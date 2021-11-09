package exception.handling.xml2vave

import FeatureIDEXSD.ImpType
import org.eclipse.emf.common.util.EList
import FeatureIDEXSD.Expression
import FeatureIDEXSD.ConjType
import FeatureIDEXSD.DisjType
import FeatureIDEXSD.EqType
import FeatureIDEXSD.NotType

class ExceptionHandlerConstraints {

	String implication = "IMPLICATION"
	String conjunction = "CONJUNCTION"
	String disjunction = "DISJUNCTION"
	String equivalence = "EQUIVALENCE"
	String not = "NOT"

	def dispatch checkExpression(ImpType expression, EList<Expression> expressionList) {
		this.checkBinaryList(expressionList, implication, true)
	}

	def dispatch checkExpression(ConjType expression, EList<Expression> expressionList) {
		this.checkBinaryList(expressionList, conjunction, true)
	}

	def dispatch checkExpression(DisjType expression, EList<Expression> expressionList) {
		this.checkBinaryList(expressionList, disjunction, true)
	}

	def dispatch checkExpression(EqType expression, EList<Expression> expressionList) {
		this.checkBinaryList(expressionList, equivalence, true)
	}

	def dispatch checkExpression(NotType expression, EList<Expression> expressionList) {
		this.checkBinaryList(expressionList, not, false)
	}

	def checkBinaryList(EList<Expression> list, String expression, boolean binary) {

		if (binary) {
			if (list === null || list.get(0) === null) {
				throw new Exception(expression + " has no terms")
			} else if (list.length == 2) {
				return
			} else if (list.length < 2) {
				throw new Exception(expression + " is a binary expression it needs two terms")
			} else
				throw new Exception(expression + " has more then two terms this is not allowed")
		} else {
			if (list === null) {
				throw new Exception(expression + " has no terms")
			} else if (list.length == 1) {
				return
			} else if (list.length < 1) {
				throw new Exception(expression + " is a unary expression it needs one term")
			} else
				throw new Exception(expression + " has more then one term this is not allowed")

		}
	}

}
