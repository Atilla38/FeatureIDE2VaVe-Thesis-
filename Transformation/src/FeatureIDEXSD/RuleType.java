/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.RuleType#getDescription <em>Description</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType()
 * @model extendedMetaData="name='rule_._type' kind='elementOnly'"
 * @generated
 */
public interface RuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expression List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression List Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_ExpressionListGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='expressionList:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionListGroup();

	/**
	 * Returns the value of the '<em><b>Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression List</em>' containment reference.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_ExpressionList()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expressionList' namespace='##targetNamespace' group='expressionList:group'"
	 * @generated
	 */
	Expression getExpressionList();

} // RuleType
