package comparators;

import java.io.BufferedReader;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceListener;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import counter.FeatureIDEFeatureCounter;
import differenceListeners.IgnoreNotTransformableAttributes;
import differenceListeners.IgnoreNotTransformableFeatureModelChildren;
import printer.Printer;
import transformations.Main;

class Vave2XMLComparator {
	private static List<File> fileList = new ArrayList<File>();
	private static String sourceFolderFeatureIDE = "src/test/resource/vave2xml/FeatureIDE/";
	private static String sourceFolderVave = "src/test/resource/vave2xml/vave/";
	private static String targetFolderFeatureIDE = "target/src/test/resource/models/FeatureIDE/";

	@BeforeAll
	public static void generateVave2XMLFiles() {
		addFilesToList(fileList, "xml", sourceFolderFeatureIDE); // XML files on which the self created vavemodels are based.

		List<File> vaveFileList = new ArrayList<File>();
		addFilesToList(vaveFileList, "vavemodel", sourceFolderVave);
		for (File file : vaveFileList) { // Generate for all .vavemodel files in the list a XML file with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateFeatureIDEXMLFile(file, name, targetFolderFeatureIDE);
		}
	}

	private static void addFilesToList(List<File> list, String ending, String folderPath) {
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			String filename = file.getName();
			if (filename.endsWith("." + ending) || filename.endsWith("." + ending.toUpperCase())) {
				list.add(file);
			}
		}
	}

	@Test
	public void given2XMLS_whenGeneratesDifferences_thenCorrect() throws SAXException, IOException {

		int totalIdenticalDifferences = 0;
		int totalSimilarDifferences = 0;
		int totalFeatures = 0;
		int totalNotAbstractAndHiddenFeatures = 0;
		Printer printer = new Printer();
		FeatureIDEFeatureCounter counter = new FeatureIDEFeatureCounter();
		
		for (File file : fileList) {
			totalFeatures =+ counter.countFeatures(file, true);
			totalNotAbstractAndHiddenFeatures =+ counter.countFeatures(file, false);
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
			List<Difference> identicalDifferences = compareXML(source, target, identicalListener);
			List<Difference> similarDifferences = compareXML(similarSource, similarTarget, similarListener);
			// showing differences found in two xml files
			printer.printDifferences(file.getName(), identicalDifferences, similarDifferences);

			printer.printSeperator();

			totalIdenticalDifferences = totalIdenticalDifferences + identicalDifferences.size();

			totalSimilarDifferences = totalSimilarDifferences + similarDifferences.size();

		}

		printer.printResult(fileList.size(), totalIdenticalDifferences, totalSimilarDifferences, totalFeatures, totalNotAbstractAndHiddenFeatures);
	}

	public static List<org.custommonkey.xmlunit.Difference> compareXML(BufferedReader source, BufferedReader target,
			DifferenceListener listener) throws SAXException, IOException {

		// creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);

		// for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		detailXmlDiff.overrideDifferenceListener(listener);
		return detailXmlDiff.getAllDifferences();
	}

	
}
