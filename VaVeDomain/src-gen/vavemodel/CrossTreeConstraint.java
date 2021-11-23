/**
 */
package vavemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Tree Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.CrossTreeConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getCrossTreeConstraint()
 * @model
 * @generated
 */
public interface CrossTreeConstraint extends Constraint
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see vavemodel.VavemodelPackage#getCrossTreeConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<FeatureOption> getExpression();

	/**
	 * Sets the value of the '{@link vavemodel.CrossTreeConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression<FeatureOption> value);

} // CrossTreeConstraint
