/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;

import vavemodel.Conjunction;
import vavemodel.Option;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConjunctionImpl<T extends Option> extends BinaryExpressionImpl<T> implements Conjunction<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjunctionImpl()
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
		return VavemodelPackage.Literals.CONJUNCTION;
	}

} //ConjunctionImpl
