package mbttoolset.wizard;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;

import Driver.GenerateJunitTestCases;
import Driver.TestCase;
import Driver.TestPath;
/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class MySelectionAdapter extends SelectionAdapter{
	private final Shell shell;
	private Logger logger;
	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;
	private Label outputText;
	private Button button;
	private StyledText concreteTests;
	private ProgressBar progressBar;
	private TestCase testCases;
	private String selectedProject;
	private String targetClassName;
	private String pathOfUmlFile;
	private int counter=0;
	
	public void setButton(Button button) {
		this.button = button;
	}
	public void setTargetClassName(String targetClassName) {
		this.targetClassName = targetClassName;
	}

	public void setPathOfUmlFile(String pathOfUmlFile) {
		this.pathOfUmlFile = pathOfUmlFile;
	}

	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
	}

	public void setTestCases(TestCase testCases) {
		this.testCases = testCases;
	}

	public void setProgressBar(ProgressBar progressBar) {
		this.progressBar = progressBar;
	}

	public void setOutputText(Label outputText) {
		this.outputText = outputText;
	}

	public void setConcreteTests(StyledText concreteTests) {
		this.concreteTests = concreteTests;
	}


	public MySelectionAdapter(Shell shell) {
		this.shell = shell;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		button.setEnabled(false);
		initializeLogger();
		progressBar.setMinimum(0);
		progressBar.setMaximum(testCases.getPaths().size());
		final GenerateJunitTestCases junitTests = new GenerateJunitTestCases(testCases);
		try {
			junitTests.initializeFileWriter(targetClassName);
		} catch (FileNotFoundException e1) {
			logger.log(Level.SEVERE, "File Error:",e1);
			MessageDialog.openError(shell, "Error", "Problem has occurred while creating tests file.\n\n"
					+ "Please check ErrorLog file.");
			//			e.printStackTrace();
		}finally {
			fileTxt.close();
		}

		Job job = new Job("Tests Generation Job") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				for (TestPath tPath : testCases.getPaths()) 
				{
					generateSingleTest(junitTests,tPath);
					++counter;
					syncWithUi();
				}
				junitTests.finishFileWriter(targetClassName);
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						generateTestCasesFile();
					}
				});
				// use this to open a Shell in the UI thread
				return Status.OK_STATUS;
			}

		};
		job.setUser(true);
		job.schedule();
	}

	private void generateSingleTest(GenerateJunitTestCases junitTests, TestPath tPath) {
		try {
			junitTests.setCounter(counter+1);
			junitTests.createSingleTest(tPath, targetClassName, pathOfUmlFile);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error: ",e);
//			e.printStackTrace();
		}
	}

	private void syncWithUi() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if(counter+1 <= testCases.getPaths().size())
					outputText.setText("Generating test "+(counter+1)+"/"+testCases.getPaths().size()+" ...");
				Display display = shell.getDisplay();
				outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
				concreteTests.append("Generated Test Case Number : "+counter+"\n\n");
				concreteTests.setTopIndex(concreteTests.getLineCount()-1);
				progressBar.setSelection(counter);
			}
		});

	}
	private void initializeLogger(){
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String path = myWorkspaceRoot.getLocation().toString()+"/"+selectedProject;
		logger = Logger.getLogger(TestGenerationProcess.class.getName());
		logger.setUseParentHandlers(false);
		try {
			fileTxt = new FileHandler(path+"/ErrorLog.txt");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// create a TXT formatter
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		logger.addHandler(fileTxt);
	}
	private void generateTestCasesFile(){		
		initializeLogger();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] project=myWorkspaceRoot.getProjects();
		IFolder testfiles = null;
		for(IProject p : project)
		{
			if(p.getName().equals(selectedProject)/*p.isOpen()*/)
			{
				testfiles=p.getFolder("test");
				if(!testfiles.exists()){
					testfiles=p.getFolder("src");
					if(!testfiles.exists()){
						MessageDialog.openError(shell, "Error!!!", "No source (src) or test directory exists.\n\n"
							+ "Please select MBT Project or create source (src) or test directory.");
						logger.log(Level.SEVERE, "Error: No source (src) or test directory exists.");
					}
				}
				BufferedReader br=null;
				try {
					br = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
				} catch (FileNotFoundException e1) {
					logger.log(Level.SEVERE, "IO Error:",e1);
					MessageDialog.openError(shell, "Error!!!", "Problem has occurred while finding tests file.\n\n"
							+ "Please check ErrorLog file.");
//					e1.printStackTrace();
				}
				finally {
					fileTxt.close();
				}

				String s;
				String finals="";
				try {
					while((s=br.readLine())!=null)
					{
						finals+=s+"\n";
					}
				} catch (IOException e1) {
					logger.log(Level.SEVERE, "IO Error:",e1);
					MessageDialog.openError(shell, "Error!!!", "Problem has occurred while reading file.\n\n"
							+ "Please check ErrorLog file.");
//					e1.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
				IFile file = testfiles.getFile(targetClassName+"Tests.java");
				if(file.exists())
				{
					File f=new File(file.getLocation().toString());
					f.delete();
					try {
						testfiles.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						logger.log(Level.SEVERE, "IO Error:",e);
						MessageDialog.openError(shell, "Error!!!", "Problem has occurred while finding file resources.\n\n"
								+ "Please check ErrorLog file.");
//						e.printStackTrace();
					}
					finally {
						fileTxt.close();
					}
				}
				
				PrintWriter pr=null;
				try {
					pr = new PrintWriter(new File(targetClassName+"Tests.java"));
				} catch (FileNotFoundException e1) {
					logger.log(Level.SEVERE, "IO Error:",e1);
					MessageDialog.openError(shell, "Error!!!", "Problem has occurred while finding tests file.\n\n"
							+ "Please check ErrorLog file.");
//					e1.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
				pr.write(finals);
				pr.close();

				byte[] bytes = finals.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
				try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(shell, "Error!!!", "Problem has occurred while finding file resources.\n\n"
							+ "Please check ErrorLog file.");
//					e.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
			}
		}
		JunitClassPath junitLib = new JunitClassPath();
		junitLib.addJunitLibPathToProject(selectedProject);
		MessageDialog.openInformation(shell, "Message", "Test cases file has been generated in test folder of project.");
	}
}
