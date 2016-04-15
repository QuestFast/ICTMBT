package letsstartagain;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;

public class CustomProjectSupport {
	
	 
	    public static IProject createProject(String projectName, URI location) {
	        Assert.isNotNull(projectName);
	 
	        IProject project = createBaseProject(projectName, location);
	        try {
	           // addNature(project);
	 
	            String[] paths = { "Code", "InputFiles" }; //$NON-NLS-1$ //$NON-NLS-2$
	            addToProjectStructure(project, paths);
	        } catch (CoreException e) {
	            e.printStackTrace();
	            project = null;
	        }
	 
	        return project;
	    }
	    private static void createFolder(IFolder folder) throws CoreException {
	        IContainer parent = folder.getParent();
	        if (parent instanceof IFolder) {
	            createFolder((IFolder) parent);
	        }
	        if (!folder.exists()) {
	            folder.create(false, true, null);
	        }
	    }
	 
	    private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
	        for (String path : paths) {
	            IFolder etcFolders = newProject.getFolder(path);
	            createFolder(etcFolders);
	        }
	    }

	    private static IProject createBaseProject(String projectName, URI location) {
	        // it is acceptable to use the ResourcesPlugin class
	        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	 
	        if (!newProject.exists()) {
	            URI projectLocation = location;
	            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
	            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
	                projectLocation = null;
	            }
	 
	            desc.setLocationURI(projectLocation);
	            try {
	                newProject.create(desc, null);
	                if (!newProject.isOpen()) {
	                    newProject.open(null);
	                }
	            } catch (CoreException e) {
	                e.printStackTrace();
	            }
	        }
	 
	        return newProject;
	    }
}
