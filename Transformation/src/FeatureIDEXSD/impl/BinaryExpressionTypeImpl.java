/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExpressionType;

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
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getDisj <em>Disj</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getConj <em>Conj</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getImp <em>Imp</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryExpressionTypeImpl#getVar <em>Var</em>}</li>
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
	public EList<BinaryExpressionType> getDisj() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__DISJ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryExpressionType> getConj() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__CONJ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryExpressionType> getImp() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__IMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryExpressionType> getEq() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__EQ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnaryExpressionType> getNot() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__NOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVar() {
		return getExpressionGroup().list(FeatureIDEXSDPackage.Literals.BINARY_EXPRESSION_TYPE__VAR);
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__DISJ:
				return ((InternalEList<?>)getDisj()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__CONJ:
				return ((InternalEList<?>)getConj()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__IMP:
				return ((InternalEList<?>)getImp()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EQ:
				return ((InternalEList<?>)getEq()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__DISJ:
				return getDisj();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__CONJ:
				return getConj();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__IMP:
				return getImp();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EQ:
				return getEq();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__NOT:
				return getNot();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__VAR:
				return getVar();
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__DISJ:
				getDisj().clear();
				getDisj().addAll((Collection<? extends BinaryExpressionType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__CONJ:
				getConj().clear();
				getConj().addAll((Collection<? extends BinaryExpressionType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__IMP:
				getImp().clear();
				getImp().addAll((Collection<? extends BinaryExpressionType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EQ:
				getEq().clear();
				getEq().addAll((Collection<? extends BinaryExpressionType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends UnaryExpressionType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends String>)newValue);
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__DISJ:
				getDisj().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__CONJ:
				getConj().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__IMP:
				getImp().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EQ:
				getEq().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__NOT:
				getNot().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__VAR:
				getVar().clear();
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
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__DISJ:
				return !getDisj().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__CONJ:
				return !getConj().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__IMP:
				return !getImp().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__EQ:
				return !getEq().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__NOT:
				return !getNot().isEmpty();
			case FeatureIDEXSDPackage.BINARY_EXPRESSION_TYPE__VAR:
				return !getVar().isEmpty();
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
