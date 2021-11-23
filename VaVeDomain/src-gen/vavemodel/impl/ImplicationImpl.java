/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;

import vavemodel.Implication;
import vavemodel.Option;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImplicationImpl<T extends Option> extends BinaryExpressionImpl<T> implements Implication<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return VavemodelPackage.Literals.IMPLICATION;
	}

} //ImplicationImpl
