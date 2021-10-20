/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.StructType;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getNodeListGroup <em>Node List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.StructTypeImpl#getNodeList <em>Node List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructTypeImpl extends MinimalEObjectImpl.Container implements StructType {
	/**
	 * The cached value of the '{@link #getNodeListGroup() <em>Node List Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeListGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nodeListGroup;

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
	public FeatureMap getNodeListGroup() {
		if (nodeListGroup == null) {
			nodeListGroup = new BasicFeatureMap(this, FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP);
		}
		return nodeListGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeList() {
		return (Node)getNodeListGroup().get(FeatureIDEXSDPackage.Literals.STRUCT_TYPE__NODE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeList(Node newNodeList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNodeListGroup()).basicAdd(FeatureIDEXSDPackage.Literals.STRUCT_TYPE__NODE_LIST, newNodeList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP:
				return ((InternalEList<?>)getNodeListGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST:
				return basicSetNodeList(null, msgs);
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP:
				if (coreType) return getNodeListGroup();
				return ((FeatureMap.Internal)getNodeListGroup()).getWrapper();
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST:
				return getNodeList();
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP:
				((FeatureMap.Internal)getNodeListGroup()).set(newValue);
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP:
				getNodeListGroup().clear();
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
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST_GROUP:
				return nodeListGroup != null && !nodeListGroup.isEmpty();
			case FeatureIDEXSDPackage.STRUCT_TYPE__NODE_LIST:
				return getNodeList() != null;
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
		result.append(" (nodeListGroup: ");
		result.append(nodeListGroup);
		result.append(')');
		return result.toString();
	}

} //StructTypeImpl
