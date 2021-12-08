package changeResolution.test;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import comparators.RoundTripXMLComparator;
import comparators.XMLComparator;
import transformations.Main;

/**
 * Tests the default Vitruvius state based change resolution strategy, for the
 * transformed FeatureIDE Feature-Models.
 * 
 * @author Atilla Ates
 *
 */
public class ChangeResolutionFeatureIDE2VaveTest extends ChangeResolutionTest {

	@Test
	void testDefaultStateBasedChangeResolutionStrategyFeatureIDE2Vave() throws IOException {

		sourceFolderNewStateFeatureIDE = "src/test/resource/changeResolution/FeatureIDE/newState/";

		XMLComparator fileReader = new RoundTripXMLComparator();

		List<File> oldStateFileList = new ArrayList<File>();

		fileReader.addFilesToList(oldStateFileList, "xml", "src/test/resource/changeResolution/FeatureIDE/oldState/");

		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Main.generateVaveModel(file, name, targetFolderOldStateVave);

			this.changeResolutionEvolutionClass(oldState, name, specializationCounter);
		}
	}
}
