/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;
import FeatureIDEXSD.UnaryExtendedNodeType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FeatureIDEXSD.UnaryExtendedNodeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExtendedNodeTypeItemProvider extends ExtendedNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExtendedNodeTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP);
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
	 * This returns UnaryExtendedNodeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryExtendedNodeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnaryExtendedNodeType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnaryExtendedNodeType_type") :
			getString("_UI_UnaryExtendedNodeType_type") + " " + label;
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

		switch (notification.getFeatureID(UnaryExtendedNodeType.class)) {
			case FeatureIDEXSDPackage.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP:
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
				(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__FEATURE,
					 FeatureIDEXSDFactory.eINSTANCE.createExtendedLeafType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__ALT,
					 FeatureIDEXSDFactory.eINSTANCE.createBinaryExtendedNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__OR,
					 FeatureIDEXSDFactory.eINSTANCE.createBinaryExtendedNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__EXTENDED_NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__AND,
					 FeatureIDEXSDFactory.eINSTANCE.createUnaryExtendedNodeType())));
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
			childFeature == FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE ||
			childFeature == FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__ALT ||
			childFeature == FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__OR ||
			childFeature == FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__FEATURE ||
			childFeature == FeatureIDEXSDPackage.Literals.UNARY_EXTENDED_NODE_TYPE__AND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
