/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link FeatureIDEXSD.Node#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link FeatureIDEXSD.Node#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link FeatureIDEXSD.Node#isHidden <em>Hidden</em>}</li>
 *   <li>{@link FeatureIDEXSD.Node#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link FeatureIDEXSD.Node#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode()
 * @model extendedMetaData="name='node' kind='elementOnly'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Graphics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsType getGraphics();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(GraphicsType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Abstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link FeatureIDEXSD.Node#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link FeatureIDEXSD.Node#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #setHidden(boolean)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Hidden()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='hidden' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Unsets the value of the '{@link FeatureIDEXSD.Node#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	void unsetHidden();

	/**
	 * Returns whether the value of the '{@link FeatureIDEXSD.Node#isHidden <em>Hidden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hidden</em>' attribute is set.
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	boolean isSetHidden();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #setMandatory(boolean)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Mandatory()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='mandatory' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link FeatureIDEXSD.Node#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	void unsetMandatory();

	/**
	 * Returns whether the value of the '{@link FeatureIDEXSD.Node#isMandatory <em>Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory</em>' attribute is set.
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	boolean isSetMandatory();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getNode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
