/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;

import vavemodel.Equivalence;
import vavemodel.Option;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalence</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EquivalenceImpl<T extends Option> extends BinaryExpressionImpl<T> implements Equivalence<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalenceImpl()
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
		return VavemodelPackage.Literals.EQUIVALENCE;
	}

} //EquivalenceImpl
