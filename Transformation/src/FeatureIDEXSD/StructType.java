/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.StructType#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.StructType#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.StructType#getAnd <em>And</em>}</li>
 *   <li>{@link FeatureIDEXSD.StructType#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType()
 * @model extendedMetaData="name='struct_._type' kind='elementOnly'"
 * @generated
 */
public interface StructType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference.
	 * @see #setAlt(AltType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_Alt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace'"
	 * @generated
	 */
	AltType getAlt();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.StructType#getAlt <em>Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' containment reference.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(AltType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(OrType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace'"
	 * @generated
	 */
	OrType getOr();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.StructType#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(OrType value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(AndType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace'"
	 * @generated
	 */
	AndType getAnd();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.StructType#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(AndType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureType getFeature();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.StructType#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureType value);

} // StructType
