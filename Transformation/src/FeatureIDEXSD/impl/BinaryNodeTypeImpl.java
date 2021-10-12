/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.LeafType;
import FeatureIDEXSD.UnaryNodeType;

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
 * An implementation of the model object '<em><b>Binary Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryNodeTypeImpl extends NodeImpl implements BinaryNodeType {
	/**
	 * The cached value of the '{@link #getNodeGroup() <em>Node Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nodeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNodeGroup() {
		if (nodeGroup == null) {
			nodeGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP);
		}
		return nodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeafType> getFeature() {
		return getNodeGroup().list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryNodeType> getAlt() {
		return getNodeGroup().list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__ALT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryNodeType> getOr() {
		return getNodeGroup().list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__OR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnaryNodeType> getAnd() {
		return getNodeGroup().list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__AND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
				return ((InternalEList<?>)getNodeGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__AND:
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
				if (coreType) return getNodeGroup();
				return ((FeatureMap.Internal)getNodeGroup()).getWrapper();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__FEATURE:
				return getFeature();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__ALT:
				return getAlt();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__OR:
				return getOr();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__AND:
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
				((FeatureMap.Internal)getNodeGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends LeafType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends BinaryNodeType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends BinaryNodeType>)newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends UnaryNodeType>)newValue);
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
				getNodeGroup().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__FEATURE:
				getFeature().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__ALT:
				getAlt().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__OR:
				getOr().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__AND:
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
				return nodeGroup != null && !nodeGroup.isEmpty();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__FEATURE:
				return !getFeature().isEmpty();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__ALT:
				return !getAlt().isEmpty();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__OR:
				return !getOr().isEmpty();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__AND:
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
		result.append(" (nodeGroup: ");
		result.append(nodeGroup);
		result.append(')');
		return result.toString();
	}

} //BinaryNodeTypeImpl
