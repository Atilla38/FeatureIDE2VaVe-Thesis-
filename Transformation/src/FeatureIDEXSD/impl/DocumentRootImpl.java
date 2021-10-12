/**
 */
package FeatureIDEXSD.impl;

import FeatureIDEXSD.CalculationsType;
import FeatureIDEXSD.CommentsType;
import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.ExtendedFeatureModelType;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.FeatureOrderType;
import FeatureIDEXSD.GraphicsType;
import FeatureIDEXSD.PropertiesType;
import FeatureIDEXSD.RuleType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getC <em>C</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getExtendedFeatureModel <em>Extended Feature Model</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getFeatureOrder <em>Feature Order</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link FeatureIDEXSD.impl.DocumentRootImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final String C_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC() {
		return (String)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__C, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(String newC) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__C, newC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationsType getCalculations() {
		return (CalculationsType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CALCULATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculations(CalculationsType newCalculations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CALCULATIONS, newCalculations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculations(CalculationsType newCalculations) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CALCULATIONS, newCalculations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentsType getComments() {
		return (CommentsType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(CommentsType newComments, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__COMMENTS, newComments, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(CommentsType newComments) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return (ConstraintsType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONSTRAINTS, newConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONSTRAINTS, newConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedFeatureModelType getExtendedFeatureModel() {
		return (ExtendedFeatureModelType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedFeatureModel(ExtendedFeatureModelType newExtendedFeatureModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL, newExtendedFeatureModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedFeatureModel(ExtendedFeatureModelType newExtendedFeatureModel) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL, newExtendedFeatureModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelType getFeatureModel() {
		return (FeatureModelType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureModel(FeatureModelType newFeatureModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, newFeatureModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModelType newFeatureModel) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, newFeatureModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOrderType getFeatureOrder() {
		return (FeatureOrderType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureOrder(FeatureOrderType newFeatureOrder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_ORDER, newFeatureOrder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOrder(FeatureOrderType newFeatureOrder) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_ORDER, newFeatureOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsType getGraphics() {
		return (GraphicsType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__GRAPHICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphics(GraphicsType newGraphics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__GRAPHICS, newGraphics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphics(GraphicsType newGraphics) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__GRAPHICS, newGraphics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return (PropertiesType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getRule() {
		return (RuleType)getMixed().get(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(RuleType newRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__RULE, newRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(RuleType newRule) {
		((FeatureMap.Internal)getMixed()).set(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__RULE, newRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
				return basicSetCalculations(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
				return basicSetComments(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
				return basicSetExtendedFeatureModel(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return basicSetFeatureModel(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
				return basicSetFeatureOrder(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
				return basicSetGraphics(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
				return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__C:
				return getC();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
				return getCalculations();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
				return getComments();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return getConstraints();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
				return getExtendedFeatureModel();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return getFeatureModel();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
				return getFeatureOrder();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
				return getGraphics();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
				return getRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__C:
				setC((String)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
				setCalculations((CalculationsType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
				setComments((CommentsType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
				setExtendedFeatureModel((ExtendedFeatureModelType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
				setFeatureModel((FeatureModelType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
				setFeatureOrder((FeatureOrderType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
				setGraphics((GraphicsType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__C:
				setC(C_EDEFAULT);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
				setCalculations((CalculationsType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
				setComments((CommentsType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
				setExtendedFeatureModel((ExtendedFeatureModelType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
				setFeatureModel((FeatureModelType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
				setFeatureOrder((FeatureOrderType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
				setGraphics((GraphicsType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__C:
				return C_EDEFAULT == null ? getC() != null : !C_EDEFAULT.equals(getC());
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
				return getCalculations() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
				return getComments() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return getConstraints() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
				return getExtendedFeatureModel() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return getFeatureModel() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
				return getFeatureOrder() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
				return getGraphics() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties() != null;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
				return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
