/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link FeatureIDEXSD.RuleType#getDisj <em>Disj</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getConj <em>Conj</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getImp <em>Imp</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getEq <em>Eq</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getNot <em>Not</em>}</li>
 *   <li>{@link FeatureIDEXSD.RuleType#getVar <em>Var</em>}</li>
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
	 * Returns the value of the '<em><b>Disj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disj</em>' containment reference.
	 * @see #setDisj(BinaryExpressionType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Disj()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disj' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExpressionType getDisj();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getDisj <em>Disj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disj</em>' containment reference.
	 * @see #getDisj()
	 * @generated
	 */
	void setDisj(BinaryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Conj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conj</em>' containment reference.
	 * @see #setConj(BinaryExpressionType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Conj()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conj' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExpressionType getConj();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getConj <em>Conj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conj</em>' containment reference.
	 * @see #getConj()
	 * @generated
	 */
	void setConj(BinaryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Imp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp</em>' containment reference.
	 * @see #setImp(BinaryExpressionType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Imp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imp' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExpressionType getImp();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getImp <em>Imp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imp</em>' containment reference.
	 * @see #getImp()
	 * @generated
	 */
	void setImp(BinaryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference.
	 * @see #setEq(BinaryExpressionType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Eq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eq' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryExpressionType getEq();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getEq <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq</em>' containment reference.
	 * @see #getEq()
	 * @generated
	 */
	void setEq(BinaryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(UnaryExpressionType)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Not()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace'"
	 * @generated
	 */
	UnaryExpressionType getNot();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(UnaryExpressionType value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getRuleType_Var()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link FeatureIDEXSD.RuleType#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

} // RuleType
