package mbttoolset.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class JunitClassPath {
	private static final String JDT_NATURE = "org.eclipse.jdt.core.javanature";

	public JunitClassPath() {

	}

	public void addJunitLibPathToProject(String projectName){
		//change class path for junit 
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		// Get all projects in the workspace
		IProject[] projects = root.getProjects();
		// Loop over all projects
		for (IProject project : projects) {
			try {
				// only work on open projects with the Java nature
				if (project.isOpen() && project.getName().equals(projectName) && project.isNatureEnabled(JDT_NATURE)) {
					changeClassPath(project);
				}
			} catch (CoreException e) {
				e.printStackTrace(); 
			}
		}
	}

	private void changeClassPath(IProject project) throws JavaModelException {
		IJavaProject javaProject = JavaCore.create(project);
		IClasspathEntry[] entries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];

		System.arraycopy(entries, 0, newEntries, 0, entries.length);

		//check for existing junit libs
		boolean found = false;
		for(IClasspathEntry entry: entries){
			if(entry.getPath().toString().contains("org.eclipse.jdt.junit.JUNIT_CONTAINER"))
				found = true;
		}
		if(!found){
			// add a new entry using the path to the container
			Path junitPath = new Path("org.eclipse.jdt.junit.JUNIT_CONTAINER/4");
			IClasspathEntry junitEntry = JavaCore
					.newContainerEntry(junitPath);
			newEntries[entries.length] = JavaCore
					.newContainerEntry(junitEntry.getPath());
			javaProject.setRawClasspath(newEntries, null);
		}
	}
}
