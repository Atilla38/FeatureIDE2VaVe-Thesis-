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

/**
 * Implements the constraint transformation from xml to vave of the FeatureIDE Feature-Model.
 */
class CrossTreeConstraintTransformation {
	vavemodel.System system

	new(vavemodel.System system) {
		this.system = system
	}

    /**
     * Starts the transformation of the constraints.
     * @param ruleList A list of the constraints in the FeatureIDE Feature-Model.
     */
	def void start(EList<RuleType> ruleList) {
		for (RuleType rule : ruleList) {
			var vavemodel.CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint()
			var vavemodel.Expression<FeatureOption> expression = null
			var Expression featureIDEExpression = rule.getExpressionList()
			if (featureIDEExpression instanceof ImpType) {
				expression = this.parseExpression(featureIDEExpression);

				if (expression === null) {
					return;
				}
			}

			crossTreeConstr.setExpression(expression)
			system.getConstraint().add(crossTreeConstr)
		}
	}

    /**
     * Generates a vavemodel.Implication instance and parses the child terms of the implication expression.
     * @param imp The implication which should be parsed and whose child terms should be parsed.
     * @return Returns the generated vavemodel.Implication instance based on the imp parameter.  
     */
	def dispatch private vavemodel.Implication<FeatureOption> parseExpression(ImpType imp) {
		var vavemodel.Implication<FeatureOption> vaveImp = VavemodelFactory.eINSTANCE.createImplication()
		this.transformChilds(imp, null, vaveImp)
		return vaveImp
	}

    /**
     * Generates a vavemodel.Conjunction instance and parses the child terms of the conjunction expression.
     * @param conj The conjunction which should be parsed and whose child terms should be parsed.
     * @return Returns the generated vavemodel.Conjunction instance based on the conj parameter.  
     */
	def dispatch private Conjunction<FeatureOption> parseExpression(ConjType conj) {
		var vavemodel.Conjunction<FeatureOption> vaveConj = VavemodelFactory.eINSTANCE.createConjunction()
		this.transformChilds(conj, null, vaveConj)
		return vaveConj
	}

    /**
     * Generates a vavemodel.Disjunction instance and parses the child terms of the disjunction expression.
     * @param disj The disjunction which should be parsed and whose child terms should be parsed.
     * @return Returns the generated vavemodel.Disjunction instance based on the disj parameter.  
     */
	def dispatch private vavemodel.Disjunction<FeatureOption> parseExpression(DisjType disj) {
		var vavemodel.Disjunction<FeatureOption> vaveDisj = VavemodelFactory.eINSTANCE.createDisjunction()
		this.transformChilds(disj, null, vaveDisj)
		return vaveDisj
	}

     /**
     * Generates a vavemodel.Equivalence instance and parses the child terms of the equivalence expression.
     * @param eq The equivalence which should be parsed and whose child terms should be parsed.
     * @return Returns the generated vavemodel.Equivalence instance based on the eq parameter.  
     */
	def dispatch private vavemodel.Equivalence<FeatureOption> parseExpression(EqType eq) {
		var vavemodel.Equivalence<FeatureOption> vaveEq = VavemodelFactory.eINSTANCE.createEquivalence()
		this.transformChilds(eq, null, vaveEq)
		return vaveEq
	}

    /**
     * Generates a vavemodel.Not instance and parses the child terms of the not expression.
     * @param conj The conjunction which should be parsed and whose child terms should be parsed.
     * @return Returns the generated vavemodel.Conjunction instance based on the conj parameter.  
     */
	def dispatch private vavemodel.Not<FeatureOption> parseExpression(NotType not) {
		var vavemodel.Not<FeatureOption> vaveNot = VavemodelFactory.eINSTANCE.createNot()
		this.transformChilds(null, not, vaveNot)
		return vaveNot
	}

    /**
     * Generates a vavemodel.Variable instance.
     * @param ^var The variable which should be parsed.
     * @return Returns the generated vavemodel.Variable instance based on the ^var parameter.  
     */
	def dispatch private vavemodel.Variable<FeatureOption> parseExpression(VarType ^var) {
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

    /**
     * Transforms the child terms and adds them to the expression.
     * @param binaryExpression If the parent expression is of the type BinaryExpressionType this parameter should not be null.
     * @param unaryExpression If the parent expression is of the type UnaryExpressionType this parameter should not be null.
     * @param expression The parent expression with type vavemodel.Expression.
     */
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
				var vavemodel.Expression<FeatureOption> vaveExpression = this.parseExpression(featureIDEExpression)
				if (vaveExpression === null) {
					return;
				}
				this.addTerm(isBinary, expression, vaveExpression)
		}
	}

    /**
     * Adds the term to the expression.
     * @param binary If the expression is a binary expression this should be true.
     * @param expression The expression to witch the term should be added.
     * @param term The term which should be added to the expression.
     */
	def private void addTerm(boolean binary, vavemodel.Expression<FeatureOption> expression,
		vavemodel.Expression<FeatureOption> term) {
		if (binary) {
			((expression as BinaryExpression<FeatureOption>)).getTerm().add(term)
		} else {
			((expression as UnaryExpression<FeatureOption>)).setTerm(term)
		}
	}
}
