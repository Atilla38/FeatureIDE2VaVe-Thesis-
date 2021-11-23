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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vavemodel.Constraint;
import vavemodel.FeatureOption;
import vavemodel.Revision;
import vavemodel.SystemRevision;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.SystemRevisionImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link vavemodel.impl.SystemRevisionImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link vavemodel.impl.SystemRevisionImpl#getRevisionID <em>Revision ID</em>}</li>
 *   <li>{@link vavemodel.impl.SystemRevisionImpl#getEnablesoptions <em>Enablesoptions</em>}</li>
 *   <li>{@link vavemodel.impl.SystemRevisionImpl#getEnablesconstraints <em>Enablesconstraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRevisionImpl extends OptionImpl implements SystemRevision
{
	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> successors;

	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> predecessors;

	/**
	 * The default value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected int revisionID = REVISION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnablesoptions() <em>Enablesoptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablesoptions()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureOption> enablesoptions;

	/**
	 * The cached value of the '{@link #getEnablesconstraints() <em>Enablesconstraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablesconstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> enablesconstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRevisionImpl()
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
		return VavemodelPackage.Literals.SYSTEM_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, VavemodelPackage.SYSTEM_REVISION__SUCCESSORS, VavemodelPackage.REVISION__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getPredecessors()
	{
		if (predecessors == null)
		{
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, VavemodelPackage.SYSTEM_REVISION__PREDECESSORS, VavemodelPackage.REVISION__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionID()
	{
		return revisionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionID(int newRevisionID)
	{
		int oldRevisionID = revisionID;
		revisionID = newRevisionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.SYSTEM_REVISION__REVISION_ID, oldRevisionID, revisionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureOption> getEnablesoptions()
	{
		if (enablesoptions == null)
		{
			enablesoptions = new EObjectResolvingEList<FeatureOption>(FeatureOption.class, this, VavemodelPackage.SYSTEM_REVISION__ENABLESOPTIONS);
		}
		return enablesoptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getEnablesconstraints()
	{
		if (enablesconstraints == null)
		{
			enablesconstraints = new EObjectResolvingEList<Constraint>(Constraint.class, this, VavemodelPackage.SYSTEM_REVISION__ENABLESCONSTRAINTS);
		}
		return enablesconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessors()).basicAdd(otherEnd, msgs);
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
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
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				return getSuccessors();
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				return getPredecessors();
			case VavemodelPackage.SYSTEM_REVISION__REVISION_ID:
				return getRevisionID();
			case VavemodelPackage.SYSTEM_REVISION__ENABLESOPTIONS:
				return getEnablesoptions();
			case VavemodelPackage.SYSTEM_REVISION__ENABLESCONSTRAINTS:
				return getEnablesconstraints();
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
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case VavemodelPackage.SYSTEM_REVISION__REVISION_ID:
				setRevisionID((Integer)newValue);
				return;
			case VavemodelPackage.SYSTEM_REVISION__ENABLESOPTIONS:
				getEnablesoptions().clear();
				getEnablesoptions().addAll((Collection<? extends FeatureOption>)newValue);
				return;
			case VavemodelPackage.SYSTEM_REVISION__ENABLESCONSTRAINTS:
				getEnablesconstraints().clear();
				getEnablesconstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				getSuccessors().clear();
				return;
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				getPredecessors().clear();
				return;
			case VavemodelPackage.SYSTEM_REVISION__REVISION_ID:
				setRevisionID(REVISION_ID_EDEFAULT);
				return;
			case VavemodelPackage.SYSTEM_REVISION__ENABLESOPTIONS:
				getEnablesoptions().clear();
				return;
			case VavemodelPackage.SYSTEM_REVISION__ENABLESCONSTRAINTS:
				getEnablesconstraints().clear();
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
			case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case VavemodelPackage.SYSTEM_REVISION__REVISION_ID:
				return revisionID != REVISION_ID_EDEFAULT;
			case VavemodelPackage.SYSTEM_REVISION__ENABLESOPTIONS:
				return enablesoptions != null && !enablesoptions.isEmpty();
			case VavemodelPackage.SYSTEM_REVISION__ENABLESCONSTRAINTS:
				return enablesconstraints != null && !enablesconstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Revision.class)
		{
			switch (derivedFeatureID)
			{
				case VavemodelPackage.SYSTEM_REVISION__SUCCESSORS: return VavemodelPackage.REVISION__SUCCESSORS;
				case VavemodelPackage.SYSTEM_REVISION__PREDECESSORS: return VavemodelPackage.REVISION__PREDECESSORS;
				case VavemodelPackage.SYSTEM_REVISION__REVISION_ID: return VavemodelPackage.REVISION__REVISION_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Revision.class)
		{
			switch (baseFeatureID)
			{
				case VavemodelPackage.REVISION__SUCCESSORS: return VavemodelPackage.SYSTEM_REVISION__SUCCESSORS;
				case VavemodelPackage.REVISION__PREDECESSORS: return VavemodelPackage.SYSTEM_REVISION__PREDECESSORS;
				case VavemodelPackage.REVISION__REVISION_ID: return VavemodelPackage.SYSTEM_REVISION__REVISION_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (revisionID: ");
		result.append(revisionID);
		result.append(')');
		return result.toString();
	}

} //SystemRevisionImpl
