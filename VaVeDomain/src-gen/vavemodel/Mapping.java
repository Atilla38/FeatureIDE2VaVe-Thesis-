/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Mapping#getDeltamodule <em>Deltamodule</em>}</li>
 *   <li>{@link vavemodel.Mapping#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.DeltaModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamodule</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getMapping_Deltamodule()
	 * @model required="true"
	 * @generated
	 */
	EList<DeltaModule> getDeltamodule();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see vavemodel.VavemodelPackage#getMapping_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<Option> getExpression();

	/**
	 * Sets the value of the '{@link vavemodel.Mapping#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression<Option> value);

} // Mapping
