/**
 */
package psdstructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import psdstructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsdstructureFactoryImpl extends EFactoryImpl implements PsdstructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsdstructureFactory init() {
		try {
			PsdstructureFactory thePsdstructureFactory = (PsdstructureFactory)EPackage.Registry.INSTANCE.getEFactory(PsdstructurePackage.eNS_URI);
			if (thePsdstructureFactory != null) {
				return thePsdstructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsdstructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsdstructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PsdstructurePackage.VECTOR: return createVector();
			case PsdstructurePackage.VIEW_GROUP: return createViewGroup();
			case PsdstructurePackage.BUTTON: return createButton();
			case PsdstructurePackage.BACKGROUND_IMAGE: return createBackgroundImage();
			case PsdstructurePackage.GRID: return createGrid();
			case PsdstructurePackage.SCROLL: return createScroll();
			case PsdstructurePackage.PROGRESS_SPINNER: return createProgressSpinner();
			case PsdstructurePackage.IMAGE: return createImage();
			case PsdstructurePackage.TEXT: return createText();
			case PsdstructurePackage.SELECT: return createSelect();
			case PsdstructurePackage.PROGRESS_BAR: return createProgressBar();
			case PsdstructurePackage.WEB_VIEW: return createWebView();
			case PsdstructurePackage.DATE_PICKER: return createDatePicker();
			case PsdstructurePackage.SLIDER: return createSlider();
			case PsdstructurePackage.SWITCH: return createSwitch();
			case PsdstructurePackage.CHECKBOX: return createCheckbox();
			case PsdstructurePackage.MAP: return createMap();
			case PsdstructurePackage.RADIO_BUTTON: return createRadioButton();
			case PsdstructurePackage.AD_VIEW: return createAdView();
			case PsdstructurePackage.SELECT_OPTION: return createSelectOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroup createViewGroup() {
		ViewGroupImpl viewGroup = new ViewGroupImpl();
		return viewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundImage createBackgroundImage() {
		BackgroundImageImpl backgroundImage = new BackgroundImageImpl();
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scroll createScroll() {
		ScrollImpl scroll = new ScrollImpl();
		return scroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressSpinner createProgressSpinner() {
		ProgressSpinnerImpl progressSpinner = new ProgressSpinnerImpl();
		return progressSpinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar createProgressBar() {
		ProgressBarImpl progressBar = new ProgressBarImpl();
		return progressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebView createWebView() {
		WebViewImpl webView = new WebViewImpl();
		return webView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePicker createDatePicker() {
		DatePickerImpl datePicker = new DatePickerImpl();
		return datePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slider createSlider() {
		SliderImpl slider = new SliderImpl();
		return slider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdView createAdView() {
		AdViewImpl adView = new AdViewImpl();
		return adView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectOption createSelectOption() {
		SelectOptionImpl selectOption = new SelectOptionImpl();
		return selectOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsdstructurePackage getPsdstructurePackage() {
		return (PsdstructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsdstructurePackage getPackage() {
		return PsdstructurePackage.eINSTANCE;
	}

} //PsdstructureFactoryImpl
