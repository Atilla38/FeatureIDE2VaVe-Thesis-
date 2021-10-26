package exception.handling.xml2vave;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.OrType;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ExceptionHandlerStruct {
  private String and = "AND";
  
  private String or = "OR";
  
  private String alt = "ALT";
  
  protected void _checkNode(final AndType node, final EList<Node> nodeList) {
    this.checkBinaryList(nodeList, this.and, false);
  }
  
  protected void _checkNode(final OrType node, final EList<Node> nodeList) {
    this.checkBinaryList(nodeList, this.or, true);
  }
  
  protected void _checkNode(final AltType node, final EList<Node> nodeList) {
    this.checkBinaryList(nodeList, this.alt, true);
  }
  
  public void checkBinaryList(final EList<Node> list, final String node, final boolean binary) {
    try {
      if (binary) {
        if (((list == null) || (list.get(0) == null))) {
          throw new Exception((node + " has no child nodes"));
        } else {
          int _length = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
          boolean _lessThan = (_length < 2);
          if (_lessThan) {
            throw new Exception((node + " is a binary node it needs at least two child nodes"));
          } else {
            return;
          }
        }
      } else {
        if ((list == null)) {
          throw new Exception((node + " has no child node"));
        } else {
          int _length_1 = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
          boolean _lessThan_1 = (_length_1 < 1);
          if (_lessThan_1) {
            throw new Exception((node + " is a unary node it needs at least one child node"));
          } else {
            return;
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void checkNode(final Node node, final EList<Node> nodeList) {
    if (node instanceof AltType) {
      _checkNode((AltType)node, nodeList);
      return;
    } else if (node instanceof AndType) {
      _checkNode((AndType)node, nodeList);
      return;
    } else if (node instanceof OrType) {
      _checkNode((OrType)node, nodeList);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, nodeList).toString());
    }
  }
}
