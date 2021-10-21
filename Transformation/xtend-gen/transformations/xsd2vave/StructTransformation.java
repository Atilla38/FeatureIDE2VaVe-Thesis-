package transformations.xsd2vave;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.OrType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.UnaryNodeType;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import vavemodel.Feature;
import vavemodel.GroupType;
import vavemodel.TreeConstraint;
import vavemodel.VavemodelFactory;

@SuppressWarnings("all")
public class StructTransformation {
  private vavemodel.System system;
  
  public StructTransformation(final vavemodel.System system) {
    this.system = system;
  }
  
  public void start(final StructType struct) {
    Node node = struct.getNodeList();
    this.parseChild(node, null, null);
  }
  
  private void _parseChild(final OrType or, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(or);
    this.addTreeConstraints(or, feature, parent, treeConstrParent);
    TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
    treeconstr.setType(GroupType.OR);
    this.addContainment(feature, treeconstr, "treeconstraint");
    this.tranformChildFeatures(or, null, feature, treeconstr);
  }
  
  private void _parseChild(final AltType alt, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(alt);
    this.addTreeConstraints(alt, feature, parent, treeConstrParent);
    TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
    treeconstr.setType(GroupType.XOR);
    this.addContainment(feature, treeconstr, "treeconstraint");
    this.tranformChildFeatures(alt, null, feature, treeconstr);
  }
  
  private void _parseChild(final AndType and, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(and);
    this.addTreeConstraints(and, feature, parent, treeConstrParent);
    this.tranformChildFeatures(null, and, feature, treeConstrParent);
  }
  
  private void _parseChild(final FeatureType leaf, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(leaf);
    this.addTreeConstraints(leaf, feature, parent, treeConstrParent);
  }
  
  @SuppressWarnings("unchecked")
  private void addContainment(final EObject container, final EObject containment, final String structFeature) {
    EStructuralFeature eStructFeature = container.eClass().getEStructuralFeature(structFeature);
    Object _eGet = container.eGet(eStructFeature);
    List<EObject> features = ((List<EObject>) _eGet);
    features.add(containment);
  }
  
  private Feature createFeature(final Node node) {
    Feature feature = VavemodelFactory.eINSTANCE.createFeature();
    feature.setName(node.getName());
    this.system.getFeature().add(feature);
    return feature;
  }
  
  private void tranformChildFeatures(final BinaryNodeType binaryNode, final UnaryNodeType unaryNode, final Feature feature, final TreeConstraint treeConstr) {
    EList<Node> nodeList = null;
    if ((binaryNode != null)) {
      nodeList = binaryNode.getNodeList();
    } else {
      if ((unaryNode != null)) {
        nodeList = unaryNode.getNodeList();
      } else {
        System.out.println("Unary and binaryNode can\'t be both null");
        return;
      }
    }
    for (final Node childNode : nodeList) {
      if ((unaryNode != null)) {
        this.parseChild(childNode, feature, null);
      } else {
        this.parseChild(childNode, null, treeConstr);
      }
    }
  }
  
  private void addTreeConstraints(final Node node, final Feature feature, final Feature parent, final TreeConstraint treeConstrParent) {
    if ((treeConstrParent != null)) {
      this.addContainment(treeConstrParent, feature, "feature");
    } else {
      if ((parent != null)) {
        TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
        boolean _isMandatory = node.isMandatory();
        if (_isMandatory) {
          treeconstr.setType(GroupType.XOR);
          this.addContainment(parent, treeconstr, "treeconstraint");
          this.addContainment(treeconstr, feature, "feature");
        } else {
          treeconstr.setType(GroupType.XORNONE);
          this.addContainment(parent, treeconstr, "treeconstraint");
          this.addContainment(treeconstr, feature, "feature");
        }
      }
    }
  }
  
  private void parseChild(final Node alt, final Feature parent, final TreeConstraint treeConstrParent) {
    if (alt instanceof AltType) {
      _parseChild((AltType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof AndType) {
      _parseChild((AndType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof FeatureType) {
      _parseChild((FeatureType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof OrType) {
      _parseChild((OrType)alt, parent, treeConstrParent);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(alt, parent, treeConstrParent).toString());
    }
  }
}
