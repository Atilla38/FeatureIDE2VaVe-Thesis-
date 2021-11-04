/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.StructType#getNodeListGroup <em>Node List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.StructType#getNodeList <em>Node List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType()
 * @model extendedMetaData="name='struct_._type' kind='elementOnly'"
 * @generated
 */
public interface StructType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node List Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_NodeListGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='nodeList:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNodeListGroup();

	/**
	 * Returns the value of the '<em><b>Node List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node List</em>' containment reference.
	 * @see #setNodeList(Node)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getStructType_NodeList()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nodeList' namespace='##targetNamespace' group='nodeList:group'"
	 * @generated
	 */
	Node getNodeList();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.StructType#getNodeList <em>Node List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node List</em>' containment reference.
	 * @see #getNodeList()
	 * @generated
	 */
	void setNodeList(Node value);

} // StructType
