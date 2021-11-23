/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;

import vavemodel.Option;
import vavemodel.True;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrueImpl<T extends Option> extends ExpressionImpl<T> implements True<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueImpl()
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
		return VavemodelPackage.Literals.TRUE;
	}

} //TrueImpl
