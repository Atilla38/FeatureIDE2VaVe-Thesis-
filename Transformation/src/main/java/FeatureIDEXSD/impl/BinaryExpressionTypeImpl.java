/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.Expression;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionTypeImpl extends ExpressionImpl implements BinaryExpressionType {
	/**
	 * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap expressionGroup;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP);
		}
		return expressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExpressionListGroup() {
		return (FeatureMap)getExpressionGroup().<FeatureMap.Entry>list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressionList() {
		return getExpressionListGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				return ((InternalEList<?>)getExpressionListGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return ((InternalEList<?>)getExpressionList()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				if (coreType) return getExpressionListGroup();
				return ((FeatureMap.Internal)getExpressionListGroup()).getWrapper();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return getExpressionList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				((FeatureMap.Internal)getExpressionListGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				getExpressionList().clear();
				getExpressionList().addAll((Collection<? extends Expression>)newValue);
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				getExpressionListGroup().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				getExpressionList().clear();
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP:
				return !getExpressionListGroup().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EXPRESSION_LIST:
				return !getExpressionList().isEmpty();
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
		result.append(" (expressionGroup: ");
		result.append(expressionGroup);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionTypeImpl
