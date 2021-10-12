/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.ConstraintsType#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getConstraintsType()
 * @model extendedMetaData="name='constraints_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.RuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getConstraintsType_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RuleType> getRule();

} // ConstraintsType
