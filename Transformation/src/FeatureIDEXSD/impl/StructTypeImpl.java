/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.LeafType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.UnaryNodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructTypeImpl extends MinimalEObjectImpl.Container implements StructType {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected LeafType feature;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected BinaryNodeType alt;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected BinaryNodeType or;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected UnaryNodeType and;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.STRUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafType getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(LeafType newFeature, NotificationChain msgs) {
		LeafType oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(LeafType newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNodeType getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlt(BinaryNodeType newAlt, NotificationChain msgs) {
		BinaryNodeType oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__ALT, oldAlt, newAlt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(BinaryNodeType newAlt) {
		if (newAlt != alt) {
			NotificationChain msgs = null;
			if (alt != null)
				msgs = ((InternalEObject)alt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__ALT, null, msgs);
			if (newAlt != null)
				msgs = ((InternalEObject)newAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__ALT, null, msgs);
			msgs = basicSetAlt(newAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__ALT, newAlt, newAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNodeType getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(BinaryNodeType newOr, NotificationChain msgs) {
		BinaryNodeType oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__OR, oldOr, newOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(BinaryNodeType newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__OR, newOr, newOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryNodeType getAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(UnaryNodeType newAnd, NotificationChain msgs) {
		UnaryNodeType oldAnd = and;
		and = newAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__AND, oldAnd, newAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(UnaryNodeType newAnd) {
		if (newAnd != and) {
			NotificationChain msgs = null;
			if (and != null)
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.STRUCT_TYPE__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.STRUCT_TYPE__AND, newAnd, newAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
			case FeatureIDEXSDPackage.STRUCT_TYPE__ALT:
				return basicSetAlt(null, msgs);
			case FeatureIDEXSDPackage.STRUCT_TYPE__OR:
				return basicSetOr(null, msgs);
			case FeatureIDEXSDPackage.STRUCT_TYPE__AND:
				return basicSetAnd(null, msgs);
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE:
				return getFeature();
			case FeatureIDEXSDPackage.STRUCT_TYPE__ALT:
				return getAlt();
			case FeatureIDEXSDPackage.STRUCT_TYPE__OR:
				return getOr();
			case FeatureIDEXSDPackage.STRUCT_TYPE__AND:
				return getAnd();
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE:
				setFeature((LeafType)newValue);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__ALT:
				setAlt((BinaryNodeType)newValue);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__OR:
				setOr((BinaryNodeType)newValue);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__AND:
				setAnd((UnaryNodeType)newValue);
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE:
				setFeature((LeafType)null);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__ALT:
				setAlt((BinaryNodeType)null);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__OR:
				setOr((BinaryNodeType)null);
				return;
			case FeatureIDEXSDPackage.STRUCT_TYPE__AND:
				setAnd((UnaryNodeType)null);
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__FEATURE:
				return feature != null;
			case FeatureIDEXSDPackage.STRUCT_TYPE__ALT:
				return alt != null;
			case FeatureIDEXSDPackage.STRUCT_TYPE__OR:
				return or != null;
			case FeatureIDEXSDPackage.STRUCT_TYPE__AND:
				return and != null;
		}
		return super.eIsSet(featureID);
	}

} //StructTypeImpl
