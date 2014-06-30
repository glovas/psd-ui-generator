/**
 */
package psdstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import psdstructure.AdView;
import psdstructure.PsdstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link psdstructure.impl.AdViewImpl#getUnitid <em>Unitid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdViewImpl extends ViewImpl implements AdView {
	/**
	 * The default value of the '{@link #getUnitid() <em>Unitid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitid()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnitid() <em>Unitid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitid()
	 * @generated
	 * @ordered
	 */
	protected String unitid = UNITID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsdstructurePackage.Literals.AD_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitid() {
		return unitid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitid(String newUnitid) {
		String oldUnitid = unitid;
		unitid = newUnitid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsdstructurePackage.AD_VIEW__UNITID, oldUnitid, unitid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsdstructurePackage.AD_VIEW__UNITID:
				return getUnitid();
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
			case PsdstructurePackage.AD_VIEW__UNITID:
				setUnitid((String)newValue);
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
			case PsdstructurePackage.AD_VIEW__UNITID:
				setUnitid(UNITID_EDEFAULT);
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
			case PsdstructurePackage.AD_VIEW__UNITID:
				return UNITID_EDEFAULT == null ? unitid != null : !UNITID_EDEFAULT.equals(unitid);
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
		result.append(" (unitid: ");
		result.append(unitid);
		result.append(')');
		return result.toString();
	}

} //AdViewImpl
