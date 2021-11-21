/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.BinaryNodeType;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;

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
 * This is the item provider adapter for a {@link FeatureIDEXSD.BinaryNodeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryNodeTypeItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNodeTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP);
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
	 * This returns BinaryNodeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryNodeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BinaryNodeType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryNodeType_type") :
			getString("_UI_BinaryNodeType_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryNodeType.class)) {
			case FeatureIDEXSDPackage.BINARY_NODE_TYPE__NODE_GROUP:
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
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createNode())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createBinaryNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createAltType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createUnaryNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createAndType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createExtendedNode())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createBinaryExtendedNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createExtendedLeafType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createLeafType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createFeatureType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createOrType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST,
					 FeatureIDEXSDFactory.eINSTANCE.createUnaryExtendedNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT,
					 FeatureIDEXSDFactory.eINSTANCE.createAltType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND,
					 FeatureIDEXSDFactory.eINSTANCE.createAndType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE,
					 FeatureIDEXSDFactory.eINSTANCE.createFeatureType())));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_GROUP,
				 FeatureMapUtil.createEntry
					(FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR,
					 FeatureIDEXSDFactory.eINSTANCE.createOrType())));
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
			childFeature == FeatureIDEXSDPackage.Literals.BINARY_NODE_TYPE__NODE_LIST ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__ALT ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__AND ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__FEATURE ||
			childFeature == FeatureIDEXSDPackage.Literals.DOCUMENT_ROOT__OR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
