/**
 */
package psdstructure;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.Slider#getMax <em>Max</em>}</li>
 *   <li>{@link psdstructure.Slider#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getSlider()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defaultInRange maxIsBigger'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defaultInRange='(self.default >= 0) and (self.default <= self.max)' maxIsBigger='max > 0'"
 * @generated
 */
public interface Slider extends View {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see psdstructure.PsdstructurePackage#getSlider_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link psdstructure.Slider#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(int)
	 * @see psdstructure.PsdstructurePackage#getSlider_Default()
	 * @model
	 * @generated
	 */
	int getDefault();

	/**
	 * Sets the value of the '{@link psdstructure.Slider#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(int value);

} // Slider
