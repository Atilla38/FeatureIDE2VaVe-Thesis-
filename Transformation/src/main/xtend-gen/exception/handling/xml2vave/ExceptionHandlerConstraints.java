package exception.handling.xml2vave;

import FeatureIDEXSD.ConjType;
import FeatureIDEXSD.DisjType;
import FeatureIDEXSD.EqType;
import FeatureIDEXSD.Expression;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.NotType;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ExceptionHandlerConstraints {
  private String implication = "IMPLICATION";
  
  private String conjunction = "CONJUNCTION";
  
  private String disjunction = "DISJUNCTION";
  
  private String equivalence = "EQUIVALENCE";
  
  private String not = "NOT";
  
  protected void _checkExpression(final ImpType expression, final EList<Expression> expressionList) {
    this.checkBinaryList(expressionList, this.implication, true);
  }
  
  protected void _checkExpression(final ConjType expression, final EList<Expression> expressionList) {
    this.checkBinaryList(expressionList, this.conjunction, true);
  }
  
  protected void _checkExpression(final DisjType expression, final EList<Expression> expressionList) {
    this.checkBinaryList(expressionList, this.disjunction, true);
  }
  
  protected void _checkExpression(final EqType expression, final EList<Expression> expressionList) {
    this.checkBinaryList(expressionList, this.equivalence, true);
  }
  
  protected void _checkExpression(final NotType expression, final EList<Expression> expressionList) {
    this.checkBinaryList(expressionList, this.not, false);
  }
  
  public void checkBinaryList(final EList<Expression> list, final String expression, final boolean binary) {
    try {
      if (binary) {
        if (((list == null) || (list.get(0) == null))) {
          throw new Exception((expression + " has no terms"));
        } else {
          int _length = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
          boolean _equals = (_length == 2);
          if (_equals) {
            return;
          } else {
            int _length_1 = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
            boolean _lessThan = (_length_1 < 2);
            if (_lessThan) {
              throw new Exception((expression + " is a binary expression it needs two terms"));
            } else {
              throw new Exception((expression + " has more then two terms this is not allowed"));
            }
          }
        }
      } else {
        if ((list == null)) {
          throw new Exception((expression + " has no terms"));
        } else {
          int _length_2 = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
          boolean _equals_1 = (_length_2 == 1);
          if (_equals_1) {
            return;
          } else {
            int _length_3 = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
            boolean _lessThan_1 = (_length_3 < 1);
            if (_lessThan_1) {
              throw new Exception((expression + " is a unary expression it needs one term"));
            } else {
              throw new Exception((expression + " has more then one term this is not allowed"));
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void checkExpression(final Expression expression, final EList<Expression> expressionList) {
    if (expression instanceof ConjType) {
      _checkExpression((ConjType)expression, expressionList);
      return;
    } else if (expression instanceof DisjType) {
      _checkExpression((DisjType)expression, expressionList);
      return;
    } else if (expression instanceof EqType) {
      _checkExpression((EqType)expression, expressionList);
      return;
    } else if (expression instanceof ImpType) {
      _checkExpression((ImpType)expression, expressionList);
      return;
    } else if (expression instanceof NotType) {
      _checkExpression((NotType)expression, expressionList);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, expressionList).toString());
    }
  }
}
