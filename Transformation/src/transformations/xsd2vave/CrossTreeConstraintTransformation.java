package transformations.xsd2vave;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.ConjType;
import FeatureIDEXSD.DisjType;
import FeatureIDEXSD.EqType;
import FeatureIDEXSD.Expression;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.NotType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.UnaryExpressionType;
import FeatureIDEXSD.VarType;
import vavemodel.BinaryExpression;
import vavemodel.Conjunction;
import vavemodel.Feature;
import vavemodel.FeatureOption;
import vavemodel.UnaryExpression;
import vavemodel.VavemodelFactory;

public class CrossTreeConstraintTransformation {

	private vavemodel.System system;

	public CrossTreeConstraintTransformation(vavemodel.System system) {
		this.system = system;
	}

	public void start(EList<RuleType> ruleList) {

		for (RuleType rule : ruleList) {
			vavemodel.CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint();
			vavemodel.Expression<FeatureOption> expression = null;
			Expression featureIDEExpression = rule.getExpressionList();

			if (featureIDEExpression instanceof ImpType) {
				expression = this.parseImp((BinaryExpressionType) featureIDEExpression);
			}

			if (featureIDEExpression instanceof ConjType) {
				expression = this.parseConj((BinaryExpressionType) featureIDEExpression);
			}

			if (featureIDEExpression instanceof DisjType) {
				expression = this.parseDisj((BinaryExpressionType) featureIDEExpression);
			}

			if (featureIDEExpression instanceof EqType) {
				expression = this.parseEq((BinaryExpressionType) featureIDEExpression);
			}

			if (featureIDEExpression instanceof NotType) {
				expression = this.parseNot((UnaryExpressionType) featureIDEExpression);
			}

			if (featureIDEExpression instanceof VarType) {
				expression = this.parseVar((VarType) featureIDEExpression);
			}

			crossTreeConstr.setExpression(expression);
			system.getConstraint().add(crossTreeConstr);
		}

	}

	public vavemodel.Implication<FeatureOption> parseImp(BinaryExpressionType imp) {
		vavemodel.Implication<FeatureOption> vaveImp = VavemodelFactory.eINSTANCE.createImplication();
		this.transformChilds(imp, null, vaveImp);
		return vaveImp;
	}

	public Conjunction<FeatureOption> parseConj(BinaryExpressionType conj) {
		vavemodel.Conjunction<FeatureOption> vaveConj = VavemodelFactory.eINSTANCE.createConjunction();
		this.transformChilds(conj, null, vaveConj);
		return vaveConj;
	}

	public vavemodel.Disjunction<FeatureOption> parseDisj(BinaryExpressionType disj) {
		vavemodel.Disjunction<FeatureOption> vaveDisj = VavemodelFactory.eINSTANCE.createDisjunction();
		this.transformChilds(disj, null, vaveDisj);
		return vaveDisj;
	}

	public vavemodel.Equivalence<FeatureOption> parseEq(BinaryExpressionType eq) {
		vavemodel.Equivalence<FeatureOption> vaveEq = VavemodelFactory.eINSTANCE.createEquivalence();
		this.transformChilds(eq, null, vaveEq);
		return vaveEq;
	}

	public vavemodel.Not<FeatureOption> parseNot(UnaryExpressionType not) {
		vavemodel.Not<FeatureOption> vaveNot = VavemodelFactory.eINSTANCE.createNot();
		this.transformChilds(null, not, vaveNot);
		return vaveNot;
	}

	public vavemodel.Variable<FeatureOption> parseVar(VarType var) {

		vavemodel.Variable<FeatureOption> vaveVar = VavemodelFactory.eINSTANCE.createVariable();
		for (Feature feature : system.getFeature()) {
			if (feature.getName().equals(var.getMixed().getValue(0))) {
				vaveVar.setOption(feature);
				return vaveVar;
			}
		}

		return null;
	}

	private void transformChilds(BinaryExpressionType binaryExpression, UnaryExpressionType unaryExpression,
			vavemodel.Expression<FeatureOption> expression) {

		EList<Expression> featureIDEExpressionList;
		Boolean isBinary;
		if (binaryExpression != null) {
			featureIDEExpressionList = binaryExpression.getExpressionList();
			isBinary = true;
		} else if (unaryExpression != null) {
			featureIDEExpressionList  = new BasicEList<Expression>();
			featureIDEExpressionList.add(unaryExpression.getExpressionList());
			isBinary = false;
		} else {
			System.out.println("Binary and unaryExpression can't be both null");
			return;
		}

		for (Expression featureIDEExpression : featureIDEExpressionList) {
			if (featureIDEExpression instanceof ImpType) {
				vavemodel.Implication<FeatureOption> vaveImp = this
						.parseImp((BinaryExpressionType) featureIDEExpression);
				this.addTerm(isBinary, expression, vaveImp);

			}

			if (featureIDEExpression instanceof ConjType) {
				vavemodel.Conjunction<FeatureOption> vaveConj = this
						.parseConj((BinaryExpressionType) featureIDEExpression);
				this.addTerm(isBinary, expression, vaveConj);
			}

			if (featureIDEExpression instanceof DisjType) {
				vavemodel.Disjunction<FeatureOption> vaveDisj = this
						.parseDisj((BinaryExpressionType) featureIDEExpression);
				this.addTerm(isBinary, expression, vaveDisj);
			}

			if (featureIDEExpression instanceof EqType) {
				vavemodel.Equivalence<FeatureOption> vaveEq = this.parseEq((BinaryExpressionType) featureIDEExpression);
				this.addTerm(isBinary, expression, vaveEq);
			}

			if (featureIDEExpression instanceof NotType) {
				vavemodel.Not<FeatureOption> vaveNot = this.parseNot((UnaryExpressionType) featureIDEExpression);
				this.addTerm(isBinary, expression, vaveNot);
			}

			if (featureIDEExpression instanceof VarType) {
				vavemodel.Variable<FeatureOption> vaveVar = this.parseVar((VarType) featureIDEExpression);
				if (vaveVar == null) {
					System.out.println("No matching feature found in system");
				}

				this.addTerm(isBinary, expression, vaveVar);
			}
		}
	}

	private void addTerm(boolean binary, vavemodel.Expression<FeatureOption> expression,
			vavemodel.Expression<FeatureOption> term) {

		if (binary) {
			((BinaryExpression<FeatureOption>) expression).getTerm().add(term);
		} else {
			((UnaryExpression<FeatureOption>) expression).setTerm(term);

		}
	}
}
