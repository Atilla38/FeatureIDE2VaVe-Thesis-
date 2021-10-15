package transformations.xsd2vave;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.UnaryExpressionType;
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
	

	public vavemodel.Variable<FeatureOption> parseVar(String var) {

		vavemodel.Variable<FeatureOption> vaveVar = VavemodelFactory.eINSTANCE.createVariable();
		for (Feature feature : system.getFeature()) {
			if (feature.getName().equals(var)) {
				vaveVar.setOption(feature);
				return vaveVar;
			}
		}

		return null;
	}

	private void transformChilds(BinaryExpressionType binaryExpression, UnaryExpressionType unaryExpression,
			vavemodel.Expression<FeatureOption> expression) {

		EList<BinaryExpressionType> impList;
		EList<BinaryExpressionType> conjList;
		EList<BinaryExpressionType> disjList;
		EList<BinaryExpressionType> eqList;
		EList<UnaryExpressionType> notList;
		EList<String> varList;

		if (binaryExpression != null) {
			impList = binaryExpression.getImp();
			conjList = binaryExpression.getConj();
			disjList = binaryExpression.getDisj();
			eqList = binaryExpression.getEq();
			notList = binaryExpression.getNot();
			varList = binaryExpression.getVar();
			
		} else if (unaryExpression != null) {
			impList = new BasicEList<BinaryExpressionType>();
			conjList = new BasicEList<BinaryExpressionType>();
			disjList = new BasicEList<BinaryExpressionType>();
			eqList = new BasicEList<BinaryExpressionType>();
			notList = new BasicEList<UnaryExpressionType>();
			varList = new BasicEList<String>();

			impList.add(unaryExpression.getImp());
			conjList.add(unaryExpression.getConj());
			disjList.add(unaryExpression.getDisj());
			eqList.add(unaryExpression.getEq());
			notList.add(unaryExpression.getNot());
			varList.add(unaryExpression.getVar());
		} else {
			System.out.println("Binary and unaryExpression can't be both null");
			return;
		}

		if (!impList.isEmpty()) {
			for (BinaryExpressionType imp : impList) {
				vavemodel.Implication<FeatureOption> vaveImp = this.parseImp(imp);
				this.addTerm(binaryExpression, expression, vaveImp);
			}
		}

		if (!conjList.isEmpty()) {
			for (BinaryExpressionType conj : conjList) {
				vavemodel.Conjunction<FeatureOption> vaveConj = this.parseConj(conj);
				this.addTerm(binaryExpression, expression, vaveConj);
			}
		}

		if (!disjList.isEmpty()) {
			for (BinaryExpressionType disj : disjList) {
				vavemodel.Disjunction<FeatureOption> vaveDisj = this.parseDisj(disj);
				this.addTerm(binaryExpression, expression, vaveDisj);
			}
		}

		if (!eqList.isEmpty()) {
			for (BinaryExpressionType eq : eqList) {
				vavemodel.Equivalence<FeatureOption> vaveDisj = this.parseEq(eq);
				this.addTerm(binaryExpression, expression, vaveDisj);
			}
		}

		if (!notList.isEmpty()) {
			for (UnaryExpressionType not : notList) {
				vavemodel.Not<FeatureOption> vaveNot = this.parseNot(not);
				this.addTerm(binaryExpression, expression, vaveNot);
			}
		}

		if (!varList.isEmpty()) {
			for (String var : varList) {
				vavemodel.Variable<FeatureOption> vaveVar = this.parseVar(var);
				if (vaveVar == null) {
					System.out.println("No matching feature found in system");
				}

				this.addTerm(binaryExpression, expression, vaveVar);
			}
		}

	}

	private void addTerm(BinaryExpressionType binaryExpression, vavemodel.Expression<FeatureOption> expression,
			vavemodel.Expression<FeatureOption> term) {

		if (binaryExpression != null) {
			((BinaryExpression<FeatureOption>) expression).getTerm().add(term);
		} else {
			((UnaryExpression<FeatureOption>) expression).setTerm(term);

		}
	}
}
