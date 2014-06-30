/**
 */
package psdstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.Map#getApikey <em>Apikey</em>}</li>
 *   <li>{@link psdstructure.Map#isClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getMap()
 * @model
 * @generated
 */
public interface Map extends View {

	/**
	 * Returns the value of the '<em><b>Apikey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apikey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apikey</em>' attribute.
	 * @see #setApikey(String)
	 * @see psdstructure.PsdstructurePackage#getMap_Apikey()
	 * @model
	 * @generated
	 */
	String getApikey();

	/**
	 * Sets the value of the '{@link psdstructure.Map#getApikey <em>Apikey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apikey</em>' attribute.
	 * @see #getApikey()
	 * @generated
	 */
	void setApikey(String value);

	/**
	 * Returns the value of the '<em><b>Clickable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clickable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clickable</em>' attribute.
	 * @see #setClickable(boolean)
	 * @see psdstructure.PsdstructurePackage#getMap_Clickable()
	 * @model
	 * @generated
	 */
	boolean isClickable();

	/**
	 * Sets the value of the '{@link psdstructure.Map#isClickable <em>Clickable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clickable</em>' attribute.
	 * @see #isClickable()
	 * @generated
	 */
	void setClickable(boolean value);
} // Map
