package transformations.vave2xml;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.UnaryExpressionType;
import FeatureIDEXSD.VarType;
import vavemodel.CrossTreeConstraint;
import vavemodel.Expression;
import vavemodel.Feature;
import vavemodel.FeatureOption;
import vavemodel.Implication;
import vavemodel.Term;
import vavemodel.Variable;

public class CrossTreeConstraintTransformation {

	private ConstraintsType constraint;
	private FeatureModelType featureModel;
	public CrossTreeConstraintTransformation(FeatureModelType featureModel) {
		this.constraint = FeatureIDEXSDFactory.eINSTANCE.createConstraintsType();
		this.featureModel = featureModel;
	}

	public void start(EList<CrossTreeConstraint> constraintList) {
		for(CrossTreeConstraint constraint : constraintList) {
			RuleType rule = FeatureIDEXSDFactory.eINSTANCE.createRuleType();
			if(constraint.getExpression() instanceof Implication) {
				rule.getExpressionListGroup().add(this.parseImplication((Implication<FeatureOption>) constraint.getExpression()));
			}
			this.constraint.getRule().add(rule);
		}
		
		this.featureModel.setConstraints(constraint);
	}

	private FeatureMap.Entry parseImplication(Implication<FeatureOption> expression) {
		ImpType imp = FeatureIDEXSDFactory.eINSTANCE.createImpType();
		parseChild(imp,null, expression.getTerm());
		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP, imp);
	}

	private FeatureMap.Entry parseVariable(Variable<FeatureOption> expression) {
		VarType var = FeatureIDEXSDFactory.eINSTANCE.createVarType();
		 FeatureMap.Entry entry = FeatureMapUtil.createRawTextEntry(((Feature) expression.getOption()).getName());
		var.getMixed().add(entry);
		return  FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR, var);
	}

	private void parseChild(BinaryExpressionType binaryExpression, UnaryExpressionType unaryExpression, EList<Term<FeatureOption>> termList) {
		for(Term<FeatureOption> term: termList ) {
			if(binaryExpression != null) {
			binaryExpression.getExpressionListGroup().add(parseVariable((Variable<FeatureOption>) term));
			} else {
			   unaryExpression.getExpressionListGroup().add(parseVariable((Variable<FeatureOption>) term));
			}
		}
		
	}
	
	private String getName(String string) {
		String[] words = string.split(" ");
		char[] name = new char[words[2].length() - 1];
		words[2].getChars(0, words[2].length() - 1, name, 0);
		return new String(name);
	}
}
