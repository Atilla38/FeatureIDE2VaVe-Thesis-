/**
 */
package FeatureIDEXSD.util;

import FeatureIDEXSD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FeatureIDEXSD.FeatureIDEXSDPackage
 * @generated
 */
public class FeatureIDEXSDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureIDEXSDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIDEXSDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FeatureIDEXSDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureIDEXSDSwitch<Adapter> modelSwitch =
		new FeatureIDEXSDSwitch<Adapter>() {
			@Override
			public Adapter caseBinaryExpressionType(BinaryExpressionType object) {
				return createBinaryExpressionTypeAdapter();
			}
			@Override
			public Adapter caseBinaryExtendedNodeType(BinaryExtendedNodeType object) {
				return createBinaryExtendedNodeTypeAdapter();
			}
			@Override
			public Adapter caseBinaryNodeType(BinaryNodeType object) {
				return createBinaryNodeTypeAdapter();
			}
			@Override
			public Adapter caseCalculationsType(CalculationsType object) {
				return createCalculationsTypeAdapter();
			}
			@Override
			public Adapter caseCommentsType(CommentsType object) {
				return createCommentsTypeAdapter();
			}
			@Override
			public Adapter caseConjType(ConjType object) {
				return createConjTypeAdapter();
			}
			@Override
			public Adapter caseConstraintsType(ConstraintsType object) {
				return createConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseDisjType(DisjType object) {
				return createDisjTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEqType(EqType object) {
				return createEqTypeAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExtendedFeatureModelType(ExtendedFeatureModelType object) {
				return createExtendedFeatureModelTypeAdapter();
			}
			@Override
			public Adapter caseExtendedLeafType(ExtendedLeafType object) {
				return createExtendedLeafTypeAdapter();
			}
			@Override
			public Adapter caseExtendedNode(ExtendedNode object) {
				return createExtendedNodeAdapter();
			}
			@Override
			public Adapter caseFeatureModelType(FeatureModelType object) {
				return createFeatureModelTypeAdapter();
			}
			@Override
			public Adapter caseFeatureOrderType(FeatureOrderType object) {
				return createFeatureOrderTypeAdapter();
			}
			@Override
			public Adapter caseGraphicsType(GraphicsType object) {
				return createGraphicsTypeAdapter();
			}
			@Override
			public Adapter caseImpType(ImpType object) {
				return createImpTypeAdapter();
			}
			@Override
			public Adapter caseLeafType(LeafType object) {
				return createLeafTypeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNotType(NotType object) {
				return createNotTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseRuleType(RuleType object) {
				return createRuleTypeAdapter();
			}
			@Override
			public Adapter caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			@Override
			public Adapter caseStructType1(StructType1 object) {
				return createStructType1Adapter();
			}
			@Override
			public Adapter caseUnaryExpressionType(UnaryExpressionType object) {
				return createUnaryExpressionTypeAdapter();
			}
			@Override
			public Adapter caseUnaryExtendedNodeType(UnaryExtendedNodeType object) {
				return createUnaryExtendedNodeTypeAdapter();
			}
			@Override
			public Adapter caseUnaryNodeType(UnaryNodeType object) {
				return createUnaryNodeTypeAdapter();
			}
			@Override
			public Adapter caseVarType(VarType object) {
				return createVarTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.BinaryExpressionType <em>Binary Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.BinaryExpressionType
	 * @generated
	 */
	public Adapter createBinaryExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.BinaryExtendedNodeType <em>Binary Extended Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.BinaryExtendedNodeType
	 * @generated
	 */
	public Adapter createBinaryExtendedNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.BinaryNodeType <em>Binary Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.BinaryNodeType
	 * @generated
	 */
	public Adapter createBinaryNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.CalculationsType <em>Calculations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.CalculationsType
	 * @generated
	 */
	public Adapter createCalculationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.CommentsType <em>Comments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.CommentsType
	 * @generated
	 */
	public Adapter createCommentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ConjType <em>Conj Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ConjType
	 * @generated
	 */
	public Adapter createConjTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.DisjType <em>Disj Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.DisjType
	 * @generated
	 */
	public Adapter createDisjTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.EqType <em>Eq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.EqType
	 * @generated
	 */
	public Adapter createEqTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ExtendedFeatureModelType <em>Extended Feature Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ExtendedFeatureModelType
	 * @generated
	 */
	public Adapter createExtendedFeatureModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ExtendedLeafType <em>Extended Leaf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ExtendedLeafType
	 * @generated
	 */
	public Adapter createExtendedLeafTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ExtendedNode <em>Extended Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ExtendedNode
	 * @generated
	 */
	public Adapter createExtendedNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.FeatureModelType <em>Feature Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.FeatureModelType
	 * @generated
	 */
	public Adapter createFeatureModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.FeatureOrderType <em>Feature Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.FeatureOrderType
	 * @generated
	 */
	public Adapter createFeatureOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.GraphicsType
	 * @generated
	 */
	public Adapter createGraphicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.ImpType <em>Imp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.ImpType
	 * @generated
	 */
	public Adapter createImpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.LeafType <em>Leaf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.LeafType
	 * @generated
	 */
	public Adapter createLeafTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.NotType <em>Not Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.NotType
	 * @generated
	 */
	public Adapter createNotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.RuleType
	 * @generated
	 */
	public Adapter createRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.StructType
	 * @generated
	 */
	public Adapter createStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.StructType1 <em>Struct Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.StructType1
	 * @generated
	 */
	public Adapter createStructType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.UnaryExpressionType <em>Unary Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.UnaryExpressionType
	 * @generated
	 */
	public Adapter createUnaryExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.UnaryExtendedNodeType <em>Unary Extended Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.UnaryExtendedNodeType
	 * @generated
	 */
	public Adapter createUnaryExtendedNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.UnaryNodeType <em>Unary Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.UnaryNodeType
	 * @generated
	 */
	public Adapter createUnaryNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureIDEXSD.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureIDEXSD.VarType
	 * @generated
	 */
	public Adapter createVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FeatureIDEXSDAdapterFactory
