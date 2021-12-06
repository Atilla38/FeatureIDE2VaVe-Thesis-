package changeResolution.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;

import comparators.RoundTripXMLComparator;
import comparators.XMLComparator;
import tools.vitruv.framework.change.description.VitruviusChange;
import transformations.Main;
import transformations.vave2xml.Vave2XMLTransformation;

public class ChangeResolutionFeatureIDE2VaveTest extends ChangeResolutionTest {

	private static String targetFolderOldStateVave = "target/src/test/resource/models/changeResolution/vave/oldState/";
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private String targetFolder = "target/src/test/resource/models/vave/";
	
	@Test
	void testDefaultStateBasedChangeResolutionStrategyFeatureIDE2Vave() throws IOException {

		/*
		 * sourceFolderNewStateFeatureIDE =
		 * "src/test/resource/changeResolution/FeatureIDE/newState/";
		 * 
		 * XMLComparator fileReader = new RoundTripXMLComparator();
		 * 
		 * List<File> oldStateFileList = new ArrayList<File>();
		 * 
		 * fileReader.addFilesToList(oldStateFileList, "xml",
		 * "src/test/resource/changeResolution/FeatureIDE/oldState/");
		 * 
		 * for (File file : oldStateFileList) { String fileName = file.getName(); String
		 * name = fileName.substring(0, fileName.lastIndexOf(".")); Resource oldState =
		 * Main.generateVaveModel(file, name, targetFolderOldStateVave);
		 * 
		 * this.changeResolutionEvolutionClass(oldState, name, "specialization");
		 * this.changeResolutionEvolutionClass(oldState, name, "generalization");
		 * 
		 * }
		 */

		File oldStateFile = new File("src/test/resource/changeResolution/FeatureIDE/oldState/car3.xml");
		File newStateFile = new File("src/test/resource/changeResolution/FeatureIDE/newState/generalization/car3 generalization.xml");

		Resource oldState = Main.generateVaveModel(oldStateFile, "test", targetFolderOldStateVave);
		Resource newState = Main.generateVaveModel(newStateFile, "test", targetFolderNewStateVave);
		
		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		VitruviusChange unresolvedChange = change.unresolve();
		unresolvedChange.resolveAndApply(oldState.getResourceSet());
		
		
		System.out.println(oldState.getContents());
		
		try {
			oldState.save(Collections.EMPTY_MAP);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
