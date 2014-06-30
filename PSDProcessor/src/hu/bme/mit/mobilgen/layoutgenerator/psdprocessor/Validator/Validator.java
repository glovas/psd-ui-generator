package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor.Validator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import psdstructure.View;

public class Validator {
	
	private Diagnostic diag = null;
	private String modelname = "";
	
	public void validate(View model) {

		// initialize OCL
		org.eclipse.ocl.examples.pivot.OCL.initialize(null);

		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLValidationDelegateFactory.Global());

		OCLinEcoreStandaloneSetup.doSetup();
		// install the OCL standard library
		OCLstdlib.install();
		
		// do diagnostic
		diag = Diagnostician.INSTANCE.validate(model);
		modelname = model.getID();
	}
	
	public boolean displayErrors(){
		if(diag == null || diag.getChildren().size() == 0){
			return false;
		}
		String message = "Some errors are contained by the psd file : " + modelname + "\n\n";
		int i = 1;
		for (Diagnostic d : diag.getChildren()) {
			message = message + i + " -- " +  d.getSource() + " : " + d.getMessage() + "\n";
			i++;
		}
		showError("Error while processing psd file",message); 
		return true;
	}
	
	public Diagnostic getDiagnostic(){
		return this.diag;
	}
	
	public void showError(final String title, final String message) {
		Display.getDefault().asyncExec(new Runnable() {
		    @Override
		    public void run() {
		    	MessageDialog.openError(null, title, message);
		    }
		});
	}
	
}
