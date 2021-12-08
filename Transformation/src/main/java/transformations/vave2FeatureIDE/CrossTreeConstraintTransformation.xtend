package transformations.vave2FeatureIDE

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

/**
 * Implements the constraint transformation from a feature-model in VaVe to a FeatureIDE feature-model.
 */
class CrossTreeConstraintTransformation {
	ConstraintsType constraint
	FeatureModelType featureModel

	new(FeatureModelType featureModel) {
		this.constraint = FeatureIDEXSDFactory.eINSTANCE.createConstraintsType()
		this.featureModel = featureModel
	}

   /**
    * Starts the constraint transformation.
    * @param constraintList A list of the constraints which should be transformed.
    */
	def void start(EList<CrossTreeConstraint> constraintList) {
		for (CrossTreeConstraint constraint : constraintList) {
			var RuleType rule = FeatureIDEXSDFactory.eINSTANCE.createRuleType()
			rule.getExpressionListGroup().add(
					this.parseExpression(constraint.getExpression()))
			this.constraint.getRule().add(rule)
		}
		this.featureModel.setConstraints(constraint)
	}

    /**
     * Parses the vavemodel.Implication expression to FeatureIDEXSD.ImpType expression.
     * @param expression The vavemodel.Implication which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Implication<FeatureOption> expression) {
		var ImpType imp = FeatureIDEXSDFactory.eINSTANCE.createImpType()
		parseChild(imp, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP, imp)
	}
	
	/**
     * Parses the vavemodel.Conjunction expression to FeatureIDEXSD.ConjType expression.
     * @param expression The vavemodel.Conjunction which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Conjunction<FeatureOption> expression) {
		var ConjType conj = FeatureIDEXSDFactory.eINSTANCE.createConjType()
		parseChild(conj, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ, conj)
	}
	
	/**
     * Parses the vavemodel.Disjunction expression to FeatureIDEXSD.DisjType expression.
     * @param expression The vavemodel.Disjunction expression which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Disjunction<FeatureOption> expression) {
		var DisjType disj = FeatureIDEXSDFactory.eINSTANCE.createDisjType()
		parseChild(disj, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ, disj)
	}
	
	/**
     * Parses the vavemodel.Equivalence expression to FeatureIDEXSD.EqType expression.
     * @param expression The vavemodel.Disjunction expression which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Equivalence<FeatureOption> expression) {
		var EqType eq = FeatureIDEXSDFactory.eINSTANCE.createEqType()
		parseChild(eq, null, expression.getTerm())
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ, eq)
	}
	
	/**
     * Parses the vavemodel.Not expression to FeatureIDEXSD.NotType expression.
     * @param expression The vavemodel.Not expression which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Not<FeatureOption> expression) {
		var NotType not = FeatureIDEXSDFactory.eINSTANCE.createNotType()
		var EList<Term<FeatureOption>> terms = new BasicEList();
		terms.add(expression.getTerm())
		parseChild(null, not, terms)
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT, not)
	}

    /**
     * Parses the vavemodel.Variable expression to FeatureIDEXSD.VarType expression.
     * @param expression The vavemodel.Variable expression which should be parsed.
     * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR as EStructuralFeature.
     */
	def dispatch private FeatureMap.Entry parseExpression(Variable<FeatureOption> expression) {
		var VarType ^var = FeatureIDEXSDFactory.eINSTANCE.createVarType()
		var FeatureMap.Entry entry = FeatureMapUtil.createRawTextEntry(((expression.getOption() as Feature)).getName())
		^var.getMixed().add(entry)
		return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR, ^var)
	}

   /**
    * Parses the children.
    * @param binaryExpression If the parent is a binary expression this should not be null.
    * @param unaryExpression If the parent is a unary expression this should not be null.
    * @param termList The children which should be parsed.
    */
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
