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
	int totalOperationDifference
	int totalMinimalChangeResolutions
	int totalNotMinimalChangeResolutions
	int totalLessOperationChangeResolutions

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

	def void increaseOperationDifference(int totalOperationDifference) {
		this.totalOperationDifference = this.totalOperationDifference + totalOperationDifference
	}

	def int getTotalOperationDifference() {
		return this.totalOperationDifference;
	}

	def int getTotalMinimalChangeResolutions() {
		return this.totalMinimalChangeResolutions
	}

	def void increaseTotalMinimalChangeResolutions() {
		this.totalMinimalChangeResolutions++
	}

	def int getTotalNotMinimalChangeResolutions() {
		return this.totalNotMinimalChangeResolutions
	}

	def void increaseTotalNotMinimalChangeResolutions() {
		this.totalNotMinimalChangeResolutions++
	}
	
	def void increaseTotalLessOperationChangeResolutions() {
		this.totalLessOperationChangeResolutions++;
	}
	
	def int getTotalLessOperationChangeResolutions() {
		return this.totalLessOperationChangeResolutions;
	}

	def double getTotalPercentageCorrect() {
		var double totalPercentage = 0;
		if (this.totalChangeResolutions > 0) {
			totalPercentage = (this.correctChangeResolutions as double / this.totalChangeResolutions as double) * 100
		}
		return totalPercentage;
	}

	def double getTotalPercentageMinimal() {
		var double totalPercentage = 0;
		if (this.totalChangeResolutions > 0) {
			totalPercentage = (this.totalMinimalChangeResolutions as double / this.totalChangeResolutions as double) * 100
		}
		return totalPercentage;
	}
}
