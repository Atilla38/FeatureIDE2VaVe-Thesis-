/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.Feature#getTreeconstraint <em>Treeconstraint</em>}</li>
 *   <li>{@link vavemodel.Feature#getFeaturerevision <em>Featurerevision</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends FeatureOption
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vavemodel.VavemodelPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vavemodel.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Treeconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.TreeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treeconstraint</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getFeature_Treeconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreeConstraint> getTreeconstraint();

	/**
	 * Returns the value of the '<em><b>Featurerevision</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.FeatureRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featurerevision</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getFeature_Featurerevision()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureRevision> getFeaturerevision();

} // Feature
