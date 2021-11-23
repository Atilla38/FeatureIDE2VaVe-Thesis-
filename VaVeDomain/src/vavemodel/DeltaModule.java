/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.framework.change.echange.EChange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.DeltaModule#getDeltamodule <em>Deltamodule</em>}</li>
 *   <li>{@link vavemodel.DeltaModule#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getDeltaModule()
 * @model
 * @generated
 */
public interface DeltaModule extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.DeltaModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamodule</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getDeltaModule_Deltamodule()
	 * @model
	 * @generated
	 */
	EList<DeltaModule> getDeltamodule();

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference list.
	 * The list contents are of type {@link tools.vitruv.framework.change.echange.EChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getDeltaModule_Change()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EChange> getChange();

} // DeltaModule
