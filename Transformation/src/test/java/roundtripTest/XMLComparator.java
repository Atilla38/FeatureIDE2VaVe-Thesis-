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

		BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
		BufferedReader target = new BufferedReader(new InputStreamReader(fis2));

		XMLUnit.setIgnoreWhitespace(true);
	
		
		// comparing two XML using XMLUnit in Java
		List<Difference> differences = compareXML(source, target);

		// showing differences found in two xml files
		printDifferences(differences);
	}

	public static List<org.custommonkey.xmlunit.Difference> compareXML(BufferedReader source, BufferedReader target) throws SAXException, IOException {

        //creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);
		
        //for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		DifferenceListener listener = new MyDifferenceListener();
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
}
