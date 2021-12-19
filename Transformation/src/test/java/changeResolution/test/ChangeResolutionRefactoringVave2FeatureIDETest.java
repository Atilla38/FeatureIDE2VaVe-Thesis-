package changeResolution.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import comparators.RoundTripFeatureIDEXMLComparator;
import comparators.XMLComparator;
import transformations.Transformation;

/**
 * Test the Vitruvius state based change resolution with a Vitruvius model as
 * the old state and a transformed FeatureIDE Feature-Model as the new state.
 * 
 * @author Atilla Ates
 *
 */
public class ChangeResolutionRefactoringVave2FeatureIDETest extends ChangeResolutionTest {
	@Test
	void testDefaultStateBasedChangeResolutionStrategyRefactoring() throws IOException {

		sourceFolderNewStateFeatureIDE = "src/test/resource/changeResolution/vave2FeatureIDE/refactoring/FeatureIDE/newState/";

		XMLComparator fileReader = new RoundTripFeatureIDEXMLComparator();

		List<File> oldStateFileList = new ArrayList<File>();

		fileReader.addFilesToList(oldStateFileList, "vavemodel",
				"src/test/resource/changeResolution/vave2FeatureIDE/refactoring/FeatureIDE/oldState/");

		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Transformation.loadVavemodel(file);

			this.changeResolutionEvolutionClass(oldState, name, refactoringCounter);
		}
	}
}
