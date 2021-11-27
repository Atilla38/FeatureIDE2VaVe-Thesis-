/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureOrderType;
import FeatureIDEXSD.LeafType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Order Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.FeatureOrderTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureOrderTypeImpl#isUserDefined <em>User Defined</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOrderTypeImpl extends MinimalEObjectImpl.Container implements FeatureOrderType {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<LeafType> feature;

	/**
	 * The default value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean userDefined = USER_DEFINED_EDEFAULT;

	/**
	 * This is true if the User Defined attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOrderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.FEATURE_ORDER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeafType> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<LeafType>(LeafType.class, this, FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserDefined() {
		return userDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(boolean newUserDefined) {
		boolean oldUserDefined = userDefined;
		userDefined = newUserDefined;
		boolean oldUserDefinedESet = userDefinedESet;
		userDefinedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED, oldUserDefined, userDefined, !oldUserDefinedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefined() {
		boolean oldUserDefined = userDefined;
		boolean oldUserDefinedESet = userDefinedESet;
		userDefined = USER_DEFINED_EDEFAULT;
		userDefinedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED, oldUserDefined, USER_DEFINED_EDEFAULT, oldUserDefinedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefined() {
		return userDefinedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE:
				return getFeature();
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED:
				return isUserDefined();
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
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends LeafType>)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED:
				setUserDefined((Boolean)newValue);
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
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE:
				getFeature().clear();
				return;
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED:
				unsetUserDefined();
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
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__FEATURE:
				return feature != null && !feature.isEmpty();
			case FeatureIDEXSDPackage.FEATURE_ORDER_TYPE__USER_DEFINED:
				return isSetUserDefined();
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
		result.append(" (userDefined: ");
		if (userDefinedESet) result.append(userDefined); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeatureOrderTypeImpl
