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

@SuppressWarnings("all")
public class CrossTreeConstraintTransformation {
  private vavemodel.System system;
  
  public CrossTreeConstraintTransformation(final vavemodel.System system) {
    this.system = system;
  }
  
  public void start(final EList<RuleType> ruleList) {
    for (final RuleType rule : ruleList) {
      {
        CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint();
        Expression<FeatureOption> expression = null;
        FeatureIDEXSD.Expression featureIDEExpression = rule.getExpressionList();
        if ((featureIDEExpression instanceof ImpType)) {
          expression = this.parseChild(featureIDEExpression, null);
          if ((expression == null)) {
            return;
          }
        }
        crossTreeConstr.setExpression(expression);
        this.system.getConstraint().add(crossTreeConstr);
      }
    }
  }
  
  private Implication<FeatureOption> _parseChild(final ImpType imp, final Expression<FeatureOption> expression) {
    Implication<FeatureOption> vaveImp = VavemodelFactory.eINSTANCE.<FeatureOption>createImplication();
    this.transformChilds(imp, null, vaveImp);
    return vaveImp;
  }
  
  private Conjunction<FeatureOption> _parseChild(final ConjType conj, final Expression<FeatureOption> expression) {
    Conjunction<FeatureOption> vaveConj = VavemodelFactory.eINSTANCE.<FeatureOption>createConjunction();
    this.transformChilds(conj, null, vaveConj);
    return vaveConj;
  }
  
  private Disjunction<FeatureOption> _parseChild(final DisjType disj, final Expression<FeatureOption> expression) {
    Disjunction<FeatureOption> vaveDisj = VavemodelFactory.eINSTANCE.<FeatureOption>createDisjunction();
    this.transformChilds(disj, null, vaveDisj);
    return vaveDisj;
  }
  
  private Equivalence<FeatureOption> _parseChild(final EqType eq, final Expression<FeatureOption> expression) {
    Equivalence<FeatureOption> vaveEq = VavemodelFactory.eINSTANCE.<FeatureOption>createEquivalence();
    this.transformChilds(eq, null, vaveEq);
    return vaveEq;
  }
  
  private Not<FeatureOption> _parseChild(final NotType not, final Expression<FeatureOption> expression) {
    Not<FeatureOption> vaveNot = VavemodelFactory.eINSTANCE.<FeatureOption>createNot();
    this.transformChilds(null, not, vaveNot);
    return vaveNot;
  }
  
  private Variable<FeatureOption> _parseChild(final VarType var, final Expression<FeatureOption> expression) {
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
        Expression<FeatureOption> vaveExpression = this.parseChild(featureIDEExpression, null);
        if ((vaveExpression == null)) {
          return;
        }
        this.addTerm((isBinary).booleanValue(), expression, vaveExpression);
      }
    }
  }
  
  private void addTerm(final boolean binary, final Expression<FeatureOption> expression, final Expression<FeatureOption> term) {
    if (binary) {
      ((BinaryExpression<FeatureOption>) expression).getTerm().add(term);
    } else {
      ((UnaryExpression<FeatureOption>) expression).setTerm(term);
    }
  }
  
  private Expression<FeatureOption> parseChild(final FeatureIDEXSD.Expression conj, final Expression<FeatureOption> expression) {
    if (conj instanceof ConjType) {
      return _parseChild((ConjType)conj, expression);
    } else if (conj instanceof DisjType) {
      return _parseChild((DisjType)conj, expression);
    } else if (conj instanceof EqType) {
      return _parseChild((EqType)conj, expression);
    } else if (conj instanceof ImpType) {
      return _parseChild((ImpType)conj, expression);
    } else if (conj instanceof NotType) {
      return _parseChild((NotType)conj, expression);
    } else if (conj instanceof VarType) {
      return _parseChild((VarType)conj, expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(conj, expression).toString());
    }
  }
}
