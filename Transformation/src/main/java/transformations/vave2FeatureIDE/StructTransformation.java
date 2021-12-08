package transformations.vave2FeatureIDE;

import java.util.List;

import org.eclipse.emf.common.util.EList;
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

/**
 * Implements the structural transformation from a VaVemodel to XML.
 */
public class StructTransformation {

	private FeatureModelType featureModel;
	private StructTypeImpl struct;

	public StructTransformation(FeatureModelType featureModel) {
		this.featureModel = featureModel;
		this.struct = (StructTypeImpl) FeatureIDEXSDFactory.eINSTANCE.createStructType();
	}

	/**
	 * Starts the transformation.
	 * 
	 * @param features A list of type Feature. The first element in the list will be
	 *                 the root feature.
	 * @throws Exception
	 */
	public void start(EList<Feature> features) throws Exception {
		vavemodel.Feature rootFeature = features.get(0);
		FeatureMap.Entry entry = this.parse(rootFeature, null, false);
		((Node) entry.getValue()).setMandatory(true); // Root element is always mandatory
		struct.getNodeListGroup().add(entry);
		this.featureModel.setStruct(struct);
	}

	/**
	 * Determines which parse method should be called based on the GroupType of the
	 * treeConstraintParent parameter and the tree constraints of the feature
	 * parameter.
	 * 
	 * @param feature              The feature which should be parsed.
	 * @param treeConstraintParent The tree constraint of the parent feature.
	 * @param mandatoryAttribute   When the feature should have a mandatory
	 *                             attribute, this parameter should be true.
	 * @return Returns a FeatureMap.Entry
	 * @throws Exception
	 */
	private FeatureMap.Entry parse(Feature feature, TreeConstraint treeConstraintParent, boolean mandatoryAttribute) {
		boolean mandatory = false;

		if (mandatoryAttribute) { // If parent is a binary node the mandatoryAttribute parameter should be false
			mandatory = this.isMandatory(treeConstraintParent);
		}
		if (feature.getTreeconstraint().size() >= 1) { // If the feature has a tree constraint it can not be a leaf.
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
				throw new IllegalArgumentException("No matching found");

			}
		} else {
			return parseFeature(feature, mandatory, mandatoryAttribute);
		}
	}

	/**
	 * Determines if the feature is mandatory or not based on the GroupType of the
	 * treeConstraint parameter.
	 * 
	 * @param treeConstraint The tree constraint of the vavemodel.Feature feature.
	 * @return Returns true if the feature should be mandatory, false else.
	 * @throws Exception
	 */
	private boolean isMandatory(TreeConstraint treeConstraint) {
		switch (treeConstraint.getType().getValue()) {
		case GroupType.XOR_VALUE:
			return true;
		default:
			return false;

		}
	}

	/**
	 * Parses the vavemodel.Feature feature to a FeatureType node.
	 * 
	 * @param feature            The feature which should be parsed.
	 * @param mandatory          When the feature should be mandatory this should be
	 *                           true.
	 * @param mandatoryAttribute When the feature should have a mandatory attribute
	 *                           this should be true.
	 * @return Returns a FeatureMap.Entry with
	 *         FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE as
	 *         EStructuralFeature.
	 */
	private FeatureMap.Entry parseFeature(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		FeatureType featureIDE = FeatureIDEXSDFactory.eINSTANCE.createFeatureType();

		this.setAttributes(featureIDE, feature, mandatory, mandatoryAttribute);

		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE, featureIDE);
	}

	/**
	 * Parses the vavemodel.Feature feature to a AndType node.
	 * 
	 * @param feature            The feature which should be parsed.
	 * @param mandatory          When the feature should be mandatory this should be
	 *                           true.
	 * @param mandatoryAttribute When the feature should have a mandatory attribute
	 *                           this should be true.
	 * @return Returns a FeatureMap.Entry with
	 *         FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND as
	 *         EStructuralFeature.
	 */
	private FeatureMap.Entry parseAnd(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		AndType andFeature = FeatureIDEXSDFactory.eINSTANCE.createAndType();

		this.setAttributes(andFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, null, andFeature);

		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND, andFeature);
	}

	/**
	 * Parses the vavemodel.Feature feature to AltType node.
	 * 
	 * @param feature            The feature which should be parsed.
	 * @param mandatory          When the feature should be mandatory this should be
	 *                           true.
	 * @param mandatoryAttribute When the feature should have a mandatory attribute
	 *                           this should be true.
	 * @return Returns a FeatureMap.Entry with
	 *         FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT as
	 *         EStructuralFeature.
	 */
	private FeatureMap.Entry parseAlt(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		AltType altFeature = FeatureIDEXSDFactory.eINSTANCE.createAltType();

		this.setAttributes(altFeature, feature, mandatory, mandatoryAttribute);
		parseChild(feature, altFeature, null);

		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT, altFeature);

	}

	/**
	 * Parses the vavemodel.Feature feature to a OrType node.
	 * 
	 * @param feature            The feature which should be parsed.
	 * @param mandatory          When the feature should be mandatory, this should
	 *                           be true.
	 * @param mandatoryAttribute When the feature should have a mandatory attribute,
	 *                           this should be true.
	 * @return Returns a FeatureMap.Entry with
	 *         FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR as
	 *         EStructuralFeature.
	 */
	private FeatureMap.Entry parseOr(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		OrType orFeature = FeatureIDEXSDFactory.eINSTANCE.createOrType();

		this.setAttributes(orFeature, feature, mandatory, mandatoryAttribute);

		parseChild(feature, orFeature, null);

		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR, orFeature);
	}

	/**
	 * Parses the child features.
	 * 
	 * @param feature    The vavemodel.Feature, whose children should be parsed.
	 * @param binaryNode If the parent node is of type BinaryNodeType, this should
	 *                   be not null.
	 * @param unaryNode  If the parent node is of type UnaryNodeType, this should be
	 *                   not null.
	 * @throws Exception
	 */
	private void parseChild(Feature feature, BinaryNodeType binaryNode, UnaryNodeType unaryNode) {
		List<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		if (binaryNode != null && treeConstraintList.size() > 1) {
			throw new IllegalArgumentException("A binary node can only have one tree constraint");
		}
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

	/**
	 * Takes over the attributes of the feature parameter to the node parameter.
	 * 
	 * @param node               The node, whose attributes should be set.
	 * @param feature            The vavemodel.Feature, whose attributes should be
	 *                           taken.
	 * @param mandatory          If the node should be mandatory, this should be
	 *                           true.
	 * @param mandatoryAttribute If the node should have an mandatory attribute,
	 *                           this should be true.
	 */
	private void setAttributes(Node node, Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		node.setName(feature.getName());

		if (mandatoryAttribute && mandatory) {
			node.setMandatory(mandatory);
		}
	}
}
