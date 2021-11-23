/**
 */
package vavemodel.impl;

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

import vavemodel.Configuration;
import vavemodel.CrossTreeConstraint;
import vavemodel.DeltaModule;
import vavemodel.Feature;
import vavemodel.Mapping;
import vavemodel.SystemRevision;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.SystemImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getDeltamodule <em>Deltamodule</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getSystemrevision <em>Systemrevision</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements vavemodel.System
{
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossTreeConstraint> constraint;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mapping;

	/**
	 * The cached value of the '{@link #getDeltamodule() <em>Deltamodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltamodule()
	 * @generated
	 * @ordered
	 */
	protected EList<DeltaModule> deltamodule;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getSystemrevision() <em>Systemrevision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemrevision()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRevision> systemrevision;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return VavemodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CrossTreeConstraint> getConstraint()
	{
		if (constraint == null)
		{
			constraint = new EObjectContainmentEList<CrossTreeConstraint>(CrossTreeConstraint.class, this, VavemodelPackage.SYSTEM__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMapping()
	{
		if (mapping == null)
		{
			mapping = new EObjectContainmentEList<Mapping>(Mapping.class, this, VavemodelPackage.SYSTEM__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeltaModule> getDeltamodule()
	{
		if (deltamodule == null)
		{
			deltamodule = new EObjectContainmentEList<DeltaModule>(DeltaModule.class, this, VavemodelPackage.SYSTEM__DELTAMODULE);
		}
		return deltamodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature()
	{
		if (feature == null)
		{
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, VavemodelPackage.SYSTEM__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRevision> getSystemrevision()
	{
		if (systemrevision == null)
		{
			systemrevision = new EObjectContainmentEList<SystemRevision>(SystemRevision.class, this, VavemodelPackage.SYSTEM__SYSTEMREVISION);
		}
		return systemrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfiguration()
	{
		if (configuration == null)
		{
			configuration = new EObjectContainmentEList<Configuration>(Configuration.class, this, VavemodelPackage.SYSTEM__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__DELTAMODULE:
				return ((InternalEList<?>)getDeltamodule()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__SYSTEMREVISION:
				return ((InternalEList<?>)getSystemrevision()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM__CONSTRAINT:
				return getConstraint();
			case VavemodelPackage.SYSTEM__NAME:
				return getName();
			case VavemodelPackage.SYSTEM__MAPPING:
				return getMapping();
			case VavemodelPackage.SYSTEM__DELTAMODULE:
				return getDeltamodule();
			case VavemodelPackage.SYSTEM__FEATURE:
				return getFeature();
			case VavemodelPackage.SYSTEM__SYSTEMREVISION:
				return getSystemrevision();
			case VavemodelPackage.SYSTEM__CONFIGURATION:
				return getConfiguration();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends CrossTreeConstraint>)newValue);
				return;
			case VavemodelPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case VavemodelPackage.SYSTEM__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends Mapping>)newValue);
				return;
			case VavemodelPackage.SYSTEM__DELTAMODULE:
				getDeltamodule().clear();
				getDeltamodule().addAll((Collection<? extends DeltaModule>)newValue);
				return;
			case VavemodelPackage.SYSTEM__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case VavemodelPackage.SYSTEM__SYSTEMREVISION:
				getSystemrevision().clear();
				getSystemrevision().addAll((Collection<? extends SystemRevision>)newValue);
				return;
			case VavemodelPackage.SYSTEM__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends Configuration>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM__CONSTRAINT:
				getConstraint().clear();
				return;
			case VavemodelPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VavemodelPackage.SYSTEM__MAPPING:
				getMapping().clear();
				return;
			case VavemodelPackage.SYSTEM__DELTAMODULE:
				getDeltamodule().clear();
				return;
			case VavemodelPackage.SYSTEM__FEATURE:
				getFeature().clear();
				return;
			case VavemodelPackage.SYSTEM__SYSTEMREVISION:
				getSystemrevision().clear();
				return;
			case VavemodelPackage.SYSTEM__CONFIGURATION:
				getConfiguration().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case VavemodelPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VavemodelPackage.SYSTEM__MAPPING:
				return mapping != null && !mapping.isEmpty();
			case VavemodelPackage.SYSTEM__DELTAMODULE:
				return deltamodule != null && !deltamodule.isEmpty();
			case VavemodelPackage.SYSTEM__FEATURE:
				return feature != null && !feature.isEmpty();
			case VavemodelPackage.SYSTEM__SYSTEMREVISION:
				return systemrevision != null && !systemrevision.isEmpty();
			case VavemodelPackage.SYSTEM__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
