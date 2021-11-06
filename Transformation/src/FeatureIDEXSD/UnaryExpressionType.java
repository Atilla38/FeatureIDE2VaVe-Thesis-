/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.UnaryExpressionType#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.UnaryExpressionType#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryExpressionType()
 * @model extendedMetaData="name='unaryExpressionType' kind='elementOnly'"
 * @generated
 */
public interface UnaryExpressionType extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression List Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryExpressionType_ExpressionListGroup()
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
	 * @see #setExpressionList(Expression)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getUnaryExpressionType_ExpressionList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expressionList' namespace='##targetNamespace' group='expressionList:group'"
	 * @generated
	 */
	Expression getExpressionList();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.UnaryExpressionType#getExpressionList <em>Expression List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression List</em>' containment reference.
	 * @see #getExpressionList()
	 * @generated
	 */
	void setExpressionList(Expression value);

} // UnaryExpressionType
