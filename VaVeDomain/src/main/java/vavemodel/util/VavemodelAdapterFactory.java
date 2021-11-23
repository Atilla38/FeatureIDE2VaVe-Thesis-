/**
 */
package vavemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vavemodel.BinaryExpression;
import vavemodel.Configuration;
import vavemodel.Conjunction;
import vavemodel.Constraint;
import vavemodel.CrossTreeConstraint;
import vavemodel.DeltaModule;
import vavemodel.Disjunction;
import vavemodel.Equivalence;
import vavemodel.Expression;
import vavemodel.False;
import vavemodel.Feature;
import vavemodel.FeatureOption;
import vavemodel.FeatureRevision;
import vavemodel.Implication;
import vavemodel.Mapping;
import vavemodel.Not;
import vavemodel.Option;
import vavemodel.Revision;
import vavemodel.SystemRevision;
import vavemodel.Term;
import vavemodel.TreeConstraint;
import vavemodel.True;
import vavemodel.UnaryExpression;
import vavemodel.Variable;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelPackage
 * @generated
 */
public class VavemodelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VavemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = VavemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VavemodelSwitch<Adapter> modelSwitch =
		new VavemodelSwitch<Adapter>()
		{
			@Override
			public Adapter caseSystem(vavemodel.System object)
			{
				return createSystemAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object)
			{
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseCrossTreeConstraint(CrossTreeConstraint object)
			{
				return createCrossTreeConstraintAdapter();
			}
			@Override
			public Adapter caseTreeConstraint(TreeConstraint object)
			{
				return createTreeConstraintAdapter();
			}
			@Override
			public Adapter caseFeatureRevision(FeatureRevision object)
			{
				return createFeatureRevisionAdapter();
			}
			@Override
			public Adapter caseDeltaModule(DeltaModule object)
			{
				return createDeltaModuleAdapter();
			}
			@Override
			public <T extends Option> Adapter caseVariable(Variable<T> object)
			{
				return createVariableAdapter();
			}
			@Override
			public <T extends Option> Adapter caseExpression(Expression<T> object)
			{
				return createExpressionAdapter();
			}
			@Override
			public <T extends Option> Adapter caseTerm(Term<T> object)
			{
				return createTermAdapter();
			}
			@Override
			public <T extends Option> Adapter caseBinaryExpression(BinaryExpression<T> object)
			{
				return createBinaryExpressionAdapter();
			}
			@Override
			public <T extends Option> Adapter caseUnaryExpression(UnaryExpression<T> object)
			{
				return createUnaryExpressionAdapter();
			}
			@Override
			public <T extends Option> Adapter caseImplication(Implication<T> object)
			{
				return createImplicationAdapter();
			}
			@Override
			public <T extends Option> Adapter caseDisjunction(Disjunction<T> object)
			{
				return createDisjunctionAdapter();
			}
			@Override
			public <T extends Option> Adapter caseEquivalence(Equivalence<T> object)
			{
				return createEquivalenceAdapter();
			}
			@Override
			public <T extends Option> Adapter caseConjunction(Conjunction<T> object)
			{
				return createConjunctionAdapter();
			}
			@Override
			public <T extends Option> Adapter caseNot(Not<T> object)
			{
				return createNotAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object)
			{
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseOption(Option object)
			{
				return createOptionAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object)
			{
				return createMappingAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object)
			{
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseFeatureOption(FeatureOption object)
			{
				return createFeatureOptionAdapter();
			}
			@Override
			public Adapter caseSystemRevision(SystemRevision object)
			{
				return createSystemRevisionAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object)
			{
				return createConfigurationAdapter();
			}
			@Override
			public <T extends Option> Adapter caseTrue(True<T> object)
			{
				return createTrueAdapter();
			}
			@Override
			public <T extends Option> Adapter caseFalse(False<T> object)
			{
				return createFalseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.CrossTreeConstraint <em>Cross Tree Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.CrossTreeConstraint
	 * @generated
	 */
	public Adapter createCrossTreeConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.TreeConstraint <em>Tree Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.TreeConstraint
	 * @generated
	 */
	public Adapter createTreeConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.FeatureRevision <em>Feature Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.FeatureRevision
	 * @generated
	 */
	public Adapter createFeatureRevisionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.DeltaModule <em>Delta Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.DeltaModule
	 * @generated
	 */
	public Adapter createDeltaModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Term
	 * @generated
	 */
	public Adapter createTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Equivalence <em>Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Equivalence
	 * @generated
	 */
	public Adapter createEquivalenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Conjunction
	 * @generated
	 */
	public Adapter createConjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Not
	 * @generated
	 */
	public Adapter createNotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Option
	 * @generated
	 */
	public Adapter createOptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.FeatureOption <em>Feature Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.FeatureOption
	 * @generated
	 */
	public Adapter createFeatureOptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.SystemRevision <em>System Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.SystemRevision
	 * @generated
	 */
	public Adapter createSystemRevisionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.True
	 * @generated
	 */
	public Adapter createTrueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.False
	 * @generated
	 */
	public Adapter createFalseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //VavemodelAdapterFactory
