package roundtripTest;

import java.util.ArrayList;
import java.util.List;

import org.custommonkey.xmlunit.Difference;

import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class MyDifferenceListener implements DifferenceListener {

	@Override
	public int differenceFound(Difference difference) {
		Node controlNode = difference.getControlNodeDetail().getNode();
		Node testNode = difference.getTestNodeDetail().getNode();

		if (controlNode != null && controlNode.getNodeName().equals("properties")) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}

		if (controlNode != null && controlNode.getNodeName().equals("graphics")) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}

		if (difference.getId() == DifferenceConstants.CHILD_NODELIST_SEQUENCE_ID) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
			/*List<Node> controlChildNodes = new ArrayList<Node>();
			List<Node> testChildNodes = new ArrayList<Node>();

			for (int i = 0; i < controlNode.getChildNodes().getLength(); i++) {
				if (controlNode.getChildNodes().item(i).getNodeType() != Node.TEXT_NODE) {
					controlChildNodes.add(controlNode.getChildNodes().item(i));
				}
			}
			for (int i = 0; i < testNode.getChildNodes().getLength(); i++) {
				if (testNode.getChildNodes().item(i).getNodeType() != Node.TEXT_NODE) {
					testChildNodes.add(testNode.getChildNodes().item(i));
				}
			}
			if (controlChildNodes.equals(testChildNodes)) {
				return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
			} else {

				return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
			}*/
		}

		if (difference.getId() == DifferenceConstants.HAS_CHILD_NODES_ID) {

			Node nodeToTest = (controlNode.hasChildNodes()) ? controlNode : testNode;

			if (nodeToTest.getFirstChild().getNodeName().equals("graphics")) {
				return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
			}
		}

		if (difference.getId() == DifferenceConstants.CHILD_NODELIST_LENGTH_ID) {
			Node nodeToTest;
			if (controlNode.getChildNodes().getLength() > testNode.getChildNodes().getLength()) {
				nodeToTest = controlNode;
			} else {
				nodeToTest = testNode;
			}

			if (nodeToTest.getNodeName().equals("featureModel")) {
				if (nodeToTest.getFirstChild().getNodeName().equals("properties")) {
					return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
				} else {
					return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
				}
			} else {
				if (nodeToTest.getFirstChild().getNodeName().equals("graphics")) {
					return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
				}
			}
		}
		return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
	}

	@Override
	public void skippedComparison(Node control, Node test) {
		// TODO Auto-generated method stub

	}
}
