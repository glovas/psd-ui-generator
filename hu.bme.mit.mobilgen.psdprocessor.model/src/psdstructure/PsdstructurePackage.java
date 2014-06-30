/**
 */
package psdstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see psdstructure.PsdstructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PsdstructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psdstructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.mobilgen.layoutgenerator.psdprocessor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.mobilgen.layoutgenerator.psdprocessor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsdstructurePackage eINSTANCE = psdstructure.impl.PsdstructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link psdstructure.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ViewImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__POS = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BACKGROUNDS = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.VectorImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__Y = 1;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ViewGroupImpl <em>View Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ViewGroupImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getViewGroup()
	 * @generated
	 */
	int VIEW_GROUP = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__CHILDREN = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ButtonImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.BackgroundImageImpl <em>Background Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.BackgroundImageImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getBackgroundImage()
	 * @generated
	 */
	int BACKGROUND_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__POS = 2;

	/**
	 * The number of structural features of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.GridImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ID = VIEW_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__POS = VIEW_GROUP__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__SIZE = VIEW_GROUP__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__BACKGROUNDS = VIEW_GROUP__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__CHILDREN = VIEW_GROUP__CHILDREN;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__COLS = VIEW_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ROWS = VIEW_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = VIEW_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ScrollImpl <em>Scroll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ScrollImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getScroll()
	 * @generated
	 */
	int SCROLL = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__ID = VIEW_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__POS = VIEW_GROUP__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__SIZE = VIEW_GROUP__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__BACKGROUNDS = VIEW_GROUP__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__CHILDREN = VIEW_GROUP__CHILDREN;

	/**
	 * The number of structural features of the '<em>Scroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_FEATURE_COUNT = VIEW_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_OPERATION_COUNT = VIEW_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ProgressSpinnerImpl <em>Progress Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ProgressSpinnerImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getProgressSpinner()
	 * @generated
	 */
	int PROGRESS_SPINNER = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The number of structural features of the '<em>Progress Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Progress Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_SPINNER_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ImageImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.TextImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__EDITABLE = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TYPE = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.SelectImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DEFAULT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__OPTIONS = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.ProgressBarImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getProgressBar()
	 * @generated
	 */
	int PROGRESS_BAR = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.WebViewImpl <em>Web View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.WebViewImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getWebView()
	 * @generated
	 */
	int WEB_VIEW = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW__URL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.DatePickerImpl <em>Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.DatePickerImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getDatePicker()
	 * @generated
	 */
	int DATE_PICKER = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__MIN = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__MAX = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__DEFAULT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.SliderImpl <em>Slider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.SliderImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getSlider()
	 * @generated
	 */
	int SLIDER = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__MAX = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DEFAULT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.SwitchImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SELECTED = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.CheckboxImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__VALUE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__SELECTED = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.MapImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Apikey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__APIKEY = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CLICKABLE = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.RadioButtonImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VALUE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SELECTED = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.AdViewImpl <em>Ad View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.AdViewImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getAdView()
	 * @generated
	 */
	int AD_VIEW = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW__POS = VIEW__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW__SIZE = VIEW__SIZE;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW__BACKGROUNDS = VIEW__BACKGROUNDS;

	/**
	 * The feature id for the '<em><b>Unitid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW__UNITID = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ad View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ad View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psdstructure.impl.SelectOptionImpl <em>Select Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psdstructure.impl.SelectOptionImpl
	 * @see psdstructure.impl.PsdstructurePackageImpl#getSelectOption()
	 * @generated
	 */
	int SELECT_OPTION = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Select Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Select Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link psdstructure.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see psdstructure.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.View#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see psdstructure.View#getID()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ID();

	/**
	 * Returns the meta object for the containment reference '{@link psdstructure.View#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see psdstructure.View#getPos()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Pos();

	/**
	 * Returns the meta object for the containment reference '{@link psdstructure.View#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see psdstructure.View#getSize()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link psdstructure.View#getBackgrounds <em>Backgrounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Backgrounds</em>'.
	 * @see psdstructure.View#getBackgrounds()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Backgrounds();

	/**
	 * Returns the meta object for class '{@link psdstructure.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see psdstructure.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Vector#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see psdstructure.Vector#getX()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_X();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Vector#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see psdstructure.Vector#getY()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Y();

	/**
	 * Returns the meta object for class '{@link psdstructure.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Group</em>'.
	 * @see psdstructure.ViewGroup
	 * @generated
	 */
	EClass getViewGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link psdstructure.ViewGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see psdstructure.ViewGroup#getChildren()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Children();

	/**
	 * Returns the meta object for class '{@link psdstructure.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see psdstructure.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see psdstructure.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for class '{@link psdstructure.BackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Image</em>'.
	 * @see psdstructure.BackgroundImage
	 * @generated
	 */
	EClass getBackgroundImage();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.BackgroundImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see psdstructure.BackgroundImage#getImage()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EAttribute getBackgroundImage_Image();

	/**
	 * Returns the meta object for the containment reference '{@link psdstructure.BackgroundImage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see psdstructure.BackgroundImage#getSize()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EReference getBackgroundImage_Size();

	/**
	 * Returns the meta object for the containment reference '{@link psdstructure.BackgroundImage#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see psdstructure.BackgroundImage#getPos()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EReference getBackgroundImage_Pos();

	/**
	 * Returns the meta object for class '{@link psdstructure.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see psdstructure.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Grid#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see psdstructure.Grid#getCols()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Cols();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Grid#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see psdstructure.Grid#getRows()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Rows();

	/**
	 * Returns the meta object for class '{@link psdstructure.Scroll <em>Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll</em>'.
	 * @see psdstructure.Scroll
	 * @generated
	 */
	EClass getScroll();

	/**
	 * Returns the meta object for class '{@link psdstructure.ProgressSpinner <em>Progress Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Spinner</em>'.
	 * @see psdstructure.ProgressSpinner
	 * @generated
	 */
	EClass getProgressSpinner();

	/**
	 * Returns the meta object for class '{@link psdstructure.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see psdstructure.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link psdstructure.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see psdstructure.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see psdstructure.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Text#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see psdstructure.Text#isEditable()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Editable();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Text#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see psdstructure.Text#getType()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Type();

	/**
	 * Returns the meta object for class '{@link psdstructure.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see psdstructure.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the reference '{@link psdstructure.Select#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see psdstructure.Select#getDefault()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link psdstructure.Select#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see psdstructure.Select#getOptions()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Options();

	/**
	 * Returns the meta object for class '{@link psdstructure.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see psdstructure.ProgressBar
	 * @generated
	 */
	EClass getProgressBar();

	/**
	 * Returns the meta object for class '{@link psdstructure.WebView <em>Web View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web View</em>'.
	 * @see psdstructure.WebView
	 * @generated
	 */
	EClass getWebView();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.WebView#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see psdstructure.WebView#getUrl()
	 * @see #getWebView()
	 * @generated
	 */
	EAttribute getWebView_Url();

	/**
	 * Returns the meta object for class '{@link psdstructure.DatePicker <em>Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker</em>'.
	 * @see psdstructure.DatePicker
	 * @generated
	 */
	EClass getDatePicker();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.DatePicker#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see psdstructure.DatePicker#getMin()
	 * @see #getDatePicker()
	 * @generated
	 */
	EAttribute getDatePicker_Min();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.DatePicker#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see psdstructure.DatePicker#getMax()
	 * @see #getDatePicker()
	 * @generated
	 */
	EAttribute getDatePicker_Max();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.DatePicker#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see psdstructure.DatePicker#getDefault()
	 * @see #getDatePicker()
	 * @generated
	 */
	EAttribute getDatePicker_Default();

	/**
	 * Returns the meta object for class '{@link psdstructure.Slider <em>Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider</em>'.
	 * @see psdstructure.Slider
	 * @generated
	 */
	EClass getSlider();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Slider#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see psdstructure.Slider#getMax()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_Max();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Slider#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see psdstructure.Slider#getDefault()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_Default();

	/**
	 * Returns the meta object for class '{@link psdstructure.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see psdstructure.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Switch#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see psdstructure.Switch#isSelected()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Selected();

	/**
	 * Returns the meta object for class '{@link psdstructure.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see psdstructure.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Checkbox#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psdstructure.Checkbox#getValue()
	 * @see #getCheckbox()
	 * @generated
	 */
	EAttribute getCheckbox_Value();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Checkbox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see psdstructure.Checkbox#isSelected()
	 * @see #getCheckbox()
	 * @generated
	 */
	EAttribute getCheckbox_Selected();

	/**
	 * Returns the meta object for class '{@link psdstructure.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see psdstructure.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Map#getApikey <em>Apikey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apikey</em>'.
	 * @see psdstructure.Map#getApikey()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Apikey();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.Map#isClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clickable</em>'.
	 * @see psdstructure.Map#isClickable()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Clickable();

	/**
	 * Returns the meta object for class '{@link psdstructure.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see psdstructure.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.RadioButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psdstructure.RadioButton#getValue()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Value();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.RadioButton#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see psdstructure.RadioButton#isSelected()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Selected();

	/**
	 * Returns the meta object for class '{@link psdstructure.AdView <em>Ad View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ad View</em>'.
	 * @see psdstructure.AdView
	 * @generated
	 */
	EClass getAdView();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.AdView#getUnitid <em>Unitid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unitid</em>'.
	 * @see psdstructure.AdView#getUnitid()
	 * @see #getAdView()
	 * @generated
	 */
	EAttribute getAdView_Unitid();

	/**
	 * Returns the meta object for class '{@link psdstructure.SelectOption <em>Select Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Option</em>'.
	 * @see psdstructure.SelectOption
	 * @generated
	 */
	EClass getSelectOption();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.SelectOption#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see psdstructure.SelectOption#getLabel()
	 * @see #getSelectOption()
	 * @generated
	 */
	EAttribute getSelectOption_Label();

	/**
	 * Returns the meta object for the attribute '{@link psdstructure.SelectOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psdstructure.SelectOption#getValue()
	 * @see #getSelectOption()
	 * @generated
	 */
	EAttribute getSelectOption_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PsdstructureFactory getPsdstructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link psdstructure.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ViewImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_ID();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__POS = eINSTANCE.getView_Pos();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SIZE = eINSTANCE.getView_Size();

		/**
		 * The meta object literal for the '<em><b>Backgrounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BACKGROUNDS = eINSTANCE.getView_Backgrounds();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.VectorImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__X = eINSTANCE.getVector_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__Y = eINSTANCE.getVector_Y();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ViewGroupImpl <em>View Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ViewGroupImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getViewGroup()
		 * @generated
		 */
		EClass VIEW_GROUP = eINSTANCE.getViewGroup();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__CHILDREN = eINSTANCE.getViewGroup_Children();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ButtonImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.BackgroundImageImpl <em>Background Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.BackgroundImageImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getBackgroundImage()
		 * @generated
		 */
		EClass BACKGROUND_IMAGE = eINSTANCE.getBackgroundImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_IMAGE__IMAGE = eINSTANCE.getBackgroundImage_Image();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_IMAGE__SIZE = eINSTANCE.getBackgroundImage_Size();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_IMAGE__POS = eINSTANCE.getBackgroundImage_Pos();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.GridImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__COLS = eINSTANCE.getGrid_Cols();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ROWS = eINSTANCE.getGrid_Rows();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ScrollImpl <em>Scroll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ScrollImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getScroll()
		 * @generated
		 */
		EClass SCROLL = eINSTANCE.getScroll();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ProgressSpinnerImpl <em>Progress Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ProgressSpinnerImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getProgressSpinner()
		 * @generated
		 */
		EClass PROGRESS_SPINNER = eINSTANCE.getProgressSpinner();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ImageImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.TextImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__EDITABLE = eINSTANCE.getText_Editable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TYPE = eINSTANCE.getText_Type();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.SelectImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__DEFAULT = eINSTANCE.getSelect_Default();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__OPTIONS = eINSTANCE.getSelect_Options();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.ProgressBarImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getProgressBar()
		 * @generated
		 */
		EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.WebViewImpl <em>Web View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.WebViewImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getWebView()
		 * @generated
		 */
		EClass WEB_VIEW = eINSTANCE.getWebView();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_VIEW__URL = eINSTANCE.getWebView_Url();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.DatePickerImpl <em>Date Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.DatePickerImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getDatePicker()
		 * @generated
		 */
		EClass DATE_PICKER = eINSTANCE.getDatePicker();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER__MIN = eINSTANCE.getDatePicker_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER__MAX = eINSTANCE.getDatePicker_Max();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER__DEFAULT = eINSTANCE.getDatePicker_Default();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.SliderImpl <em>Slider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.SliderImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getSlider()
		 * @generated
		 */
		EClass SLIDER = eINSTANCE.getSlider();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__MAX = eINSTANCE.getSlider_Max();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__DEFAULT = eINSTANCE.getSlider_Default();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.SwitchImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__SELECTED = eINSTANCE.getSwitch_Selected();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.CheckboxImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKBOX__VALUE = eINSTANCE.getCheckbox_Value();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKBOX__SELECTED = eINSTANCE.getCheckbox_Selected();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.MapImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Apikey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__APIKEY = eINSTANCE.getMap_Apikey();

		/**
		 * The meta object literal for the '<em><b>Clickable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__CLICKABLE = eINSTANCE.getMap_Clickable();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.RadioButtonImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__VALUE = eINSTANCE.getRadioButton_Value();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__SELECTED = eINSTANCE.getRadioButton_Selected();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.AdViewImpl <em>Ad View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.AdViewImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getAdView()
		 * @generated
		 */
		EClass AD_VIEW = eINSTANCE.getAdView();

		/**
		 * The meta object literal for the '<em><b>Unitid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD_VIEW__UNITID = eINSTANCE.getAdView_Unitid();

		/**
		 * The meta object literal for the '{@link psdstructure.impl.SelectOptionImpl <em>Select Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psdstructure.impl.SelectOptionImpl
		 * @see psdstructure.impl.PsdstructurePackageImpl#getSelectOption()
		 * @generated
		 */
		EClass SELECT_OPTION = eINSTANCE.getSelectOption();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_OPTION__LABEL = eINSTANCE.getSelectOption_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_OPTION__VALUE = eINSTANCE.getSelectOption_Value();

	}

} //PsdstructurePackage
