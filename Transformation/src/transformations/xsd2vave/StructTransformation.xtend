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

class StructTransformation {
	vavemodel.System system

	new(vavemodel.System system) {
		this.system = system
	}

	def void start(StructType struct) {
		var Node node = struct.getNodeList()
			this.parseChild(node, null, null)
	}

	def dispatch private void parseChild(OrType or, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(or)
		this.addTreeConstraints(or, feature, parent, treeConstrParent)
		var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
		treeconstr.setType(vavemodel.GroupType::OR)
		addContainment(feature, treeconstr, "treeconstraint")
		this.tranformChildFeatures(or, null, feature, treeconstr)
	}

	def dispatch private void parseChild(AltType alt, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(alt)
		this.addTreeConstraints(alt, feature, parent, treeConstrParent)
		var vavemodel.TreeConstraint treeconstr = VavemodelFactory::eINSTANCE.createTreeConstraint()
		treeconstr.setType(vavemodel.GroupType::XOR)
		addContainment(feature, treeconstr, "treeconstraint")
		this.tranformChildFeatures(alt, null, feature, treeconstr)
	}

	def dispatch private void parseChild(AndType and, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(and)
		this.addTreeConstraints(and, feature, parent, treeConstrParent)
		this.tranformChildFeatures(null, and, feature, treeConstrParent)
	}

	def dispatch private void parseChild(FeatureType leaf, vavemodel.Feature parent, vavemodel.TreeConstraint treeConstrParent) {
		var vavemodel.Feature feature = this.createFeature(leaf)
		this.addTreeConstraints(leaf, feature, parent, treeConstrParent)
	}

	@SuppressWarnings("unchecked") def private void addContainment(EObject container, EObject containment,
		String structFeature) {
		var EStructuralFeature eStructFeature = container.eClass().getEStructuralFeature(structFeature)
		var List<EObject> features = (container.eGet(eStructFeature) as List<EObject>)
		features.add(containment)
	}

	def private vavemodel.Feature createFeature(Node node) {
		var vavemodel.Feature feature = VavemodelFactory::eINSTANCE.createFeature()
		feature.setName(node.getName())
		system.getFeature().add(feature)
		return feature
	}

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
