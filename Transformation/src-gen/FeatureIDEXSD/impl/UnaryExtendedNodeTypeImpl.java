/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryExtendedNodeType;
import FeatureIDEXSD.ExtendedLeafType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExtendedNodeType;

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
 * An implementation of the model object '<em><b>Unary Extended Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl#getExtendedNodeGroup <em>Extended Node Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.UnaryExtendedNodeTypeImpl#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExtendedNodeTypeImpl extends ExtendedNodeImpl implements UnaryExtendedNodeType {
	/**
	 * The cached value of the '{@link #getExtendedNodeGroup() <em>Extended Node Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extendedNodeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExtendedNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExtendedNodeGroup() {
		if (extendedNodeGroup == null) {
			extendedNodeGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP);
		}
		return extendedNodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedLeafType> getFeature() {
		return getExtendedNodeGroup().list(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryExtendedNodeType> getAlt() {
		return getExtendedNodeGroup().list(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__ALT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryExtendedNodeType> getOr() {
		return getExtendedNodeGroup().list(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__OR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnaryExtendedNodeType> getAnd() {
		return getExtendedNodeGroup().list(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__AND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
				return ((InternalEList<?>)getExtendedNodeGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
				if (coreType) return getExtendedNodeGroup();
				return ((FeatureMap.Internal)getExtendedNodeGroup()).getWrapper();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__FEATURE:
				return getFeature();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__ALT:
				return getAlt();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__OR:
				return getOr();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__AND:
				return getAnd();
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
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
				((FeatureMap.Internal)getExtendedNodeGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends ExtendedLeafType>)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends BinaryExtendedNodeType>)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends BinaryExtendedNodeType>)newValue);
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends UnaryExtendedNodeType>)newValue);
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
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
				getExtendedNodeGroup().clear();
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__FEATURE:
				getFeature().clear();
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__ALT:
				getAlt().clear();
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__OR:
				getOr().clear();
				return;
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__AND:
				getAnd().clear();
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
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
				return extendedNodeGroup != null && !extendedNodeGroup.isEmpty();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__FEATURE:
				return !getFeature().isEmpty();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__ALT:
				return !getAlt().isEmpty();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__OR:
				return !getOr().isEmpty();
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__AND:
				return !getAnd().isEmpty();
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
		result.append(" (extendedNodeGroup: ");
		result.append(extendedNodeGroup);
		result.append(')');
		return result.toString();
	}

} //UnaryExtendedNodeTypeImpl
