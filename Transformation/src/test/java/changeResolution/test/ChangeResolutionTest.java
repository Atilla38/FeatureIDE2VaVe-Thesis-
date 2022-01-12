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
import transformations.Transformation;

/**
 * The super class of the change resolution tests. It starts the change
 * resolution and sets the statistic of the evolution class.
 * 
 * @author Atilla Ates
 *
 */
class ChangeResolutionTest {
	private static String targetFolderNewStateVave = "target/src/test/resource/models/changeResolution/vave/newState/";
	protected static String targetFolderOldStateVave = "target/src/test/resource/models/changeResolution/vave/oldState/";
	protected static String sourceFolderNewStateFeatureIDE;
	private static String sourceFolderUserChangesStrategy = "src/test/resource/changeResolution/userChanges/vave/strategy/";
	private static String sourceFolderRedundancyFreeSequenz = "src/test/resource/changeResolution/userChanges/vave/redundancy free/";

	protected static StateBasedChangeResolutionStrategy strategy;
	protected static ChangeResolutionPrinter printer;

	protected static EvolutionClassStatisticCounter totalCounter;
	protected static EvolutionClassStatisticCounter specializationCounter;
	protected static EvolutionClassStatisticCounter generalizationCounter;
	protected static EvolutionClassStatisticCounter arbitraryCounter;
	protected static EvolutionClassStatisticCounter refactoringCounter;

	protected static List<String> results;
	protected static List<EvolutionClassStatisticCounter> counterList = new ArrayList<EvolutionClassStatisticCounter>();;

	@BeforeAll
	protected static void initialize() {
		printer = new ChangeResolutionPrinter();
		strategy = new DefaultStateBasedChangeResolutionStrategy();
		totalCounter = new EvolutionClassStatisticCounter();
		specializationCounter = new EvolutionClassStatisticCounter();
		generalizationCounter = new EvolutionClassStatisticCounter();
		arbitraryCounter = new EvolutionClassStatisticCounter();
		refactoringCounter = new EvolutionClassStatisticCounter();
		results = new ArrayList<String>();

		totalCounter.setName("Total");
		specializationCounter.setName("Specialization");
		generalizationCounter.setName("Generalization");
		arbitraryCounter.setName("Arbitrary");
		refactoringCounter.setName("Refactoring");

		counterList.add(totalCounter);
		counterList.add(specializationCounter);
		counterList.add(generalizationCounter);
		counterList.add(arbitraryCounter);
		counterList.add(refactoringCounter);
	}

	/**
	 * Starts the Vitruvius state based change resolution.
	 * 
	 * @param oldState The old state of the model.
	 * @param name     The name of the old state model.
	 * @param counter  The evolution statistic counter.
	 * @throws IOException
	 */
	protected void changeResolutionEvolutionClass(Resource oldState, String name,
			EvolutionClassStatisticCounter counter) throws IOException {
		String evolutionClass = counter.getName().toLowerCase();
		Resource newState = Transformation.generateVaveModel(
				new File(sourceFolderNewStateFeatureIDE + evolutionClass + "/" + name + " " + evolutionClass + ".xml"),
				name + evolutionClass, targetFolderNewStateVave);

		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		totalCounter.increaseTotalChangeResolutions();
		counter.increaseTotalChangeResolutions();
		this.checkChangeResolution(change, name, counter);
	}

	/**
	 * Documents the statistic of the evolution classes.
	 * 
	 * @param checkChangeResolution True if the change resolution was correct.
	 * @param counter               The evolution counter which should hold the
	 *                              statistics.
	 */
	protected void documentStatistic(boolean checkChangeResolution, EvolutionClassStatisticCounter counter) {
		if (checkChangeResolution) {
			counter.increaseCorrectChangeResolutions();
		} else {
			counter.increaseIncorrectChangeResolutions();
		}
		counter.increaseTotalChangeResolutions();
	}

