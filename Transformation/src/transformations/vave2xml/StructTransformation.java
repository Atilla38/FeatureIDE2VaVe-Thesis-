package transformations.vave2xml;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

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
		Map.Entry<EStructuralFeature, Node> entry;
		entry = this.parse(rootFeature, null, false);
		entry.getValue().setMandatory(true);
		struct.getNodeListGroup().add(entry.getKey(), entry.getValue());
		this.featureModel.setStruct(struct);
	}

	private Map.Entry<EStructuralFeature, Node> parse(Feature feature, TreeConstraint treeConstraintParent,
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

	private java.util.Map.Entry<EStructuralFeature, Node> parseFeature(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) {
		FeatureType featureIDE = FeatureIDEXSDFactory.eINSTANCE.createFeatureType();

		this.setAttributes(featureIDE, feature, mandatory, mandatoryAttribute);

		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE, featureIDE);
	}

	private java.util.Map.Entry<EStructuralFeature, Node> parseAnd(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		AndType andFeature = FeatureIDEXSDFactory.eINSTANCE.createAndType();

		this.setAttributes(andFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, null, andFeature);

		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND, andFeature);
	}

	private java.util.Map.Entry<EStructuralFeature, Node> parseAlt(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		AltType altFeature = FeatureIDEXSDFactory.eINSTANCE.createAltType();

		this.setAttributes(altFeature, feature, mandatory, mandatoryAttribute);
		parseChild(feature, altFeature, null);

		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT, altFeature);

	}

	private java.util.Map.Entry<EStructuralFeature, Node> parseOr(Feature feature, boolean mandatory,
			boolean mandatoryAttribute) throws Exception {
		OrType orFeature = FeatureIDEXSDFactory.eINSTANCE.createOrType();

		this.setAttributes(orFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, orFeature, null);

		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR, orFeature);
	}

	private void parseChild(Feature feature, BinaryNodeType binaryNode, UnaryNodeType unaryNode) throws Exception {
		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		for (TreeConstraint treeConstraint : treeConstraintList) {
			for (Feature childFeature : treeConstraint.getFeature()) {
				if (binaryNode != null) {
					Map.Entry<EStructuralFeature, Node> entry = parse(childFeature, treeConstraint, false);
					binaryNode.getNodeGroup().add(entry.getKey(), entry.getValue());
				} else {
					Map.Entry<EStructuralFeature, Node> entry = parse(childFeature, treeConstraint, true);
					unaryNode.getNodeGroup().add(entry.getKey(), entry.getValue());
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
