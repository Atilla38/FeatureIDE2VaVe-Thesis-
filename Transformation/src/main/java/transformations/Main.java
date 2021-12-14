package transformations;

import java.io.File;

/**
 * This is the main class of the transformation. You can run the transformation
 * and can set the name and path of the files.
 * 
 * @author Atilla
 *
 */
public class Main {

	public static void main(String[] args) {
		String featureIDEFilePath = args[0];
		String vavemodelName = args[1];
		String targetFolderVavemodel = args[2];

		String vavemodelFilePath = args[3];
		String featureIDEModelName = args[4];
		String targetFolderFeatureIDE = args[5];

		File featureIDEFile = new File(featureIDEFilePath);
		Transformation.generateVaveModel(featureIDEFile, vavemodelName, targetFolderVavemodel);
		File vaveFile = new File(vavemodelFilePath);
		Transformation.generateFeatureIDEXMLFile(vaveFile, featureIDEModelName, targetFolderFeatureIDE);
	}

}