package integrated_plug_in;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

public class CustomProjectSupport {


	public static IProject createProject(String projectName, URI location) {
		Assert.isNotNull(projectName);

		IProject project = createBaseProject(projectName, location);
		try {
			addNature(project);
			String[] paths = { "InputFiles" ,"OutputFiles" }; //$NON-NLS-1$ //$NON-NLS-2$
			addToProjectStructure(project, paths);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}

		return project;
	}
	private static void addNature(IProject proj) throws CoreException {
		IProjectDescription description = null;
		try {
			description = proj.getDescription();
		} catch (CoreException e3) {
			e3.printStackTrace();
		}
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });

		try {
			proj.setDescription(description, null);
		} catch (CoreException e2) {
			e2.printStackTrace();
		}
		IJavaProject javaProject = JavaCore.create(proj);
		IFolder binFolder = proj.getFolder("bin");
		try {
			if(!binFolder.exists())
				binFolder.create(false, true, null);
		} catch (CoreException e3) {
			e3.printStackTrace();
		}
		try {
			javaProject.setOutputLocation(binFolder.getFullPath(), null);
		} catch (JavaModelException e2) {
			e2.printStackTrace();
		}
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();

		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		IClasspathEntry[] newEntries = null;
		//add libs to project class path
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
		IFolder sourceFolder = proj.getFolder("src");
		if(!sourceFolder.exists())
			sourceFolder.create(false, true, null);  

		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());

		IFolder testFolder = proj.getFolder("test");
		if(!testFolder.exists())
			testFolder.create(false, true, null);  

		IPackageFragmentRoot testRoot = javaProject.getPackageFragmentRoot(testFolder);
		IClasspathEntry[] newEntries_1 = new IClasspathEntry[newEntries.length + 1];
		System.arraycopy(newEntries, 0, newEntries_1, 0, newEntries.length);			
		newEntries_1[newEntries.length] = JavaCore.newSourceEntry(testRoot.getPath());

		javaProject.setRawClasspath(newEntries_1, null);
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

		if (!newProject.exists() && !newProject.isOpen()) {
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
