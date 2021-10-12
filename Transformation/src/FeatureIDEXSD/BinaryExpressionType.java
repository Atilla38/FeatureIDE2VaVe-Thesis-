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
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getDisj <em>Disj</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getConj <em>Conj</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getImp <em>Imp</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getEq <em>Eq</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getNot <em>Not</em>}</li>
 *   <li>{@link FeatureIDEXSD.BinaryExpressionType#getVar <em>Var</em>}</li>
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
	 * Returns the value of the '<em><b>Disj</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disj</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Disj()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disj' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<BinaryExpressionType> getDisj();

	/**
	 * Returns the value of the '<em><b>Conj</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conj</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Conj()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conj' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<BinaryExpressionType> getConj();

	/**
	 * Returns the value of the '<em><b>Imp</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Imp()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imp' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<BinaryExpressionType> getImp();

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.BinaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Eq()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eq' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<BinaryExpressionType> getEq();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.UnaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Not()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<UnaryExpressionType> getNot();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getBinaryExpressionType_Var()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='ExpressionGroup:0'"
	 * @generated
	 */
	EList<String> getVar();

} // BinaryExpressionType
