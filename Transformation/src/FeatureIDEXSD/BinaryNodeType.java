/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.BinaryNodeType#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryNodeType#getNodeListGroup <em>Node List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryNodeType#getNodeList <em>Node List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryNodeType()
 * @model extendedMetaData="name='binaryNodeType' kind='elementOnly'"
 * @generated
 */
public interface BinaryNodeType extends Node {
	/**
	 * Returns the value of the '<em><b>Node Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryNodeType_NodeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NodeGroup:6'"
	 * @generated
	 */
	FeatureMap getNodeGroup();

	/**
	 * Returns the value of the '<em><b>Node List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node List Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryNodeType_NodeListGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nodeList:group' namespace='##targetNamespace' group='NodeGroup:6'"
	 * @generated
	 */
	FeatureMap getNodeListGroup();

	/**
	 * Returns the value of the '<em><b>Node List</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node List</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryNodeType_NodeList()
	 * @model containment="true" lower="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nodeList' namespace='##targetNamespace' group='nodeList:group'"
	 * @generated
	 */
	EList<Node> getNodeList();

} // BinaryNodeType
