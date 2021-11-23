/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tools.vitruv.framework.change.echange.EChangePackage;

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
import vavemodel.GroupType;
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
import vavemodel.VavemodelFactory;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelPackageImpl extends EPackageImpl implements VavemodelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossTreeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vavemodel.VavemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VavemodelPackageImpl()
	{
		super(eNS_URI, VavemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VavemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VavemodelPackage init()
	{
		if (isInited) return (VavemodelPackage)EPackage.Registry.INSTANCE.getEPackage(VavemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVavemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VavemodelPackageImpl theVavemodelPackage = registeredVavemodelPackage instanceof VavemodelPackageImpl ? (VavemodelPackageImpl)registeredVavemodelPackage : new VavemodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EChangePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVavemodelPackage.createPackageContents();

		// Initialize created meta-data
		theVavemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVavemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VavemodelPackage.eNS_URI, theVavemodelPackage);
		return theVavemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem()
	{
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Constraint()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name()
	{
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Mapping()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Deltamodule()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Feature()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Systemrevision()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Configuration()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature()
	{
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name()
	{
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Treeconstraint()
	{
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Featurerevision()
	{
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossTreeConstraint()
	{
		return crossTreeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossTreeConstraint_Expression()
	{
		return (EReference)crossTreeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeConstraint()
	{
		return treeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeConstraint_Type()
	{
		return (EAttribute)treeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeConstraint_Feature()
	{
		return (EReference)treeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureRevision()
	{
		return featureRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeltaModule()
	{
		return deltaModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeltaModule_Deltamodule()
	{
		return (EReference)deltaModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeltaModule_Change()
	{
		return (EReference)deltaModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable()
	{
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Option()
	{
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression()
	{
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm()
	{
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression()
	{
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Term()
	{
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression()
	{
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Term()
	{
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplication()
	{
		return implicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunction()
	{
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalence()
	{
		return equivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction()
	{
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot()
	{
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint()
	{
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption()
	{
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping()
	{
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Deltamodule()
	{
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Expression()
	{
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision()
	{
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Successors()
	{
		return (EReference)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Predecessors()
	{
		return (EReference)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_RevisionID()
	{
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOption()
	{
		return featureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRevision()
	{
		return systemRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRevision_Enablesoptions()
	{
		return (EReference)systemRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRevision_Enablesconstraints()
	{
		return (EReference)systemRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration()
	{
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Option()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue()
	{
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalse()
	{
		return falseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupType()
	{
		return groupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelFactory getVavemodelFactory()
	{
		return (VavemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONSTRAINT);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__MAPPING);
		createEReference(systemEClass, SYSTEM__DELTAMODULE);
		createEReference(systemEClass, SYSTEM__FEATURE);
		createEReference(systemEClass, SYSTEM__SYSTEMREVISION);
		createEReference(systemEClass, SYSTEM__CONFIGURATION);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__TREECONSTRAINT);
		createEReference(featureEClass, FEATURE__FEATUREREVISION);

		crossTreeConstraintEClass = createEClass(CROSS_TREE_CONSTRAINT);
		createEReference(crossTreeConstraintEClass, CROSS_TREE_CONSTRAINT__EXPRESSION);

		treeConstraintEClass = createEClass(TREE_CONSTRAINT);
		createEAttribute(treeConstraintEClass, TREE_CONSTRAINT__TYPE);
		createEReference(treeConstraintEClass, TREE_CONSTRAINT__FEATURE);

		featureRevisionEClass = createEClass(FEATURE_REVISION);

		deltaModuleEClass = createEClass(DELTA_MODULE);
		createEReference(deltaModuleEClass, DELTA_MODULE__DELTAMODULE);
		createEReference(deltaModuleEClass, DELTA_MODULE__CHANGE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__OPTION);

		expressionEClass = createEClass(EXPRESSION);

		termEClass = createEClass(TERM);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__TERM);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__TERM);

		implicationEClass = createEClass(IMPLICATION);

		disjunctionEClass = createEClass(DISJUNCTION);

		equivalenceEClass = createEClass(EQUIVALENCE);

		conjunctionEClass = createEClass(CONJUNCTION);

		notEClass = createEClass(NOT);

		constraintEClass = createEClass(CONSTRAINT);

		optionEClass = createEClass(OPTION);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__DELTAMODULE);
		createEReference(mappingEClass, MAPPING__EXPRESSION);

		revisionEClass = createEClass(REVISION);
		createEReference(revisionEClass, REVISION__SUCCESSORS);
		createEReference(revisionEClass, REVISION__PREDECESSORS);
		createEAttribute(revisionEClass, REVISION__REVISION_ID);

		featureOptionEClass = createEClass(FEATURE_OPTION);

		systemRevisionEClass = createEClass(SYSTEM_REVISION);
		createEReference(systemRevisionEClass, SYSTEM_REVISION__ENABLESOPTIONS);
		createEReference(systemRevisionEClass, SYSTEM_REVISION__ENABLESCONSTRAINTS);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__OPTION);

		trueEClass = createEClass(TRUE);

		falseEClass = createEClass(FALSE);

		// Create enums
		groupTypeEEnum = createEEnum(GROUP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EChangePackage theEChangePackage = (EChangePackage)EPackage.Registry.INSTANCE.getEPackage(EChangePackage.eNS_URI);

		// Create type parameters
		ETypeParameter variableEClass_T = addETypeParameter(variableEClass, "T");
		ETypeParameter expressionEClass_T = addETypeParameter(expressionEClass, "T");
		ETypeParameter termEClass_T = addETypeParameter(termEClass, "T");
		ETypeParameter binaryExpressionEClass_T = addETypeParameter(binaryExpressionEClass, "T");
		ETypeParameter unaryExpressionEClass_T = addETypeParameter(unaryExpressionEClass, "T");
		ETypeParameter implicationEClass_T = addETypeParameter(implicationEClass, "T");
		ETypeParameter disjunctionEClass_T = addETypeParameter(disjunctionEClass, "T");
		ETypeParameter equivalenceEClass_T = addETypeParameter(equivalenceEClass, "T");
		ETypeParameter conjunctionEClass_T = addETypeParameter(conjunctionEClass, "T");
		ETypeParameter notEClass_T = addETypeParameter(notEClass, "T");
		ETypeParameter trueEClass_T = addETypeParameter(trueEClass, "T");
		ETypeParameter falseEClass_T = addETypeParameter(falseEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getOption());
		variableEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		expressionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		termEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		binaryExpressionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		unaryExpressionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		implicationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		disjunctionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		equivalenceEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		conjunctionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		notEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		trueEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOption());
		falseEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		featureEClass.getESuperTypes().add(this.getFeatureOption());
		crossTreeConstraintEClass.getESuperTypes().add(this.getConstraint());
		treeConstraintEClass.getESuperTypes().add(this.getConstraint());
		featureRevisionEClass.getESuperTypes().add(this.getRevision());
		featureRevisionEClass.getESuperTypes().add(this.getFeatureOption());
		g1 = createEGenericType(this.getExpression());
		EGenericType g2 = createEGenericType(variableEClass_T);
		g1.getETypeArguments().add(g2);
		variableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTerm());
		g2 = createEGenericType(expressionEClass_T);
		g1.getETypeArguments().add(g2);
		expressionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(binaryExpressionEClass_T);
		g1.getETypeArguments().add(g2);
		binaryExpressionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(unaryExpressionEClass_T);
		g1.getETypeArguments().add(g2);
		unaryExpressionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryExpression());
		g2 = createEGenericType(implicationEClass_T);
		g1.getETypeArguments().add(g2);
		implicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryExpression());
		g2 = createEGenericType(disjunctionEClass_T);
		g1.getETypeArguments().add(g2);
		disjunctionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryExpression());
		g2 = createEGenericType(equivalenceEClass_T);
		g1.getETypeArguments().add(g2);
		equivalenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBinaryExpression());
		g2 = createEGenericType(conjunctionEClass_T);
		g1.getETypeArguments().add(g2);
		conjunctionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryExpression());
		g2 = createEGenericType(notEClass_T);
		g1.getETypeArguments().add(g2);
		notEClass.getEGenericSuperTypes().add(g1);
		featureOptionEClass.getESuperTypes().add(this.getOption());
		systemRevisionEClass.getESuperTypes().add(this.getOption());
		systemRevisionEClass.getESuperTypes().add(this.getRevision());
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(trueEClass_T);
		g1.getETypeArguments().add(g2);
		trueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(falseEClass_T);
		g1.getETypeArguments().add(g2);
		falseEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, vavemodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Constraint(), this.getCrossTreeConstraint(), null, "constraint", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Mapping(), this.getMapping(), null, "mapping", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Deltamodule(), this.getDeltaModule(), null, "deltamodule", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Feature(), this.getFeature(), null, "feature", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Systemrevision(), this.getSystemRevision(), null, "systemrevision", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Configuration(), this.getConfiguration(), null, "configuration", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Treeconstraint(), this.getTreeConstraint(), null, "treeconstraint", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Featurerevision(), this.getFeatureRevision(), null, "featurerevision", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossTreeConstraintEClass, CrossTreeConstraint.class, "CrossTreeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(this.getFeatureOption());
		g1.getETypeArguments().add(g2);
		initEReference(getCrossTreeConstraint_Expression(), g1, null, "expression", null, 1, 1, CrossTreeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeConstraintEClass, TreeConstraint.class, "TreeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeConstraint_Type(), this.getGroupType(), "type", null, 0, 1, TreeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeConstraint_Feature(), this.getFeature(), null, "feature", null, 1, -1, TreeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureRevisionEClass, FeatureRevision.class, "FeatureRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deltaModuleEClass, DeltaModule.class, "DeltaModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeltaModule_Deltamodule(), this.getDeltaModule(), null, "deltamodule", null, 0, -1, DeltaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeltaModule_Change(), theEChangePackage.getEChange(), null, "change", null, 1, -1, DeltaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(variableEClass_T);
		initEReference(getVariable_Option(), g1, null, "option", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getTerm());
		g2 = createEGenericType(binaryExpressionEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getBinaryExpression_Term(), g1, null, "term", null, 2, 2, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getTerm());
		g2 = createEGenericType(unaryExpressionEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getUnaryExpression_Term(), g1, null, "term", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalenceEClass, Equivalence.class, "Equivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionEClass, Option.class, "Option", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Deltamodule(), this.getDeltaModule(), null, "deltamodule", null, 1, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(this.getOption());
		g1.getETypeArguments().add(g2);
		initEReference(getMapping_Expression(), g1, null, "expression", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevision_Successors(), this.getRevision(), this.getRevision_Predecessors(), "successors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Predecessors(), this.getRevision(), this.getRevision_Successors(), "predecessors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_RevisionID(), ecorePackage.getEInt(), "revisionID", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOptionEClass, FeatureOption.class, "FeatureOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemRevisionEClass, SystemRevision.class, "SystemRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRevision_Enablesoptions(), this.getFeatureOption(), null, "enablesoptions", null, 0, -1, SystemRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRevision_Enablesconstraints(), this.getConstraint(), null, "enablesconstraints", null, 0, -1, SystemRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Option(), this.getOption(), null, "option", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(groupTypeEEnum, GroupType.class, "GroupType");
		addEEnumLiteral(groupTypeEEnum, GroupType.XOR);
		addEEnumLiteral(groupTypeEEnum, GroupType.OR);
		addEEnumLiteral(groupTypeEEnum, GroupType.XORNONE);
		addEEnumLiteral(groupTypeEEnum, GroupType.ORNONE);

		// Create resource
		createResource(eNS_URI);
	}

} //VavemodelPackageImpl
