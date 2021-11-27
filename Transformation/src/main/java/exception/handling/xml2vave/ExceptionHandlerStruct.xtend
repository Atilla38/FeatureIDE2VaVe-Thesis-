package exception.handling.xml2vave

import FeatureIDEXSD.AndType
import FeatureIDEXSD.OrType
import FeatureIDEXSD.AltType
import FeatureIDEXSD.Node
import java.util.List

class ExceptionHandlerStruct {
	static val String AND = "AND"
	static val String OR = "OR"
	static val String ALT = "ALT"

	def dispatch checkNode(AndType node, List<Node> nodeList) {
		this.checkBinaryList(nodeList, exception.handling.xml2vave.ExceptionHandlerStruct.AND, false)
	}

	def dispatch checkNode(OrType node, List<Node> nodeList) {
		this.checkBinaryList(nodeList, exception.handling.xml2vave.ExceptionHandlerStruct.OR, true)
	}

	def dispatch checkNode(AltType node, List<Node> nodeList) {
		this.checkBinaryList(nodeList, exception.handling.xml2vave.ExceptionHandlerStruct.ALT, true)
	}

	def checkBinaryList(List<Node> list, String node, boolean binary) {

		if (binary) {
			if (list === null || list.get(0) === null) {
				throw new IllegalArgumentException(node + " has no child nodes")
			} else if (list.length < 2) {
				throw new IllegalArgumentException(node + " is a binary node it needs at least two child nodes")
			} else
				return
		} else {
			if (list === null) {
				throw new IllegalArgumentException(node + " has no child node")
			} else if (list.length < 1) {
				throw new IllegalArgumentException(node + " is a unary node it needs at least one child node")
			} else
				return

		}

	}
}
