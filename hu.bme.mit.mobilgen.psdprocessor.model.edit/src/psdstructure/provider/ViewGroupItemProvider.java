/**
 */
package psdstructure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import psdstructure.PsdstructureFactory;
import psdstructure.PsdstructurePackage;
import psdstructure.ViewGroup;

/**
 * This is the item provider adapter for a {@link psdstructure.ViewGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewGroupItemProvider
	extends ViewItemProvider
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
	public ViewGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN);
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
	 * This returns ViewGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ViewGroup)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewGroup_type") :
			getString("_UI_ViewGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ViewGroup.class)) {
			case PsdstructurePackage.VIEW_GROUP__CHILDREN:
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
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createViewGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createGrid()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createScroll()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createProgressSpinner()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createProgressBar()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createWebView()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createDatePicker()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createSlider()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(PsdstructurePackage.Literals.VIEW_GROUP__CHILDREN,
				 PsdstructureFactory.eINSTANCE.createAdView()));
	}

}
