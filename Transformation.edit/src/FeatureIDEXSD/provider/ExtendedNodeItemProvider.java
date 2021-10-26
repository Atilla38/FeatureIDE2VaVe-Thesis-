/**
 */
package FeatureIDEXSD.provider;


import FeatureIDEXSD.ExtendedNode;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureIDEXSDPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FeatureIDEXSD.ExtendedNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedNodeItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedNodeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE);
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
	 * This returns ExtendedNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExtendedNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExtendedNode_type") :
			getString("_UI_ExtendedNode_type") + " " + label;
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

		switch (notification.getFeatureID(ExtendedNode.class)) {
			case FeatureIDEXSDPackage.EXTENDED_NODE__ATTRIBUTE:
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
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createBinaryNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createAltType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createUnaryNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createAndType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createBinaryExpressionType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createExtendedNode()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createBinaryExtendedNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createConjType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createDisjType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createEqType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createExtendedLeafType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createLeafType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createImpType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createUnaryExpressionType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createNotType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createOrType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 FeatureIDEXSDFactory.eINSTANCE.createUnaryExtendedNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureIDEXSDPackage.Literals.EXTENDED_NODE__ATTRIBUTE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));
	}

}
