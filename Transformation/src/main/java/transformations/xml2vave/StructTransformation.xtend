package transformations.xml2vave

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
import exception.handling.xml2vave.ExceptionHandlerStruct
import vavemodel.TreeConstraint
import vavemodel.GroupType

/**
 * Implements the structural transformation from xml to vave of the FeatureIDE Feature-Model.
 */
class StructTransformation {
	vavemodel.System system
	ExceptionHandlerStruct exceptionHandler

	new(vavemodel.System system) {
		this.system = system
		exceptionHandler = new ExceptionHandlerStruct()
	}

	/**
	 * Starts the structural transformation.
	 * @param struct The struct container of the FeatureIDEXSD ecore model.
	 */
	def void start(StructType struct) {
		this.parseFeature(struct.getNodeList(), null, null)
	}

	/**
	 * Generates a vavemodel feature, adds a tree constraint with the type OR to it and parses the child features of the or parameter.
	 * @param or The OrType feature which should be parsed and whose children should be parsed.
	 * @param parent The parent of the or feature.
	 * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
	 */
	def dispatch private void parseFeature(OrType or, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(or) //TODO: 
		var TreeConstraint treeconstr = this.
			addTreeConstraintAndCreateTreeConstraint(or, feature, parent, treeConstrParent, GroupType::OR); // Tree constraint with type OR = or feature.
		this.tranformChildFeatures(or, null, feature, treeconstr)
	}

	/**
	 * Generates a vavemodel feature, adds a tree constraint with the type XOR to it and parses the child features of the alt parameter.
	 * @param alt The AltType feature which should be parsed and whose children should be parsed.
	 * @param parent The parent of the alt feature.
	 * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
	 */
	def dispatch private void parseFeature(AltType alt, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(alt)
		var TreeConstraint treeconstr = this.
			addTreeConstraintAndCreateTreeConstraint(alt, feature, parent, treeConstrParent, GroupType::XOR); // Tree constraint with type XOR = alternative feature.
		this.tranformChildFeatures(alt, null, feature, treeconstr)
	}

	/**
	 * Generates a vavemodel feature and parses the child features of the and parameter.
	 * @param and The AndType feature which should be parsed and whose children should be parsed.
	 * @param parent The parent of the and feature.
	 * @param treeConstrParent The tree constraint of the parent which is used to point to the child.  
	 */
	def dispatch private void parseFeature(AndType and, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
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
	def dispatch private void parseFeature(FeatureType leaf, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(leaf)
		this.addTreeConstraints(leaf, feature, parent, treeConstrParent)
	}

	def dispatch private void parseFeature(Node node, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		throw new IllegalArgumentException("Unsupported node type");
	}

	/**
	 * Adds the containment to the container.
	 * @param container The container to which the containment should be added.
	 * @param containment The containment which should be added to the container.
	 * @param structFeature The type of the containment. "feature" for a feature and "treeconstraint" for treeconstraint.
	 */
	def private void addContainment(EObject container, EObject containment,
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
			exceptionHandler.checkNode(binaryNode, nodeList);
		} else if (unaryNode !== null) {
			nodeList = unaryNode.getNodeList()
			exceptionHandler.checkNode(unaryNode, nodeList);
		} else {
			System::out.println("Unary and binary node can't be both null")
			return;
		}

		for (Node childNode : nodeList) {

			if (unaryNode !== null) {
				this.parseFeature(childNode, feature, null)
			} else {
				this.parseFeature(childNode, null, treeConstr)
			}
		}
	}

	/**
	 * Adds tree constraints to the parent feature and to the feature it self if necessary. It creates also a tree constraint with the right type and adds it to the vavemodel feature.
	 * @param node The node which is parsed.
	 * @param feature The feature in which the created treeConstraint should be added.
	 * @param parent The parent of the feature parameter.
	 * @param treeConstrParent The tree constraint of the parent.
	 * @param groupType The type the created treeConstraint should have. vavemodel.GroupType::OR for a or feature and vavemodel.GroupType::XOR for a alternative feature.
	 */
	def private TreeConstraint addTreeConstraintAndCreateTreeConstraint(BinaryNodeType node, vavemodel.Feature feature,
		vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent, vavemodel.GroupType groupType) {
		this.addTreeConstraints(node, feature, parent, treeConstrParent)
		var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
		treeconstr.setType(groupType)
		addContainment(feature, treeconstr, "treeconstraint") // Add tree constraint to the vavemodel feature.
		return treeconstr;
	}

	/**
	 * Adds tree constraints to the parent parameter. If treeConstrParent is not null the tree constraint will be added which points then to the feature parameter.
	 * If parent is not null a tree constraint which points to the feature based on the node parameter will be added to the parent.
	 * @param Node If parent is not null and the node is mandatory a tree constraint with type XOR will be added to the parent else when parent is not null with type XORNONE.
	 * @param feature The child of the parent feature.
	 * @param parent The parent of the feature parameter.
	 */
	def private void addTreeConstraints(Node node, vavemodel.Feature feature, vavemodel.Feature parent,
		vavemodel.TreeConstraint treeConstrParent) {
		if (treeConstrParent !== null) {
			addContainment(treeConstrParent, feature, "feature") // Add pointer, which points to the feature, into the treeConstrParent
		} else {
			if (parent !== null) {
				var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
				if (node.isMandatory()) {
					treeconstr.setType(vavemodel.GroupType::XOR) // Tree constraint with type XOR = mandatory.
					addContainment(parent, treeconstr, "treeconstraint") // Add tree constraint with type XOR to the parent.
					addContainment(treeconstr, feature, "feature") // Add pointer, which points to the feature, to the tree constraint.
				} else {
					treeconstr.setType(vavemodel.GroupType::XORNONE) // Tree constraint with type XORNONE = optional.
					addContainment(parent, treeconstr, "treeconstraint") // Add tree constraint with type XORNONE to the parent.
					addContainment(treeconstr, feature, "feature") // Add pointer, which points to the feature, to the tree constraint.
				}
			}
		}
	}
}
