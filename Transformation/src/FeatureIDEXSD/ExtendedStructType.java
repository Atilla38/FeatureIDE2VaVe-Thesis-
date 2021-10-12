/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.ExtendedStructType#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedStructType#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedStructType#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedStructType#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedStructType()
 * @model extendedMetaData="name='struct_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedStructType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(ExtendedLeafType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedStructType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedLeafType getFeature();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedStructType#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(ExtendedLeafType value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference.
	 * @see #setAlt(BinaryExtendedNodeType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedStructType_Alt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExtendedNodeType getAlt();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedStructType#getAlt <em>Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' containment reference.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(BinaryExtendedNodeType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(BinaryExtendedNodeType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedStructType_Or()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExtendedNodeType getOr();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedStructType#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BinaryExtendedNodeType value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(UnaryExtendedNodeType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedStructType_And()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace'"
	 * @generated
	 */
	UnaryExtendedNodeType getAnd();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedStructType#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(UnaryExtendedNodeType value);

} // ExtendedStructType
