package transformations.xsd2vave

import java.util.List

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import FeatureIDEXSD.AltType
import FeatureIDEXSD.AndType
import FeatureIDEXSD.BinaryNodeType
import FeatureIDEXSD.FeatureType
import FeatureIDEXSD.Node
import FeatureIDEXSD.OrType
import FeatureIDEXSD.StructType
import FeatureIDEXSD.UnaryNodeType
import vavemodel.VavemodelFactory

/**
 * Implements the structural xml to vave transformation of the FeatureIDE Feature-Model.
 */
class StructTransformation {
	vavemodel.System system

	new(vavemodel.System system) {
		this.system = system
	}

    /**
     * Starts the structural transformation.
     * @param struct The struct container of the FeatureIDEXSD ecore model.
     */
	def void start(StructType struct) {
		var Node node = struct.getNodeList()
			this.parseChild(node, null, null)
	}
    
    /**
     * Generates a vavemodel feature, adds a tree constraint with the type OR to it and parses the child features of the or parameter.
     * @param or The OrType feature which should be parsed and whose children should be parsed.
     * @param parent The parent of the or feature.
     * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
     */
	def dispatch private void parseChild(OrType or, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(or)
		this.addTreeConstraints(or, feature, parent, treeConstrParent)
		var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
		treeconstr.setType(vavemodel.GroupType::OR)
		addContainment(feature, treeconstr, "treeconstraint")
		this.tranformChildFeatures(or, null, feature, treeconstr)
	}

     /**
     * Generates a vavemodel feature, adds a tree constraint with the type XOR to it and parses the child features of the alt parameter.
     * @param alt The AltType feature which should be parsed and whose children should be parsed.
     * @param parent The parent of the alt feature.
     * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
     */
	def dispatch private void parseChild(AltType alt, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(alt)
		this.addTreeConstraints(alt, feature, parent, treeConstrParent)
		var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
		treeconstr.setType(vavemodel.GroupType::XOR)
		addContainment(feature, treeconstr, "treeconstraint")
		this.tranformChildFeatures(alt, null, feature, treeconstr)
	}

    /**
     * Generates a vavemodel feature and parses the child features of the and parameter.
     * @param and The AndType feature which should be parsed and whose children should be parsed.
     * @param parent The parent of the and feature.
     * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
     */
	def dispatch private void parseChild(AndType and, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(and)
		this.addTreeConstraints(and, feature, parent, treeConstrParent)
		this.tranformChildFeatures(null, and, feature, treeConstrParent)
	}

     /**
     * Generates a vavemodel feature.
     * @param leaf The FeatureType feature which should be parsed.
     * @param parent The parent of the leaf feature.
     * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
     */
	def dispatch private void parseChild(FeatureType leaf, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(leaf)
		this.addTreeConstraints(leaf, feature, parent, treeConstrParent)
	}

    /**
     * Adds the containment to the container.
     * @param container The container to which the containment should be added.
     * @param containment The containment which should be added to the container.
     * @param structFeature The type of the containment. "feature" for a feature and "treeconstraint" for treeconstraint.
     */
	@SuppressWarnings("unchecked") def private void addContainment(EObject container, EObject containment,
		String structFeature) {
		var EStructuralFeature eStructFeature = container.eClass().getEStructuralFeature(structFeature)
		var List<EObject> features = (container.eGet(eStructFeature) as List<EObject>)
		features.add(containment)
	}

    /**
     * Creates a vavemodel feature.
     * @param node The created vavemodel feature gets the name of the node.
     */
	def private vavemodel.Feature createFeature(Node node) {
		var vavemodel.Feature feature = VavemodelFactory::eINSTANCE.createFeature()
		feature.setName(node.getName())
		system.getFeature().add(feature)
		return feature
	}

    /**
     * Transforms the child features of the binary or unaryNode parameter.
     * @param binaryNode If the parent feature is of the type BinaryNodeType this parameter should not be null.
     * @param unaryNode If the parent feature is of the type UnaryNodeType this parameter should not be null.
     * @param feature The parent feature with the vavemodel.Feature type.
     */
	def private void tranformChildFeatures(BinaryNodeType binaryNode, UnaryNodeType unaryNode,
		vavemodel.Feature feature, vavemodel.TreeConstraint treeConstr) {
		var EList<Node> nodeList
		if (binaryNode !== null) {
			nodeList = binaryNode.getNodeList()
		} else if (unaryNode !== null) {
			nodeList = unaryNode.getNodeList()
		} else {
			System::out.println("Unary and binaryNode can't be both null")
			return;
		}
		for (Node childNode : nodeList) {
			
				if (unaryNode !== null) {
					this.parseChild(childNode, feature, null)
				} else {
					this.parseChild(childNode, null, treeConstr)
				}
		}
	}

    /**
     * Adds tree constraints to the parent parameter. If treeConstrParent is not null the tree constraint will be added which points then to the feature parameter.
     * If parent is not null a tree constraint which points to the feature based on the node parameter will be added to the parent.
     * @param Node If the node is mandatory a tree constraint with type XOR will be added to the parent else with type XORNONE.
     * @param feature The child of the parent feature.
     * @param parent The feature parent.
     */
	def private void addTreeConstraints(Node node, vavemodel.Feature feature, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		if (treeConstrParent !== null) {
			addContainment(treeConstrParent, feature, "feature")
		} else {
			if (parent !== null) {
				var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
				if (node.isMandatory()) {
					treeconstr.setType(vavemodel.GroupType::XOR)
					addContainment(parent, treeconstr, "treeconstraint")
					addContainment(treeconstr, feature, "feature")
				} else {
					treeconstr.setType(vavemodel.GroupType::XORNONE)
					addContainment(parent, treeconstr, "treeconstraint")
					addContainment(treeconstr, feature, "feature")
				}
			}
		}
	}
}
