/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vavemodel.Configuration;
import vavemodel.Conjunction;
import vavemodel.CrossTreeConstraint;
import vavemodel.DeltaModule;
import vavemodel.Disjunction;
import vavemodel.Equivalence;
import vavemodel.False;
import vavemodel.Feature;
import vavemodel.FeatureRevision;
import vavemodel.GroupType;
import vavemodel.Implication;
import vavemodel.Mapping;
import vavemodel.Not;
import vavemodel.Option;
import vavemodel.SystemRevision;
import vavemodel.TreeConstraint;
import vavemodel.True;
import vavemodel.Variable;
import vavemodel.VavemodelFactory;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelFactoryImpl extends EFactoryImpl implements VavemodelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VavemodelFactory init()
	{
		try
		{
			VavemodelFactory theVavemodelFactory = (VavemodelFactory)EPackage.Registry.INSTANCE.getEFactory(VavemodelPackage.eNS_URI);
			if (theVavemodelFactory != null)
			{
				return theVavemodelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VavemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case VavemodelPackage.SYSTEM: return createSystem();
			case VavemodelPackage.FEATURE: return createFeature();
			case VavemodelPackage.CROSS_TREE_CONSTRAINT: return createCrossTreeConstraint();
			case VavemodelPackage.TREE_CONSTRAINT: return createTreeConstraint();
			case VavemodelPackage.FEATURE_REVISION: return createFeatureRevision();
			case VavemodelPackage.DELTA_MODULE: return createDeltaModule();
			case VavemodelPackage.VARIABLE: return createVariable();
			case VavemodelPackage.IMPLICATION: return createImplication();
			case VavemodelPackage.DISJUNCTION: return createDisjunction();
			case VavemodelPackage.EQUIVALENCE: return createEquivalence();
			case VavemodelPackage.CONJUNCTION: return createConjunction();
			case VavemodelPackage.NOT: return createNot();
			case VavemodelPackage.MAPPING: return createMapping();
			case VavemodelPackage.SYSTEM_REVISION: return createSystemRevision();
			case VavemodelPackage.CONFIGURATION: return createConfiguration();
			case VavemodelPackage.TRUE: return createTrue();
			case VavemodelPackage.FALSE: return createFalse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case VavemodelPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case VavemodelPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vavemodel.System createSystem()
	{
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature()
	{
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossTreeConstraint createCrossTreeConstraint()
	{
		CrossTreeConstraintImpl crossTreeConstraint = new CrossTreeConstraintImpl();
		return crossTreeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeConstraint createTreeConstraint()
	{
		TreeConstraintImpl treeConstraint = new TreeConstraintImpl();
		return treeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRevision createFeatureRevision()
	{
		FeatureRevisionImpl featureRevision = new FeatureRevisionImpl();
		return featureRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltaModule createDeltaModule()
	{
		DeltaModuleImpl deltaModule = new DeltaModuleImpl();
		return deltaModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Variable<T> createVariable()
	{
		VariableImpl<T> variable = new VariableImpl<T>();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Implication<T> createImplication()
	{
		ImplicationImpl<T> implication = new ImplicationImpl<T>();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Disjunction<T> createDisjunction()
	{
		DisjunctionImpl<T> disjunction = new DisjunctionImpl<T>();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Equivalence<T> createEquivalence()
	{
		EquivalenceImpl<T> equivalence = new EquivalenceImpl<T>();
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Conjunction<T> createConjunction()
	{
		ConjunctionImpl<T> conjunction = new ConjunctionImpl<T>();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> Not<T> createNot()
	{
		NotImpl<T> not = new NotImpl<T>();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping()
	{
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRevision createSystemRevision()
	{
		SystemRevisionImpl systemRevision = new SystemRevisionImpl();
		return systemRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration()
	{
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> True<T> createTrue()
	{
		TrueImpl<T> true_ = new TrueImpl<T>();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Option> False<T> createFalse()
	{
		FalseImpl<T> false_ = new FalseImpl<T>();
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue)
	{
		GroupType result = GroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelPackage getVavemodelPackage()
	{
		return (VavemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VavemodelPackage getPackage()
	{
		return VavemodelPackage.eINSTANCE;
	}

} //VavemodelFactoryImpl
