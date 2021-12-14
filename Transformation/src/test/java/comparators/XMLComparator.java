package comparators;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.DifferenceListener;
import org.xml.sax.SAXException;

/**
 * Compares two XML-Files.
 * 
 * @author Atilla
 *
 */
public abstract class XMLComparator {
	protected List<File> fileList = new ArrayList<File>();
	protected String sourceFolder;
	protected String targetFolder;

	public void addFilesToList(List<File> list, String ending, String folderPath) {
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			String filename = file.getName();
			if (filename.endsWith("." + ending) || filename.endsWith("." + ending.toUpperCase())) {
				list.add(file);
			}
		}
	}

	/**
	 * Compares the source and the target XML-Files and returns the differences
	 * found by the DifferenceListener.
	 * 
	 * @param source   The source XML-File.
	 * @param target   The target XML-File.
	 * @param listener The DifferenceListener.
	 * @return Returns the differences found by the DifferenceListener.
	 * @throws SAXException
	 * @throws IOException
	 */
	public List<org.custommonkey.xmlunit.Difference> compareXML(BufferedReader source, BufferedReader target,
			DifferenceListener listener) throws SAXException, IOException {

		// creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);

		// for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		detailXmlDiff.overrideDifferenceListener(listener);
		return detailXmlDiff.getAllDifferences();
	}

	public List<File> getFileList() {
		return this.fileList;
	}

	public String getSourceFolder() {
		return this.sourceFolder;
	}

	public String getTargetFolder() {
		return this.targetFolder;
	}
}
