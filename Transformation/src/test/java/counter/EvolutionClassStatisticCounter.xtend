package counter

class EvolutionClassStatisticCounter {
	int totalChangeResolutions
	int correctChangeResolutions
	int incorrectChangeResolutions

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
}
