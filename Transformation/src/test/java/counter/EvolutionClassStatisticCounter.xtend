package counter

/**
 * Holds the statistic of the evolution class.
 * @author Atilla Ates
 */
class EvolutionClassStatisticCounter {
	String name;
	int totalChangeResolutions
	int correctChangeResolutions
	int incorrectChangeResolutions
	int totalRedundancyOperationDifference
	int totalRedundancyFreeChangeResolutions
	int totalNotRedundancyFreeChangeResolutions
	int totalRedundancyFreeSequenceOperations
	int totalResolutionOperations

	def String getName() {
		return name;
	}

	def setName(String name) {
		this.name = name;
	}

	def int getTotalChangeResolutions() {
		return totalChangeResolutions
	}

	def void increaseTotalChangeResolutions() {
		this.totalChangeResolutions++
	}

	def int getCorrectChangeResolutions() {
		return correctChangeResolutions
	}

	def void increaseCorrectChangeResolutions() {
		this.correctChangeResolutions++
	}

	def int getIncorrectChangeResolutions() {
		return incorrectChangeResolutions
	}

	def void increaseIncorrectChangeResolutions() {
		this.incorrectChangeResolutions++
	}

	def void increaseRedundancyOperationDifference(int totalOperationDifference) {
		this.totalRedundancyOperationDifference = this.totalRedundancyOperationDifference + totalOperationDifference
	}

	def int getTotalRedundancyOperationDifference() {
		return this.totalRedundancyOperationDifference;
	}

	def int getTotalRedundancyFreeChangeResolutions() {
		return this.totalRedundancyFreeChangeResolutions
	}

	def void increaseTotalRedundancyFreeChangeResolutions() {
		this.totalRedundancyFreeChangeResolutions++
	}

	def int getTotalNotRedundancyFreeChangeResolutions() {
		return this.totalNotRedundancyFreeChangeResolutions
	}

	def void increaseTotalNotRedundancyFreeChangeResolutions() {
		this.totalNotRedundancyFreeChangeResolutions++
	}

	def void increaseTotalRedundancyFreeSequenceChangeOperations(int numberOfOperations) {
		this.totalRedundancyFreeSequenceOperations = this.totalRedundancyFreeSequenceOperations + numberOfOperations
	}

	def int getTotalRedundancyFreeSequenzOperations() {
		return this.totalRedundancyFreeSequenceOperations;
	}

	def void increaseTotalResolutionOperations(int numberOfOperations) {
		this.totalResolutionOperations = this.totalResolutionOperations + numberOfOperations
	}

	def int getTotalResolutionOperations() {
		return this.totalResolutionOperations
	}

	def double getTotalPercentageCorrect() {
		var double totalPercentage = 0;
		if (this.totalChangeResolutions > 0) {
			totalPercentage = (this.correctChangeResolutions as double / this.totalChangeResolutions as double) * 100
		}
		return totalPercentage;
	}

	def double getTotalPercentageRedundancyFree() {
		var double totalPercentage = 0;
		if (this.totalChangeResolutions > 0) {
			totalPercentage = (this.totalRedundancyFreeChangeResolutions as double /
				this.totalChangeResolutions as double) * 100
		}
		return totalPercentage;
	}
}
