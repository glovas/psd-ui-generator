/**
 */
package psdstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import psdstructure.Map;
import psdstructure.PsdstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link psdstructure.impl.MapImpl#getApikey <em>Apikey</em>}</li>
 *   <li>{@link psdstructure.impl.MapImpl#isClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends ViewImpl implements Map {
	/**
	 * The default value of the '{@link #getApikey() <em>Apikey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApikey()
	 * @generated
	 * @ordered
	 */
	protected static final String APIKEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApikey() <em>Apikey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApikey()
	 * @generated
	 * @ordered
	 */
	protected String apikey = APIKEY_EDEFAULT;
	/**
	 * The default value of the '{@link #isClickable() <em>Clickable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClickable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLICKABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isClickable() <em>Clickable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClickable()
	 * @generated
	 * @ordered
	 */
	protected boolean clickable = CLICKABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsdstructurePackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApikey() {
		return apikey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApikey(String newApikey) {
		String oldApikey = apikey;
		apikey = newApikey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsdstructurePackage.MAP__APIKEY, oldApikey, apikey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClickable() {
		return clickable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickable(boolean newClickable) {
		boolean oldClickable = clickable;
		clickable = newClickable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsdstructurePackage.MAP__CLICKABLE, oldClickable, clickable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsdstructurePackage.MAP__APIKEY:
				return getApikey();
			case PsdstructurePackage.MAP__CLICKABLE:
				return isClickable();
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
			case PsdstructurePackage.MAP__APIKEY:
				setApikey((String)newValue);
				return;
			case PsdstructurePackage.MAP__CLICKABLE:
				setClickable((Boolean)newValue);
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
			case PsdstructurePackage.MAP__APIKEY:
				setApikey(APIKEY_EDEFAULT);
				return;
			case PsdstructurePackage.MAP__CLICKABLE:
				setClickable(CLICKABLE_EDEFAULT);
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
			case PsdstructurePackage.MAP__APIKEY:
				return APIKEY_EDEFAULT == null ? apikey != null : !APIKEY_EDEFAULT.equals(apikey);
			case PsdstructurePackage.MAP__CLICKABLE:
				return clickable != CLICKABLE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (apikey: ");
		result.append(apikey);
		result.append(", clickable: ");
		result.append(clickable);
		result.append(')');
		return result.toString();
	}

} //MapImpl
