package transformations.vave2xml;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.FeatureType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.OrType;
import FeatureIDEXSD.UnaryNodeType;
import FeatureIDEXSD.impl.StructTypeImpl;
import vavemodel.Feature;
import vavemodel.GroupType;
import vavemodel.TreeConstraint;

public class StructTransformation {

	private FeatureModelType featureModel;
	private StructTypeImpl struct;

	public StructTransformation(FeatureModelType featureModel) {
		this.featureModel = featureModel;
		this.struct = (StructTypeImpl) FeatureIDEXSDFactory.eINSTANCE.createStructType();
	}

	public void start(EList<Feature> features) throws Exception {
		vavemodel.Feature rootFeature = features.get(0);
		FeatureMap.Entry entry = this.parse(rootFeature, null, false);
	    ((Node) entry.getValue()).setMandatory(true);
		struct.getNodeListGroup().add(entry);
		this.featureModel.setStruct(struct);
	}

	private FeatureMap.Entry parse(Feature feature, TreeConstraint treeConstraintParent,
			boolean mandatoryAttribute) throws Exception {
		boolean mandatory = false;

		if (mandatoryAttribute) { // if parent is a binary Node the mandatoryAttribute parameter is false
			mandatory = this.isMandatory(treeConstraintParent);
		}
		if (feature.getTreeconstraint().size() >= 1) {
			TreeConstraint treeConstraint = feature.getTreeconstraint().get(0);
			switch (treeConstraint.getType().getValue()) {
			case GroupType.OR_VALUE:
				return parseOr(feature, mandatory, mandatoryAttribute);

			case GroupType.XOR_VALUE:
				if (treeConstraint.getFeature().size() == 1) {
					return parseAnd(feature, mandatory, mandatoryAttribute);
				} else {
					return parseAlt(feature, mandatory, mandatoryAttribute);
				}
			case GroupType.XORNONE_VALUE:
				return parseAnd(feature, mandatory, mandatoryAttribute);
			default:
				throw new Exception("No matching found");

			}
		} else {
			return parseFeature(feature, mandatory, mandatoryAttribute);
		}
	}

	private boolean isMandatory(TreeConstraint treeConstraint) throws Exception {
		switch (treeConstraint.getType().getValue()) {
		case GroupType.XOR_VALUE:
			return true;
		case GroupType.XORNONE_VALUE:
			return false;
		default:
			throw new Exception("A feature which is not a child of a binary node must be mandatory or optional");

		}
	}

	private FeatureMap.Entry parseFeature(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) {
		FeatureType featureIDE = FeatureIDEXSDFactory.eINSTANCE.createFeatureType();

		this.setAttributes(featureIDE, feature, mandatory, mandatoryAttribute);

		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE, featureIDE);
	}

	private FeatureMap.Entry parseAnd(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		AndType andFeature = FeatureIDEXSDFactory.eINSTANCE.createAndType();

		this.setAttributes(andFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, null, andFeature);

		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND, andFeature);
	}

	private FeatureMap.Entry parseAlt(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		AltType altFeature = FeatureIDEXSDFactory.eINSTANCE.createAltType();

		this.setAttributes(altFeature, feature, mandatory, mandatoryAttribute);
		parseChild(feature, altFeature, null);

		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT, altFeature);

	}

	private FeatureMap.Entry parseOr(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		OrType orFeature = FeatureIDEXSDFactory.eINSTANCE.createOrType();

		this.setAttributes(orFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, orFeature, null);

		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR, orFeature);
	}

	private void parseChild(Feature feature, BinaryNodeType binaryNode, UnaryNodeType unaryNode) throws Exception {
		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		for (TreeConstraint treeConstraint : treeConstraintList) {
			for (Feature childFeature : treeConstraint.getFeature()) {
				if (binaryNode != null) {
					binaryNode.getNodeGroup().add(parse(childFeature, treeConstraint, false));
				} else {
					unaryNode.getNodeGroup().add(parse(childFeature, treeConstraint, true));
				}
			}
		}
	}

	private void setAttributes(Node node, Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		node.setName(feature.getName());

		if (mandatoryAttribute) {
			node.setMandatory(mandatory);
		}
	}
}
