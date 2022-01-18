/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.Expression;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExpressionType;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionTypeImpl extends ExpressionImpl implements UnaryExpressionType {
	/**
	 * The cached value of the '{@link #getExpressionListGroup() <em>Expression List Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionListGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap expressionListGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExpressionListGroup() {
		if (expressionListGroup == null) {
			expressionListGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP);
		}
		return expressionListGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionList() {
		return (Expression)getExpressionListGroup().get(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionList(Expression newExpressionList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionListGroup()).basicAdd(FeatureIDEXSDPackage.Literals.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST, newExpressionList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				return ((InternalEList<?>)getExpressionListGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return basicSetExpressionList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				if (coreType) return getExpressionListGroup();
				return ((FeatureMap.Internal)getExpressionListGroup()).getWrapper();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return getExpressionList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				((FeatureMap.Internal)getExpressionListGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				getExpressionListGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				return expressionListGroup != null && !expressionListGroup.isEmpty();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return getExpressionList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (expressionListGroup: ");
		result.append(expressionListGroup);
		result.append(')');
		return result.toString();
	}

} //UnaryExpressionTypeImpl
