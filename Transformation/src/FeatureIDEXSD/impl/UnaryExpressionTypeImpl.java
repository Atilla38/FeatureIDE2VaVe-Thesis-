/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExpressionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getDisj <em>Disj</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getConj <em>Conj</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getImp <em>Imp</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExpressionTypeImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionTypeImpl extends ExpressionImpl implements UnaryExpressionType {
	/**
	 * The cached value of the '{@link #getDisj() <em>Disj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisj()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpressionType disj;

	/**
	 * The cached value of the '{@link #getConj() <em>Conj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConj()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpressionType conj;

	/**
	 * The cached value of the '{@link #getImp() <em>Imp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImp()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpressionType imp;

	/**
	 * The cached value of the '{@link #getEq() <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEq()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpressionType eq;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected UnaryExpressionType not;

	/**
	 * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected String var = VAR_EDEFAULT;

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
	public BinaryExpressionType getDisj() {
		return disj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisj(BinaryExpressionType newDisj, NotificationChain msgs) {
		BinaryExpressionType oldDisj = disj;
		disj = newDisj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ, oldDisj, newDisj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisj(BinaryExpressionType newDisj) {
		if (newDisj != disj) {
			NotificationChain msgs = null;
			if (disj != null)
				msgs = ((InternalEObject)disj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ, null, msgs);
			if (newDisj != null)
				msgs = ((InternalEObject)newDisj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ, null, msgs);
			msgs = basicSetDisj(newDisj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ, newDisj, newDisj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionType getConj() {
		return conj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConj(BinaryExpressionType newConj, NotificationChain msgs) {
		BinaryExpressionType oldConj = conj;
		conj = newConj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ, oldConj, newConj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConj(BinaryExpressionType newConj) {
		if (newConj != conj) {
			NotificationChain msgs = null;
			if (conj != null)
				msgs = ((InternalEObject)conj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ, null, msgs);
			if (newConj != null)
				msgs = ((InternalEObject)newConj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ, null, msgs);
			msgs = basicSetConj(newConj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ, newConj, newConj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionType getImp() {
		return imp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImp(BinaryExpressionType newImp, NotificationChain msgs) {
		BinaryExpressionType oldImp = imp;
		imp = newImp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP, oldImp, newImp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImp(BinaryExpressionType newImp) {
		if (newImp != imp) {
			NotificationChain msgs = null;
			if (imp != null)
				msgs = ((InternalEObject)imp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP, null, msgs);
			if (newImp != null)
				msgs = ((InternalEObject)newImp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP, null, msgs);
			msgs = basicSetImp(newImp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP, newImp, newImp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionType getEq() {
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEq(BinaryExpressionType newEq, NotificationChain msgs) {
		BinaryExpressionType oldEq = eq;
		eq = newEq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ, oldEq, newEq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEq(BinaryExpressionType newEq) {
		if (newEq != eq) {
			NotificationChain msgs = null;
			if (eq != null)
				msgs = ((InternalEObject)eq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ, null, msgs);
			if (newEq != null)
				msgs = ((InternalEObject)newEq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ, null, msgs);
			msgs = basicSetEq(newEq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ, newEq, newEq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionType getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(UnaryExpressionType newNot, NotificationChain msgs) {
		UnaryExpressionType oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT, oldNot, newNot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(UnaryExpressionType newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(String newVar) {
		String oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ:
				return basicSetDisj(null, msgs);
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ:
				return basicSetConj(null, msgs);
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP:
				return basicSetImp(null, msgs);
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ:
				return basicSetEq(null, msgs);
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT:
				return basicSetNot(null, msgs);
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
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ:
				return getDisj();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ:
				return getConj();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP:
				return getImp();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ:
				return getEq();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT:
				return getNot();
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__VAR:
				return getVar();
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
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ:
				setDisj((BinaryExpressionType)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ:
				setConj((BinaryExpressionType)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP:
				setImp((BinaryExpressionType)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ:
				setEq((BinaryExpressionType)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT:
				setNot((UnaryExpressionType)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__VAR:
				setVar((String)newValue);
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
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ:
				setDisj((BinaryExpressionType)null);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ:
				setConj((BinaryExpressionType)null);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP:
				setImp((BinaryExpressionType)null);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ:
				setEq((BinaryExpressionType)null);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT:
				setNot((UnaryExpressionType)null);
				return;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__VAR:
				setVar(VAR_EDEFAULT);
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
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__DISJ:
				return disj != null;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__CONJ:
				return conj != null;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__IMP:
				return imp != null;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__EQ:
				return eq != null;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__NOT:
				return not != null;
			case FeatureIDEXSDPackage.UNARY_EXPRESSION_TYPE__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
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
		result.append(" (var: ");
		result.append(var);
		result.append(')');
		return result.toString();
	}

} //UnaryExpressionTypeImpl
