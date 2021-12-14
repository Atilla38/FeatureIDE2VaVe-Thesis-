package comparators;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import transformations.Main;

/**
 * Compares two XML-Files.
 * 
 * @author Atilla Ates
 *
 */
public class RoundTripVaveComparator extends XMLComparator {
	private String sourceFolderVave = "src/test/resource/vave2xml/vave/";
	private String targetFolderFeatureIDE = "target/src/test/resource/models/FeatureIDE/";

	public RoundTripVaveComparator() {
		this.targetFolder = "target/src/test/resource/models/vave/";
	}
	/**
	 * Generates FeatureIDE Feature-Model XML-Files, by transforming VaVemodels in
	 * the source VaVe folder(default: src/test/resource/vave2xml/vave/).
	 */
	public void generateVave2XMLFiles() {
		addFilesToList(fileList, "vavemodel", sourceFolderVave); // XML files on which the self created vavemodels are
		for (File file : fileList) { // Generate for all .vavemodel files in the list a XML file with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateFeatureIDEXMLFile(file, name, targetFolderFeatureIDE);
		}

		List<File> vaveFileList = new ArrayList<File>();
		addFilesToList(vaveFileList, "xml", targetFolderFeatureIDE);
		for (File file : vaveFileList) { // Generate for all .vavemodel files in the list a XML file with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateVaveModel(file, name, targetFolder);
		}
	}

}
