/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.ExtendedNode#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedNode()
 * @model extendedMetaData="name='extendedNode' kind='elementOnly'"
 * @generated
 */
public interface ExtendedNode extends Node {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getExtendedNode_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getAttribute();

} // ExtendedNode
