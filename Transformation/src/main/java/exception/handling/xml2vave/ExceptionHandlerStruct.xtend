package exception.handling.xml2vave

import FeatureIDEXSD.AndType
import FeatureIDEXSD.OrType
import FeatureIDEXSD.AltType
import FeatureIDEXSD.Node
import org.eclipse.emf.common.util.EList

class ExceptionHandlerStruct {
	String and = "AND"
	String or = "OR"
	String alt = "ALT"

	def dispatch checkNode(AndType node, EList<Node> nodeList) {
		this.checkBinaryList(nodeList, and, false)
	}

	def dispatch checkNode(OrType node, EList<Node> nodeList) {
		this.checkBinaryList(nodeList, or, true)
	}

	def dispatch checkNode(AltType node, EList<Node> nodeList) {
		this.checkBinaryList(nodeList, alt, true)
	}

	def checkBinaryList(EList<Node> list, String node, boolean binary) {

		if (binary) {
			if (list === null || list.get(0) === null) {
				throw new Exception(node + " has no child nodes")
			} else if (list.length < 2) {
				throw new Exception(node + " is a binary node it needs at least two child nodes")
			} else
				return
		} else {
			if (list === null) {
				throw new Exception(node + " has no child node")
			} else if (list.length < 1) {
				throw new Exception(node + " is a unary node it needs at least one child node")
			} else
				return

		}

	}
}
