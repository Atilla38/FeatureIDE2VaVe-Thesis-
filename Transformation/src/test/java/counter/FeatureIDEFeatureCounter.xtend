package counter

import java.io.File

import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import FeatureIDEXSD.BinaryNodeType
import FeatureIDEXSD.DocumentRoot
import FeatureIDEXSD.FeatureModelType
import FeatureIDEXSD.FeatureType
import FeatureIDEXSD.Node
import FeatureIDEXSD.StructType
import FeatureIDEXSD.UnaryNodeType
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl
import java.util.stream.Collectors

/**
 * Counts the features in a FeatureIDE Feature-Model.
 */
class FeatureIDEFeatureCounter {
	
	/**
	 * Counts the features in a FeatureIDE Feature-Model.
	 * @param file The FeatureIDE-Model in which the features are counted.
	 * @param countAbstractAndHiddenFeatures True if abstract and hidden features should also be counted. Else false.
	 * @returns Returns the counted features.
	 */
	def int countFeatures(File file, boolean countAbstractAndHiddenFeatures) {
		var Resource resource = this.loadFeatureIDEXMLFile(file)
		var DocumentRoot root = (resource.getContents().get(0) as DocumentRoot)
		var FeatureModelType featureModel = root.getFeatureModel()
		var StructType struct = featureModel.getStruct()
		
		if(countAbstractAndHiddenFeatures) {
			return this.count(1, struct.getNodeList(), countAbstractAndHiddenFeatures)
		} else if(struct.getNodeList().isAbstract || struct.getNodeList().isHidden) {
			return this.count(0, struct.getNodeList(), countAbstractAndHiddenFeatures)
		} else {
			return this.count(1, struct.getNodeList(), countAbstractAndHiddenFeatures)
		}
		
	}

	def dispatch int count(int counter_final_param, BinaryNodeType node, boolean countAbstractAndHiddenFeatures) {
		var counter = counter_final_param;
		var List<Node> filteredList;
		var List<Node> nodeList = node.getNodeList();
		if (countAbstractAndHiddenFeatures) {
			counter = counter + nodeList.size();
		} else {
			filteredList = nodeList.stream()
			                       .filter([n |!n.isHidden() && !n.isAbstract()])
			                       .collect(Collectors.toList());
			counter = counter + filteredList.size();
		}

		for (Node child : nodeList) {
			counter = count(counter, child, countAbstractAndHiddenFeatures)
		}
		return counter
	}

	def dispatch int count(int counter_final_param, UnaryNodeType node, boolean countAbstractAndHiddenFeatures) {
		var counter = counter_final_param;
		var List<Node> filteredList;
		var List<Node> nodeList = node.getNodeList();
		if (countAbstractAndHiddenFeatures) {
			counter = counter + nodeList.size();
		} else {
			filteredList = nodeList.stream()
			                       .filter([n |!n.isHidden() && !n.isAbstract()])
			                       .collect(Collectors.toList());
			counter = counter + filteredList.size();
		}
		for (Node child : nodeList) {
			counter = count(counter, child, countAbstractAndHiddenFeatures)
		}
		return counter
	}

	def dispatch int count(int counter_final_param, FeatureType node, boolean countAbstractAndHiddenFeatures) {
		var counter = counter_final_param;
		return counter;
	}

	def private Resource loadFeatureIDEXMLFile(File file) {
		var ResourceSetImpl resourceSet = new ResourceSetImpl()
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
			new FeatureIDEXSDResourceFactoryImpl())
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featureIDExml",
			new FeatureIDEXSDResourceFactoryImpl())
		return resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true)
	}
}
