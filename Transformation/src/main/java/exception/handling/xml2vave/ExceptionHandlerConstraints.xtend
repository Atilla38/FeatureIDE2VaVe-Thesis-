package exception.handling.xml2vave

import FeatureIDEXSD.ImpType
import FeatureIDEXSD.Expression
import FeatureIDEXSD.ConjType
import FeatureIDEXSD.DisjType
import FeatureIDEXSD.EqType
import FeatureIDEXSD.NotType
import java.util.List

class ExceptionHandlerConstraints {

	static val String IMPLICATION = "IMPLICATION"  
	static val String CONJUNCTION = "CONJUNCTION"
	static val String DISJUNCTION = "DISJUNCTION"
	static val String EQUIVALENCE = "EQUIVALENCE"
	static val String NOT = "NOT"

	def dispatch checkExpression(ImpType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, exception.handling.xml2vave.ExceptionHandlerConstraints.IMPLICATION, true)
	}

	def dispatch checkExpression(ConjType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, exception.handling.xml2vave.ExceptionHandlerConstraints.CONJUNCTION, true)
	}

	def dispatch checkExpression(DisjType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, exception.handling.xml2vave.ExceptionHandlerConstraints.DISJUNCTION, true)
	}

	def dispatch checkExpression(EqType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, exception.handling.xml2vave.ExceptionHandlerConstraints.EQUIVALENCE, true)
	}

	def dispatch checkExpression(NotType expression, List<Expression> expressionList) {
		this.checkBinaryList(expressionList, exception.handling.xml2vave.ExceptionHandlerConstraints.NOT, false)
	}
	
	def dispatch checkExpression(Expression expression, List<Expression> expressionList) {
		throw new IllegalArgumentException("Expression type not supported");
	}

	def checkBinaryList(List<Expression> list, String expression, boolean binary) {
		var maximalLength = binary ? 2 : 1;
		
			if (list === null || list.get(0) === null) {
				throw new IllegalArgumentException(expression + " has no terms")
			} else if (list.length == maximalLength) {
				return
			} else if (list.length < maximalLength) {
				throw new IllegalArgumentException(expression + " is a binary expression it needs two terms")
			} else {
				throw new IllegalArgumentException(expression + " has more then two terms this is not allowed")
            }	
	}
	
	

}
