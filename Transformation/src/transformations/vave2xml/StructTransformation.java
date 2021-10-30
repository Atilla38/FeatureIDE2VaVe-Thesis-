package transformations.vave2xml;

import org.eclipse.emf.common.util.EList;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
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
		Node node;
		if(rootFeature.getTreeconstraint().size() >= 1) {
			TreeConstraint treeConstraint = rootFeature.getTreeconstraint().get(0);
			switch (treeConstraint.getType().getValue()) {
			case GroupType.OR_VALUE:
				node = parseOr(rootFeature, true, true);
				break;
			
			case GroupType.XOR_VALUE:
				if(treeConstraint.getFeature().size() == 1) {
				 node = parseAnd(rootFeature, true, true);
				} else {
					node = parseAlt(rootFeature, true, true);
				}
				break;
			case GroupType.XORNONE_VALUE:
				   node = parseAnd(rootFeature,true, true);
				    break;
			default: throw new Exception("No matching found");
			}
		} else {
			node = parseFeature(rootFeature, true, true);
		}
		
		/*this.struct.basicSetNodeList(node, null);
		this.featureModel.setStruct(struct);*/
	}

	private Node parseChild(Feature feature,TreeConstraint treeConstraintParent, boolean mandatoryAttribute) throws Exception {
		Node node = null;
		boolean mandatory = false;
		
		if(mandatoryAttribute) { // if parent is a binary Node the mandatoryAttribute argument is false
			mandatory = this.isMandatory(treeConstraintParent);
		}
			if(feature.getTreeconstraint().size() >= 1) { 
				TreeConstraint treeConstraint = feature.getTreeconstraint().get(0);
				switch (treeConstraint.getType().getValue()) {
				case GroupType.OR_VALUE: 
					node = parseOr(feature, mandatory, mandatoryAttribute);
					break;
				
				case GroupType.XOR_VALUE:
					if(treeConstraint.getFeature().size() == 1) {
					  node = parseAnd(feature,mandatory, mandatoryAttribute);
					} else {
						node = parseAlt(feature,mandatory, mandatoryAttribute);
					}
					break;
				case GroupType.XORNONE_VALUE:
					   node = parseAnd(feature,mandatory, mandatoryAttribute);
					    break;
				default: throw new Exception("No matching found");
					
				}
			} else {
				node = parseFeature(feature, mandatory, mandatoryAttribute);
			}
		return node;
	}

	private boolean isMandatory(TreeConstraint treeConstraint) throws Exception {
		switch (treeConstraint.getType().getValue()) {
		case GroupType.XOR_VALUE: return true;
		case GroupType.XORNONE_VALUE: return false;
		default: throw new Exception("A feature which is not a child of a binary node must be mandatory or optional");
			
		}
	}

	private FeatureType parseFeature(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		FeatureType featureIDE = FeatureIDEXSDFactory.eINSTANCE.createFeatureType();
		featureIDE.setName(feature.getName());
		
		if(mandatoryAttribute) {
		featureIDE.setMandatory(mandatory);
		}
		
		return featureIDE;
	}

	private AndType parseAnd(Feature feature, boolean mandatory, boolean mandatoryAttribute) throws Exception {
		AndType andFeature = FeatureIDEXSDFactory.eINSTANCE.createAndType();
		andFeature.setName(feature.getName());
		
		if(mandatoryAttribute) {
		andFeature.setMandatory(mandatory);
		}
		
		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		
		for(TreeConstraint treeConstraint : treeConstraintList) {
			for(Feature childFeature : treeConstraint.getFeature()) {
			Node node = FeatureIDEXSDFactory.eINSTANCE.createNode();
				node = parseChild(childFeature,treeConstraint, true);
				andFeature.getNodeList().add(node);
			}
		}
		
		return andFeature;
	}

	private AltType parseAlt(Feature feature, boolean mandatory, boolean mandatoryAttribute) {
		return FeatureIDEXSDFactory.eINSTANCE.createAltType();

	}

	private OrType parseOr(Feature feature, boolean mandatory, boolean mandatoryAttribute) throws Exception {
		OrType orFeature = FeatureIDEXSDFactory.eINSTANCE.createOrType();
		orFeature.setName(feature.getName());
		if(mandatoryAttribute) {
			orFeature.setMandatory(mandatory);
		}
		EList<TreeConstraint> treeConstraintList = feature.getTreeconstraint();
		for(TreeConstraint treeConstraint : treeConstraintList) {
			for(Feature childFeature : treeConstraint.getFeature()) {
			Node node = FeatureIDEXSDFactory.eINSTANCE.createNode();
			node = parseChild(childFeature, treeConstraint, false);
			orFeature.getNodeList().add(node);
			}
		}
		
		return orFeature;
	}
}
