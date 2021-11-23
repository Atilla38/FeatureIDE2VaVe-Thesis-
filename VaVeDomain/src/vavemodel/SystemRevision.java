/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.SystemRevision#getEnablesoptions <em>Enablesoptions</em>}</li>
 *   <li>{@link vavemodel.SystemRevision#getEnablesconstraints <em>Enablesconstraints</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getSystemRevision()
 * @model
 * @generated
 */
public interface SystemRevision extends Option, Revision
{
	/**
	 * Returns the value of the '<em><b>Enablesoptions</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.FeatureOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enablesoptions</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getSystemRevision_Enablesoptions()
	 * @model
	 * @generated
	 */
	EList<FeatureOption> getEnablesoptions();

	/**
	 * Returns the value of the '<em><b>Enablesconstraints</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enablesconstraints</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getSystemRevision_Enablesconstraints()
	 * @model
	 * @generated
	 */
	EList<Constraint> getEnablesconstraints();

} // SystemRevision
