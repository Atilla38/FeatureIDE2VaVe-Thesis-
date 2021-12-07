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
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import counter.EvolutionClassStatisticCounter;
import printer.ChangeResolutionPrinter;
import tools.vitruv.framework.change.description.VitruviusChange;
import tools.vitruv.framework.domains.DefaultStateBasedChangeResolutionStrategy;
import tools.vitruv.framework.domains.StateBasedChangeResolutionStrategy;
import transformations.Main;

class ChangeResolutionTest {
	private static String targetFolderNewStateVave = "target/src/test/resource/models/changeResolution/vave/newState/";
	protected static String sourceFolderNewStateFeatureIDE;
	private static String sourceFolderUserChanges = "src/test/resource/changeResolution/userChanges/vave/";

	protected static StateBasedChangeResolutionStrategy strategy;
	protected static ChangeResolutionPrinter printer;

	protected static EvolutionClassStatisticCounter totalCounter;
	protected static EvolutionClassStatisticCounter specializationCounter;
	protected static EvolutionClassStatisticCounter generalizationCounter;
	protected static EvolutionClassStatisticCounter arbitraryCounter;
	protected static List<String> results;
	private static List<EvolutionClassStatisticCounter> counterList = new ArrayList<EvolutionClassStatisticCounter>();;

	@BeforeAll
	protected static void initialize() {
		printer = new ChangeResolutionPrinter();
		strategy = new DefaultStateBasedChangeResolutionStrategy();
		totalCounter = new EvolutionClassStatisticCounter();
		specializationCounter = new EvolutionClassStatisticCounter();
		generalizationCounter = new EvolutionClassStatisticCounter();
		arbitraryCounter = new EvolutionClassStatisticCounter();
		results = new ArrayList<String>();

		totalCounter.setName("Total");
		specializationCounter.setName("Specialization");
		generalizationCounter.setName("genera,lization");
		arbitraryCounter.setName("Arbitrary");

		counterList.add(totalCounter);
		counterList.add(specializationCounter);
		counterList.add(generalizationCounter);
		counterList.add(arbitraryCounter);
	}

	protected void changeResolutionEvolutionClass(Resource oldState, String name, String evolutionClass)
			throws IOException {
		Resource newState = Main.generateVaveModel(
				new File(sourceFolderNewStateFeatureIDE + evolutionClass + "/" + name + " " + evolutionClass + ".xml"),
				name + evolutionClass, targetFolderNewStateVave);

		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		totalCounter.increaseTotalChangeResolutions();
		boolean checkChangeResolution = this.checkChangeResolution(change, name, evolutionClass);
		this.documentStatistic(checkChangeResolution, evolutionClass);
	}

	protected void documentStatistic(boolean checkChangeResolution, String evolutionClass) {
		switch (evolutionClass) {
		case "specialization":
			if (checkChangeResolution) {
				specializationCounter.increaseCorrectChangeResolutions();
			} else {
				specializationCounter.increaseIncorrectChangeResolutions();
			}
			specializationCounter.increaseTotalChangeResolutions();

			break;
		case "generalization":
			if (checkChangeResolution) {
				generalizationCounter.increaseCorrectChangeResolutions();
			} else {
				generalizationCounter.increaseIncorrectChangeResolutions();
			}
			generalizationCounter.increaseTotalChangeResolutions();
			break;
		case "arbitrary":
			if (checkChangeResolution) {
				arbitraryCounter.increaseCorrectChangeResolutions();
			} else {
				arbitraryCounter.increaseIncorrectChangeResolutions();
			}
			arbitraryCounter.increaseTotalChangeResolutions();
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
		String changeBetween = "(" + name + ", " + name + " " + evolutionClass + ")";

		if (vitruviusChangeList.equals(userChangeList)) {
			System.out.println("Change Resolution is CONSERVATIVE");
			totalCounter.increaseCorrectChangeResolutions();
			results.add(changeBetween + "[CORRECT]");
			return true;
		} else {
			for (String changeString : vitruviusChangeList) {
				if (!userChangeList.contains(changeString)) {
					System.out.println("Change resolution is not CONSERVATIVE or ADMISSIBLE");
					totalCounter.increaseIncorrectChangeResolutions();
					results.add(changeBetween + "[X]");
					return false;
				}
			}
			System.out.println("Change resolution is ADMISSIBLE");
			totalCounter.increaseCorrectChangeResolutions();
			results.add(changeBetween + "[CORRECT]");
			return true;
		}
	}

	@AfterAll
	protected static void evaluateTest() {
		printer.printResult(counterList, results);
		assertEquals(0, totalCounter.getIncorrectChangeResolutions());
	}
}
