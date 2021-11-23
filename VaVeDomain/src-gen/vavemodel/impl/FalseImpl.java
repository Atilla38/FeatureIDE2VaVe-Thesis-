/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;

import vavemodel.False;
import vavemodel.Option;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>False</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FalseImpl<T extends Option> extends ExpressionImpl<T> implements False<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseImpl()
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
		return VavemodelPackage.Literals.FALSE;
	}

} //FalseImpl
