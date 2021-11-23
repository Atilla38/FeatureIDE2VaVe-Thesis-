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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vavemodel.Feature;
import vavemodel.FeatureRevision;
import vavemodel.TreeConstraint;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.impl.FeatureImpl#getTreeconstraint <em>Treeconstraint</em>}</li>
 *   <li>{@link vavemodel.impl.FeatureImpl#getFeaturerevision <em>Featurerevision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends FeatureOptionImpl implements Feature
{
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
	 * The cached value of the '{@link #getTreeconstraint() <em>Treeconstraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeConstraint> treeconstraint;

	/**
	 * The cached value of the '{@link #getFeaturerevision() <em>Featurerevision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturerevision()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureRevision> featurerevision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl()
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
		return VavemodelPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeConstraint> getTreeconstraint()
	{
		if (treeconstraint == null)
		{
			treeconstraint = new EObjectContainmentEList<TreeConstraint>(TreeConstraint.class, this, VavemodelPackage.FEATURE__TREECONSTRAINT);
		}
		return treeconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureRevision> getFeaturerevision()
	{
		if (featurerevision == null)
		{
			featurerevision = new EObjectContainmentEList<FeatureRevision>(FeatureRevision.class, this, VavemodelPackage.FEATURE__FEATUREREVISION);
		}
		return featurerevision;
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
			case VavemodelPackage.FEATURE__TREECONSTRAINT:
				return ((InternalEList<?>)getTreeconstraint()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.FEATURE__FEATUREREVISION:
				return ((InternalEList<?>)getFeaturerevision()).basicRemove(otherEnd, msgs);
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
			case VavemodelPackage.FEATURE__NAME:
				return getName();
			case VavemodelPackage.FEATURE__TREECONSTRAINT:
				return getTreeconstraint();
			case VavemodelPackage.FEATURE__FEATUREREVISION:
				return getFeaturerevision();
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
			case VavemodelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case VavemodelPackage.FEATURE__TREECONSTRAINT:
				getTreeconstraint().clear();
				getTreeconstraint().addAll((Collection<? extends TreeConstraint>)newValue);
				return;
			case VavemodelPackage.FEATURE__FEATUREREVISION:
				getFeaturerevision().clear();
				getFeaturerevision().addAll((Collection<? extends FeatureRevision>)newValue);
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
			case VavemodelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VavemodelPackage.FEATURE__TREECONSTRAINT:
				getTreeconstraint().clear();
				return;
			case VavemodelPackage.FEATURE__FEATUREREVISION:
				getFeaturerevision().clear();
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
			case VavemodelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VavemodelPackage.FEATURE__TREECONSTRAINT:
				return treeconstraint != null && !treeconstraint.isEmpty();
			case VavemodelPackage.FEATURE__FEATUREREVISION:
				return featurerevision != null && !featurerevision.isEmpty();
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

} //FeatureImpl
