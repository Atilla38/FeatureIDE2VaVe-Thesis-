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

/**
 * Implements the structural transformation from xml to vave of the FeatureIDE Feature-Model.
 */
@SuppressWarnings("all")
public class StructTransformation {
  private vavemodel.System system;
  
  public StructTransformation(final vavemodel.System system) {
    this.system = system;
  }
  
  /**
   * Starts the structural transformation.
   * @param struct The struct container of the FeatureIDEXSD ecore model.
   */
  public void start(final StructType struct) {
    Node node = struct.getNodeList();
    this.parseFeature(node, null, null);
  }
  
  /**
   * Generates a vavemodel feature, adds a tree constraint with the type OR to it and parses the child features of the or parameter.
   * @param or The OrType feature which should be parsed and whose children should be parsed.
   * @param parent The parent of the or feature.
   * @param treeConstrParent The tree constraint of the parent which is used to point to the child.
   */
  private void _parseFeature(final OrType or, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(or);
    this.addTreeConstraints(or, feature, parent, treeConstrParent);
    TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
    treeconstr.setType(GroupType.OR);
    this.addContainment(feature, treeconstr, "treeconstraint");
    this.tranformChildFeatures(or, null, feature, treeconstr);
  }
  
  /**
   * Generates a vavemodel feature, adds a tree constraint with the type XOR to it and parses the child features of the alt parameter.
   * @param alt The AltType feature which should be parsed and whose children should be parsed.
   * @param parent The parent of the alt feature.
   * @param treeConstrParent The tree constraint of the parent which is used to point to the child.
   */
  private void _parseFeature(final AltType alt, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(alt);
    this.addTreeConstraints(alt, feature, parent, treeConstrParent);
    TreeConstraint treeconstr = VavemodelFactory.eINSTANCE.createTreeConstraint();
    treeconstr.setType(GroupType.XOR);
    this.addContainment(feature, treeconstr, "treeconstraint");
    this.tranformChildFeatures(alt, null, feature, treeconstr);
  }
  
  /**
   * Generates a vavemodel feature and parses the child features of the and parameter.
   * @param and The AndType feature which should be parsed and whose children should be parsed.
   * @param parent The parent of the and feature.
   * @param treeConstrParent The tree constraint of the parent which is used to point to the child.
   */
  private void _parseFeature(final AndType and, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(and);
    this.addTreeConstraints(and, feature, parent, treeConstrParent);
    this.tranformChildFeatures(null, and, feature, treeConstrParent);
  }
  
  /**
   * Generates a vavemodel feature.
   * @param leaf The FeatureType feature which should be parsed.
   * @param parent The parent of the leaf feature.
   * @param treeConstrParent The tree constraint of the parent which is used to point to the child.
   */
  private void _parseFeature(final FeatureType leaf, final Feature parent, final TreeConstraint treeConstrParent) {
    Feature feature = this.createFeature(leaf);
    this.addTreeConstraints(leaf, feature, parent, treeConstrParent);
  }
  
  /**
   * Adds the containment to the container.
   * @param container The container to which the containment should be added.
   * @param containment The containment which should be added to the container.
   * @param structFeature The type of the containment. "feature" for a feature and "treeconstraint" for treeconstraint.
   */
  @SuppressWarnings("unchecked")
  private void addContainment(final EObject container, final EObject containment, final String structFeature) {
    EStructuralFeature eStructFeature = container.eClass().getEStructuralFeature(structFeature);
    Object _eGet = container.eGet(eStructFeature);
    List<EObject> features = ((List<EObject>) _eGet);
    features.add(containment);
  }
  
  /**
   * Creates a vavemodel feature.
   * @param node The created vavemodel feature gets the name of the node.
   */
  private Feature createFeature(final Node node) {
    Feature feature = VavemodelFactory.eINSTANCE.createFeature();
    feature.setName(node.getName());
    this.system.getFeature().add(feature);
    return feature;
  }
  
  /**
   * Transforms the child features of the binary or unaryNode parameter.
   * @param binaryNode If the parent feature is of the type BinaryNodeType this parameter should not be null.
   * @param unaryNode If the parent feature is of the type UnaryNodeType this parameter should not be null.
   * @param feature The parent feature with the vavemodel.Feature type.
   */
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
        this.parseFeature(childNode, feature, null);
      } else {
        this.parseFeature(childNode, null, treeConstr);
      }
    }
  }
  
  /**
   * Adds tree constraints to the parent parameter. If treeConstrParent is not null the tree constraint will be added which points then to the feature parameter.
   * If parent is not null a tree constraint which points to the feature based on the node parameter will be added to the parent.
   * @param Node If parent is not null and the node is mandatory a tree constraint with type XOR will be added to the parent else when parent is not null with type XORNONE.
   * @param feature The child of the parent feature.
   * @param parent The parent of the feature parameter.
   */
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
  
  private void parseFeature(final Node alt, final Feature parent, final TreeConstraint treeConstrParent) {
    if (alt instanceof AltType) {
      _parseFeature((AltType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof AndType) {
      _parseFeature((AndType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof FeatureType) {
      _parseFeature((FeatureType)alt, parent, treeConstrParent);
      return;
    } else if (alt instanceof OrType) {
      _parseFeature((OrType)alt, parent, treeConstrParent);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(alt, parent, treeConstrParent).toString());
    }
  }
}
