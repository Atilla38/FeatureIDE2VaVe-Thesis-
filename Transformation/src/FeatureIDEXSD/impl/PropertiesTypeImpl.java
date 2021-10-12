/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.CalculationsType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.GraphicsType;
import FeatureIDEXSD.PropertiesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.PropertiesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.PropertiesTypeImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.PropertiesTypeImpl#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesTypeImpl extends MinimalEObjectImpl.Container implements PropertiesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicsType> getGraphics() {
		return getGroup().list(FeatureIDEXSDPackage.Literals.PROPERTIES_TYPE__GRAPHICS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculationsType> getCalculations() {
		return getGroup().list(FeatureIDEXSDPackage.Literals.PROPERTIES_TYPE__CALCULATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GRAPHICS:
				return ((InternalEList<?>)getGraphics()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__CALCULATIONS:
				return ((InternalEList<?>)getCalculations()).basicRemove(otherEnd, msgs);
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
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GRAPHICS:
				return getGraphics();
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__CALCULATIONS:
				return getCalculations();
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
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GRAPHICS:
				getGraphics().clear();
				getGraphics().addAll((Collection<? extends GraphicsType>)newValue);
				return;
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__CALCULATIONS:
				getCalculations().clear();
				getCalculations().addAll((Collection<? extends CalculationsType>)newValue);
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
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP:
				getGroup().clear();
				return;
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GRAPHICS:
				getGraphics().clear();
				return;
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__CALCULATIONS:
				getCalculations().clear();
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
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__GRAPHICS:
				return !getGraphics().isEmpty();
			case FeatureIDEXSDPackage.PROPERTIES_TYPE__CALCULATIONS:
				return !getCalculations().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //PropertiesTypeImpl
