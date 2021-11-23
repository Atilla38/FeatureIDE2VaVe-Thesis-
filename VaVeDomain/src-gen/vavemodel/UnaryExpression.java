/**
 */
package vavemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.UnaryExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getUnaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface UnaryExpression<T extends Option> extends Expression<T>
{
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see vavemodel.VavemodelPackage#getUnaryExpression_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term<T> getTerm();

	/**
	 * Sets the value of the '{@link vavemodel.UnaryExpression#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term<T> value);

} // UnaryExpression
