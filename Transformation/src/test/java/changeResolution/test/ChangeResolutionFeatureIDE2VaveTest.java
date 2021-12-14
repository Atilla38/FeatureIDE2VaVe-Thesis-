package changeResolution.test;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import comparators.RoundTripFeatureIDEXMLComparator;
import comparators.XMLComparator;
import tools.vitruv.framework.change.description.VitruviusChange;
import transformations.Transformation;

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

		XMLComparator fileReader = new RoundTripFeatureIDEXMLComparator();

		List<File> oldStateFileList = new ArrayList<File>();

		fileReader.addFilesToList(oldStateFileList, "xml", "src/test/resource/changeResolution/FeatureIDE/oldState/");
		/*
		 * File oldFile = new
		 * File("src/test/resource/changeResolution/FeatureIDE/not automated/oldState/car4.xml"
		 * ); File newFile = new
		 * File("src/test/resource/changeResolution/FeatureIDE/not automated/newState/car4.xml"
		 * ); Resource oldState = Transformation.generateVaveModel(oldFile, "car4Old",
		 * targetFolderOldStateVave); Resource newState =
		 * Transformation.generateVaveModel(newFile, "car4New",
		 * targetFolderOldStateVave);
		

		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		System.out.println(change);*/

		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Transformation.generateVaveModel(file, name, targetFolderOldStateVave);

			this.changeResolutionEvolutionClass(oldState, name, specializationCounter);
			this.changeResolutionEvolutionClass(oldState, name, generalizationCounter);
			this.changeResolutionEvolutionClass(oldState, name, arbitraryCounter);
		}

	}
}
