package changeResolution.test;

import static org.junit.Assert.assertEquals;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import comparators.RoundTripXMLComparator;
import comparators.XMLComparator;
import counter.EvolutionClassStatisticCounter;
import printer.ChangeResolutionPrinter;
import tools.vitruv.framework.change.description.VitruviusChange;
import tools.vitruv.framework.domains.DefaultStateBasedChangeResolutionStrategy;
import tools.vitruv.framework.domains.StateBasedChangeResolutionStrategy;
import transformations.Main;

class ChangeResolutionTest {
	private static String targetFolderOldStateVave = "target/src/test/resource/models/changeResolution/vave/oldState/";
	private static String targetFolderNewStateVave = "target/src/test/resource/models/changeResolution/vave/newState/";
	private static String sourceFolderNewStateFeatureIDE = "src/test/resource/changeResolution/FeatureIDE/newState/";
	private static String sourceFolderUserChanges = "src/test/resource/changeResolution/userChanges/vave/";

	private StateBasedChangeResolutionStrategy strategy;
	private ChangeResolutionPrinter printer;

	private EvolutionClassStatisticCounter totalCounter;
	private EvolutionClassStatisticCounter specializationCounter;
	private EvolutionClassStatisticCounter generalizationCounter;

	@Test
	void testDefaultStateBasedChangeResolutionStrategy() throws IOException {

		this.printer = new ChangeResolutionPrinter();
		this.strategy = new DefaultStateBasedChangeResolutionStrategy();
		this.totalCounter = new EvolutionClassStatisticCounter();
		this.specializationCounter = new EvolutionClassStatisticCounter();
		this.generalizationCounter = new EvolutionClassStatisticCounter();
		
		XMLComparator fileReader = new RoundTripXMLComparator();

		List<File> oldStateFileList = new ArrayList<File>();
		List<File> newStateFileList = new ArrayList<File>();
		List<File> userChangesFileList = new ArrayList<File>();

		fileReader.addFilesToList(oldStateFileList, "xml", "src/test/resource/changeResolution/FeatureIDE/oldState/");
		fileReader.addFilesToList(newStateFileList, "xml", "src/test/resource/changeResolution/FeatureIDE/newState/");
		fileReader.addFilesToList(userChangesFileList, "txt", "src/test/resource/changeResolution/userChanges/vave/");
		
		/*File oldStateFile = new File("src/test/resource/changeResolution/FeatureIDE/oldState/car3.xml");
		File newStateFile = new File("src/test/resource/changeResolution/FeatureIDE/newState/specialization/car3.xml");
		
		Resource oldState = Main.generateVaveModel(oldStateFile, "car3", targetFolderOldStateVave);
		Resource newState = Main.generateVaveModel(newStateFile, "car3generalization", targetFolderNewStateVave);
		
		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		System.out.println();*/
		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Main.generateVaveModel(file, name, targetFolderOldStateVave);

			this.changeResolutionEvolutionClass(oldState, name, "specialization");
			this.changeResolutionEvolutionClass(oldState, name, "generalization");

			

		}
		this.printer.printResult(this.totalCounter, this.specializationCounter, this.generalizationCounter);
		assertEquals(0, this.totalCounter.getIncorrectChangeResolutions());
	}

	private void changeResolutionEvolutionClass(Resource oldState, String name, String evolutionClass)
			throws IOException {
		Resource newState = Main.generateVaveModel(
				new File(sourceFolderNewStateFeatureIDE + evolutionClass +"/"+ name + " " + evolutionClass + ".xml"),
				name + evolutionClass, targetFolderNewStateVave);

		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		this.totalCounter.increaseTotalChangeResolutions();
		boolean checkChangeResolution = this.checkChangeResolution(change, name, evolutionClass);
		this.documentStatistic(checkChangeResolution, evolutionClass);
	}

	private void documentStatistic(boolean checkChangeResolution, String evolutionClass) {
		switch (evolutionClass) {
		case "specialization":
			if (checkChangeResolution) {
				this.specializationCounter.increaseCorrectChangeResolutions();
			} else {
				this.specializationCounter.increaseIncorrectChangeResolutions();
			}
			this.specializationCounter.increaseTotalChangeResolutions();

			break;
		case "generalization":
			if (checkChangeResolution) {
				this.generalizationCounter.increaseCorrectChangeResolutions();
			} else {
				this.generalizationCounter.increaseIncorrectChangeResolutions();
			}
			this.generalizationCounter.increaseTotalChangeResolutions();
			break;
		default:
			throw new IllegalArgumentException("Unsupported evolution class");
		}
	}

	private boolean checkChangeResolution(VitruviusChange change, String name, String evolutionClass)
			throws IOException {
		List<String> vitruviusChangeList = printer.print(change, name + " " + evolutionClass, name);
		Path path = Paths.get(sourceFolderUserChanges + name + " " + evolutionClass + ".txt");
		String content = Files.readString(path, StandardCharsets.US_ASCII);
		Stream<String> stream = content.lines();
		List<String> userChangeList = stream.collect(Collectors.toList());

		if (vitruviusChangeList.equals(userChangeList)) {
			System.out.println("Change Resolution is CONSERVATIVE");
			this.totalCounter.increaseCorrectChangeResolutions();
			return true;
		} else {
			for (String changeString : vitruviusChangeList) {
				if (!userChangeList.contains(changeString)) {
					System.out.println("Change resolution is not CONSERVATIVE or ADMISSIBLE");
					this.totalCounter.increaseIncorrectChangeResolutions();
					return false;
				}
			}
			System.out.println("Change resolution is ADMISSIBLE");
			this.totalCounter.increaseCorrectChangeResolutions();
			return true;
		}
	}

}
