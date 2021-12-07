package counter

class EvolutionClassStatisticCounter {
	String name;
	int totalChangeResolutions
	int correctChangeResolutions
	int incorrectChangeResolutions

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
}
