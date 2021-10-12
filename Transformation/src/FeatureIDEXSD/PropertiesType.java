/**
 */
package FeatureIDEXSD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.PropertiesType#getGroup <em>Group</em>}</li>
 *   <li>{@link FeatureIDEXSD.PropertiesType#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link FeatureIDEXSD.PropertiesType#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getPropertiesType()
 * @model extendedMetaData="name='properties_._type' kind='elementOnly'"
 * @generated
 */
public interface PropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getPropertiesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.GraphicsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getPropertiesType_Graphics()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<GraphicsType> getGraphics();

	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureIDEXSD.CalculationsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' containment reference list.
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#getPropertiesType_Calculations()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calculations' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<CalculationsType> getCalculations();

} // PropertiesType
