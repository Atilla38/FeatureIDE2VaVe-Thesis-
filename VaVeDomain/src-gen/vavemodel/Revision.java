/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Revision#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link vavemodel.Revision#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link vavemodel.Revision#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getRevision()
 * @model abstract="true"
 * @generated
 */
public interface Revision extends EObject
{
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Revision}.
	 * It is bidirectional and its opposite is '{@link vavemodel.Revision#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getRevision_Successors()
	 * @see vavemodel.Revision#getPredecessors
	 * @model opposite="predecessors"
	 * @generated
	 */
	EList<Revision> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Revision}.
	 * It is bidirectional and its opposite is '{@link vavemodel.Revision#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getRevision_Predecessors()
	 * @see vavemodel.Revision#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	EList<Revision> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision ID</em>' attribute.
	 * @see #setRevisionID(int)
	 * @see vavemodel.VavemodelPackage#getRevision_RevisionID()
	 * @model
	 * @generated
	 */
	int getRevisionID();

	/**
	 * Sets the value of the '{@link vavemodel.Revision#getRevisionID <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision ID</em>' attribute.
	 * @see #getRevisionID()
	 * @generated
	 */
	void setRevisionID(int value);

} // Revision
