/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.GraphicsType#getKey <em>Key</em>}</li>
 *   <li>{@link FeatureIDEXSD.GraphicsType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getGraphicsType()
 * @model extendedMetaData="name='graphics_._type' kind='empty'"
 * @generated
 */
public interface GraphicsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getGraphicsType_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.GraphicsType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getGraphicsType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.GraphicsType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // GraphicsType
