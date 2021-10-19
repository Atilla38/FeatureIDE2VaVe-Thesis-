/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureIDEXSDFactoryImpl extends EFactoryImpl implements FeatureIDEXSDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureIDEXSDFactory init() {
		try {
			FeatureIDEXSDFactory theFeatureIDEXSDFactory = (FeatureIDEXSDFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureIDEXSDPackage.eNS_URI);
			if (theFeatureIDEXSDFactory != null) {
				return theFeatureIDEXSDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureIDEXSDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIDEXSDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE: return createBinaryExpressionType();
			case FeatureIDEXSDPackage.BINARY_EXTENDED_NODE_TYPE: return createBinaryExtendedNodeType();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE: return createBinaryNodeType();
			case FeatureIDEXSDPackage.CALCULATIONS_TYPE: return createCalculationsType();
			case FeatureIDEXSDPackage.COMMENTS_TYPE: return createCommentsType();
			case FeatureIDEXSDPackage.CONJ_TYPE: return createConjType();
			case FeatureIDEXSDPackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case FeatureIDEXSDPackage.DISJ_TYPE: return createDisjType();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FeatureIDEXSDPackage.EQ_TYPE: return createEqType();
			case FeatureIDEXSDPackage.EXPRESSION: return createExpression();
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE: return createExtendedFeatureModelType();
			case FeatureIDEXSDPackage.EXTENDED_LEAF_TYPE: return createExtendedLeafType();
			case FeatureIDEXSDPackage.EXTENDED_NODE: return createExtendedNode();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE: return createFeatureModelType();
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE: return createFeatureOrderType();
			case FeatureIDEXSDPackage.GRAPHICS_TYPE: return createGraphicsType();
			case FeatureIDEXSDPackage.IMP_TYPE: return createImpType();
			case FeatureIDEXSDPackage.LEAF_TYPE: return createLeafType();
			case FeatureIDEXSDPackage.NODE: return createNode();
			case FeatureIDEXSDPackage.NOT_TYPE: return createNotType();
			case FeatureIDEXSDPackage.PROPERTIES_TYPE: return createPropertiesType();
			case FeatureIDEXSDPackage.RULE_TYPE: return createRuleType();
			case FeatureIDEXSDPackage.STRUCT_TYPE: return createStructType();
			case FeatureIDEXSDPackage.STRUCT_TYPE1: return createStructType1();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE: return createUnaryExpressionType();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE: return createUnaryExtendedNodeType();
			case FeatureIDEXSDPackage.UNARY_NODE_TYPE: return createUnaryNodeType();
			case FeatureIDEXSDPackage.VAR_TYPE: return createVarType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionType createBinaryExpressionType() {
		BinaryExpressionTypeImpl binaryExpressionType = new BinaryExpressionTypeImpl();
		return binaryExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExtendedNodeType createBinaryExtendedNodeType() {
		BinaryExtendedNodeTypeImpl binaryExtendedNodeType = new BinaryExtendedNodeTypeImpl();
		return binaryExtendedNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNodeType createBinaryNodeType() {
		BinaryNodeTypeImpl binaryNodeType = new BinaryNodeTypeImpl();
		return binaryNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationsType createCalculationsType() {
		CalculationsTypeImpl calculationsType = new CalculationsTypeImpl();
		return calculationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentsType createCommentsType() {
		CommentsTypeImpl commentsType = new CommentsTypeImpl();
		return commentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjType createConjType() {
		ConjTypeImpl conjType = new ConjTypeImpl();
		return conjType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjType createDisjType() {
		DisjTypeImpl disjType = new DisjTypeImpl();
		return disjType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqType createEqType() {
		EqTypeImpl eqType = new EqTypeImpl();
		return eqType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedFeatureModelType createExtendedFeatureModelType() {
		ExtendedFeatureModelTypeImpl extendedFeatureModelType = new ExtendedFeatureModelTypeImpl();
		return extendedFeatureModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedLeafType createExtendedLeafType() {
		ExtendedLeafTypeImpl extendedLeafType = new ExtendedLeafTypeImpl();
		return extendedLeafType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedNode createExtendedNode() {
		ExtendedNodeImpl extendedNode = new ExtendedNodeImpl();
		return extendedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelType createFeatureModelType() {
		FeatureModelTypeImpl featureModelType = new FeatureModelTypeImpl();
		return featureModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOrderType createFeatureOrderType() {
		FeatureOrderTypeImpl featureOrderType = new FeatureOrderTypeImpl();
		return featureOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsType createGraphicsType() {
		GraphicsTypeImpl graphicsType = new GraphicsTypeImpl();
		return graphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpType createImpType() {
		ImpTypeImpl impType = new ImpTypeImpl();
		return impType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafType createLeafType() {
		LeafTypeImpl leafType = new LeafTypeImpl();
		return leafType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotType createNotType() {
		NotTypeImpl notType = new NotTypeImpl();
		return notType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType createRuleType() {
		RuleTypeImpl ruleType = new RuleTypeImpl();
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType1 createStructType1() {
		StructType1Impl structType1 = new StructType1Impl();
		return structType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionType createUnaryExpressionType() {
		UnaryExpressionTypeImpl unaryExpressionType = new UnaryExpressionTypeImpl();
		return unaryExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExtendedNodeType createUnaryExtendedNodeType() {
		UnaryExtendedNodeTypeImpl unaryExtendedNodeType = new UnaryExtendedNodeTypeImpl();
		return unaryExtendedNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryNodeType createUnaryNodeType() {
		UnaryNodeTypeImpl unaryNodeType = new UnaryNodeTypeImpl();
		return unaryNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIDEXSDPackage getFeatureIDEXSDPackage() {
		return (FeatureIDEXSDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureIDEXSDPackage getPackage() {
		return FeatureIDEXSDPackage.eINSTANCE;
	}

} //FeatureIDEXSDFactoryImpl
