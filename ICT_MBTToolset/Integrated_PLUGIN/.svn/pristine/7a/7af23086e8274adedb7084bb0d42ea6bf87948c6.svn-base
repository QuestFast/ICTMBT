package integrated_plug_in;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class NewWizard2 extends org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard implements INewWizard {
	private WizardNewProjectCreationPage _pageOne;
	private IConfigurationElement _configurationElement;
	public NewWizard2() {
		setWindowTitle("ToolSet");	// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) {
	    _configurationElement = config;
	}

	@Override
	public boolean performFinish() {
		
		  String name = _pageOne.getProjectName();
		    URI location = null;
		    if (!_pageOne.useDefaults()) {
		        location = _pageOne.getLocationURI();
		        System.err.println("location: " + location.toString()); //$NON-NLS-1$
		    } // else location == null
		 
		    CustomProjectSupport.createProject(name, location);
		    // Add this
		    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		 
	//	    return true;
		
		return true;
	}

	
	
	@Override
	public void addPages() {
	 //   super.addPages();
	 
	  
	_pageOne = new WizardNewProjectCreationPage("From Scratch Project Wizard");
	 _pageOne.setTitle("From Scratch Project");
	_pageOne.setDescription("Create something from scratch.");
	 
	    addPage(_pageOne);
	}
}
