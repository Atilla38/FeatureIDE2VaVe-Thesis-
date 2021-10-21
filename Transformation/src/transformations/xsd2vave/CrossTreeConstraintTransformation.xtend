package transformations.xsd2vave

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import FeatureIDEXSD.BinaryExpressionType
import FeatureIDEXSD.ConjType
import FeatureIDEXSD.DisjType
import FeatureIDEXSD.EqType
import FeatureIDEXSD.Expression
import FeatureIDEXSD.ImpType
import FeatureIDEXSD.NotType
import FeatureIDEXSD.RuleType
import FeatureIDEXSD.UnaryExpressionType
import FeatureIDEXSD.VarType
import vavemodel.BinaryExpression
import vavemodel.Conjunction
import vavemodel.Feature
import vavemodel.FeatureOption
import vavemodel.UnaryExpression
import vavemodel.VavemodelFactory

class CrossTreeConstraintTransformation {
	vavemodel.System system

	new(vavemodel.System system) {
		this.system = system
	}

	def void start(EList<RuleType> ruleList) {
		for (RuleType rule : ruleList) {
			var vavemodel.CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint()
			var vavemodel.Expression<FeatureOption> expression = null
			var Expression featureIDEExpression = rule.getExpressionList()
			if (featureIDEExpression instanceof ImpType) {
				expression = this.parseChild(featureIDEExpression, null);

				if (expression === null) {
					return;
				}
			}

			crossTreeConstr.setExpression(expression)
			system.getConstraint().add(crossTreeConstr)
		}
	}

	def dispatch private vavemodel.Implication<FeatureOption> parseChild(ImpType imp,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Implication<FeatureOption> vaveImp = VavemodelFactory.eINSTANCE.createImplication()
		this.transformChilds(imp, null, vaveImp)
		return vaveImp
	}

	def dispatch private Conjunction<FeatureOption> parseChild(ConjType conj,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Conjunction<FeatureOption> vaveConj = VavemodelFactory.eINSTANCE.createConjunction()
		this.transformChilds(conj, null, vaveConj)
		return vaveConj
	}

	def dispatch private vavemodel.Disjunction<FeatureOption> parseChild(DisjType disj,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Disjunction<FeatureOption> vaveDisj = VavemodelFactory.eINSTANCE.createDisjunction()
		this.transformChilds(disj, null, vaveDisj)
		return vaveDisj
	}

	def dispatch private vavemodel.Equivalence<FeatureOption> parseChild(EqType eq,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Equivalence<FeatureOption> vaveEq = VavemodelFactory.eINSTANCE.createEquivalence()
		this.transformChilds(eq, null, vaveEq)
		return vaveEq
	}

	def dispatch private vavemodel.Not<FeatureOption> parseChild(NotType not,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Not<FeatureOption> vaveNot = VavemodelFactory.eINSTANCE.createNot()
		this.transformChilds(null, not, vaveNot)
		return vaveNot
	}

	def dispatch private vavemodel.Variable<FeatureOption> parseChild(VarType ^var,
		vavemodel.Expression<FeatureOption> expression) {
		var vavemodel.Variable<FeatureOption> vaveVar = VavemodelFactory.eINSTANCE.createVariable()
		for (Feature feature : system.getFeature()) {
			if (feature.getName().equals(^var.getMixed().getValue(0))) {
				vaveVar.setOption(feature)
				return vaveVar
			}
		}
		System.out.println("No matching feature found in system")
		return null
	}

	def private void transformChilds(BinaryExpressionType binaryExpression, UnaryExpressionType unaryExpression,
		vavemodel.Expression<FeatureOption> expression) {
		var EList<Expression> featureIDEExpressionList
		var Boolean isBinary
		if (binaryExpression !== null) {
			featureIDEExpressionList = binaryExpression.getExpressionList()
			isBinary = true
		} else if (unaryExpression !== null) {
			featureIDEExpressionList = new BasicEList<Expression>()
			featureIDEExpressionList.add(unaryExpression.getExpressionList())
			isBinary = false
		} else {
			System.out.println("Binary and unaryExpression can't be both null")
			return;
		}
		for (Expression featureIDEExpression : featureIDEExpressionList) {
				var vavemodel.Expression<FeatureOption> vaveExpression = this.parseChild(featureIDEExpression, null)
				if (vaveExpression === null) {
					return;
				}
				this.addTerm(isBinary, expression, vaveExpression)
		}
	}

	def private void addTerm(boolean binary, vavemodel.Expression<FeatureOption> expression,
		vavemodel.Expression<FeatureOption> term) {
		if (binary) {
			((expression as BinaryExpression<FeatureOption>)).getTerm().add(term)
		} else {
			((expression as UnaryExpression<FeatureOption>)).setTerm(term)
		}
	}
}
