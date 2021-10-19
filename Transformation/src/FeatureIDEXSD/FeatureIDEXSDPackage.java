/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FeatureIDEXSD.FeatureIDEXSDFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface FeatureIDEXSDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FeatureIDEXSD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/D:/Uni/Bachelorarbeit/Thesis%20Repository/XSD-Schema/XMLSPY/FeatureIDE-XSD.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FeatureIDEXSD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureIDEXSDPackage eINSTANCE = FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl.init();

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ExpressionImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl <em>Binary Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.BinaryExpressionTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryExpressionType()
	 * @generated
	 */
	int BINARY_EXPRESSION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_TYPE__EXPRESSION_LIST = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.NodeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 19;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ExtendedNodeImpl <em>Extended Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ExtendedNodeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedNode()
	 * @generated
	 */
	int EXTENDED_NODE = 13;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.BinaryExtendedNodeTypeImpl <em>Binary Extended Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.BinaryExtendedNodeTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryExtendedNodeType()
	 * @generated
	 */
	int BINARY_EXTENDED_NODE_TYPE = 1;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl <em>Binary Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.BinaryNodeTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryNodeType()
	 * @generated
	 */
	int BINARY_NODE_TYPE = 2;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.CalculationsTypeImpl <em>Calculations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.CalculationsTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getCalculationsType()
	 * @generated
	 */
	int CALCULATIONS_TYPE = 3;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.CommentsTypeImpl <em>Comments Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.CommentsTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getCommentsType()
	 * @generated
	 */
	int COMMENTS_TYPE = 4;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ConstraintsTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 6;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.DocumentRootImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ExtendedFeatureModelTypeImpl <em>Extended Feature Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ExtendedFeatureModelTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedFeatureModelType()
	 * @generated
	 */
	int EXTENDED_FEATURE_MODEL_TYPE = 11;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ExtendedLeafTypeImpl <em>Extended Leaf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ExtendedLeafTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedLeafType()
	 * @generated
	 */
	int EXTENDED_LEAF_TYPE = 12;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.FeatureModelTypeImpl <em>Feature Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.FeatureModelTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getFeatureModelType()
	 * @generated
	 */
	int FEATURE_MODEL_TYPE = 14;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.FeatureOrderTypeImpl <em>Feature Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.FeatureOrderTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getFeatureOrderType()
	 * @generated
	 */
	int FEATURE_ORDER_TYPE = 15;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.GraphicsTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getGraphicsType()
	 * @generated
	 */
	int GRAPHICS_TYPE = 16;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.LeafTypeImpl <em>Leaf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.LeafTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getLeafType()
	 * @generated
	 */
	int LEAF_TYPE = 18;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.PropertiesTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 21;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.RuleTypeImpl <em>Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.RuleTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 22;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.StructTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getStructType()
	 * @generated
	 */
	int STRUCT_TYPE = 23;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.StructType1Impl <em>Struct Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.StructType1Impl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getStructType1()
	 * @generated
	 */
	int STRUCT_TYPE1 = 24;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl <em>Unary Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.UnaryExpressionTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryExpressionType()
	 * @generated
	 */
	int UNARY_EXPRESSION_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Binary Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_TYPE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_TYPE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPHICS = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HIDDEN = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MANDATORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__ABSTRACT = NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__HIDDEN = NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__MANDATORY = NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE__ATTRIBUTE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extended Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__DESCRIPTION = EXTENDED_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__GRAPHICS = EXTENDED_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__ABSTRACT = EXTENDED_NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__HIDDEN = EXTENDED_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__MANDATORY = EXTENDED_NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__NAME = EXTENDED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__ATTRIBUTE = EXTENDED_NODE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extended Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP = EXTENDED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__FEATURE = EXTENDED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__ALT = EXTENDED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__OR = EXTENDED_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE__AND = EXTENDED_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binary Extended Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE_FEATURE_COUNT = EXTENDED_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Binary Extended Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXTENDED_NODE_TYPE_OPERATION_COUNT = EXTENDED_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__ABSTRACT = NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__HIDDEN = NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__MANDATORY = NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__NODE_GROUP = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__FEATURE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__ALT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__OR = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE__AND = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binary Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Binary Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NODE_TYPE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Calculations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calculations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE__C = 0;

	/**
	 * The number of structural features of the '<em>Comments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ConjTypeImpl <em>Conj Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ConjTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getConjType()
	 * @generated
	 */
	int CONJ_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJ_TYPE__EXPRESSION_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJ_TYPE__EXPRESSION_LIST_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJ_TYPE__EXPRESSION_LIST = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST;

	/**
	 * The number of structural features of the '<em>Conj Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJ_TYPE_FEATURE_COUNT = BINARY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conj Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJ_TYPE_OPERATION_COUNT = BINARY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__RULE = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.DisjTypeImpl <em>Disj Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.DisjTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getDisjType()
	 * @generated
	 */
	int DISJ_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJ_TYPE__EXPRESSION_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJ_TYPE__EXPRESSION_LIST_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJ_TYPE__EXPRESSION_LIST = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST;

	/**
	 * The number of structural features of the '<em>Disj Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJ_TYPE_FEATURE_COUNT = BINARY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disj Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJ_TYPE_OPERATION_COUNT = BINARY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__C = 3;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALCULATIONS = 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENTS = 5;

	/**
	 * The feature id for the '<em><b>Conj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONJ = 6;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION_LIST = 7;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTRAINTS = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Disj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISJ = 10;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EQ = 11;

	/**
	 * The feature id for the '<em><b>Extended Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Feature Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_ORDER = 14;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRAPHICS = 15;

	/**
	 * The feature id for the '<em><b>Imp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMP = 16;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOT = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 18;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RULE = 19;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VAR = 20;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.EqTypeImpl <em>Eq Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.EqTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getEqType()
	 * @generated
	 */
	int EQ_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TYPE__EXPRESSION_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TYPE__EXPRESSION_LIST_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TYPE__EXPRESSION_LIST = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST;

	/**
	 * The number of structural features of the '<em>Eq Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TYPE_FEATURE_COUNT = BINARY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eq Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TYPE_OPERATION_COUNT = BINARY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Feature Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER = 5;

	/**
	 * The number of structural features of the '<em>Extended Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Extended Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__DESCRIPTION = EXTENDED_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__GRAPHICS = EXTENDED_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__ABSTRACT = EXTENDED_NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__HIDDEN = EXTENDED_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__MANDATORY = EXTENDED_NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__NAME = EXTENDED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE__ATTRIBUTE = EXTENDED_NODE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Extended Leaf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE_FEATURE_COUNT = EXTENDED_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extended Leaf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_LEAF_TYPE_OPERATION_COUNT = EXTENDED_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__CALCULATIONS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Feature Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__FEATURE_ORDER = 5;

	/**
	 * The number of structural features of the '<em>Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ORDER_TYPE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ORDER_TYPE__USER_DEFINED = 1;

	/**
	 * The number of structural features of the '<em>Feature Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ORDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ORDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.ImpTypeImpl <em>Imp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.ImpTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getImpType()
	 * @generated
	 */
	int IMP_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMP_TYPE__EXPRESSION_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMP_TYPE__EXPRESSION_LIST_GROUP = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMP_TYPE__EXPRESSION_LIST = BINARY_EXPRESSION_TYPE__EXPRESSION_LIST;

	/**
	 * The number of structural features of the '<em>Imp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMP_TYPE_FEATURE_COUNT = BINARY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Imp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMP_TYPE_OPERATION_COUNT = BINARY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__ABSTRACT = NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__HIDDEN = NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__MANDATORY = NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Leaf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TYPE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_TYPE__EXPRESSION_LIST = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_TYPE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_TYPE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.NotTypeImpl <em>Not Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.NotTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getNotType()
	 * @generated
	 */
	int NOT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__EXPRESSION_LIST_GROUP = UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__EXPRESSION_LIST = UNARY_EXPRESSION_TYPE__EXPRESSION_LIST;

	/**
	 * The number of structural features of the '<em>Not Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE_FEATURE_COUNT = UNARY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE_OPERATION_COUNT = UNARY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__GRAPHICS = 1;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__CALCULATIONS = 2;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Expression List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__EXPRESSION_LIST_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__EXPRESSION_LIST = 2;

	/**
	 * The number of structural features of the '<em>Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__ALT = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__OR = 2;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__AND = 3;

	/**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1__ALT = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1__OR = 2;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1__AND = 3;

	/**
	 * The number of structural features of the '<em>Struct Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Struct Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl <em>Unary Extended Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryExtendedNodeType()
	 * @generated
	 */
	int UNARY_EXTENDED_NODE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__DESCRIPTION = EXTENDED_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__GRAPHICS = EXTENDED_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__ABSTRACT = EXTENDED_NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__HIDDEN = EXTENDED_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__MANDATORY = EXTENDED_NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__NAME = EXTENDED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__ATTRIBUTE = EXTENDED_NODE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extended Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP = EXTENDED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__FEATURE = EXTENDED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__ALT = EXTENDED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__OR = EXTENDED_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE__AND = EXTENDED_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unary Extended Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE_FEATURE_COUNT = EXTENDED_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Unary Extended Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXTENDED_NODE_TYPE_OPERATION_COUNT = EXTENDED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.UnaryNodeTypeImpl <em>Unary Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.UnaryNodeTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryNodeType()
	 * @generated
	 */
	int UNARY_NODE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__ABSTRACT = NODE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__HIDDEN = NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__MANDATORY = NODE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__NODE_GROUP = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__FEATURE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__ALT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__OR = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE__AND = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unary Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Unary Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NODE_TYPE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link FeatureIDEXSD.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureIDEXSD.impl.VarTypeImpl
	 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__MIXED = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.BinaryExpressionType <em>Binary Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression Type</em>'.
	 * @see FeatureIDEXSD.BinaryExpressionType
	 * @generated
	 */
	EClass getBinaryExpressionType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.BinaryExpressionType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see FeatureIDEXSD.BinaryExpressionType#getExpressionGroup()
	 * @see #getBinaryExpressionType()
	 * @generated
	 */
	EAttribute getBinaryExpressionType_ExpressionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.BinaryExpressionType#getExpressionListGroup <em>Expression List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression List Group</em>'.
	 * @see FeatureIDEXSD.BinaryExpressionType#getExpressionListGroup()
	 * @see #getBinaryExpressionType()
	 * @generated
	 */
	EAttribute getBinaryExpressionType_ExpressionListGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryExpressionType#getExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression List</em>'.
	 * @see FeatureIDEXSD.BinaryExpressionType#getExpressionList()
	 * @see #getBinaryExpressionType()
	 * @generated
	 */
	EReference getBinaryExpressionType_ExpressionList();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.BinaryExtendedNodeType <em>Binary Extended Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Extended Node Type</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType
	 * @generated
	 */
	EClass getBinaryExtendedNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.BinaryExtendedNodeType#getExtendedNodeGroup <em>Extended Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Node Group</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType#getExtendedNodeGroup()
	 * @see #getBinaryExtendedNodeType()
	 * @generated
	 */
	EAttribute getBinaryExtendedNodeType_ExtendedNodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryExtendedNodeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType#getFeature()
	 * @see #getBinaryExtendedNodeType()
	 * @generated
	 */
	EReference getBinaryExtendedNodeType_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryExtendedNodeType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType#getAlt()
	 * @see #getBinaryExtendedNodeType()
	 * @generated
	 */
	EReference getBinaryExtendedNodeType_Alt();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryExtendedNodeType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType#getOr()
	 * @see #getBinaryExtendedNodeType()
	 * @generated
	 */
	EReference getBinaryExtendedNodeType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryExtendedNodeType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType#getAnd()
	 * @see #getBinaryExtendedNodeType()
	 * @generated
	 */
	EReference getBinaryExtendedNodeType_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.BinaryNodeType <em>Binary Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Node Type</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType
	 * @generated
	 */
	EClass getBinaryNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.BinaryNodeType#getNodeGroup <em>Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Group</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType#getNodeGroup()
	 * @see #getBinaryNodeType()
	 * @generated
	 */
	EAttribute getBinaryNodeType_NodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryNodeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType#getFeature()
	 * @see #getBinaryNodeType()
	 * @generated
	 */
	EReference getBinaryNodeType_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryNodeType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType#getAlt()
	 * @see #getBinaryNodeType()
	 * @generated
	 */
	EReference getBinaryNodeType_Alt();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryNodeType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType#getOr()
	 * @see #getBinaryNodeType()
	 * @generated
	 */
	EReference getBinaryNodeType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.BinaryNodeType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see FeatureIDEXSD.BinaryNodeType#getAnd()
	 * @see #getBinaryNodeType()
	 * @generated
	 */
	EReference getBinaryNodeType_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.CalculationsType <em>Calculations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculations Type</em>'.
	 * @see FeatureIDEXSD.CalculationsType
	 * @generated
	 */
	EClass getCalculationsType();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.CalculationsType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see FeatureIDEXSD.CalculationsType#getKey()
	 * @see #getCalculationsType()
	 * @generated
	 */
	EAttribute getCalculationsType_Key();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.CalculationsType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see FeatureIDEXSD.CalculationsType#isValue()
	 * @see #getCalculationsType()
	 * @generated
	 */
	EAttribute getCalculationsType_Value();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.CommentsType <em>Comments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comments Type</em>'.
	 * @see FeatureIDEXSD.CommentsType
	 * @generated
	 */
	EClass getCommentsType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.CommentsType#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>C</em>'.
	 * @see FeatureIDEXSD.CommentsType#getC()
	 * @see #getCommentsType()
	 * @generated
	 */
	EAttribute getCommentsType_C();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ConjType <em>Conj Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conj Type</em>'.
	 * @see FeatureIDEXSD.ConjType
	 * @generated
	 */
	EClass getConjType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see FeatureIDEXSD.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.ConstraintsType#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see FeatureIDEXSD.ConstraintsType#getRule()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EReference getConstraintsType_Rule();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.DisjType <em>Disj Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disj Type</em>'.
	 * @see FeatureIDEXSD.DisjType
	 * @generated
	 */
	EClass getDisjType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see FeatureIDEXSD.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link FeatureIDEXSD.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link FeatureIDEXSD.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.DocumentRoot#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getC()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_C();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculations</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getCalculations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Calculations();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comments</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getComments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Comments();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getConj <em>Conj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conj</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getConj()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Conj();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression List</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getExpressionList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpressionList();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getDisj <em>Disj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disj</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getDisj()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Disj();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eq</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getEq()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Eq();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getExtendedFeatureModel <em>Extended Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Feature Model</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getExtendedFeatureModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Model</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getFeatureModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getFeatureOrder <em>Feature Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Order</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getFeatureOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureOrder();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getGraphics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Graphics();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getImp <em>Imp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imp</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getImp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Imp();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getNot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Not();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.DocumentRoot#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see FeatureIDEXSD.DocumentRoot#getVar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Var();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.EqType <em>Eq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Type</em>'.
	 * @see FeatureIDEXSD.EqType
	 * @generated
	 */
	EClass getEqType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see FeatureIDEXSD.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ExtendedFeatureModelType <em>Extended Feature Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Feature Model Type</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType
	 * @generated
	 */
	EClass getExtendedFeatureModelType();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getProperties()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getStruct()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getConstraints()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculations</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getCalculations()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_Calculations();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comments</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getComments()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_Comments();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.ExtendedFeatureModelType#getFeatureOrder <em>Feature Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Order</em>'.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType#getFeatureOrder()
	 * @see #getExtendedFeatureModelType()
	 * @generated
	 */
	EReference getExtendedFeatureModelType_FeatureOrder();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ExtendedLeafType <em>Extended Leaf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Leaf Type</em>'.
	 * @see FeatureIDEXSD.ExtendedLeafType
	 * @generated
	 */
	EClass getExtendedLeafType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ExtendedNode <em>Extended Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Node</em>'.
	 * @see FeatureIDEXSD.ExtendedNode
	 * @generated
	 */
	EClass getExtendedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.ExtendedNode#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see FeatureIDEXSD.ExtendedNode#getAttribute()
	 * @see #getExtendedNode()
	 * @generated
	 */
	EReference getExtendedNode_Attribute();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.FeatureModelType <em>Feature Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model Type</em>'.
	 * @see FeatureIDEXSD.FeatureModelType
	 * @generated
	 */
	EClass getFeatureModelType();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getProperties()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getStruct()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getConstraints()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculations</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getCalculations()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Calculations();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comments</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getComments()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Comments();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.FeatureModelType#getFeatureOrder <em>Feature Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Order</em>'.
	 * @see FeatureIDEXSD.FeatureModelType#getFeatureOrder()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_FeatureOrder();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.FeatureOrderType <em>Feature Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Order Type</em>'.
	 * @see FeatureIDEXSD.FeatureOrderType
	 * @generated
	 */
	EClass getFeatureOrderType();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.FeatureOrderType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see FeatureIDEXSD.FeatureOrderType#getFeature()
	 * @see #getFeatureOrderType()
	 * @generated
	 */
	EReference getFeatureOrderType_Feature();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.FeatureOrderType#isUserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Defined</em>'.
	 * @see FeatureIDEXSD.FeatureOrderType#isUserDefined()
	 * @see #getFeatureOrderType()
	 * @generated
	 */
	EAttribute getFeatureOrderType_UserDefined();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Type</em>'.
	 * @see FeatureIDEXSD.GraphicsType
	 * @generated
	 */
	EClass getGraphicsType();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.GraphicsType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see FeatureIDEXSD.GraphicsType#getKey()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Key();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.GraphicsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see FeatureIDEXSD.GraphicsType#getValue()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Value();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.ImpType <em>Imp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imp Type</em>'.
	 * @see FeatureIDEXSD.ImpType
	 * @generated
	 */
	EClass getImpType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.LeafType <em>Leaf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Type</em>'.
	 * @see FeatureIDEXSD.LeafType
	 * @generated
	 */
	EClass getLeafType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see FeatureIDEXSD.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FeatureIDEXSD.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.Node#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see FeatureIDEXSD.Node#getGraphics()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.Node#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see FeatureIDEXSD.Node#isAbstract()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.Node#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see FeatureIDEXSD.Node#isHidden()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.Node#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see FeatureIDEXSD.Node#isMandatory()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FeatureIDEXSD.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.NotType <em>Not Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Type</em>'.
	 * @see FeatureIDEXSD.NotType
	 * @generated
	 */
	EClass getNotType();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see FeatureIDEXSD.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.PropertiesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FeatureIDEXSD.PropertiesType#getGroup()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.PropertiesType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphics</em>'.
	 * @see FeatureIDEXSD.PropertiesType#getGraphics()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Graphics();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.PropertiesType#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculations</em>'.
	 * @see FeatureIDEXSD.PropertiesType#getCalculations()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Calculations();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Type</em>'.
	 * @see FeatureIDEXSD.RuleType
	 * @generated
	 */
	EClass getRuleType();

	/**
	 * Returns the meta object for the attribute '{@link FeatureIDEXSD.RuleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FeatureIDEXSD.RuleType#getDescription()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.RuleType#getExpressionListGroup <em>Expression List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression List Group</em>'.
	 * @see FeatureIDEXSD.RuleType#getExpressionListGroup()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_ExpressionListGroup();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.RuleType#getExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression List</em>'.
	 * @see FeatureIDEXSD.RuleType#getExpressionList()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_ExpressionList();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see FeatureIDEXSD.StructType
	 * @generated
	 */
	EClass getStructType();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see FeatureIDEXSD.StructType#getFeature()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt</em>'.
	 * @see FeatureIDEXSD.StructType#getAlt()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Alt();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see FeatureIDEXSD.StructType#getOr()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Or();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see FeatureIDEXSD.StructType#getAnd()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.StructType1 <em>Struct Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type1</em>'.
	 * @see FeatureIDEXSD.StructType1
	 * @generated
	 */
	EClass getStructType1();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType1#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see FeatureIDEXSD.StructType1#getFeature()
	 * @see #getStructType1()
	 * @generated
	 */
	EReference getStructType1_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType1#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt</em>'.
	 * @see FeatureIDEXSD.StructType1#getAlt()
	 * @see #getStructType1()
	 * @generated
	 */
	EReference getStructType1_Alt();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType1#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see FeatureIDEXSD.StructType1#getOr()
	 * @see #getStructType1()
	 * @generated
	 */
	EReference getStructType1_Or();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.StructType1#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see FeatureIDEXSD.StructType1#getAnd()
	 * @see #getStructType1()
	 * @generated
	 */
	EReference getStructType1_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.UnaryExpressionType <em>Unary Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression Type</em>'.
	 * @see FeatureIDEXSD.UnaryExpressionType
	 * @generated
	 */
	EClass getUnaryExpressionType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.UnaryExpressionType#getExpressionListGroup <em>Expression List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression List Group</em>'.
	 * @see FeatureIDEXSD.UnaryExpressionType#getExpressionListGroup()
	 * @see #getUnaryExpressionType()
	 * @generated
	 */
	EAttribute getUnaryExpressionType_ExpressionListGroup();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureIDEXSD.UnaryExpressionType#getExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression List</em>'.
	 * @see FeatureIDEXSD.UnaryExpressionType#getExpressionList()
	 * @see #getUnaryExpressionType()
	 * @generated
	 */
	EReference getUnaryExpressionType_ExpressionList();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.UnaryExtendedNodeType <em>Unary Extended Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Extended Node Type</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType
	 * @generated
	 */
	EClass getUnaryExtendedNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.UnaryExtendedNodeType#getExtendedNodeGroup <em>Extended Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Node Group</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType#getExtendedNodeGroup()
	 * @see #getUnaryExtendedNodeType()
	 * @generated
	 */
	EAttribute getUnaryExtendedNodeType_ExtendedNodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryExtendedNodeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType#getFeature()
	 * @see #getUnaryExtendedNodeType()
	 * @generated
	 */
	EReference getUnaryExtendedNodeType_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryExtendedNodeType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType#getAlt()
	 * @see #getUnaryExtendedNodeType()
	 * @generated
	 */
	EReference getUnaryExtendedNodeType_Alt();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryExtendedNodeType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType#getOr()
	 * @see #getUnaryExtendedNodeType()
	 * @generated
	 */
	EReference getUnaryExtendedNodeType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryExtendedNodeType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType#getAnd()
	 * @see #getUnaryExtendedNodeType()
	 * @generated
	 */
	EReference getUnaryExtendedNodeType_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.UnaryNodeType <em>Unary Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Node Type</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType
	 * @generated
	 */
	EClass getUnaryNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.UnaryNodeType#getNodeGroup <em>Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Group</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType#getNodeGroup()
	 * @see #getUnaryNodeType()
	 * @generated
	 */
	EAttribute getUnaryNodeType_NodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryNodeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType#getFeature()
	 * @see #getUnaryNodeType()
	 * @generated
	 */
	EReference getUnaryNodeType_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryNodeType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType#getAlt()
	 * @see #getUnaryNodeType()
	 * @generated
	 */
	EReference getUnaryNodeType_Alt();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryNodeType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType#getOr()
	 * @see #getUnaryNodeType()
	 * @generated
	 */
	EReference getUnaryNodeType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureIDEXSD.UnaryNodeType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see FeatureIDEXSD.UnaryNodeType#getAnd()
	 * @see #getUnaryNodeType()
	 * @generated
	 */
	EReference getUnaryNodeType_And();

	/**
	 * Returns the meta object for class '{@link FeatureIDEXSD.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see FeatureIDEXSD.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute list '{@link FeatureIDEXSD.VarType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see FeatureIDEXSD.VarType#getMixed()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Mixed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureIDEXSDFactory getFeatureIDEXSDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl <em>Binary Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.BinaryExpressionTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryExpressionType()
		 * @generated
		 */
		EClass BINARY_EXPRESSION_TYPE = eINSTANCE.getBinaryExpressionType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP = eINSTANCE.getBinaryExpressionType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression List Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP = eINSTANCE.getBinaryExpressionType_ExpressionListGroup();

		/**
		 * The meta object literal for the '<em><b>Expression List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION_TYPE__EXPRESSION_LIST = eINSTANCE.getBinaryExpressionType_ExpressionList();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.BinaryExtendedNodeTypeImpl <em>Binary Extended Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.BinaryExtendedNodeTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryExtendedNodeType()
		 * @generated
		 */
		EClass BINARY_EXTENDED_NODE_TYPE = eINSTANCE.getBinaryExtendedNodeType();

		/**
		 * The meta object literal for the '<em><b>Extended Node Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP = eINSTANCE.getBinaryExtendedNodeType_ExtendedNodeGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXTENDED_NODE_TYPE__FEATURE = eINSTANCE.getBinaryExtendedNodeType_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXTENDED_NODE_TYPE__ALT = eINSTANCE.getBinaryExtendedNodeType_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXTENDED_NODE_TYPE__OR = eINSTANCE.getBinaryExtendedNodeType_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXTENDED_NODE_TYPE__AND = eINSTANCE.getBinaryExtendedNodeType_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl <em>Binary Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.BinaryNodeTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getBinaryNodeType()
		 * @generated
		 */
		EClass BINARY_NODE_TYPE = eINSTANCE.getBinaryNodeType();

		/**
		 * The meta object literal for the '<em><b>Node Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_NODE_TYPE__NODE_GROUP = eINSTANCE.getBinaryNodeType_NodeGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_NODE_TYPE__FEATURE = eINSTANCE.getBinaryNodeType_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_NODE_TYPE__ALT = eINSTANCE.getBinaryNodeType_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_NODE_TYPE__OR = eINSTANCE.getBinaryNodeType_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_NODE_TYPE__AND = eINSTANCE.getBinaryNodeType_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.CalculationsTypeImpl <em>Calculations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.CalculationsTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getCalculationsType()
		 * @generated
		 */
		EClass CALCULATIONS_TYPE = eINSTANCE.getCalculationsType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATIONS_TYPE__KEY = eINSTANCE.getCalculationsType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATIONS_TYPE__VALUE = eINSTANCE.getCalculationsType_Value();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.CommentsTypeImpl <em>Comments Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.CommentsTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getCommentsType()
		 * @generated
		 */
		EClass COMMENTS_TYPE = eINSTANCE.getCommentsType();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTS_TYPE__C = eINSTANCE.getCommentsType_C();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ConjTypeImpl <em>Conj Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ConjTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getConjType()
		 * @generated
		 */
		EClass CONJ_TYPE = eINSTANCE.getConjType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ConstraintsTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getConstraintsType()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE = eINSTANCE.getConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE__RULE = eINSTANCE.getConstraintsType_Rule();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.DisjTypeImpl <em>Disj Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.DisjTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getDisjType()
		 * @generated
		 */
		EClass DISJ_TYPE = eINSTANCE.getDisjType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.DocumentRootImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__C = eINSTANCE.getDocumentRoot_C();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CALCULATIONS = eINSTANCE.getDocumentRoot_Calculations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMENTS = eINSTANCE.getDocumentRoot_Comments();

		/**
		 * The meta object literal for the '<em><b>Conj</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONJ = eINSTANCE.getDocumentRoot_Conj();

		/**
		 * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPRESSION_LIST = eINSTANCE.getDocumentRoot_ExpressionList();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTRAINTS = eINSTANCE.getDocumentRoot_Constraints();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Disj</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISJ = eINSTANCE.getDocumentRoot_Disj();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EQ = eINSTANCE.getDocumentRoot_Eq();

		/**
		 * The meta object literal for the '<em><b>Extended Feature Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL = eINSTANCE.getDocumentRoot_ExtendedFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_MODEL = eINSTANCE.getDocumentRoot_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Feature Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_ORDER = eINSTANCE.getDocumentRoot_FeatureOrder();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GRAPHICS = eINSTANCE.getDocumentRoot_Graphics();

		/**
		 * The meta object literal for the '<em><b>Imp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMP = eINSTANCE.getDocumentRoot_Imp();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOT = eINSTANCE.getDocumentRoot_Not();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTIES = eINSTANCE.getDocumentRoot_Properties();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RULE = eINSTANCE.getDocumentRoot_Rule();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VAR = eINSTANCE.getDocumentRoot_Var();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.EqTypeImpl <em>Eq Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.EqTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getEqType()
		 * @generated
		 */
		EClass EQ_TYPE = eINSTANCE.getEqType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ExpressionImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ExtendedFeatureModelTypeImpl <em>Extended Feature Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ExtendedFeatureModelTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedFeatureModelType()
		 * @generated
		 */
		EClass EXTENDED_FEATURE_MODEL_TYPE = eINSTANCE.getExtendedFeatureModelType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES = eINSTANCE.getExtendedFeatureModelType_Properties();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__STRUCT = eINSTANCE.getExtendedFeatureModelType_Struct();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS = eINSTANCE.getExtendedFeatureModelType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS = eINSTANCE.getExtendedFeatureModelType_Calculations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__COMMENTS = eINSTANCE.getExtendedFeatureModelType_Comments();

		/**
		 * The meta object literal for the '<em><b>Feature Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER = eINSTANCE.getExtendedFeatureModelType_FeatureOrder();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ExtendedLeafTypeImpl <em>Extended Leaf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ExtendedLeafTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedLeafType()
		 * @generated
		 */
		EClass EXTENDED_LEAF_TYPE = eINSTANCE.getExtendedLeafType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ExtendedNodeImpl <em>Extended Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ExtendedNodeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getExtendedNode()
		 * @generated
		 */
		EClass EXTENDED_NODE = eINSTANCE.getExtendedNode();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_NODE__ATTRIBUTE = eINSTANCE.getExtendedNode_Attribute();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.FeatureModelTypeImpl <em>Feature Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.FeatureModelTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getFeatureModelType()
		 * @generated
		 */
		EClass FEATURE_MODEL_TYPE = eINSTANCE.getFeatureModelType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__PROPERTIES = eINSTANCE.getFeatureModelType_Properties();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__STRUCT = eINSTANCE.getFeatureModelType_Struct();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__CONSTRAINTS = eINSTANCE.getFeatureModelType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__CALCULATIONS = eINSTANCE.getFeatureModelType_Calculations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__COMMENTS = eINSTANCE.getFeatureModelType_Comments();

		/**
		 * The meta object literal for the '<em><b>Feature Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__FEATURE_ORDER = eINSTANCE.getFeatureModelType_FeatureOrder();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.FeatureOrderTypeImpl <em>Feature Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.FeatureOrderTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getFeatureOrderType()
		 * @generated
		 */
		EClass FEATURE_ORDER_TYPE = eINSTANCE.getFeatureOrderType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ORDER_TYPE__FEATURE = eINSTANCE.getFeatureOrderType_Feature();

		/**
		 * The meta object literal for the '<em><b>User Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ORDER_TYPE__USER_DEFINED = eINSTANCE.getFeatureOrderType_UserDefined();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.GraphicsTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getGraphicsType()
		 * @generated
		 */
		EClass GRAPHICS_TYPE = eINSTANCE.getGraphicsType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_TYPE__KEY = eINSTANCE.getGraphicsType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_TYPE__VALUE = eINSTANCE.getGraphicsType_Value();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.ImpTypeImpl <em>Imp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.ImpTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getImpType()
		 * @generated
		 */
		EClass IMP_TYPE = eINSTANCE.getImpType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.LeafTypeImpl <em>Leaf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.LeafTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getLeafType()
		 * @generated
		 */
		EClass LEAF_TYPE = eINSTANCE.getLeafType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.NodeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GRAPHICS = eINSTANCE.getNode_Graphics();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ABSTRACT = eINSTANCE.getNode_Abstract();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HIDDEN = eINSTANCE.getNode_Hidden();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MANDATORY = eINSTANCE.getNode_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.NotTypeImpl <em>Not Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.NotTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getNotType()
		 * @generated
		 */
		EClass NOT_TYPE = eINSTANCE.getNotType();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.PropertiesTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__GROUP = eINSTANCE.getPropertiesType_Group();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__GRAPHICS = eINSTANCE.getPropertiesType_Graphics();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__CALCULATIONS = eINSTANCE.getPropertiesType_Calculations();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.RuleTypeImpl <em>Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.RuleTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getRuleType()
		 * @generated
		 */
		EClass RULE_TYPE = eINSTANCE.getRuleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__DESCRIPTION = eINSTANCE.getRuleType_Description();

		/**
		 * The meta object literal for the '<em><b>Expression List Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__EXPRESSION_LIST_GROUP = eINSTANCE.getRuleType_ExpressionListGroup();

		/**
		 * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__EXPRESSION_LIST = eINSTANCE.getRuleType_ExpressionList();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.StructTypeImpl <em>Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.StructTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getStructType()
		 * @generated
		 */
		EClass STRUCT_TYPE = eINSTANCE.getStructType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__FEATURE = eINSTANCE.getStructType_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__ALT = eINSTANCE.getStructType_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__OR = eINSTANCE.getStructType_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__AND = eINSTANCE.getStructType_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.StructType1Impl <em>Struct Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.StructType1Impl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getStructType1()
		 * @generated
		 */
		EClass STRUCT_TYPE1 = eINSTANCE.getStructType1();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE1__FEATURE = eINSTANCE.getStructType1_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE1__ALT = eINSTANCE.getStructType1_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE1__OR = eINSTANCE.getStructType1_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE1__AND = eINSTANCE.getStructType1_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl <em>Unary Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.UnaryExpressionTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryExpressionType()
		 * @generated
		 */
		EClass UNARY_EXPRESSION_TYPE = eINSTANCE.getUnaryExpressionType();

		/**
		 * The meta object literal for the '<em><b>Expression List Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP = eINSTANCE.getUnaryExpressionType_ExpressionListGroup();

		/**
		 * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION_TYPE__EXPRESSION_LIST = eINSTANCE.getUnaryExpressionType_ExpressionList();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl <em>Unary Extended Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryExtendedNodeType()
		 * @generated
		 */
		EClass UNARY_EXTENDED_NODE_TYPE = eINSTANCE.getUnaryExtendedNodeType();

		/**
		 * The meta object literal for the '<em><b>Extended Node Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP = eINSTANCE.getUnaryExtendedNodeType_ExtendedNodeGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXTENDED_NODE_TYPE__FEATURE = eINSTANCE.getUnaryExtendedNodeType_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXTENDED_NODE_TYPE__ALT = eINSTANCE.getUnaryExtendedNodeType_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXTENDED_NODE_TYPE__OR = eINSTANCE.getUnaryExtendedNodeType_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXTENDED_NODE_TYPE__AND = eINSTANCE.getUnaryExtendedNodeType_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.UnaryNodeTypeImpl <em>Unary Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.UnaryNodeTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getUnaryNodeType()
		 * @generated
		 */
		EClass UNARY_NODE_TYPE = eINSTANCE.getUnaryNodeType();

		/**
		 * The meta object literal for the '<em><b>Node Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_NODE_TYPE__NODE_GROUP = eINSTANCE.getUnaryNodeType_NodeGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_NODE_TYPE__FEATURE = eINSTANCE.getUnaryNodeType_Feature();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_NODE_TYPE__ALT = eINSTANCE.getUnaryNodeType_Alt();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_NODE_TYPE__OR = eINSTANCE.getUnaryNodeType_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_NODE_TYPE__AND = eINSTANCE.getUnaryNodeType_And();

		/**
		 * The meta object literal for the '{@link FeatureIDEXSD.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureIDEXSD.impl.VarTypeImpl
		 * @see FeatureIDEXSD.impl.FeatureIDEXSDPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__MIXED = eINSTANCE.getVarType_Mixed();

	}

} //FeatureIDEXSDPackage
