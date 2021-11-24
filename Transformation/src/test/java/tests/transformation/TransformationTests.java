package tests.transformation;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceListener;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import comparators.RoundTripXMLComparator;
import comparators.Vave2XMLComparator;
import comparators.XMLComparator;
import counter.FeatureIDEFeatureCounter;
import differenceListeners.IgnoreNotTransformableAttributes;
import differenceListeners.IgnoreNotTransformableFeatureModelChildren;
import printer.Printer;

class TransformationTests {

	@Test
	void roundTripTest() throws SAXException, IOException {
		RoundTripXMLComparator comparator = new RoundTripXMLComparator();
		comparator.generateRoundTripXMLFiles();
		compareFiles(comparator);
	}
	
	
	void vave2XMLTest() throws SAXException, IOException {
		Vave2XMLComparator comparator = new Vave2XMLComparator();
		comparator.generateVave2XMLFiles();
		compareFiles(comparator);
	}
	
	private void compareFiles(XMLComparator comparator) throws SAXException, IOException {
		{
			int totalIdenticalDifferences = 0;
			int totalSimilarDifferences = 0;
			int totalFeatures = 0;
			int totalNotAbstractAndHiddenFeatures = 0;
			List<File> fileList = comparator.getFileList();
			String targetFolderFeatureIDE = comparator.getTargetFolderFeatureIDE();
			Printer printer = new Printer();
			FeatureIDEFeatureCounter counter = new FeatureIDEFeatureCounter();
			
			for (File file : fileList) {
				totalFeatures = totalFeatures + counter.countFeatures(file, true);
				totalNotAbstractAndHiddenFeatures = totalNotAbstractAndHiddenFeatures + counter.countFeatures(file, false);
				FileInputStream fis1 = new FileInputStream(file.getPath());
				FileInputStream fis2 = new FileInputStream(targetFolderFeatureIDE + file.getName());

				FileInputStream similarFis1 = new FileInputStream(file.getPath());
				FileInputStream similarFis2 = new FileInputStream(targetFolderFeatureIDE + file.getName());

				BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
				BufferedReader target = new BufferedReader(new InputStreamReader(fis2));

				BufferedReader similarSource = new BufferedReader(new InputStreamReader(similarFis1));
				BufferedReader similarTarget = new BufferedReader(new InputStreamReader(similarFis2));
				XMLUnit.setIgnoreWhitespace(true);

				DifferenceListener identicalListener = new IgnoreNotTransformableFeatureModelChildren();
				DifferenceListener similarListener = new IgnoreNotTransformableAttributes(); // Extends the IgnoreNotTransformableFeatureModelChildren listener.

				// comparing two XML using XMLUnit in Java
				List<Difference> identicalDifferences = comparator.compareXML(source, target, identicalListener);
				List<Difference> similarDifferences = comparator.compareXML(similarSource, similarTarget, similarListener);
				// showing differences found in two xml files
				printer.printDifferences(file.getName(), identicalDifferences, similarDifferences);

				printer.printSeperator();

				totalIdenticalDifferences = totalIdenticalDifferences + identicalDifferences.size();

				totalSimilarDifferences = totalSimilarDifferences + similarDifferences.size();

			}

			printer.printResult(fileList.size(), totalIdenticalDifferences, totalSimilarDifferences, totalFeatures, totalNotAbstractAndHiddenFeatures);
		}
	}

}
