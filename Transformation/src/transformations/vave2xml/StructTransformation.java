package transformations.vave2xml;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.FeatureType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.OrType;
import FeatureIDEXSD.impl.NodeImpl;
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
		if (rootFeature.getTreeconstraint().size() >= 1) {
			TreeConstraint treeConstraint = rootFeature.getTreeconstraint().get(0);
			switch (treeConstraint.getType().getValue()) {
			case GroupType.OR_VALUE:
				entry = parseOr(rootFeature, true, true);
				break;

			case GroupType.XOR_VALUE:
				if (treeConstraint.getFeature().size() == 1) {
					entry = parseAnd(rootFeature, true, true);
				} else {
					entry = parseAlt(rootFeature, true, true);
				}
				break;
			case GroupType.XORNONE_VALUE:
				entry = parseAnd(rootFeature, true, true);
				break;
			default:
				throw new Exception("No matching found");
			}
		} else {
			entry = parseFeature(rootFeature, true, true);
		}
		struct.getNodeListGroup().add(entry.getKey(), entry.getValue());
		this.featureModel.setStruct(struct);
	}

	private Map.Entry<EStructuralFeature, Node> parseChild(Feature feature, TreeConstraint treeConstraintParent, boolean mandatoryAttribute)
			throws Exception {
		Node node = null;
		boolean mandatory = false;

		if (mandatoryAttribute) { // if parent is a binary Node the mandatoryAttribute argument is false
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

	private java.util.Map.Entry<EStructuralFeature, Node> parseFeature(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		FeatureType featureIDE = FeatureIDEXSDFactory.eINSTANCE.createFeatureType();
		featureIDE.setName(feature.getName());

		if (mandatoryAttribute) {
			featureIDE.setMandatory(mandatory);
		}
		
		
		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE, featureIDE);
	}

	private  java.util.Map.Entry<EStructuralFeature, Node> parseAnd(Feature feature, boolean mandatory, boolean mandatoryAttribute) throws Exception {
		AndType andFeature = FeatureIDEXSDFactory.eINSTANCE.createAndType();
		andFeature.setName(feature.getName());

		if (mandatoryAttribute) {
			andFeature.setMandatory(mandatory);
		}

		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		for (TreeConstraint treeConstraint : treeConstraintList) {
			for (Feature childFeature : treeConstraint.getFeature()) {
				Map.Entry<EStructuralFeature, Node> entry = parseChild(childFeature, treeConstraint, true);
				andFeature.getNodeListGroup().add(entry.getKey(),entry.getValue());
			}
		}
		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND, andFeature);
	}

	private java.util.Map.Entry<EStructuralFeature, Node> parseAlt(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT, FeatureIDEXSDFactory.eINSTANCE.createAltType());

	}

	private java.util.Map.Entry<EStructuralFeature, Node> parseOr(Feature feature, boolean mandatory, boolean mandatoryAttribute) throws Exception {
		OrType orFeature = FeatureIDEXSDFactory.eINSTANCE.createOrType();
		orFeature.setName(feature.getName());
		if (mandatoryAttribute) {
			orFeature.setMandatory(mandatory);
		}
		
		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		for (TreeConstraint treeConstraint : treeConstraintList) {
			for (Feature childFeature : treeConstraint.getFeature()) {
				Map.Entry<EStructuralFeature, Node> entry = parseChild(childFeature, treeConstraint, false);
				orFeature.getNodeGroup().add(entry.getKey(),entry.getValue());
			}
		}
		
		return Map.entry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR, orFeature);
	}
}
