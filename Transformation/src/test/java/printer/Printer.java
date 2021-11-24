package printer;

import java.util.List;

import org.custommonkey.xmlunit.Difference;

public class Printer {
	public void printDifferences(String fileName, List<Difference> identicalDifferences,
			List<Difference> similarDifferences) {
		int numberOfIdenticalDifferences = identicalDifferences.size();
		System.out.println("===============================");
		System.out.println("Identical differences : " + numberOfIdenticalDifferences);
		System.out.println("================================");

		for (Difference difference : identicalDifferences) {
			System.out.println(difference);
		}

		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		int numberOfSimilarDifferences = similarDifferences.size();
		System.out.println("===============================");
		System.out.println("Similar differences : " + numberOfSimilarDifferences);
		System.out.println("================================");

		for (Difference difference : similarDifferences) {
			System.out.println(difference);
		}

		int differences = identicalDifferences.size() - similarDifferences.size();
		System.out.println("===============================");
		System.out.println("Compared file : " + fileName);
		System.out.println("Identical differences : " + numberOfIdenticalDifferences);
		System.out.println("Similar differences : " + numberOfSimilarDifferences);
		System.out.println("Deviation : " + differences);
		System.out.println("================================");
	}
	
	public void printSeperator() {
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
	}

	public void printResult(int size, int totalIdenticalDifferences, int totalSimilarDifferences, int totalFeatures, int totalNotAbstractAndHiddenFeatures) {
		System.out.println("Number of compared XML-Files:" + size);

		System.out.println("Sum of all total identical differnces: " + totalIdenticalDifferences);

		System.out.println("Sum of all total similar differnces: " + totalSimilarDifferences);

		System.out.println("Total deviation: " + (totalIdenticalDifferences - totalSimilarDifferences));
		
		System.out.println("Total transformed features: " + totalFeatures);
		
		System.out.println("Total transformed non abstract and hidden features: " + totalNotAbstractAndHiddenFeatures);
	}
}
