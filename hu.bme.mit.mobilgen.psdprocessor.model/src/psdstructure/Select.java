/**
 */
package psdstructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.Select#getDefault <em>Default</em>}</li>
 *   <li>{@link psdstructure.Select#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getSelect()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defaultInRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defaultInRange='(options->size() = 0) or (options->includes(default))'"
 * @generated
 */
public interface Select extends View {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SelectOption)
	 * @see psdstructure.PsdstructurePackage#getSelect_Default()
	 * @model
	 * @generated
	 */
	SelectOption getDefault();

	/**
	 * Sets the value of the '{@link psdstructure.Select#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SelectOption value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link psdstructure.SelectOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see psdstructure.PsdstructurePackage#getSelect_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectOption> getOptions();

} // Select
