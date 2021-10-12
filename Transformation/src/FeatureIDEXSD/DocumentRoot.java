/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getC <em>C</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getComments <em>Comments</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getExtendedFeatureModel <em>Extended Feature Model</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getFeatureOrder <em>Feature Order</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link FeatureIDEXSD.DocumentRoot#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_C()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='c' namespace='##targetNamespace'"
	 * @generated
	 */
	String getC();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(String value);

	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' containment reference.
	 * @see #setCalculations(CalculationsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Calculations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calculations' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculationsType getCalculations();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getCalculations <em>Calculations</em>}' containment reference.
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
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Comments()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentsType getComments();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(CommentsType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Constraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Extended Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Feature Model</em>' containment reference.
	 * @see #setExtendedFeatureModel(ExtendedFeatureModelType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_ExtendedFeatureModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedFeatureModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedFeatureModelType getExtendedFeatureModel();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getExtendedFeatureModel <em>Extended Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Feature Model</em>' containment reference.
	 * @see #getExtendedFeatureModel()
	 * @generated
	 */
	void setExtendedFeatureModel(ExtendedFeatureModelType value);

	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' containment reference.
	 * @see #setFeatureModel(FeatureModelType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_FeatureModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureModel' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureModelType getFeatureModel();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getFeatureModel <em>Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' containment reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModelType value);

	/**
	 * Returns the value of the '<em><b>Feature Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Order</em>' containment reference.
	 * @see #setFeatureOrder(FeatureOrderType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_FeatureOrder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureOrderType getFeatureOrder();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getFeatureOrder <em>Feature Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Order</em>' containment reference.
	 * @see #getFeatureOrder()
	 * @generated
	 */
	void setFeatureOrder(FeatureOrderType value);

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Graphics()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsType getGraphics();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(GraphicsType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Properties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(RuleType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getDocumentRoot_Rule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	RuleType getRule();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.DocumentRoot#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(RuleType value);

} // DocumentRoot
