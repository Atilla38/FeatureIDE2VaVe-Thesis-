package roundtripTest;

import java.util.ArrayList;
import java.util.List;

import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class IgnoreAbstractAndHiddenAttribute extends MyDifferenceListener {
	
	@Override
	public int differenceFound(Difference difference) {
		Node controlNode = difference.getControlNodeDetail().getNode();
		Node testNode = difference.getTestNodeDetail().getNode();
		
		if(difference.getId() == DifferenceConstants.ATTR_NAME_NOT_FOUND_ID || difference.getId() == DifferenceConstants.ELEMENT_NUM_ATTRIBUTES_ID) { 
			List<String> controlAttributes = new ArrayList<String>();
			List<String> testAttributes = new ArrayList<String>();
			
			for(int i = 0; i < controlNode.getAttributes().getLength(); i++) {
				
				if(controlNode.getAttributes().item(i).getNodeName() != "abstract" && controlNode.getAttributes().item(i).getNodeName() != "hidden") {
					controlAttributes.add(controlNode.getAttributes().item(i).getNodeName() +""+controlNode.getAttributes().item(i).getNodeValue());
				}
			}
			
		
			for(int i = 0; i < testNode.getAttributes().getLength(); i++) {
				if(testNode.getAttributes().item(i).getNodeName() != "abstract" && testNode.getAttributes().item(i).getNodeName() != "hidden") {
					testAttributes.add(testNode.getAttributes().item(i).getNodeName() +""+testNode.getAttributes().item(i).getNodeValue());
				}
			}
			
			if(controlAttributes.equals(testAttributes)) {
				return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_IDENTICAL;
			} else 
				return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
		}
		return super.differenceFound(difference);
	}
}
