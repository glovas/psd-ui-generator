/**
 */
package psdstructure;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.Grid#getCols <em>Cols</em>}</li>
 *   <li>{@link psdstructure.Grid#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getGrid()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='properChildrenCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot properChildrenCount='children->size() = (cols * rows)'"
 * @generated
 */
public interface Grid extends ViewGroup {
	/**
	 * Returns the value of the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' attribute.
	 * @see #setCols(int)
	 * @see psdstructure.PsdstructurePackage#getGrid_Cols()
	 * @model
	 * @generated
	 */
	int getCols();

	/**
	 * Sets the value of the '{@link psdstructure.Grid#getCols <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cols</em>' attribute.
	 * @see #getCols()
	 * @generated
	 */
	void setCols(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see psdstructure.PsdstructurePackage#getGrid_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link psdstructure.Grid#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

} // Grid
