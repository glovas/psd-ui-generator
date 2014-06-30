/**
 */
package psdstructure.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import psdstructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see psdstructure.PsdstructurePackage
 * @generated
 */
public class PsdstructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PsdstructureValidator INSTANCE = new PsdstructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "psdstructure";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsdstructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PsdstructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PsdstructurePackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case PsdstructurePackage.VECTOR:
				return validateVector((Vector)value, diagnostics, context);
			case PsdstructurePackage.VIEW_GROUP:
				return validateViewGroup((ViewGroup)value, diagnostics, context);
			case PsdstructurePackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case PsdstructurePackage.BACKGROUND_IMAGE:
				return validateBackgroundImage((BackgroundImage)value, diagnostics, context);
			case PsdstructurePackage.GRID:
				return validateGrid((Grid)value, diagnostics, context);
			case PsdstructurePackage.SCROLL:
				return validateScroll((Scroll)value, diagnostics, context);
			case PsdstructurePackage.PROGRESS_SPINNER:
				return validateProgressSpinner((ProgressSpinner)value, diagnostics, context);
			case PsdstructurePackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case PsdstructurePackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case PsdstructurePackage.SELECT:
				return validateSelect((Select)value, diagnostics, context);
			case PsdstructurePackage.PROGRESS_BAR:
				return validateProgressBar((ProgressBar)value, diagnostics, context);
			case PsdstructurePackage.WEB_VIEW:
				return validateWebView((WebView)value, diagnostics, context);
			case PsdstructurePackage.DATE_PICKER:
				return validateDatePicker((DatePicker)value, diagnostics, context);
			case PsdstructurePackage.SLIDER:
				return validateSlider((Slider)value, diagnostics, context);
			case PsdstructurePackage.SWITCH:
				return validateSwitch((Switch)value, diagnostics, context);
			case PsdstructurePackage.CHECKBOX:
				return validateCheckbox((Checkbox)value, diagnostics, context);
			case PsdstructurePackage.MAP:
				return validateMap((psdstructure.Map)value, diagnostics, context);
			case PsdstructurePackage.RADIO_BUTTON:
				return validateRadioButton((RadioButton)value, diagnostics, context);
			case PsdstructurePackage.AD_VIEW:
				return validateAdView((AdView)value, diagnostics, context);
			case PsdstructurePackage.SELECT_OPTION:
				return validateSelectOption((SelectOption)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(view, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(view, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonNegativePosition constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW__NON_NEGATIVE_POSITION__EEXPRESSION = "pos.x >= 0 and pos.y >= 0";

	/**
	 * Validates the validID constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateView_validID(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!view.getID().matches("^([a-zA-Z]{1})([a-zA-Z0-9_]*)$")) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validID", getObjectLabel(view, context) },
						 new Object[] { view },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the nonNegativePosition constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView_nonNegativePosition(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.VIEW,
				 view,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonNegativePosition",
				 VIEW__NON_NEGATIVE_POSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueID constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW__UNIQUE_ID__EEXPRESSION = "View.allInstances()->select(v:View|v.ID=self.ID)->size() = 1";

	/**
	 * Validates the uniqueID constraint of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView_uniqueID(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.VIEW,
				 view,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueID",
				 VIEW__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVector(Vector vector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(viewGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(button, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(button, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundImage(BackgroundImage backgroundImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backgroundImage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrid(Grid grid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(grid, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrid_properChildrenCount(grid, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the properChildrenCount constraint of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRID__PROPER_CHILDREN_COUNT__EEXPRESSION = "children->size() = (cols * rows)";

	/**
	 * Validates the properChildrenCount constraint of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrid_properChildrenCount(Grid grid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.GRID,
				 grid,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "properChildrenCount",
				 GRID__PROPER_CHILDREN_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScroll(Scroll scroll, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scroll, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(scroll, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(scroll, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressSpinner(ProgressSpinner progressSpinner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(progressSpinner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(progressSpinner, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(progressSpinner, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(image, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(image, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(image, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(image, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(text, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelect(Select select, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(select, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(select, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(select, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(select, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(select, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(select, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelect_defaultInRange(select, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the defaultInRange constraint of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECT__DEFAULT_IN_RANGE__EEXPRESSION = "(options->size() = 0) or (options->includes(default))";

	/**
	 * Validates the defaultInRange constraint of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelect_defaultInRange(Select select, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.SELECT,
				 select,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "defaultInRange",
				 SELECT__DEFAULT_IN_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressBar(ProgressBar progressBar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(progressBar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(progressBar, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(progressBar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebView(WebView webView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(webView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(webView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePicker(DatePicker datePicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datePicker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(datePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePicker_defaultInRange(datePicker, diagnostics, context);
		return result;
	}

	/**
	 * Validates the defaultInRange constraint of '<em>Date Picker</em>'.
	 * <!-- begin-user-doc -->
	 * Checks if the default date is in the range
	 * <!-- end-user-doc -->
	 */
	public boolean validateDatePicker_defaultInRange(DatePicker datePicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		
		if ((datePicker.getDefault().after(datePicker.getMin()) && datePicker.getDefault().before(datePicker.getMax()))
			|| datePicker.getDefault().equals(datePicker.getMax())
			|| datePicker.getDefault().equals(datePicker.getMin())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "defaultInRange", getObjectLabel(datePicker, context) },
						 new Object[] { datePicker },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlider(Slider slider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlider_defaultInRange(slider, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlider_maxIsBigger(slider, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the defaultInRange constraint of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLIDER__DEFAULT_IN_RANGE__EEXPRESSION = "(self.default >= 0) and (self.default <= self.max)";

	/**
	 * Validates the defaultInRange constraint of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlider_defaultInRange(Slider slider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.SLIDER,
				 slider,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "defaultInRange",
				 SLIDER__DEFAULT_IN_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxIsBigger constraint of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLIDER__MAX_IS_BIGGER__EEXPRESSION = "max > 0";

	/**
	 * Validates the maxIsBigger constraint of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlider_maxIsBigger(Slider slider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PsdstructurePackage.Literals.SLIDER,
				 slider,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxIsBigger",
				 SLIDER__MAX_IS_BIGGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switch_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(switch_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckbox(Checkbox checkbox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(checkbox, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(checkbox, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(checkbox, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(psdstructure.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(map, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(map, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(map, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(map, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(map, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(map, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioButton(RadioButton radioButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(radioButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(radioButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(radioButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdView(AdView adView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_nonNegativePosition(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_uniqueID(adView, diagnostics, context);
		if (result || diagnostics != null) result &= validateView_validID(adView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectOption(SelectOption selectOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectOption, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PsdstructureValidator
