package roundtripTest;

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

import differenceListeners.IgnoreNotTransformableAttributes;
import differenceListeners.IgnoreNotTransformableFeatureModelChildren;
import transformations.Main;

class XMLComparator {
	private static List<File> fileList = new ArrayList<File>();
	private static String sourceFolder = "src/test/resource/";
	private static String targetFolderVave = "target/src/test/resource/models/vave/";
	private static String targetFolderFeatureIDE = "target/src/test/resource/models/FeatureIDE/";

	@BeforeAll
	public static void generateRoundTripXMLFiles() {
		addFilesToList(fileList, "xml", sourceFolder);
		for (File file : fileList) { // Generate for all XML files in the list a VaVe-Model with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateVaveModel(file, name, targetFolderVave);
		}

		List<File> vaveFileList = new ArrayList<File>();
		addFilesToList(vaveFileList, "vavemodel", targetFolderVave);
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
		for (File file : fileList) {
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
			printDifferences(file.getName(), identicalDifferences, similarDifferences);

			printSeperator();

			totalIdenticalDifferences = totalIdenticalDifferences + identicalDifferences.size();

			totalSimilarDifferences = totalSimilarDifferences + similarDifferences.size();

		}

		printResult(totalIdenticalDifferences, totalSimilarDifferences);
	}

	private void printSeperator() {
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
	}

	private void printResult(int totalIdenticalDifferences, int totalSimilarDifferences) {
		System.out.println("Number of compared XML-Files:" + fileList.size());

		System.out.println("Sum of all total identical differnces: " + totalIdenticalDifferences);

		System.out.println("Sum of all total similar differnces: " + totalSimilarDifferences);

		System.out.println("Total deviation: " + (totalIdenticalDifferences - totalSimilarDifferences));
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

	public static void printDifferences(String fileName, List<Difference> identicalDifferences,
			List<Difference> similarDifferences) {
		int numberOfIdenticalDifferences = identicalDifferences.size();
		System.out.println("===============================");
		System.out.println("Identical differences : " + numberOfIdenticalDifferences);
		System.out.println("================================");

		for (Difference difference : identicalDifferences) {
			System.out.println(difference);
		}

		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		int numberOfSimilarDifferences = similarDifferences.size();
		System.out.println("===============================");
		System.out.println("Similar differences : " + numberOfSimilarDifferences);
		System.out.println("================================");

		for (Difference difference : similarDifferences) {
			System.out.println(difference);
		}

		int differences = identicalDifferences.size() - similarDifferences.size();
		System.out.println("===============================");
		System.out.println("Compared file : " + fileName);
		System.out.println("Identical differences : " + numberOfIdenticalDifferences);
		System.out.println("Similar differences : " + numberOfSimilarDifferences);
		System.out.println("Deviation : " + differences);
		System.out.println("================================");
	}
}
