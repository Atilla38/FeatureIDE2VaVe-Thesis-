/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Extended Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.BinaryExtendedNodeType#getExtendedNodeGroup <em>Extended Node Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExtendedNodeType#getFeature <em>Feature</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExtendedNodeType#getAlt <em>Alt</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExtendedNodeType#getOr <em>Or</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExtendedNodeType#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType()
 * @model extendedMetaData="name='binaryExtendedNodeType' kind='elementOnly'"
 * @generated
 */
public interface BinaryExtendedNodeType extends ExtendedNode {
	/**
	 * Returns the value of the '<em><b>Extended Node Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Node Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType_ExtendedNodeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ExtendedNodeGroup:7'"
	 * @generated
	 */
	FeatureMap getExtendedNodeGroup();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.ExtendedLeafType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType_Feature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace' group='ExtendedNodeGroup:7'"
	 * @generated
	 */
	EList<ExtendedLeafType> getFeature();

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExtendedNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType_Alt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace' group='ExtendedNodeGroup:7'"
	 * @generated
	 */
	EList<BinaryExtendedNodeType> getAlt();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExtendedNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace' group='ExtendedNodeGroup:7'"
	 * @generated
	 */
	EList<BinaryExtendedNodeType> getOr();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.UnaryExtendedNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExtendedNodeType_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace' group='ExtendedNodeGroup:7'"
	 * @generated
	 */
	EList<UnaryExtendedNodeType> getAnd();

} // BinaryExtendedNodeType
