package transformations.xsd2vave;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.ConjType;
import FeatureIDEXSD.DisjType;
import FeatureIDEXSD.EqType;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.NotType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.UnaryExpressionType;
import FeatureIDEXSD.VarType;
import java.util.Arrays;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import vavemodel.BinaryExpression;
import vavemodel.Conjunction;
import vavemodel.CrossTreeConstraint;
import vavemodel.Disjunction;
import vavemodel.Equivalence;
import vavemodel.Expression;
import vavemodel.Feature;
import vavemodel.FeatureOption;
import vavemodel.Implication;
import vavemodel.Not;
import vavemodel.UnaryExpression;
import vavemodel.Variable;
import vavemodel.VavemodelFactory;

/**
 * Implements the constraint transformation from xml to vave of the FeatureIDE Feature-Model.
 */
@SuppressWarnings("all")
public class CrossTreeConstraintTransformation {
  private vavemodel.System system;
  
  public CrossTreeConstraintTransformation(final vavemodel.System system) {
    this.system = system;
  }
  
  /**
   * Starts the transformation of the constraints.
   * @param ruleList A list of the constraints in the FeatureIDE Feature-Model.
   */
  public void start(final EList<RuleType> ruleList) {
    for (final RuleType rule : ruleList) {
      {
        CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint();
        Expression<FeatureOption> expression = null;
        FeatureIDEXSD.Expression featureIDEExpression = rule.getExpressionList();
        if ((featureIDEExpression instanceof ImpType)) {
          expression = this.parseExpression(featureIDEExpression);
          if ((expression == null)) {
            return;
          }
        }
        crossTreeConstr.setExpression(expression);
        this.system.getConstraint().add(crossTreeConstr);
      }
    }
  }
  
  /**
   * Generates a vavemodel.Implication instance and parses the child terms of the implication expression.
   * @param imp The implication which should be parsed and whose child terms should be parsed.
   * @return Returns the generated vavemodel.Implication instance based on the imp parameter.
   */
  private Implication<FeatureOption> _parseExpression(final ImpType imp) {
    Implication<FeatureOption> vaveImp = VavemodelFactory.eINSTANCE.<FeatureOption>createImplication();
    this.transformChilds(imp, null, vaveImp);
    return vaveImp;
  }
  
  /**
   * Generates a vavemodel.Conjunction instance and parses the child terms of the conjunction expression.
   * @param conj The conjunction which should be parsed and whose child terms should be parsed.
   * @return Returns the generated vavemodel.Conjunction instance based on the conj parameter.
   */
  private Conjunction<FeatureOption> _parseExpression(final ConjType conj) {
    Conjunction<FeatureOption> vaveConj = VavemodelFactory.eINSTANCE.<FeatureOption>createConjunction();
    this.transformChilds(conj, null, vaveConj);
    return vaveConj;
  }
  
  /**
   * Generates a vavemodel.Disjunction instance and parses the child terms of the disjunction expression.
   * @param disj The disjunction which should be parsed and whose child terms should be parsed.
   * @return Returns the generated vavemodel.Disjunction instance based on the disj parameter.
   */
  private Disjunction<FeatureOption> _parseExpression(final DisjType disj) {
    Disjunction<FeatureOption> vaveDisj = VavemodelFactory.eINSTANCE.<FeatureOption>createDisjunction();
    this.transformChilds(disj, null, vaveDisj);
    return vaveDisj;
  }
  
  /**
   * Generates a vavemodel.Equivalence instance and parses the child terms of the equivalence expression.
   * @param eq The equivalence which should be parsed and whose child terms should be parsed.
   * @return Returns the generated vavemodel.Equivalence instance based on the eq parameter.
   */
  private Equivalence<FeatureOption> _parseExpression(final EqType eq) {
    Equivalence<FeatureOption> vaveEq = VavemodelFactory.eINSTANCE.<FeatureOption>createEquivalence();
    this.transformChilds(eq, null, vaveEq);
    return vaveEq;
  }
  
