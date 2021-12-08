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
 * Test the Vitruvius state based change resolution with a Vitruvius model as
 * the old state and a transformed FeatureIDE Feature-Model as the new state.
 * 
 * @author Atilla Ates
 *
 */
public class ChangeResolutionVave2FeatureIDETest extends ChangeResolutionTest {

	@Test
	void testDefaultStateBasedChangeResolutionStrategyVaVe2FeatureIDE() throws IOException {
		XMLComparator fileReader = new RoundTripXMLComparator();
		List<File> oldStateFileList = new ArrayList<File>();
		sourceFolderNewStateFeatureIDE = "src/test/resource/changeResolution/vave2FeatureIDE/FeatureIDE/newState/";

		fileReader.addFilesToList(oldStateFileList, "vavemodel",
				"src/test/resource/changeResolution/vave2FeatureIDE/vave/oldState/");

		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Main.loadVavemodel(file);
			this.changeResolutionEvolutionClass(oldState, name, specializationCounter);
			this.changeResolutionEvolutionClass(oldState, name, generalizationCounter);
		}
	}
}
