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

import differenceListeners.IgnoreNotTransformableAttributes;
import differenceListeners.IgnoreNotTransformableFeatureModelChildren;
import printer.Printer;
import transformations.Main;

class RoundTripXMLComparator {
	private static List<File> fileList = new ArrayList<File>();
	private static String sourceFolder = "src/test/resource/roundTrip/";
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
