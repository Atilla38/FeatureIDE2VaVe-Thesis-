package roundtripTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceListener;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

class XMLComparator {

	@Test
	public void given2XMLS_whenGeneratesDifferences_thenCorrect() throws SAXException, IOException {
		FileInputStream fis1 = new FileInputStream("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\FeatureIDE-Projects\\Car\\car.xml");
		FileInputStream fis2 = new FileInputStream("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\Transformation\\models\\FeatureIDEXML.xml");

		FileInputStream similarFis1 = new FileInputStream("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\FeatureIDE-Projects\\Car\\car.xml");
		FileInputStream similarFis2 = new FileInputStream("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\Transformation\\models\\FeatureIDEXML.xml");
		
		BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
		BufferedReader target = new BufferedReader(new InputStreamReader(fis2));

		BufferedReader similarSource = new BufferedReader(new InputStreamReader(similarFis1));
		BufferedReader similarTarget = new BufferedReader(new InputStreamReader(similarFis2));
		XMLUnit.setIgnoreWhitespace(true);
	    
		DifferenceListener identicalListener = new MyDifferenceListener();
		DifferenceListener attributeListener = new IgnoreAbstractAndHiddenAttribute();
		
		// comparing two XML using XMLUnit in Java
		List<Difference> identicalDifferences = compareXML(source, target, identicalListener);
		List<Difference> similarDifferences = compareXML(similarSource, similarTarget, attributeListener);
		// showing differences found in two xml files
		System.out.println("Identical differences");
		printDifferences(identicalDifferences);
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		System.out.println("Similar differences");
		printDifferences(similarDifferences);
		
		printResult(identicalDifferences, similarDifferences);
	}

	public static List<org.custommonkey.xmlunit.Difference> compareXML(BufferedReader source, BufferedReader target, DifferenceListener listener) throws SAXException, IOException {

        //creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);
		
        //for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		detailXmlDiff.overrideDifferenceListener(listener);
		return detailXmlDiff.getAllDifferences();
	}

	public static void printDifferences(List<Difference> differences) {
		int totalDifferences = differences.size();
		System.out.println("===============================");
		System.out.println("Total differences : " + totalDifferences);
		System.out.println("================================");
		
		for (Difference difference : differences) {
			System.out.println(difference);
		}
	}
	
	private void printResult(List<Difference> identicalDifferences, List<Difference> similarDifferences) {
		int differences = identicalDifferences.size() - similarDifferences.size();
		System.out.println("===============================");
		System.out.println("Deviation : " + differences);
		System.out.println("================================");
	}
}
