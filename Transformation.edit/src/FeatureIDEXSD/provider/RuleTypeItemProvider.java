/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.RuleType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link FeatureIDEXSD.RuleType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleTypeItemProvider 
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
	public RuleTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_RuleType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleType_description_feature", "_UI_RuleType_type"),
				 FeatureIDEXSDPackage.Literals.RULE_TYPE__DESCRIPTION,
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP);
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
	 * This returns RuleType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RuleType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RuleType)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_RuleType_type") :
			getString("_UI_RuleType_type") + " " + label;
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

		switch (notification.getFeatureID(RuleType.class)) {
			case FeatureIDEXSDPackage.RULE_TYPE__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FeatureIDEXSDPackage.RULE_TYPE__EXPRESSION_LIST_GROUP:
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
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createExpression())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createBinaryExpressionType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createConjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createDisjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createEqType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createImpType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createUnaryExpressionType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ,
					 FeatureIDEXSDFactory.eINSTANCE.createConjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ,
					 FeatureIDEXSDFactory.eINSTANCE.createDisjType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ,
					 FeatureIDEXSDFactory.eINSTANCE.createEqType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP,
					 FeatureIDEXSDFactory.eINSTANCE.createImpType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT,
					 FeatureIDEXSDFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__VAR,
					 FeatureIDEXSDFactory.eINSTANCE.createVarType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == FeatureIDEXSDPackage.Literals.RULE_TYPE__EXPRESSION_LIST ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__CONJ ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__DISJ ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__EQ ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__IMP ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__NOT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
