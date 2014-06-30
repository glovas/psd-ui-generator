/**
 */
package psdstructure;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Picker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.DatePicker#getMin <em>Min</em>}</li>
 *   <li>{@link psdstructure.DatePicker#getMax <em>Max</em>}</li>
 *   <li>{@link psdstructure.DatePicker#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getDatePicker()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defaultInRange'"
 * @generated
 */
public interface DatePicker extends View {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Date)
	 * @see psdstructure.PsdstructurePackage#getDatePicker_Min()
	 * @model
	 * @generated
	 */
	Date getMin();

	/**
	 * Sets the value of the '{@link psdstructure.DatePicker#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Date value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Date)
	 * @see psdstructure.PsdstructurePackage#getDatePicker_Max()
	 * @model
	 * @generated
	 */
	Date getMax();

	/**
	 * Sets the value of the '{@link psdstructure.DatePicker#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Date value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(Date)
	 * @see psdstructure.PsdstructurePackage#getDatePicker_Default()
	 * @model
	 * @generated
	 */
	Date getDefault();

	/**
	 * Sets the value of the '{@link psdstructure.DatePicker#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Date value);

} // DatePicker
