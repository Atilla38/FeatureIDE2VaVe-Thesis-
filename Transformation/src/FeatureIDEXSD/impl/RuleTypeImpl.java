/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.Expression;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.RuleType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.RuleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.RuleTypeImpl#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.RuleTypeImpl#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleTypeImpl extends MinimalEObjectImpl.Container implements RuleType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected RuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.RULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExpressionListGroup() {
		if (expressionListGroup == null) {
			expressionListGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP);
		}
		return expressionListGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionList() {
		return (Expression)getExpressionListGroup().get(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionList(Expression newExpressionList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionListGroup()).basicAdd(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST, newExpressionList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionList(Expression newExpressionList) {
		((FeatureMap.Internal)getExpressionListGroup()).set(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST, newExpressionList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
				return ((InternalEList<?>)getExpressionListGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST:
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
			case FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION:
				return getDescription();
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
				if (coreType) return getExpressionListGroup();
				return ((FeatureMap.Internal)getExpressionListGroup()).getWrapper();
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST:
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
			case FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
				((FeatureMap.Internal)getExpressionListGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST:
				setExpressionList((Expression)newValue);
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
			case FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
				getExpressionListGroup().clear();
				return;
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST:
				setExpressionList((Expression)null);
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
			case FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
				return expressionListGroup != null && !expressionListGroup.isEmpty();
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", expressionListGroup: ");
		result.append(expressionListGroup);
		result.append(')');
		return result.toString();
	}

} //RuleTypeImpl
