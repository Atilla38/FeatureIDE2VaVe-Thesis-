/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getExpressionListGroup <em>Expression List Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType()
 * @model extendedMetaData="name='binaryExpressionType' kind='elementOnly'"
 * @generated
 */
public interface BinaryExpressionType extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_ExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ExpressionGroup:0'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression List Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_ExpressionListGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='expressionList:group' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	FeatureMap getExpressionListGroup();

	/**
	 * Returns the value of the '<em><b>Expression List</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression List</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_ExpressionList()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expressionList' namespace='##targetNamespace' group='expressionList:group'"
	 * @generated
	 */
	EList<Expression> getExpressionList();

} // BinaryExpressionType
