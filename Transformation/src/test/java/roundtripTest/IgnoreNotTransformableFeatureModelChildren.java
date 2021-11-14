package roundtripTest;

import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.Node;

public class IgnoreNotTransformableFeatureModelChildren extends IgnoreNotTransformableAttributes {

	@Override
	public int differenceFound(Difference difference) {
		Node controlNode = difference.getControlNodeDetail().getNode();
		Node testNode = difference.getTestNodeDetail().getNode();
		
		if (controlNode != null && controlNode.getNodeName().equals("featureOrder")) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}
		
		if (testNode != null && testNode.getNodeName().equals("featureOrder")) {
			return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
		}
		
		return super.differenceFound(difference);
	}
}
