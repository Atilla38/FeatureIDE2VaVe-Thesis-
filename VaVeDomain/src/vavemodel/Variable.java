/**
 */
package vavemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Variable#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable<T extends Option> extends Expression<T>
{
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Option)
	 * @see vavemodel.VavemodelPackage#getVariable_Option()
	 * @model required="true"
	 * @generated
	 */
	T getOption();

	/**
	 * Sets the value of the '{@link vavemodel.Variable#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(T value);

} // Variable
