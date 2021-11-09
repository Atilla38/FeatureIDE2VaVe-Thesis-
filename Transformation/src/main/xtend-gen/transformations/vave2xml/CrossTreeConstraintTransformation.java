package transformations.vave2xml;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.ConjType;
import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.DisjType;
import FeatureIDEXSD.EqType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.NotType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.UnaryExpressionType;
import FeatureIDEXSD.VarType;
import java.util.Arrays;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import vavemodel.Conjunction;
import vavemodel.CrossTreeConstraint;
import vavemodel.Disjunction;
import vavemodel.Equivalence;
import vavemodel.Expression;
import vavemodel.Feature;
import vavemodel.FeatureOption;
import vavemodel.Implication;
import vavemodel.Not;
import vavemodel.Term;
import vavemodel.Variable;

/**
 * Implements the constraint transformation from a feature-model in VaVe to a FeatureIDE feature-model.
 */
@SuppressWarnings("all")
public class CrossTreeConstraintTransformation {
  private ConstraintsType constraint;
  
  private FeatureModelType featureModel;
  
  public CrossTreeConstraintTransformation(final FeatureModelType featureModel) {
    this.constraint = FeatureIDEXSDFactory.eINSTANCE.createConstraintsType();
    this.featureModel = featureModel;
  }
  
  /**
   * Starts the constraint transformation.
   * @param constraintList A list of the constraints which should be transformed.
   */
  public void start(final EList<CrossTreeConstraint> constraintList) {
    for (final CrossTreeConstraint constraint : constraintList) {
      {
        RuleType rule = FeatureIDEXSDFactory.eINSTANCE.createRuleType();
        rule.getExpressionListGroup().add(
          this.parseExpression(constraint.getExpression()));
        this.constraint.getRule().add(rule);
      }
    }
    this.featureModel.setConstraints(this.constraint);
  }
  
  /**
   * Parses the vavemodel.Implication expression to FeatureIDEXSD.ImpType expression.
   * @param expression The vavemodel.Implication which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Implication<FeatureOption> expression) {
    ImpType imp = FeatureIDEXSDFactory.eINSTANCE.createImpType();
    this.parseChild(imp, null, expression.getTerm());
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP, imp);
  }
  
  /**
   * Parses the vavemodel.Conjunction expression to FeatureIDEXSD.ConjType expression.
   * @param expression The vavemodel.Conjunction which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Conjunction<FeatureOption> expression) {
    ConjType conj = FeatureIDEXSDFactory.eINSTANCE.createConjType();
    this.parseChild(conj, null, expression.getTerm());
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ, conj);
  }
  
  /**
   * Parses the vavemodel.Disjunction expression to FeatureIDEXSD.DisjType expression.
   * @param expression The vavemodel.Disjunction expression which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Disjunction<FeatureOption> expression) {
    DisjType disj = FeatureIDEXSDFactory.eINSTANCE.createDisjType();
    this.parseChild(disj, null, expression.getTerm());
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ, disj);
  }
  
  /**
   * Parses the vavemodel.Equivalence expression to FeatureIDEXSD.EqType expression.
   * @param expression The vavemodel.Disjunction expression which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Equivalence<FeatureOption> expression) {
    EqType eq = FeatureIDEXSDFactory.eINSTANCE.createEqType();
    this.parseChild(eq, null, expression.getTerm());
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ, eq);
  }
  
  /**
   * Parses the vavemodel.Not expression to FeatureIDEXSD.NotType expression.
   * @param expression The vavemodel.Not expression which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Not<FeatureOption> expression) {
    NotType not = FeatureIDEXSDFactory.eINSTANCE.createNotType();
    EList<Term<FeatureOption>> terms = new BasicEList<Term<FeatureOption>>();
    terms.add(expression.getTerm());
    this.parseChild(null, not, terms);
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT, not);
  }
  
  /**
   * Parses the vavemodel.Variable expression to FeatureIDEXSD.VarType expression.
   * @param expression The vavemodel.Variable expression which should be parsed.
   * @return Returns a FeatureMap.Entry  with FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR as EStructuralFeature.
   */
  private FeatureMap.Entry _parseExpression(final Variable<FeatureOption> expression) {
    VarType var = FeatureIDEXSDFactory.eINSTANCE.createVarType();
    FeatureOption _option = expression.getOption();
    FeatureMap.Entry entry = FeatureMapUtil.createRawTextEntry(((Feature) _option).getName());
    var.getMixed().add(entry);
    return FeatureMapUtil.createEntry(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR, var);
  }
  
  /**
   * Parses the children.
   * @param binaryExpression If the parent is a binary expression this should not be null.
   * @param unaryExpression If the parent is a unary expression this should not be null.
   * @param termList The children which should be parsed.
   */
  private void parseChild(final BinaryExpressionType binaryExpression, final UnaryExpressionType unaryExpression, final EList<Term<FeatureOption>> termList) {
    for (final Term<FeatureOption> term : termList) {
      if ((binaryExpression != null)) {
        binaryExpression.getExpressionListGroup().add(this.parseExpression(((Expression<FeatureOption>) term)));
      } else {
        unaryExpression.getExpressionListGroup().add(this.parseExpression(((Expression<FeatureOption>) term)));
      }
    }
  }
  
  private FeatureMap.Entry parseExpression(final Expression<FeatureOption> expression) {
    if (expression instanceof Conjunction) {
      return _parseExpression((Conjunction<FeatureOption>)expression);
    } else if (expression instanceof Disjunction) {
      return _parseExpression((Disjunction<FeatureOption>)expression);
    } else if (expression instanceof Equivalence) {
      return _parseExpression((Equivalence<FeatureOption>)expression);
    } else if (expression instanceof Implication) {
      return _parseExpression((Implication<FeatureOption>)expression);
    } else if (expression instanceof Not) {
      return _parseExpression((Not<FeatureOption>)expression);
    } else if (expression instanceof Variable) {
      return _parseExpression((Variable<FeatureOption>)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
