/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FeatureIDEXSD.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_c_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_c_feature", "_UI_DocumentRoot_type"),
				 FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__C,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_description_feature", "_UI_DocumentRoot_type"),
				 FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NODE_LIST);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CALCULATIONS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__COMMENTS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXPRESSION_LIST);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONSTRAINTS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_ORDER);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__GRAPHICS);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__PROPERTIES);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__RULE);
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getC();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__C:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__ALT:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__NODE_LIST:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__AND:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CALCULATIONS:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__COMMENTS:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONJ:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXPRESSION_LIST:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__CONSTRAINTS:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__DISJ:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EQ:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_MODEL:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__FEATURE_ORDER:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__GRAPHICS:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__IMP:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__NOT:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__OR:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__PROPERTIES:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__RULE:
			case FeatureIDEXSDPackage.DOCUMENT_ROOT__VAR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT,
				 FeatureIDEXSDFactory.eINSTANCE.createAltType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND,
				 FeatureIDEXSDFactory.eINSTANCE.createAndType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CALCULATIONS,
				 FeatureIDEXSDFactory.eINSTANCE.createCalculationsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__COMMENTS,
				 FeatureIDEXSDFactory.eINSTANCE.createCommentsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ,
				 FeatureIDEXSDFactory.eINSTANCE.createConjType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONSTRAINTS,
				 FeatureIDEXSDFactory.eINSTANCE.createConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ,
				 FeatureIDEXSDFactory.eINSTANCE.createDisjType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ,
				 FeatureIDEXSDFactory.eINSTANCE.createEqType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EXTENDED_FEATURE_MODEL,
				 FeatureIDEXSDFactory.eINSTANCE.createExtendedFeatureModelType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE,
				 FeatureIDEXSDFactory.eINSTANCE.createFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL,
				 FeatureIDEXSDFactory.eINSTANCE.createFeatureModelType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE_ORDER,
				 FeatureIDEXSDFactory.eINSTANCE.createFeatureOrderType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__GRAPHICS,
				 FeatureIDEXSDFactory.eINSTANCE.createGraphicsType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP,
				 FeatureIDEXSDFactory.eINSTANCE.createImpType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT,
				 FeatureIDEXSDFactory.eINSTANCE.createNotType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR,
				 FeatureIDEXSDFactory.eINSTANCE.createOrType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__PROPERTIES,
				 FeatureIDEXSDFactory.eINSTANCE.createPropertiesType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__RULE,
				 FeatureIDEXSDFactory.eINSTANCE.createRuleType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR,
				 FeatureIDEXSDFactory.eINSTANCE.createVarType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FeatureIDEXSDEditPlugin.INSTANCE;
	}

}
