package printer;

import java.util.List;

import org.custommonkey.xmlunit.Difference;

/**
 * Prints the result and the differences of the XML comparison.
 * 
 * @author Atilla Ates
 *
 */
public class XMLComparatorPrinter {

	/**
	 * Prints the differences of the XML comparison.
	 * 
	 * @param fileName             The name of the compared XML-File.
	 * @param identicalDifferences The list of identical differences.
	 * @param similarDifferences   The list of similar differences.
	 */
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

	/**
	 * Prints a separator.
	 */
	public void printSeparator() {
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
	}

	/**
	 * Prints the result.
	 * 
	 * @param size                              The number of compared XML-Files.
	 * @param totalIdenticalDifferences         The number of total identical
	 *                                          differences.
	 * @param totalSimilarDifferences           The number of total similar
	 *                                          differences.
	 * @param totalFeatures                     The number of total compared
	 *                                          Features.
	 * @param totalNotAbstractAndHiddenFeatures The number of total not abstract and
	 *                                          hidden features.
	 */
	public void printResult(int size, int totalIdenticalDifferences, int totalSimilarDifferences, int totalFeatures,
			int totalNotAbstractAndHiddenFeatures, int numberOfIdenticals, int numberOfSimilars) {
		System.out.println("Number of compared XML-Files:" + size);
		
		System.out.println("Number of identicals:" + numberOfIdenticals);
		
		System.out.println("Number of similars:" + numberOfSimilars);
		
		System.out.println("Sum of all total identical differences: " + totalIdenticalDifferences);

		System.out.println("Sum of all total similar differences: " + totalSimilarDifferences);

		System.out.println("Total deviation: " + (totalIdenticalDifferences - totalSimilarDifferences));

		System.out.println("Total transformed features: " + totalFeatures);

		System.out.println("Total transformed non abstract and hidden features: " + totalNotAbstractAndHiddenFeatures);

		System.out.println("Total transformed abstract and hidden features: "
				+ (totalFeatures - totalNotAbstractAndHiddenFeatures));
	}
}
