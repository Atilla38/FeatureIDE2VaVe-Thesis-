/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Order Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.FeatureOrderType#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.FeatureOrderType#isUserDefined <em>User Defined</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getFeatureOrderType()
 * @model extendedMetaData="name='featureOrder_._type' kind='elementOnly'"
 * @generated
 */
public interface FeatureOrderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.LeafType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getFeatureOrderType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LeafType> getFeature();

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined</em>' attribute.
	 * @see #isSetUserDefined()
	 * @see #unsetUserDefined()
	 * @see #setUserDefined(boolean)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getFeatureOrderType_UserDefined()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='userDefined' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUserDefined();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.FeatureOrderType#isUserDefined <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' attribute.
	 * @see #isSetUserDefined()
	 * @see #unsetUserDefined()
	 * @see #isUserDefined()
	 * @generated
	 */
	void setUserDefined(boolean value);

	/**
	 * Unsets the value of the '{@link FeatureIDEXSD.FeatureOrderType#isUserDefined <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefined()
	 * @see #isUserDefined()
	 * @see #setUserDefined(boolean)
	 * @generated
	 */
	void unsetUserDefined();

	/**
	 * Returns whether the value of the '{@link FeatureIDEXSD.FeatureOrderType#isUserDefined <em>User Defined</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined</em>' attribute is set.
	 * @see #unsetUserDefined()
	 * @see #isUserDefined()
	 * @see #setUserDefined(boolean)
	 * @generated
	 */
	boolean isSetUserDefined();

} // FeatureOrderType
