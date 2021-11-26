package exception.handling.xml2vave

import FeatureIDEXSD.ImpType
import FeatureIDEXSD.Expression
import FeatureIDEXSD.ConjType
import FeatureIDEXSD.DisjType
import FeatureIDEXSD.EqType
import FeatureIDEXSD.NotType
import java.util.List

class ExceptionHandlerConstraints {

	static val String implication = "IMPLICATION"  
	static val String conjunction = "CONJUNCTION"
	static val String disjunction = "DISJUNCTION"
	static val String equivalence = "EQUIVALENCE"
	static val String not = "NOT"

	def dispatch checkExpression(ImpType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, implication, true)
	}

	def dispatch checkExpression(ConjType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, conjunction, true)
	}

	def dispatch checkExpression(DisjType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, disjunction, true)
	}

	def dispatch checkExpression(EqType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, equivalence, true)
	}

	def dispatch checkExpression(NotType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, not, false)
	}
	
	def dispatch checkExpression(Expression expression, List<Expression> expressionList) {
		throw new IllegalArgumentException("Expression type not supported");
	}
	
	//TODO: fall back

	def checkBinaryList(List<Expression> list, String expression, boolean binary) {
		var maximalLength = binary ? 2 : 1;
		
			if (list === null || list.get(0) === null) {
				throw new IllegalArgumentException(expression + " has no terms")
			} else if (list.length == maximalLength) {
				return
			} else if (list.length < maximalLength) {
				throw new IllegalArgumentException(expression + " is a binary expression it needs two terms") //TODO
			} else
				throw new IllegalArgumentException(expression + " has more then two terms this is not allowed")
	}

}
