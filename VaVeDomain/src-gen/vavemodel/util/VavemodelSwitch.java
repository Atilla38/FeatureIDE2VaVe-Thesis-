/**
 */
package vavemodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelPackage
 * @generated
 */
public class VavemodelSwitch<T1> extends Switch<T1>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VavemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = VavemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case VavemodelPackage.SYSTEM:
			{
				vavemodel.System system = (vavemodel.System)theEObject;
				T1 result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.FEATURE:
			{
				Feature feature = (Feature)theEObject;
				T1 result = caseFeature(feature);
				if (result == null) result = caseFeatureOption(feature);
				if (result == null) result = caseOption(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CROSS_TREE_CONSTRAINT:
			{
				CrossTreeConstraint crossTreeConstraint = (CrossTreeConstraint)theEObject;
				T1 result = caseCrossTreeConstraint(crossTreeConstraint);
				if (result == null) result = caseConstraint(crossTreeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.TREE_CONSTRAINT:
			{
				TreeConstraint treeConstraint = (TreeConstraint)theEObject;
				T1 result = caseTreeConstraint(treeConstraint);
				if (result == null) result = caseConstraint(treeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.FEATURE_REVISION:
			{
				FeatureRevision featureRevision = (FeatureRevision)theEObject;
				T1 result = caseFeatureRevision(featureRevision);
				if (result == null) result = caseRevision(featureRevision);
				if (result == null) result = caseFeatureOption(featureRevision);
				if (result == null) result = caseOption(featureRevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.DELTA_MODULE:
			{
				DeltaModule deltaModule = (DeltaModule)theEObject;
				T1 result = caseDeltaModule(deltaModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VARIABLE:
			{
				Variable<?> variable = (Variable<?>)theEObject;
				T1 result = caseVariable(variable);
				if (result == null) result = caseExpression(variable);
				if (result == null) result = caseTerm(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.EXPRESSION:
			{
				Expression<?> expression = (Expression<?>)theEObject;
				T1 result = caseExpression(expression);
				if (result == null) result = caseTerm(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.TERM:
			{
				Term<?> term = (Term<?>)theEObject;
				T1 result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.BINARY_EXPRESSION:
			{
				BinaryExpression<?> binaryExpression = (BinaryExpression<?>)theEObject;
				T1 result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseTerm(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.UNARY_EXPRESSION:
			{
				UnaryExpression<?> unaryExpression = (UnaryExpression<?>)theEObject;
				T1 result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseTerm(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.IMPLICATION:
			{
				Implication<?> implication = (Implication<?>)theEObject;
				T1 result = caseImplication(implication);
				if (result == null) result = caseBinaryExpression(implication);
				if (result == null) result = caseExpression(implication);
				if (result == null) result = caseTerm(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.DISJUNCTION:
			{
				Disjunction<?> disjunction = (Disjunction<?>)theEObject;
				T1 result = caseDisjunction(disjunction);
				if (result == null) result = caseBinaryExpression(disjunction);
				if (result == null) result = caseExpression(disjunction);
				if (result == null) result = caseTerm(disjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.EQUIVALENCE:
			{
				Equivalence<?> equivalence = (Equivalence<?>)theEObject;
				T1 result = caseEquivalence(equivalence);
				if (result == null) result = caseBinaryExpression(equivalence);
				if (result == null) result = caseExpression(equivalence);
				if (result == null) result = caseTerm(equivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CONJUNCTION:
			{
				Conjunction<?> conjunction = (Conjunction<?>)theEObject;
				T1 result = caseConjunction(conjunction);
				if (result == null) result = caseBinaryExpression(conjunction);
				if (result == null) result = caseExpression(conjunction);
				if (result == null) result = caseTerm(conjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.NOT:
			{
				Not<?> not = (Not<?>)theEObject;
				T1 result = caseNot(not);
				if (result == null) result = caseUnaryExpression(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = caseTerm(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CONSTRAINT:
			{
				Constraint constraint = (Constraint)theEObject;
				T1 result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.OPTION:
			{
				Option option = (Option)theEObject;
				T1 result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.MAPPING:
			{
				Mapping mapping = (Mapping)theEObject;
				T1 result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.REVISION:
			{
				Revision revision = (Revision)theEObject;
				T1 result = caseRevision(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.FEATURE_OPTION:
			{
				FeatureOption featureOption = (FeatureOption)theEObject;
				T1 result = caseFeatureOption(featureOption);
				if (result == null) result = caseOption(featureOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.SYSTEM_REVISION:
			{
				SystemRevision systemRevision = (SystemRevision)theEObject;
				T1 result = caseSystemRevision(systemRevision);
				if (result == null) result = caseOption(systemRevision);
				if (result == null) result = caseRevision(systemRevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CONFIGURATION:
			{
				Configuration configuration = (Configuration)theEObject;
				T1 result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.TRUE:
			{
				True<?> true_ = (True<?>)theEObject;
				T1 result = caseTrue(true_);
				if (result == null) result = caseExpression(true_);
				if (result == null) result = caseTerm(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.FALSE:
			{
				False<?> false_ = (False<?>)theEObject;
				T1 result = caseFalse(false_);
				if (result == null) result = caseExpression(false_);
				if (result == null) result = caseTerm(false_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystem(vavemodel.System object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeature(Feature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Tree Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Tree Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCrossTreeConstraint(CrossTreeConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTreeConstraint(TreeConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeatureRevision(FeatureRevision object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDeltaModule(DeltaModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseVariable(Variable<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseExpression(Expression<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseTerm(Term<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseBinaryExpression(BinaryExpression<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseUnaryExpression(UnaryExpression<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseImplication(Implication<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseDisjunction(Disjunction<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseEquivalence(Equivalence<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseConjunction(Conjunction<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseNot(Not<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstraint(Constraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOption(Option object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMapping(Mapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRevision(Revision object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeatureOption(FeatureOption object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemRevision(SystemRevision object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConfiguration(Configuration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseTrue(True<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Option> T1 caseFalse(False<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object)
	{
		return null;
	}

} //VavemodelSwitch
