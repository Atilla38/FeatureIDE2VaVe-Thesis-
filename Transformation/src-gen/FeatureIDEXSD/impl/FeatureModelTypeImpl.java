/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.CalculationsType;
import FeatureIDEXSD.CommentsType;
import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.FeatureOrderType;
import FeatureIDEXSD.PropertiesType;
import FeatureIDEXSD.StructType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.FeatureModelTypeImpl#getFeatureOrder <em>Feature Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelTypeImpl extends MinimalEObjectImpl.Container implements FeatureModelType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected StructType struct;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsType constraints;

	/**
	 * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculations()
	 * @generated
	 * @ordered
	 */
	protected CalculationsType calculations;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected CommentsType comments;

	/**
	 * The cached value of the '{@link #getFeatureOrder() <em>Feature Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOrder()
	 * @generated
	 * @ordered
	 */
	protected FeatureOrderType featureOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.FEATURE_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(StructType newStruct, NotificationChain msgs) {
		StructType oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(StructType newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		ConstraintsType oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationsType getCalculations() {
		return calculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculations(CalculationsType newCalculations, NotificationChain msgs) {
		CalculationsType oldCalculations = calculations;
		calculations = newCalculations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS, oldCalculations, newCalculations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculations(CalculationsType newCalculations) {
		if (newCalculations != calculations) {
			NotificationChain msgs = null;
			if (calculations != null)
				msgs = ((InternalEObject)calculations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS, null, msgs);
			if (newCalculations != null)
				msgs = ((InternalEObject)newCalculations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS, null, msgs);
			msgs = basicSetCalculations(newCalculations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS, newCalculations, newCalculations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentsType getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(CommentsType newComments, NotificationChain msgs) {
		CommentsType oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(CommentsType newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOrderType getFeatureOrder() {
		return featureOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureOrder(FeatureOrderType newFeatureOrder, NotificationChain msgs) {
		FeatureOrderType oldFeatureOrder = featureOrder;
		featureOrder = newFeatureOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER, oldFeatureOrder, newFeatureOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOrder(FeatureOrderType newFeatureOrder) {
		if (newFeatureOrder != featureOrder) {
			NotificationChain msgs = null;
			if (featureOrder != null)
				msgs = ((InternalEObject)featureOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER, null, msgs);
			if (newFeatureOrder != null)
				msgs = ((InternalEObject)newFeatureOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER, null, msgs);
			msgs = basicSetFeatureOrder(newFeatureOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER, newFeatureOrder, newFeatureOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT:
				return basicSetStruct(null, msgs);
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS:
				return basicSetCalculations(null, msgs);
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS:
				return basicSetComments(null, msgs);
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER:
				return basicSetFeatureOrder(null, msgs);
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
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES:
				return getProperties();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT:
				return getStruct();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS:
				return getConstraints();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS:
				return getCalculations();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS:
				return getComments();
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER:
				return getFeatureOrder();
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
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT:
				setStruct((StructType)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS:
				setCalculations((CalculationsType)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS:
				setComments((CommentsType)newValue);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER:
				setFeatureOrder((FeatureOrderType)newValue);
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
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT:
				setStruct((StructType)null);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS:
				setCalculations((CalculationsType)null);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS:
				setComments((CommentsType)null);
				return;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER:
				setFeatureOrder((FeatureOrderType)null);
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
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__PROPERTIES:
				return properties != null;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__STRUCT:
				return struct != null;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CONSTRAINTS:
				return constraints != null;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__CALCULATIONS:
				return calculations != null;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__COMMENTS:
				return comments != null;
			case FeatureIDEXSDPackage.FEATURE_MODEL_TYPE__FEATURE_ORDER:
				return featureOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelTypeImpl
