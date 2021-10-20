/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getNodeListGroup <em>Node List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getNodeList <em>Node List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType()
 * @model extendedMetaData="name='unaryNodeType' kind='elementOnly'"
 * @generated
 */
public interface UnaryNodeType extends Node {
	/**
	 * Returns the value of the '<em><b>Node Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_NodeGroup()
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
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_NodeListGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true" transient="true" volatile="true" derived="true"
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
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_NodeList()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nodeList' namespace='##targetNamespace' group='nodeList:group'"
	 * @generated
	 */
	EList<Node> getNodeList();

} // UnaryNodeType
