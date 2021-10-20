/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.AltType;
import FeatureIDEXSD.AndType;
import FeatureIDEXSD.BinaryExpressionType;
import FeatureIDEXSD.BinaryExtendedNodeType;
import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.CalculationsType;
import FeatureIDEXSD.CommentsType;
import FeatureIDEXSD.ConjType;
import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.DisjType;
import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.EqType;
import FeatureIDEXSD.Expression;
import FeatureIDEXSD.ExtendedFeatureModelType;
import FeatureIDEXSD.ExtendedLeafType;
import FeatureIDEXSD.ExtendedNode;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.FeatureOrderType;
import FeatureIDEXSD.FeatureType;
import FeatureIDEXSD.GraphicsType;
import FeatureIDEXSD.ImpType;
import FeatureIDEXSD.LeafType;
import FeatureIDEXSD.Node;
import FeatureIDEXSD.NotType;
import FeatureIDEXSD.OrType;
import FeatureIDEXSD.PropertiesType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.StructType1;
import FeatureIDEXSD.UnaryExpressionType;
import FeatureIDEXSD.UnaryExtendedNodeType;
import FeatureIDEXSD.UnaryNodeType;

import FeatureIDEXSD.VarType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureIDEXSDPackageImpl extends EPackageImpl implements FeatureIDEXSDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExtendedNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqTypeEClass = null;

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
	private EClass extendedFeatureModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedLeafTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExtendedNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTypeEClass = null;

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
	 * @see FeatureIDEXSD.FeatureIDEXSDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeatureIDEXSDPackageImpl() {
		super(eNS_URI, FeatureIDEXSDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeatureIDEXSDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeatureIDEXSDPackage init() {
		if (isInited) return (FeatureIDEXSDPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureIDEXSDPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFeatureIDEXSDPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FeatureIDEXSDPackageImpl theFeatureIDEXSDPackage = registeredFeatureIDEXSDPackage instanceof FeatureIDEXSDPackageImpl ? (FeatureIDEXSDPackageImpl)registeredFeatureIDEXSDPackage : new FeatureIDEXSDPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFeatureIDEXSDPackage.createPackageContents();

		// Initialize created meta-data
		theFeatureIDEXSDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeatureIDEXSDPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeatureIDEXSDPackage.eNS_URI, theFeatureIDEXSDPackage);
		return theFeatureIDEXSDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltType() {
		return altTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndType() {
		return andTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpressionType() {
		return binaryExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpressionType_ExpressionGroup() {
		return (EAttribute)binaryExpressionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpressionType_ExpressionListGroup() {
		return (EAttribute)binaryExpressionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpressionType_ExpressionList() {
		return (EReference)binaryExpressionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExtendedNodeType() {
		return binaryExtendedNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExtendedNodeType_ExtendedNodeGroup() {
		return (EAttribute)binaryExtendedNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExtendedNodeType_Feature() {
		return (EReference)binaryExtendedNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExtendedNodeType_Alt() {
		return (EReference)binaryExtendedNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExtendedNodeType_Or() {
		return (EReference)binaryExtendedNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExtendedNodeType_And() {
		return (EReference)binaryExtendedNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryNodeType() {
		return binaryNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryNodeType_NodeGroup() {
		return (EAttribute)binaryNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryNodeType_NodeListGroup() {
		return (EAttribute)binaryNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryNodeType_NodeList() {
		return (EReference)binaryNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculationsType() {
		return calculationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationsType_Key() {
		return (EAttribute)calculationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationsType_Value() {
		return (EAttribute)calculationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentsType() {
		return commentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentsType_C() {
		return (EAttribute)commentsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjType() {
		return conjTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType() {
		return constraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_Rule() {
		return (EReference)constraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjType() {
		return disjTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Alt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NodeList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_And() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_C() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Calculations() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Comments() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conj() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExpressionList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Constraints() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Disj() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Eq() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtendedFeatureModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Feature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureOrder() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Graphics() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Imp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Not() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Or() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Properties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Var() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqType() {
		return eqTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedFeatureModelType() {
		return extendedFeatureModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_Properties() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_Struct() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_Constraints() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_Calculations() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_Comments() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedFeatureModelType_FeatureOrder() {
		return (EReference)extendedFeatureModelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedLeafType() {
		return extendedLeafTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedNode() {
		return extendedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedNode_Attribute() {
		return (EReference)extendedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureModelType() {
		return featureModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Properties() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Struct() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Constraints() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Calculations() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Comments() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_FeatureOrder() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOrderType() {
		return featureOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOrderType_Feature() {
		return (EReference)featureOrderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureOrderType_UserDefined() {
		return (EAttribute)featureOrderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureType() {
		return featureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsType() {
		return graphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsType_Key() {
		return (EAttribute)graphicsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsType_Value() {
		return (EAttribute)graphicsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpType() {
		return impTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafType() {
		return leafTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Description() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Graphics() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Abstract() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Hidden() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Mandatory() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotType() {
		return notTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrType() {
		return orTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesType_Group() {
		return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesType_Graphics() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesType_Calculations() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleType() {
		return ruleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Description() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_ExpressionListGroup() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_ExpressionList() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructType() {
		return structTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructType_NodeListGroup() {
		return (EAttribute)structTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType_NodeList() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructType1() {
		return structType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType1_Feature() {
		return (EReference)structType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType1_Alt() {
		return (EReference)structType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType1_Or() {
		return (EReference)structType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType1_And() {
		return (EReference)structType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpressionType() {
		return unaryExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpressionType_ExpressionListGroup() {
		return (EAttribute)unaryExpressionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpressionType_ExpressionList() {
		return (EReference)unaryExpressionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExtendedNodeType() {
		return unaryExtendedNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExtendedNodeType_ExtendedNodeGroup() {
		return (EAttribute)unaryExtendedNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExtendedNodeType_Feature() {
		return (EReference)unaryExtendedNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExtendedNodeType_Alt() {
		return (EReference)unaryExtendedNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExtendedNodeType_Or() {
		return (EReference)unaryExtendedNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExtendedNodeType_And() {
		return (EReference)unaryExtendedNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryNodeType() {
		return unaryNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryNodeType_NodeGroup() {
		return (EAttribute)unaryNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryNodeType_NodeListGroup() {
		return (EAttribute)unaryNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryNodeType_NodeList() {
		return (EReference)unaryNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarType() {
		return varTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Mixed() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIDEXSDFactory getFeatureIDEXSDFactory() {
		return (FeatureIDEXSDFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		altTypeEClass = createEClass(ALT_TYPE);

		andTypeEClass = createEClass(AND_TYPE);

		binaryExpressionTypeEClass = createEClass(BINARY_EXPRESSION_TYPE);
		createEAttribute(binaryExpressionTypeEClass, BINARY_EXPRESSION_TYPE__EXPRESSION_GROUP);
		createEAttribute(binaryExpressionTypeEClass, BINARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP);
		createEReference(binaryExpressionTypeEClass, BINARY_EXPRESSION_TYPE__EXPRESSION_LIST);

		binaryExtendedNodeTypeEClass = createEClass(BINARY_EXTENDED_NODE_TYPE);
		createEAttribute(binaryExtendedNodeTypeEClass, BINARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP);
		createEReference(binaryExtendedNodeTypeEClass, BINARY_EXTENDED_NODE_TYPE__FEATURE);
		createEReference(binaryExtendedNodeTypeEClass, BINARY_EXTENDED_NODE_TYPE__ALT);
		createEReference(binaryExtendedNodeTypeEClass, BINARY_EXTENDED_NODE_TYPE__OR);
		createEReference(binaryExtendedNodeTypeEClass, BINARY_EXTENDED_NODE_TYPE__AND);

		binaryNodeTypeEClass = createEClass(BINARY_NODE_TYPE);
		createEAttribute(binaryNodeTypeEClass, BINARY_NODE_TYPE__NODE_GROUP);
		createEAttribute(binaryNodeTypeEClass, BINARY_NODE_TYPE__NODE_LIST_GROUP);
		createEReference(binaryNodeTypeEClass, BINARY_NODE_TYPE__NODE_LIST);

		calculationsTypeEClass = createEClass(CALCULATIONS_TYPE);
		createEAttribute(calculationsTypeEClass, CALCULATIONS_TYPE__KEY);
		createEAttribute(calculationsTypeEClass, CALCULATIONS_TYPE__VALUE);

		commentsTypeEClass = createEClass(COMMENTS_TYPE);
		createEAttribute(commentsTypeEClass, COMMENTS_TYPE__C);

		conjTypeEClass = createEClass(CONJ_TYPE);

		constraintsTypeEClass = createEClass(CONSTRAINTS_TYPE);
		createEReference(constraintsTypeEClass, CONSTRAINTS_TYPE__RULE);

		disjTypeEClass = createEClass(DISJ_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NODE_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AND);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__C);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CALCULATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONJ);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXPRESSION_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTRAINTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DISJ);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EQ);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_ORDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GRAPHICS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VAR);

		eqTypeEClass = createEClass(EQ_TYPE);

		expressionEClass = createEClass(EXPRESSION);

		extendedFeatureModelTypeEClass = createEClass(EXTENDED_FEATURE_MODEL_TYPE);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__PROPERTIES);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__STRUCT);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__CONSTRAINTS);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__CALCULATIONS);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__COMMENTS);
		createEReference(extendedFeatureModelTypeEClass, EXTENDED_FEATURE_MODEL_TYPE__FEATURE_ORDER);

		extendedLeafTypeEClass = createEClass(EXTENDED_LEAF_TYPE);

		extendedNodeEClass = createEClass(EXTENDED_NODE);
		createEReference(extendedNodeEClass, EXTENDED_NODE__ATTRIBUTE);

		featureModelTypeEClass = createEClass(FEATURE_MODEL_TYPE);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__PROPERTIES);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__STRUCT);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__CONSTRAINTS);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__CALCULATIONS);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__COMMENTS);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__FEATURE_ORDER);

		featureOrderTypeEClass = createEClass(FEATURE_ORDER_TYPE);
		createEReference(featureOrderTypeEClass, FEATURE_ORDER_TYPE__FEATURE);
		createEAttribute(featureOrderTypeEClass, FEATURE_ORDER_TYPE__USER_DEFINED);

		featureTypeEClass = createEClass(FEATURE_TYPE);

		graphicsTypeEClass = createEClass(GRAPHICS_TYPE);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__KEY);
		createEAttribute(graphicsTypeEClass, GRAPHICS_TYPE__VALUE);

		impTypeEClass = createEClass(IMP_TYPE);

		leafTypeEClass = createEClass(LEAF_TYPE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__DESCRIPTION);
		createEReference(nodeEClass, NODE__GRAPHICS);
		createEAttribute(nodeEClass, NODE__ABSTRACT);
		createEAttribute(nodeEClass, NODE__HIDDEN);
		createEAttribute(nodeEClass, NODE__MANDATORY);
		createEAttribute(nodeEClass, NODE__NAME);

		notTypeEClass = createEClass(NOT_TYPE);

		orTypeEClass = createEClass(OR_TYPE);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__GROUP);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__GRAPHICS);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__CALCULATIONS);

		ruleTypeEClass = createEClass(RULE_TYPE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__DESCRIPTION);
		createEAttribute(ruleTypeEClass, RULE_TYPE__EXPRESSION_LIST_GROUP);
		createEReference(ruleTypeEClass, RULE_TYPE__EXPRESSION_LIST);

		structTypeEClass = createEClass(STRUCT_TYPE);
		createEAttribute(structTypeEClass, STRUCT_TYPE__NODE_LIST_GROUP);
		createEReference(structTypeEClass, STRUCT_TYPE__NODE_LIST);

		structType1EClass = createEClass(STRUCT_TYPE1);
		createEReference(structType1EClass, STRUCT_TYPE1__FEATURE);
		createEReference(structType1EClass, STRUCT_TYPE1__ALT);
		createEReference(structType1EClass, STRUCT_TYPE1__OR);
		createEReference(structType1EClass, STRUCT_TYPE1__AND);

		unaryExpressionTypeEClass = createEClass(UNARY_EXPRESSION_TYPE);
		createEAttribute(unaryExpressionTypeEClass, UNARY_EXPRESSION_TYPE__EXPRESSION_LIST_GROUP);
		createEReference(unaryExpressionTypeEClass, UNARY_EXPRESSION_TYPE__EXPRESSION_LIST);

		unaryExtendedNodeTypeEClass = createEClass(UNARY_EXTENDED_NODE_TYPE);
		createEAttribute(unaryExtendedNodeTypeEClass, UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP);
		createEReference(unaryExtendedNodeTypeEClass, UNARY_EXTENDED_NODE_TYPE__FEATURE);
		createEReference(unaryExtendedNodeTypeEClass, UNARY_EXTENDED_NODE_TYPE__ALT);
		createEReference(unaryExtendedNodeTypeEClass, UNARY_EXTENDED_NODE_TYPE__OR);
		createEReference(unaryExtendedNodeTypeEClass, UNARY_EXTENDED_NODE_TYPE__AND);

		unaryNodeTypeEClass = createEClass(UNARY_NODE_TYPE);
		createEAttribute(unaryNodeTypeEClass, UNARY_NODE_TYPE__NODE_GROUP);
		createEAttribute(unaryNodeTypeEClass, UNARY_NODE_TYPE__NODE_LIST_GROUP);
		createEReference(unaryNodeTypeEClass, UNARY_NODE_TYPE__NODE_LIST);

		varTypeEClass = createEClass(VAR_TYPE);
		createEAttribute(varTypeEClass, VAR_TYPE__MIXED);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		altTypeEClass.getESuperTypes().add(this.getBinaryNodeType());
		andTypeEClass.getESuperTypes().add(this.getUnaryNodeType());
		binaryExpressionTypeEClass.getESuperTypes().add(this.getExpression());
		binaryExtendedNodeTypeEClass.getESuperTypes().add(this.getExtendedNode());
		binaryNodeTypeEClass.getESuperTypes().add(this.getNode());
		conjTypeEClass.getESuperTypes().add(this.getBinaryExpressionType());
		disjTypeEClass.getESuperTypes().add(this.getBinaryExpressionType());
		eqTypeEClass.getESuperTypes().add(this.getBinaryExpressionType());
		extendedLeafTypeEClass.getESuperTypes().add(this.getExtendedNode());
		extendedNodeEClass.getESuperTypes().add(this.getNode());
		featureTypeEClass.getESuperTypes().add(this.getLeafType());
		impTypeEClass.getESuperTypes().add(this.getBinaryExpressionType());
		leafTypeEClass.getESuperTypes().add(this.getNode());
		notTypeEClass.getESuperTypes().add(this.getUnaryExpressionType());
		orTypeEClass.getESuperTypes().add(this.getBinaryNodeType());
		unaryExpressionTypeEClass.getESuperTypes().add(this.getExpression());
		unaryExtendedNodeTypeEClass.getESuperTypes().add(this.getExtendedNode());
		unaryNodeTypeEClass.getESuperTypes().add(this.getNode());
		varTypeEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(altTypeEClass, AltType.class, "AltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andTypeEClass, AndType.class, "AndType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryExpressionTypeEClass, BinaryExpressionType.class, "BinaryExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpressionType_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, -1, BinaryExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpressionType_ExpressionListGroup(), ecorePackage.getEFeatureMapEntry(), "expressionListGroup", null, 0, 2, BinaryExpressionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpressionType_ExpressionList(), this.getExpression(), null, "expressionList", null, 0, 2, BinaryExpressionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binaryExtendedNodeTypeEClass, BinaryExtendedNodeType.class, "BinaryExtendedNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExtendedNodeType_ExtendedNodeGroup(), ecorePackage.getEFeatureMapEntry(), "extendedNodeGroup", null, 0, -1, BinaryExtendedNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExtendedNodeType_Feature(), this.getExtendedLeafType(), null, "feature", null, 0, -1, BinaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExtendedNodeType_Alt(), this.getBinaryExtendedNodeType(), null, "alt", null, 0, -1, BinaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExtendedNodeType_Or(), this.getBinaryExtendedNodeType(), null, "or", null, 0, -1, BinaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExtendedNodeType_And(), this.getUnaryExtendedNodeType(), null, "and", null, 0, -1, BinaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binaryNodeTypeEClass, BinaryNodeType.class, "BinaryNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryNodeType_NodeGroup(), ecorePackage.getEFeatureMapEntry(), "nodeGroup", null, 0, -1, BinaryNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryNodeType_NodeListGroup(), ecorePackage.getEFeatureMapEntry(), "nodeListGroup", null, 2, -1, BinaryNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryNodeType_NodeList(), this.getNode(), null, "nodeList", null, 2, -1, BinaryNodeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calculationsTypeEClass, CalculationsType.class, "CalculationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculationsType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, CalculationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationsType_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, CalculationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentsTypeEClass, CommentsType.class, "CommentsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentsType_C(), theXMLTypePackage.getString(), "c", null, 0, -1, CommentsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjTypeEClass, ConjType.class, "ConjType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintsTypeEClass, ConstraintsType.class, "ConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsType_Rule(), this.getRuleType(), null, "rule", null, 0, -1, ConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjTypeEClass, DisjType.class, "DisjType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Alt(), this.getAltType(), null, "alt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NodeList(), this.getNode(), null, "nodeList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_And(), this.getAndType(), null, "and", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_C(), theXMLTypePackage.getString(), "c", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Calculations(), this.getCalculationsType(), null, "calculations", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Comments(), this.getCommentsType(), null, "comments", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Conj(), this.getConjType(), null, "conj", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExpressionList(), this.getExpression(), null, "expressionList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Description(), theXMLTypePackage.getString(), "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Disj(), this.getDisjType(), null, "disj", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Eq(), this.getEqType(), null, "eq", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtendedFeatureModel(), this.getExtendedFeatureModelType(), null, "extendedFeatureModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Feature(), this.getFeatureType(), null, "feature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureModel(), this.getFeatureModelType(), null, "featureModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureOrder(), this.getFeatureOrderType(), null, "featureOrder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Graphics(), this.getGraphicsType(), null, "graphics", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Imp(), this.getImpType(), null, "imp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Not(), this.getNotType(), null, "not", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Or(), this.getOrType(), null, "or", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Properties(), this.getPropertiesType(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rule(), this.getRuleType(), null, "rule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Var(), this.getVarType(), null, "var", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eqTypeEClass, EqType.class, "EqType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendedFeatureModelTypeEClass, ExtendedFeatureModelType.class, "ExtendedFeatureModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedFeatureModelType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedFeatureModelType_Struct(), this.getStructType1(), null, "struct", null, 1, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedFeatureModelType_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedFeatureModelType_Calculations(), this.getCalculationsType(), null, "calculations", null, 0, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedFeatureModelType_Comments(), this.getCommentsType(), null, "comments", null, 0, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedFeatureModelType_FeatureOrder(), this.getFeatureOrderType(), null, "featureOrder", null, 0, 1, ExtendedFeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedLeafTypeEClass, ExtendedLeafType.class, "ExtendedLeafType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendedNodeEClass, ExtendedNode.class, "ExtendedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedNode_Attribute(), ecorePackage.getEObject(), null, "attribute", null, 0, -1, ExtendedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureModelTypeEClass, FeatureModelType.class, "FeatureModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModelType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModelType_Struct(), this.getStructType(), null, "struct", null, 1, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModelType_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModelType_Calculations(), this.getCalculationsType(), null, "calculations", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModelType_Comments(), this.getCommentsType(), null, "comments", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModelType_FeatureOrder(), this.getFeatureOrderType(), null, "featureOrder", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOrderTypeEClass, FeatureOrderType.class, "FeatureOrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOrderType_Feature(), this.getLeafType(), null, "feature", null, 0, -1, FeatureOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureOrderType_UserDefined(), theXMLTypePackage.getBoolean(), "userDefined", null, 1, 1, FeatureOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureTypeEClass, FeatureType.class, "FeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicsTypeEClass, GraphicsType.class, "GraphicsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicsType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, GraphicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, GraphicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impTypeEClass, ImpType.class, "ImpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leafTypeEClass, LeafType.class, "LeafType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Graphics(), this.getGraphicsType(), null, "graphics", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Abstract(), theXMLTypePackage.getBoolean(), "abstract", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Hidden(), theXMLTypePackage.getBoolean(), "hidden", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Mandatory(), theXMLTypePackage.getBoolean(), "mandatory", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notTypeEClass, NotType.class, "NotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orTypeEClass, OrType.class, "OrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertiesType_Graphics(), this.getGraphicsType(), null, "graphics", null, 0, -1, PropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertiesType_Calculations(), this.getCalculationsType(), null, "calculations", null, 0, -1, PropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ruleTypeEClass, RuleType.class, "RuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_ExpressionListGroup(), ecorePackage.getEFeatureMapEntry(), "expressionListGroup", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_ExpressionList(), this.getExpression(), null, "expressionList", null, 0, 1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructType_NodeListGroup(), ecorePackage.getEFeatureMapEntry(), "nodeListGroup", null, 1, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType_NodeList(), this.getNode(), null, "nodeList", null, 1, 1, StructType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(structType1EClass, StructType1.class, "StructType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructType1_Feature(), this.getExtendedLeafType(), null, "feature", null, 0, 1, StructType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType1_Alt(), this.getBinaryExtendedNodeType(), null, "alt", null, 0, 1, StructType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType1_Or(), this.getBinaryExtendedNodeType(), null, "or", null, 0, 1, StructType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType1_And(), this.getUnaryExtendedNodeType(), null, "and", null, 0, 1, StructType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionTypeEClass, UnaryExpressionType.class, "UnaryExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpressionType_ExpressionListGroup(), ecorePackage.getEFeatureMapEntry(), "expressionListGroup", null, 0, 1, UnaryExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpressionType_ExpressionList(), this.getExpression(), null, "expressionList", null, 0, 1, UnaryExpressionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unaryExtendedNodeTypeEClass, UnaryExtendedNodeType.class, "UnaryExtendedNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExtendedNodeType_ExtendedNodeGroup(), ecorePackage.getEFeatureMapEntry(), "extendedNodeGroup", null, 0, -1, UnaryExtendedNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExtendedNodeType_Feature(), this.getExtendedLeafType(), null, "feature", null, 0, -1, UnaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExtendedNodeType_Alt(), this.getBinaryExtendedNodeType(), null, "alt", null, 0, -1, UnaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExtendedNodeType_Or(), this.getBinaryExtendedNodeType(), null, "or", null, 0, -1, UnaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExtendedNodeType_And(), this.getUnaryExtendedNodeType(), null, "and", null, 0, -1, UnaryExtendedNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unaryNodeTypeEClass, UnaryNodeType.class, "UnaryNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryNodeType_NodeGroup(), ecorePackage.getEFeatureMapEntry(), "nodeGroup", null, 0, -1, UnaryNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryNodeType_NodeListGroup(), ecorePackage.getEFeatureMapEntry(), "nodeListGroup", null, 1, -1, UnaryNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryNodeType_NodeList(), this.getNode(), null, "nodeList", null, 1, -1, UnaryNodeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (altTypeEClass,
		   source,
		   new String[] {
			   "name", "altType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (andTypeEClass,
		   source,
		   new String[] {
			   "name", "andType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (binaryExpressionTypeEClass,
		   source,
		   new String[] {
			   "name", "binaryExpressionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryExpressionType_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "ExpressionGroup:0"
		   });
		addAnnotation
		  (getBinaryExpressionType_ExpressionListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expressionList:group",
			   "namespace", "##targetNamespace",
			   "group", "ExpressionGroup:0"
		   });
		addAnnotation
		  (getBinaryExpressionType_ExpressionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expressionList",
			   "namespace", "##targetNamespace",
			   "group", "expressionList:group"
		   });
		addAnnotation
		  (binaryExtendedNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "binaryExtendedNodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryExtendedNodeType_ExtendedNodeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getBinaryExtendedNodeType_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feature",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getBinaryExtendedNodeType_Alt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alt",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getBinaryExtendedNodeType_Or(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "or",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getBinaryExtendedNodeType_And(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "and",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (binaryNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "binaryNodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinaryNodeType_NodeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "NodeGroup:6"
		   });
		addAnnotation
		  (getBinaryNodeType_NodeListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "nodeList:group",
			   "namespace", "##targetNamespace",
			   "group", "NodeGroup:6"
		   });
		addAnnotation
		  (getBinaryNodeType_NodeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeList",
			   "namespace", "##targetNamespace",
			   "group", "nodeList:group"
		   });
		addAnnotation
		  (calculationsTypeEClass,
		   source,
		   new String[] {
			   "name", "calculations_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getCalculationsType_Key(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCalculationsType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (commentsTypeEClass,
		   source,
		   new String[] {
			   "name", "comments_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommentsType_C(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "c",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (conjTypeEClass,
		   source,
		   new String[] {
			   "name", "conjType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (constraintsTypeEClass,
		   source,
		   new String[] {
			   "name", "constraints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConstraintsType_Rule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (disjTypeEClass,
		   source,
		   new String[] {
			   "name", "disjType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Alt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alt",
			   "namespace", "##targetNamespace",
			   "affiliation", "nodeList"
		   });
		addAnnotation
		  (getDocumentRoot_NodeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_And(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "and",
			   "namespace", "##targetNamespace",
			   "affiliation", "nodeList"
		   });
		addAnnotation
		  (getDocumentRoot_C(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "c",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Calculations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "calculations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Comments(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comments",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Conj(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conj",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (getDocumentRoot_ExpressionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expressionList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Constraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "constraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Disj(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "disj",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (getDocumentRoot_Eq(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eq",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (getDocumentRoot_ExtendedFeatureModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extendedFeatureModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feature",
			   "namespace", "##targetNamespace",
			   "affiliation", "nodeList"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "featureModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "featureOrder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Graphics(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "graphics",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Imp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "imp",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (getDocumentRoot_Not(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "not",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (getDocumentRoot_Or(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "or",
			   "namespace", "##targetNamespace",
			   "affiliation", "nodeList"
		   });
		addAnnotation
		  (getDocumentRoot_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Rule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace",
			   "affiliation", "expressionList"
		   });
		addAnnotation
		  (eqTypeEClass,
		   source,
		   new String[] {
			   "name", "eqType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (expressionEClass,
		   source,
		   new String[] {
			   "name", "expression",
			   "kind", "empty"
		   });
		addAnnotation
		  (extendedFeatureModelTypeEClass,
		   source,
		   new String[] {
			   "name", "extendedFeatureModel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_Struct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "struct",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_Constraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "constraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_Calculations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "calculations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_Comments(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comments",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedFeatureModelType_FeatureOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "featureOrder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (extendedLeafTypeEClass,
		   source,
		   new String[] {
			   "name", "extendedLeafType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (extendedNodeEClass,
		   source,
		   new String[] {
			   "name", "extendedNode",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtendedNode_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureModelTypeEClass,
		   source,
		   new String[] {
			   "name", "featureModel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureModelType_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureModelType_Struct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "struct",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureModelType_Constraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "constraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureModelType_Calculations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "calculations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureModelType_Comments(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comments",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureModelType_FeatureOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "featureOrder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureOrderTypeEClass,
		   source,
		   new String[] {
			   "name", "featureOrder_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureOrderType_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureOrderType_UserDefined(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "userDefined",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureTypeEClass,
		   source,
		   new String[] {
			   "name", "featureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (graphicsTypeEClass,
		   source,
		   new String[] {
			   "name", "graphics_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getGraphicsType_Key(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGraphicsType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (impTypeEClass,
		   source,
		   new String[] {
			   "name", "impType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (leafTypeEClass,
		   source,
		   new String[] {
			   "name", "leafType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "name", "node",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNode_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNode_Graphics(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "graphics",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNode_Abstract(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNode_Hidden(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hidden",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNode_Mandatory(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mandatory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNode_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (notTypeEClass,
		   source,
		   new String[] {
			   "name", "notType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (orTypeEClass,
		   source,
		   new String[] {
			   "name", "orType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (propertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "properties_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertiesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getPropertiesType_Graphics(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "graphics",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (getPropertiesType_Calculations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "calculations",
			   "namespace", "##targetNamespace",
			   "group", "group:0"
		   });
		addAnnotation
		  (ruleTypeEClass,
		   source,
		   new String[] {
			   "name", "rule_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRuleType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRuleType_ExpressionListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expressionList:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRuleType_ExpressionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expressionList",
			   "namespace", "##targetNamespace",
			   "group", "expressionList:group"
		   });
		addAnnotation
		  (structTypeEClass,
		   source,
		   new String[] {
			   "name", "struct_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStructType_NodeListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "nodeList:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStructType_NodeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeList",
			   "namespace", "##targetNamespace",
			   "group", "nodeList:group"
		   });
		addAnnotation
		  (structType1EClass,
		   source,
		   new String[] {
			   "name", "struct_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStructType1_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStructType1_Alt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStructType1_Or(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "or",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStructType1_And(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "and",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unaryExpressionTypeEClass,
		   source,
		   new String[] {
			   "name", "unaryExpressionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnaryExpressionType_ExpressionListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expressionList:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnaryExpressionType_ExpressionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expressionList",
			   "namespace", "##targetNamespace",
			   "group", "expressionList:group"
		   });
		addAnnotation
		  (unaryExtendedNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "unaryExtendedNodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnaryExtendedNodeType_ExtendedNodeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getUnaryExtendedNodeType_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feature",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getUnaryExtendedNodeType_Alt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alt",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getUnaryExtendedNodeType_Or(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "or",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (getUnaryExtendedNodeType_And(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "and",
			   "namespace", "##targetNamespace",
			   "group", "ExtendedNodeGroup:7"
		   });
		addAnnotation
		  (unaryNodeTypeEClass,
		   source,
		   new String[] {
			   "name", "unaryNodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnaryNodeType_NodeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "NodeGroup:6"
		   });
		addAnnotation
		  (getUnaryNodeType_NodeListGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "nodeList:group",
			   "namespace", "##targetNamespace",
			   "group", "NodeGroup:6"
		   });
		addAnnotation
		  (getUnaryNodeType_NodeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nodeList",
			   "namespace", "##targetNamespace",
			   "group", "nodeList:group"
		   });
		addAnnotation
		  (varTypeEClass,
		   source,
		   new String[] {
			   "name", "var_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getVarType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
	}

} //FeatureIDEXSDPackageImpl
