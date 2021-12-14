package comparators;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import transformations.Main;

/**
 * Compares two XML-Files.
 * 
 * @author Atilla
 *
 */
public class RoundTripFeatureIDEXMLComparator extends XMLComparator {
	private String sourceFolderFeatureIDE = "src/test/resource/roundTrip/";
	private String targetFolderVave = "target/src/test/resource/models/vave/";

	public RoundTripFeatureIDEXMLComparator() {
		this.targetFolder = "target/src/test/resource/models/FeatureIDE/";
	}
	/**
	 * Generates VaVemodels, by transforming FeatureIDE-Models in the source
	 * FeatureIDE folder(default: src/test/resource/roundTrip/) to VaVemodels.
	 * Transforms then the VaVemodels to FeatureIDE-Models. The default folder for
	 * the generated VaVemodels is target/src/test/resource/models/vave/. The
	 * default folder for the generated FeatureIDE-Model XML-Files is
	 * target/src/test/resource/models/FeatureIDE/.
	 */
	public void generateRoundTripXMLFiles() {
		addFilesToList(fileList, "xml", sourceFolderFeatureIDE);
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
			Main.generateFeatureIDEXMLFile(file, name, targetFolder);
		}
	}

	public String getTargetFolderVave() {
		return this.targetFolderVave;
	}
}
