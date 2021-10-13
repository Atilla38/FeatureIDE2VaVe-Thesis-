package transformations;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.LeafType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.UnaryNodeType;
import vavemodel.VavemodelFactory;

public class XSD2VaveTransformation {

	private vavemodel.System system;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();

	public XSD2VaveTransformation() {
		system = VavemodelFactory.eINSTANCE.createSystem();

	}

	public void start(StructType struct) {

		if (struct.getAlt() != null) {
			this.parseAlt(struct.getAlt(), null, null);
		}

		if (struct.getAnd() != null) {
			this.parseAnd(struct.getAnd(), null, null);
		}

		if (struct.getOr() != null) {
			this.parseOr(struct.getOr(), null, null);
		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vavemodel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(
				URI.createFileURI(this.projectFolder.resolve("models/car_withFeatures.vavemodel").toString()));
		resource.getContents().add(system);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("FOLDER: " + this.projectFolder);
	}

	public void parseOr(BinaryNodeType or, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

		vavemodel.Feature feature = this.createFeature(or);

		this.addTreeConstraints(or, feature, parent, treeConstrParent);

		vavemodel.TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
		treeconstr.setType(vavemodel.GroupType.OR);
		addContainment(feature, treeconstr, "treeconstraint");

		this.tranformChildFeatures(or, null, feature, treeconstr);

	}

	public void parseAlt(BinaryNodeType alt, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		vavemodel.Feature feature = this.createFeature(alt);

		this.addTreeConstraints(alt, feature, parent, treeConstrParent);

		vavemodel.TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
		treeconstr.setType(vavemodel.GroupType.XOR);
		addContainment(feature, treeconstr, "treeconstraint");

		this.tranformChildFeatures(alt, null, feature, treeconstr);
	}

	public void parseAnd(UnaryNodeType and, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

		vavemodel.Feature feature = this.createFeature(and);

		this.addTreeConstraints(and, feature, parent, treeConstrParent);
		this.tranformChildFeatures(null, and, feature, treeConstrParent);

	}

	public void parseFeature(LeafType leaf, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

		vavemodel.Feature feature = this.createFeature(leaf);
		this.addTreeConstraints(leaf, feature, parent, treeConstrParent);

	}

	@SuppressWarnings("unchecked")
	private void addContainment(EObject container, EObject containment, String structFeature) {
		EStructuralFeature eStructFeature = container.eClass().getEStructuralFeature(structFeature);
		List<EObject> features = (List<EObject>) container.eGet(eStructFeature);
		features.add(containment);
	}

	private vavemodel.Feature createFeature(Node node) {
		vavemodel.Feature feature = VavemodelFactory.eINSTANCE.createFeature();
		feature.setName(node.getName());
		system.getFeature().add(feature);
		return feature;
	}

	private void tranformChildFeatures(BinaryNodeType binaryNode, UnaryNodeType unaryNode, vavemodel.Feature feature,
			vavemodel.TreeConstraint treeConstr) {
		EList<LeafType> features;
		EList<BinaryNodeType> ors;
		EList<BinaryNodeType> alts;
		EList<UnaryNodeType> ands;

		if (binaryNode != null) {
			features = binaryNode.getFeature();
			ors = binaryNode.getOr();
			alts = binaryNode.getAlt();
			ands = binaryNode.getAnd();
		} else if (unaryNode != null) {
			features = unaryNode.getFeature();
			ors = unaryNode.getOr();
			alts = unaryNode.getAlt();
			ands = unaryNode.getAnd();
		} else {
			System.out.println("Unary and binaryNode can't be both null");
			return;
		}

		if (!features.isEmpty()) {
			for (LeafType child : features) {
				if (unaryNode != null) {
					this.parseFeature(child, feature, null);
				} else {
					this.parseFeature(child, null, treeConstr);
				}

			}
		}

		if (!ands.isEmpty()) {
			for (UnaryNodeType child : ands) {

				if (unaryNode != null) {
					this.parseAnd(child, feature, null);
				} else {
					this.parseAnd(child, null, treeConstr);
				}
			}
		}

		if (!ors.isEmpty()) {
			for (BinaryNodeType child : ors) {
				if (unaryNode != null) {
					this.parseOr(child, feature, null);
				} else {
					this.parseOr(child, null, treeConstr);
				}
			}
		}

		if (!alts.isEmpty()) {
			for (BinaryNodeType child : alts) {
				if (unaryNode != null) {
					this.parseAlt(child, feature, null);
				} else {
					this.parseAlt(child, null, treeConstr);
				}
			}
		}
	}

	private void addTreeConstraints(Node node, vavemodel.Feature feature, vavemodel.Feature parent,
			vavemodel.TreeConstraint treeConstrParent) {

		if (treeConstrParent != null) {
			addContainment(treeConstrParent, feature, "feature");
		} else {
			if (parent != null) {
				vavemodel.TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
				if (node.isMandatory()) {
					treeconstr.setType(vavemodel.GroupType.XOR);
					addContainment(parent, treeconstr, "treeconstraint");
					addContainment(treeconstr, feature, "feature");
				} else {
					treeconstr.setType(vavemodel.GroupType.XORNONE);
					addContainment(parent, treeconstr, "treeconstraint");
					addContainment(treeconstr, feature, "feature");
				}
			}
		}
	}

}