	/**
	 * Checks if the change resolution is correct.
	 * 
	 * @param change         The derived Vitruvius change resolution.
	 * @param name           The name of the old state model.
	 * @param evolutionClass The evolution class.
	 * @return Returns true if the change resolution is correct. False else.
	 * @throws IOException
	 */
	private void checkChangeResolution(VitruviusChange change, String name,
			EvolutionClassStatisticCounter evolutionClassCounter) throws IOException {
		String evolutionClassName = evolutionClassCounter.getName();
		List<String> strategyChangeSequenzList = printer.print(change, name + " " + evolutionClassName, name);
		Path pathVaveUserChangeSequenz = Paths
				.get(sourceFolderUserChangesStrategy + name + " " + evolutionClassName + ".txt");
		String vaveUserChangeSequenz = Files.readString(pathVaveUserChangeSequenz, StandardCharsets.US_ASCII);
		Stream<String> streamVaveUserChangeSequenz = vaveUserChangeSequenz.lines();
		List<String> strategyChangeList = streamVaveUserChangeSequenz.collect(Collectors.toList());
		String changeBetween = "(" + name + ", " + name + " " + evolutionClassName + ")";

		Path pathRedundancyFreeChangeSequenz = Paths
				.get(sourceFolderRedundancyFreeSequenz + name + " " + evolutionClassName + ".txt");
		String redundancyFreeChangeSequenz = Files.readString(pathRedundancyFreeChangeSequenz,
				StandardCharsets.US_ASCII);
		Stream<String> streamRedundancyFreeChangeSequenz = redundancyFreeChangeSequenz.lines();
		List<String> redundancyFreeChangeSequenzList = streamRedundancyFreeChangeSequenz.collect(Collectors.toList());

		int operationDifference = strategyChangeSequenzList.size() - redundancyFreeChangeSequenzList.size();
		evolutionClassCounter.increaseTotalResolutionOperations(strategyChangeSequenzList.size());
		evolutionClassCounter
				.increaseTotalRedundancyFreeSequenceChangeOperations(redundancyFreeChangeSequenzList.size());
		totalCounter.increaseTotalResolutionOperations(strategyChangeSequenzList.size());
		totalCounter.increaseTotalRedundancyFreeSequenceChangeOperations(redundancyFreeChangeSequenzList.size());

		String redundancy = "redundancy free";
		if (operationDifference > 0) {
			redundancy = "not redundancy free";
			totalCounter.increaseTotalNotRedundancyFreeChangeResolutions();
			evolutionClassCounter.increaseTotalNotRedundancyFreeChangeResolutions();
		} else if (operationDifference == 0) {
			totalCounter.increaseTotalRedundancyFreeChangeResolutions();
			evolutionClassCounter.increaseTotalRedundancyFreeChangeResolutions();
		} else {
			throw new IllegalArgumentException();
		}

		String correctRedundancyOutput = changeBetween + " Diff:" + operationDifference + " [CORRECT "
				+ redundancy.toUpperCase() + "]";

		if (strategyChangeSequenzList.equals(strategyChangeList)) {
			System.out.println("Change Resolution is " + redundancy + " correct");
			totalCounter.increaseCorrectChangeResolutions();
			evolutionClassCounter.increaseCorrectChangeResolutions();
			totalCounter.increaseRedundancyOperationDifference(operationDifference);
			evolutionClassCounter.increaseRedundancyOperationDifference(operationDifference);
			results.add(correctRedundancyOutput);
			return;
		} else {
			System.out.println("Change resolution is not correct");
			totalCounter.increaseIncorrectChangeResolutions();
			evolutionClassCounter.increaseIncorrectChangeResolutions();
			results.add(changeBetween + "[CORRECT X]");
		}
	}

	@AfterAll
	protected static void evaluateTest() {
		printer.printResult(counterList, results);
		assertEquals(0, totalCounter.getIncorrectChangeResolutions());
	}
}
