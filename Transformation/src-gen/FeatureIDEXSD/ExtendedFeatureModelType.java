/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Feature Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getProperties <em>Properties</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getStruct <em>Struct</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getComments <em>Comments</em>}</li>
 *   <li>{@link FeatureIDEXSD.ExtendedFeatureModelType#getFeatureOrder <em>Feature Order</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType()
 * @model extendedMetaData="name='extendedFeatureModel_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedFeatureModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(StructType1)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_Struct()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	StructType1 getStruct();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(StructType1 value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_Constraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' containment reference.
	 * @see #setCalculations(CalculationsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_Calculations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calculations' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculationsType getCalculations();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getCalculations <em>Calculations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculations</em>' containment reference.
	 * @see #getCalculations()
	 * @generated
	 */
	void setCalculations(CalculationsType value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(CommentsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentsType getComments();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(CommentsType value);

	/**
	 * Returns the value of the '<em><b>Feature Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Order</em>' containment reference.
	 * @see #setFeatureOrder(FeatureOrderType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedFeatureModelType_FeatureOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureOrderType getFeatureOrder();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.ExtendedFeatureModelType#getFeatureOrder <em>Feature Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Order</em>' containment reference.
	 * @see #getFeatureOrder()
	 * @generated
	 */
	void setFeatureOrder(FeatureOrderType value);

} // ExtendedFeatureModelType
