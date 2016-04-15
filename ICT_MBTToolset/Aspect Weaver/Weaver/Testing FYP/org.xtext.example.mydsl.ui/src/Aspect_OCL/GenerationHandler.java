package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import state.machine.Controller_SM;
import GUI.AllWizards;

import com.google.inject.Provider;

public class GenerationHandler extends AbstractHandler implements IHandler {

	  private IGenerator generator;
	  private Provider fileAccessProvider;
	  IResourceDescriptions resourceDescriptions;
	  IResourceSetProvider resourceSetProvider;
	  
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{				
		 
	    WizardDialog dlg = new WizardDialog(null,new AllWizards());
	    dlg.open();
		return null;
	}
 

  @Override
  public boolean isEnabled() {
    return true;
  }

  
}