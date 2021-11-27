/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.Node;
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
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getNodeListGroup <em>Node List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.BinaryNodeTypeImpl#getNodeList <em>Node List</em>}</li>
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
	public FeatureMap getNodeListGroup() {
		return (FeatureMap)getNodeGroup().<FeatureMap.Entry>list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodeList() {
		return getNodeListGroup().list(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST);
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST_GROUP:
				return ((InternalEList<?>)getNodeListGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST:
				return ((InternalEList<?>)getNodeList()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST_GROUP:
				if (coreType) return getNodeListGroup();
				return ((FeatureMap.Internal)getNodeListGroup()).getWrapper();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST:
				return getNodeList();
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST_GROUP:
				((FeatureMap.Internal)getNodeListGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST:
				getNodeList().clear();
				getNodeList().addAll((Collection<? extends Node>)newValue);
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST_GROUP:
				getNodeListGroup().clear();
				return;
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST:
				getNodeList().clear();
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
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST_GROUP:
				return !getNodeListGroup().isEmpty();
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_LIST:
				return !getNodeList().isEmpty();
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
