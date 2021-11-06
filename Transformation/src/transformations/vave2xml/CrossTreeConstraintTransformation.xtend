package transformations.vave2xml

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.FeatureMap
import org.eclipse.emf.ecore.util.FeatureMapUtil
import FeatureIDEXSD.BinaryExpressionType
import FeatureIDEXSD.ConstraintsType
import FeatureIDEXSD.FeatureIDEXSDFactory
import FeatureIDEXSD.FeatureIDEXSDPackage
import FeatureIDEXSD.FeatureModelType
import FeatureIDEXSD.ImpType
import FeatureIDEXSD.RuleType
import FeatureIDEXSD.UnaryExpressionType
import FeatureIDEXSD.VarType
import vavemodel.CrossTreeConstraint
import vavemodel.Feature
import vavemodel.FeatureOption
import vavemodel.Implication
import vavemodel.Term
import vavemodel.Variable
import vavemodel.Conjunction
import FeatureIDEXSD.ConjType
import vavemodel.Disjunction
import FeatureIDEXSD.DisjType
import vavemodel.Equivalence
import FeatureIDEXSD.EqType
import vavemodel.Not
import FeatureIDEXSD.NotType
import org.eclipse.emf.common.util.BasicEList
import vavemodel.Expression

class CrossTreeConstraintTransformation {
	ConstraintsType constraint
	FeatureModelType featureModel

	new(FeatureModelType featureModel) {
		this.constraint = FeatureIDEXSDFactory.eINSTANCE.createConstraintsType()
		this.featureModel = featureModel
	}

	def void start(EList<CrossTreeConstraint> constraintList) {
		for (CrossTreeConstraint constraint : constraintList) {
			var RuleType rule = FeatureIDEXSDFactory.eINSTANCE.createRuleType()
			rule.getExpressionListGroup().add(
					this.parseExpression(constraint.getExpression()))
			this.constraint.getRule().add(rule)
		}
		this.featureModel.setConstraints(constraint)
	}

	def dispatch private FeatureMap.Entry parseExpression(Implication<FeatureOption> expression) {
		var ImpType imp = FeatureIDEXSDFactory.eINSTANCE.createImpType()
		parseChild(imp, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP, imp)
	}
	
	def dispatch private FeatureMap.Entry parseExpression(Conjunction<FeatureOption> expression) {
		var ConjType conj = FeatureIDEXSDFactory.eINSTANCE.createConjType()
		parseChild(conj, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ, conj)
	}
	
	def dispatch private FeatureMap.Entry parseExpression(Disjunction<FeatureOption> expression) {
		var DisjType disj = FeatureIDEXSDFactory.eINSTANCE.createDisjType()
		parseChild(disj, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ, disj)
	}
	
	def dispatch private FeatureMap.Entry parseExpression(Equivalence<FeatureOption> expression) {
		var EqType eq = FeatureIDEXSDFactory.eINSTANCE.createEqType()
		parseChild(eq, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ, eq)
	}
	
	def dispatch private FeatureMap.Entry parseExpression(Not<FeatureOption> expression) {
		var NotType not = FeatureIDEXSDFactory.eINSTANCE.createNotType()
		var EList<Term<FeatureOption>> terms = new BasicEList();
		terms.add(expression.getTerm())
		parseChild(null, not, terms)
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT, not)
	}

	def dispatch private FeatureMap.Entry parseExpression(Variable<FeatureOption> expression) {
		var VarType ^var = FeatureIDEXSDFactory.eINSTANCE.createVarType()
		var FeatureMap.Entry entry = FeatureMapUtil.createRawTextEntry(((expression.getOption() as Feature)).getName())
		^var.getMixed().add(entry)
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR, ^var)
	}

	def private void parseChild(BinaryExpressionType binaryExpression, UnaryExpressionType unaryExpression,
		EList<Term<FeatureOption>> termList) {
		for (Term<FeatureOption> term : termList) {
			if (binaryExpression !== null) {
				binaryExpression.getExpressionListGroup().add(parseExpression(term as Expression<FeatureOption>))
			} else {
				unaryExpression.getExpressionListGroup().add(parseExpression(term as Expression<FeatureOption>))
			}
		}
	}
}
