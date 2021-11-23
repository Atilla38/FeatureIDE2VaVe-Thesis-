/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.TreeConstraint#getType <em>Type</em>}</li>
 *   <li>{@link vavemodel.TreeConstraint#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getTreeConstraint()
 * @model
 * @generated
 */
public interface TreeConstraint extends Constraint
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vavemodel.GroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vavemodel.GroupType
	 * @see #setType(GroupType)
	 * @see vavemodel.VavemodelPackage#getTreeConstraint_Type()
	 * @model
	 * @generated
	 */
	GroupType getType();

	/**
	 * Sets the value of the '{@link vavemodel.TreeConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vavemodel.GroupType
	 * @see #getType()
	 * @generated
	 */
	void setType(GroupType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getTreeConstraint_Feature()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // TreeConstraint
