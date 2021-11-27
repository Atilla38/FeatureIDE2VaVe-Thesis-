/**
 */
package FeatureIDEXSD.util;

import FeatureIDEXSD.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see FeatureIDEXSD.FeatureIDEXSDPackage
 * @generated
 */
public class FeatureIDEXSDSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureIDEXSDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIDEXSDSwitch() {
		if (modelPackage == null) {
			modelPackage = FeatureIDEXSDPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FeatureIDEXSDPackage.ALT_TYPE: {
				AltType altType = (AltType)theEObject;
				T result = caseAltType(altType);
				if (result == null) result = caseBinaryNodeType(altType);
				if (result == null) result = caseNode(altType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.AND_TYPE: {
				AndType andType = (AndType)theEObject;
				T result = caseAndType(andType);
				if (result == null) result = caseUnaryNodeType(andType);
				if (result == null) result = caseNode(andType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE: {
				BinaryExpressionType binaryExpressionType = (BinaryExpressionType)theEObject;
				T result = caseBinaryExpressionType(binaryExpressionType);
				if (result == null) result = caseExpression(binaryExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.BINARY_EXTENDED_NODE_TYPE: {
				BinaryExtendedNodeType binaryExtendedNodeType = (BinaryExtendedNodeType)theEObject;
				T result = caseBinaryExtendedNodeType(binaryExtendedNodeType);
				if (result == null) result = caseExtendedNode(binaryExtendedNodeType);
				if (result == null) result = caseNode(binaryExtendedNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE: {
				BinaryNodeType binaryNodeType = (BinaryNodeType)theEObject;
				T result = caseBinaryNodeType(binaryNodeType);
				if (result == null) result = caseNode(binaryNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.CALCULATIONS_TYPE: {
				CalculationsType calculationsType = (CalculationsType)theEObject;
				T result = caseCalculationsType(calculationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.COMMENTS_TYPE: {
				CommentsType commentsType = (CommentsType)theEObject;
				T result = caseCommentsType(commentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.CONJ_TYPE: {
				ConjType conjType = (ConjType)theEObject;
				T result = caseConjType(conjType);
				if (result == null) result = caseBinaryExpressionType(conjType);
				if (result == null) result = caseExpression(conjType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.CONSTRAINTS_TYPE: {
				ConstraintsType constraintsType = (ConstraintsType)theEObject;
				T result = caseConstraintsType(constraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.DISJ_TYPE: {
				DisjType disjType = (DisjType)theEObject;
				T result = caseDisjType(disjType);
				if (result == null) result = caseBinaryExpressionType(disjType);
				if (result == null) result = caseExpression(disjType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.EQ_TYPE: {
				EqType eqType = (EqType)theEObject;
				T result = caseEqType(eqType);
				if (result == null) result = caseBinaryExpressionType(eqType);
				if (result == null) result = caseExpression(eqType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.EXTENDED_FEATURE_MODEL_TYPE: {
				ExtendedFeatureModelType extendedFeatureModelType = (ExtendedFeatureModelType)theEObject;
				T result = caseExtendedFeatureModelType(extendedFeatureModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.EXTENDED_LEAF_TYPE: {
				ExtendedLeafType extendedLeafType = (ExtendedLeafType)theEObject;
				T result = caseExtendedLeafType(extendedLeafType);
				if (result == null) result = caseExtendedNode(extendedLeafType);
				if (result == null) result = caseNode(extendedLeafType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.EXTENDED_NODE: {
				ExtendedNode extendedNode = (ExtendedNode)theEObject;
				T result = caseExtendedNode(extendedNode);
				if (result == null) result = caseNode(extendedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE: {
				FeatureModelType featureModelType = (FeatureModelType)theEObject;
				T result = caseFeatureModelType(featureModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE: {
				FeatureOrderType featureOrderType = (FeatureOrderType)theEObject;
				T result = caseFeatureOrderType(featureOrderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.FEATURE_TYPE: {
				FeatureType featureType = (FeatureType)theEObject;
				T result = caseFeatureType(featureType);
				if (result == null) result = caseLeafType(featureType);
				if (result == null) result = caseNode(featureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.GRAPHICS_TYPE: {
				GraphicsType graphicsType = (GraphicsType)theEObject;
				T result = caseGraphicsType(graphicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.IMP_TYPE: {
				ImpType impType = (ImpType)theEObject;
				T result = caseImpType(impType);
				if (result == null) result = caseBinaryExpressionType(impType);
				if (result == null) result = caseExpression(impType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.LEAF_TYPE: {
				LeafType leafType = (LeafType)theEObject;
				T result = caseLeafType(leafType);
				if (result == null) result = caseNode(leafType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.NOT_TYPE: {
				NotType notType = (NotType)theEObject;
				T result = caseNotType(notType);
				if (result == null) result = caseUnaryExpressionType(notType);
				if (result == null) result = caseExpression(notType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.OR_TYPE: {
				OrType orType = (OrType)theEObject;
				T result = caseOrType(orType);
				if (result == null) result = caseBinaryNodeType(orType);
				if (result == null) result = caseNode(orType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.RULE_TYPE: {
				RuleType ruleType = (RuleType)theEObject;
				T result = caseRuleType(ruleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.STRUCT_TYPE: {
				StructType structType = (StructType)theEObject;
				T result = caseStructType(structType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.STRUCT_TYPE1: {
				StructType1 structType1 = (StructType1)theEObject;
				T result = caseStructType1(structType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE: {
				UnaryExpressionType unaryExpressionType = (UnaryExpressionType)theEObject;
				T result = caseUnaryExpressionType(unaryExpressionType);
				if (result == null) result = caseExpression(unaryExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE: {
				UnaryExtendedNodeType unaryExtendedNodeType = (UnaryExtendedNodeType)theEObject;
				T result = caseUnaryExtendedNodeType(unaryExtendedNodeType);
				if (result == null) result = caseExtendedNode(unaryExtendedNodeType);
				if (result == null) result = caseNode(unaryExtendedNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.UNARY_NODE_TYPE: {
				UnaryNodeType unaryNodeType = (UnaryNodeType)theEObject;
				T result = caseUnaryNodeType(unaryNodeType);
				if (result == null) result = caseNode(unaryNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureIDEXSDPackage.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = caseExpression(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltType(AltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndType(AndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpressionType(BinaryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Extended Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Extended Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExtendedNodeType(BinaryExtendedNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryNodeType(BinaryNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationsType(CalculationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentsType(CommentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conj Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conj Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjType(ConjType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType(ConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disj Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disj Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjType(DisjType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqType(EqType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Feature Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Feature Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedFeatureModelType(ExtendedFeatureModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Leaf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Leaf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedLeafType(ExtendedLeafType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedNode(ExtendedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModelType(FeatureModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOrderType(FeatureOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureType(FeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicsType(GraphicsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpType(ImpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafType(LeafType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotType(NotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrType(OrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleType(RuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructType(StructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructType1(StructType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpressionType(UnaryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Extended Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Extended Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExtendedNodeType(UnaryExtendedNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryNodeType(UnaryNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FeatureIDEXSDSwitch
