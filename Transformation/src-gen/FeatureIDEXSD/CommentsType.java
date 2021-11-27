/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.CommentsType#getC <em>C</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getCommentsType()
 * @model extendedMetaData="name='comments_._type' kind='elementOnly'"
 * @generated
 */
public interface CommentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getCommentsType_C()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='c' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getC();

} // CommentsType
