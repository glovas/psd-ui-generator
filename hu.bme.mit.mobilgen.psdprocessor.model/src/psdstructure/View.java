/**
 */
package psdstructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psdstructure.View#getID <em>ID</em>}</li>
 *   <li>{@link psdstructure.View#getPos <em>Pos</em>}</li>
 *   <li>{@link psdstructure.View#getSize <em>Size</em>}</li>
 *   <li>{@link psdstructure.View#getBackgrounds <em>Backgrounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see psdstructure.PsdstructurePackage#getView()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNegativePosition uniqueID validID'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonNegativePosition='pos.x >= 0 and pos.y >= 0' uniqueID='View.allInstances()->select(v:View|v.ID=self.ID)->size() = 1'"
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see psdstructure.PsdstructurePackage#getView_ID()
	 * @model default=""
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link psdstructure.View#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(Vector)
	 * @see psdstructure.PsdstructurePackage#getView_Pos()
	 * @model containment="true"
	 * @generated
	 */
	Vector getPos();

	/**
	 * Sets the value of the '{@link psdstructure.View#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Vector value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Vector)
	 * @see psdstructure.PsdstructurePackage#getView_Size()
	 * @model containment="true"
	 * @generated
	 */
	Vector getSize();

	/**
	 * Sets the value of the '{@link psdstructure.View#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Vector value);

	/**
	 * Returns the value of the '<em><b>Backgrounds</b></em>' containment reference list.
	 * The list contents are of type {@link psdstructure.BackgroundImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backgrounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backgrounds</em>' containment reference list.
	 * @see psdstructure.PsdstructurePackage#getView_Backgrounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<BackgroundImage> getBackgrounds();

} // View
