package transformations.xsd2vave;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureType;
import FeatureIDEXSD.LeafType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.OrType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.UnaryNodeType;
import vavemodel.VavemodelFactory;

public class StructTransformation {

	private vavemodel.System system;

	public StructTransformation(vavemodel.System system) {
		this.system = system;
	}

	public void start(StructType struct) {
		Node node = struct.getNodeList();
		if (node instanceof AltType) {
			this.parseAlt((BinaryNodeType) node, null, null);
		}

		if (node instanceof AndType) {
			this.parseAnd((UnaryNodeType) node, null, null);
		}

		if (node instanceof OrType) {
			this.parseOr((BinaryNodeType) node, null, null);
		}

		if (node instanceof FeatureType) {
			this.parseFeature((LeafType) node, null, null);
		}
	}

	private void parseOr(BinaryNodeType or, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

		vavemodel.Feature feature = this.createFeature(or);

		this.addTreeConstraints(or, feature, parent, treeConstrParent);

		vavemodel.TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
		treeconstr.setType(vavemodel.GroupType.OR);
		addContainment(feature, treeconstr, "treeconstraint");

		this.tranformChildFeatures(or, null, feature, treeconstr);

	}

	private void parseAlt(BinaryNodeType alt, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		vavemodel.Feature feature = this.createFeature(alt);

		this.addTreeConstraints(alt, feature, parent, treeConstrParent);

		vavemodel.TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
		treeconstr.setType(vavemodel.GroupType.XOR);
		addContainment(feature, treeconstr, "treeconstraint");

		this.tranformChildFeatures(alt, null, feature, treeconstr);
	}

	private void parseAnd(UnaryNodeType and, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

		vavemodel.Feature feature = this.createFeature(and);

		this.addTreeConstraints(and, feature, parent, treeConstrParent);
		this.tranformChildFeatures(null, and, feature, treeConstrParent);

	}

	private void parseFeature(LeafType leaf, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {

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

		EList<Node> nodeList;

		if (binaryNode != null) {
			nodeList = binaryNode.getNodeList();
		} else if (unaryNode != null) {
			nodeList = unaryNode.getNodeList();
		} else {
			System.out.println("Unary and binaryNode can't be both null");
			return;
		}

		for (Node childNode : nodeList) {
			if (childNode instanceof FeatureType) {
				if (unaryNode != null) {
					this.parseFeature((LeafType) childNode, feature, null);
				} else {
					this.parseFeature((LeafType) childNode, null, treeConstr);
				}

			}

			if (childNode instanceof AndType) {

				if (unaryNode != null) {
					this.parseAnd((UnaryNodeType) childNode, feature, null);
				} else {
					this.parseAnd((UnaryNodeType) childNode, null, treeConstr);
				}
			}

			if (childNode instanceof OrType) {
				if (unaryNode != null) {
					this.parseOr((BinaryNodeType) childNode, feature, null);
				} else {
					this.parseOr((BinaryNodeType) childNode, null, treeConstr);
				}
			}

			if (childNode instanceof AltType) {
				if (unaryNode != null) {
					this.parseAlt((BinaryNodeType) childNode, feature, null);
				} else {
					this.parseAlt((BinaryNodeType) childNode, null, treeConstr);
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
