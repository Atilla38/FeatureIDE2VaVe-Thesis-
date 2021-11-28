package transformations.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

/**
 * Tests the implemented transformations by comparing the XML-Files with the
 * XMLComparators.
 * 
 * @author Atilla Ates
 *
 */
class TransformationTests {

	@Test
	void roundTripTest() throws SAXException, IOException {
		RoundTripXMLComparator comparator = new RoundTripXMLComparator();
		comparator.generateRoundTripXMLFiles();
		compareFiles(comparator);
	}

	@Test
	void vave2XMLTest() throws SAXException, IOException {
		Vave2XMLComparator comparator = new Vave2XMLComparator();
		comparator.generateVave2XMLFiles();
		compareFiles(comparator);
	}

	/**
	 * Compares the XML-Files.
	 * 
	 * @param comparator The comparator which compares the XML-Files.
	 * @throws SAXException
	 * @throws IOException
	 */
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
				totalNotAbstractAndHiddenFeatures = totalNotAbstractAndHiddenFeatures
						+ counter.countFeatures(file, false);

				BufferedReader source = createBufferedReader(file.getPath());
				BufferedReader target = createBufferedReader(targetFolderFeatureIDE + file.getName());

				BufferedReader similarSource = createBufferedReader(file.getPath());
				BufferedReader similarTarget = createBufferedReader(targetFolderFeatureIDE + file.getName());
				XMLUnit.setIgnoreWhitespace(true);
				createBufferedReader(file.getPath());
				createBufferedReader(targetFolderFeatureIDE + file.getName());
				DifferenceListener identicalListener = new IgnoreNotTransformableFeatureModelChildren();
				DifferenceListener similarListener = new IgnoreNotTransformableAttributes(); // Extends the
																								// IgnoreNotTransformableFeatureModelChildren
																								// listener.

				// comparing two XML using XMLUnit in Java
				List<Difference> identicalDifferences = comparator.compareXML(source, target, identicalListener);
				List<Difference> similarDifferences = comparator.compareXML(similarSource, similarTarget,
						similarListener);
				// showing differences found in two xml files
				printer.printDifferences(file.getName(), identicalDifferences, similarDifferences);

				printer.printSeperator();

				totalIdenticalDifferences = totalIdenticalDifferences + identicalDifferences.size();

				totalSimilarDifferences = totalSimilarDifferences + similarDifferences.size();

			}

			printer.printResult(fileList.size(), totalIdenticalDifferences, totalSimilarDifferences, totalFeatures,
					totalNotAbstractAndHiddenFeatures);

			assertEquals(0, totalSimilarDifferences);
		}
	}

	/**
	 * Creates a BufferedReader and returns it.
	 * 
	 * @param path The path of the file.
	 * @return Returns the generated BufferedReader.
	 * @throws FileNotFoundException
	 */
	private BufferedReader createBufferedReader(String path) throws FileNotFoundException {
		FileInputStream fis1 = new FileInputStream(path);
		return new BufferedReader(new InputStreamReader(fis1));
	}

}
