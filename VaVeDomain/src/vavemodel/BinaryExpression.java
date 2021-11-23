/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.BinaryExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression<T extends Option> extends Expression<T>
{
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Term}<code>&lt;T&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getBinaryExpression_Term()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Term<T>> getTerm();

} // BinaryExpression
