package differenceListeners;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.custommonkey.xmlunit.Difference;

import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.Node;

public class IgnoreNotTransformableFeatureModelChildren implements DifferenceListener {

	private String[] ignoreNodes = new String[] { "properties", "graphics", "calculations", "comments", "description",
			"featureOrder" };
	private List<String> ignoreNodesList = Arrays.asList(ignoreNodes);

	@Override
	public int differenceFound(Difference difference) {
		Node controlNode = difference.getControlNodeDetail().getNode();
		Node testNode = difference.getTestNodeDetail().getNode();

		if (controlNode != null && ignoreNodesList.contains(controlNode.getNodeName())) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}

		if (testNode != null && ignoreNodesList.contains(testNode.getNodeName())) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}

		if (difference.getId() == DifferenceConstants.CHILD_NODELIST_SEQUENCE_ID
				|| difference.getId() == DifferenceConstants.CHILD_NODELIST_LENGTH_ID) {
			return this.differenceChildSequenzOrChildLength(controlNode, testNode);
		}

		if (difference.getId() == DifferenceConstants.HAS_CHILD_NODES_ID) {
			return this.differenceHasChildNodes(controlNode, testNode);
		}

		return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
	}

	private int differenceChildSequenzOrChildLength(Node controlNode, Node testNode) {
		List<String> controlChildNodes = new ArrayList<String>();
		List<String> testChildNodes = new ArrayList<String>();

		for (int i = 0; i < controlNode.getChildNodes().getLength(); i++) {
			String childNodeName = controlNode.getChildNodes().item(i).getNodeName();
			if (controlNode.getChildNodes().item(i).getNodeType() != Node.TEXT_NODE
					&& !ignoreNodesList.contains(childNodeName)) {
				controlChildNodes.add(childNodeName);
			}
		}
		for (int i = 0; i < testNode.getChildNodes().getLength(); i++) {
			String childNodeName = testNode.getChildNodes().item(i).getNodeName();
			if (testNode.getChildNodes().item(i).getNodeType() != Node.TEXT_NODE
					&& !ignoreNodesList.contains(childNodeName)) {
				testChildNodes.add(childNodeName);
			}
		}
		return controlChildNodes.equals(testChildNodes) ? DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL
				: DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
	}

	private int differenceHasChildNodes(Node controlNode, Node testNode) {
		Node nodeToTest = (controlNode.hasChildNodes()) ? controlNode : testNode;

		List<String> nodeToTestChildNodes = new ArrayList<String>();

		for (int i = 0; i < nodeToTest.getChildNodes().getLength(); i++) {
			String childNodeName = nodeToTest.getChildNodes().item(i).getNodeName();
			if (nodeToTest.getChildNodes().item(i).getNodeType() != Node.TEXT_NODE
					&& !ignoreNodesList.contains(childNodeName)) {
				nodeToTestChildNodes.add(childNodeName);
			}
		}

		return nodeToTestChildNodes.size() == 0 ? DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL
				: DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
	}

	@Override
	public void skippedComparison(Node control, Node test) {

	}
}
