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
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryNodeType#getAnd <em>And</em>}</li>
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
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.LeafType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_Feature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace' group='NodeGroup:6'"
	 * @generated
	 */
	EList<LeafType> getFeature();

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_Alt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace' group='NodeGroup:6'"
	 * @generated
	 */
	EList<BinaryNodeType> getAlt();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace' group='NodeGroup:6'"
	 * @generated
	 */
	EList<BinaryNodeType> getOr();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.UnaryNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryNodeType_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace' group='NodeGroup:6'"
	 * @generated
	 */
	EList<UnaryNodeType> getAnd();

} // UnaryNodeType