  /**
   * Generates a vavemodel.Not instance and parses the child terms of the not expression.
   * @param conj The conjunction which should be parsed and whose child terms should be parsed.
   * @return Returns the generated vavemodel.Conjunction instance based on the conj parameter.
   */
  private Not<FeatureOption> _parseExpression(final NotType not) {
    Not<FeatureOption> vaveNot = VavemodelFactory.eINSTANCE.<FeatureOption>createNot();
    this.transformChilds(null, not, vaveNot);
    return vaveNot;
  }
  
  /**
   * Generates a vavemodel.Variable instance.
   * @param ^var The variable which should be parsed.
   * @return Returns the generated vavemodel.Variable instance based on the ^var parameter.
   */
  private Variable<FeatureOption> _parseExpression(final VarType var) {
    Variable<FeatureOption> vaveVar = VavemodelFactory.eINSTANCE.<FeatureOption>createVariable();
    EList<Feature> _feature = this.system.getFeature();
    for (final Feature feature : _feature) {
      boolean _equals = feature.getName().equals(var.getMixed().getValue(0));
      if (_equals) {
        vaveVar.setOption(feature);
        return vaveVar;
      }
    }
    System.out.println("No matching feature found in system");
    return null;
  }
  
  /**
   * Transforms the child terms and adds them to the expression.
   * @param binaryExpression If the parent expression is of the type BinaryExpressionType this parameter should not be null.
   * @param unaryExpression If the parent expression is of the type UnaryExpressionType this parameter should not be null.
   * @param expression The parent expression with type vavemodel.Expression.
   */
  private void transformChilds(final BinaryExpressionType binaryExpression, final UnaryExpressionType unaryExpression, final Expression<FeatureOption> expression) {
    EList<FeatureIDEXSD.Expression> featureIDEExpressionList = null;
    Boolean isBinary = null;
    if ((binaryExpression != null)) {
      featureIDEExpressionList = binaryExpression.getExpressionList();
      isBinary = Boolean.valueOf(true);
    } else {
      if ((unaryExpression != null)) {
        BasicEList<FeatureIDEXSD.Expression> _basicEList = new BasicEList<FeatureIDEXSD.Expression>();
        featureIDEExpressionList = _basicEList;
        featureIDEExpressionList.add(unaryExpression.getExpressionList());
        isBinary = Boolean.valueOf(false);
      } else {
        System.out.println("Binary and unaryExpression can\'t be both null");
        return;
      }
    }
    for (final FeatureIDEXSD.Expression featureIDEExpression : featureIDEExpressionList) {
      {
        Expression<FeatureOption> vaveExpression = this.parseExpression(featureIDEExpression);
        if ((vaveExpression == null)) {
          return;
        }
        this.addTerm((isBinary).booleanValue(), expression, vaveExpression);
      }
    }
  }
  
  /**
   * Adds the term to the expression.
   * @param binary If the expression is a binary expression this should be true.
   * @param expression The expression to witch the term should be added.
   * @param term The term which should be added to the expression.
   */
  private void addTerm(final boolean binary, final Expression<FeatureOption> expression, final Expression<FeatureOption> term) {
    if (binary) {
      ((BinaryExpression<FeatureOption>) expression).getTerm().add(term);
    } else {
      ((UnaryExpression<FeatureOption>) expression).setTerm(term);
    }
  }
  
  private Expression<FeatureOption> parseExpression(final FeatureIDEXSD.Expression conj) {
    if (conj instanceof ConjType) {
      return _parseExpression((ConjType)conj);
    } else if (conj instanceof DisjType) {
      return _parseExpression((DisjType)conj);
    } else if (conj instanceof EqType) {
      return _parseExpression((EqType)conj);
    } else if (conj instanceof ImpType) {
      return _parseExpression((ImpType)conj);
    } else if (conj instanceof NotType) {
      return _parseExpression((NotType)conj);
    } else if (conj instanceof VarType) {
      return _parseExpression((VarType)conj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(conj).toString());
    }
  }
}
