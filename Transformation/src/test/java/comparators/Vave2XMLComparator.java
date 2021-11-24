package comparators;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import transformations.Main;

public class Vave2XMLComparator extends XMLComparator {
	protected String sourceFolderFeatureIDE = "src/test/resource/vave2xml/FeatureIDE/";
	private String sourceFolderVave = "src/test/resource/vave2xml/vave/";
	protected String targetFolderFeatureIDE = "target/src/test/resource/models/FeatureIDE/";

	public void generateVave2XMLFiles() {
		addFilesToList(fileList, "xml", sourceFolderFeatureIDE); // XML files on which the self created vavemodels are
																	// based.

		List<File> vaveFileList = new ArrayList<File>();
		addFilesToList(vaveFileList, "vavemodel", sourceFolderVave);
		for (File file : vaveFileList) { // Generate for all .vavemodel files in the list a XML file with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateFeatureIDEXMLFile(file, name, targetFolderFeatureIDE);
		}
	}

}
