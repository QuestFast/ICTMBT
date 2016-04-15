package mbttoolset.wizard;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
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
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;

import Driver.TestCase;

/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class FourthPageTCG extends WizardPage{

	private Button button;
	private Label outputText;
	private StyledText concreteTests;
	private ProgressBar progressBar;
	private Composite container;
	public static TestCase testCases;
	public static String targetClassName="";
	public static String pathOfUmlFile;
	public static String selectedProject;
	private Logger logger;
	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;

	public static boolean generateTestData;

	public FourthPageTCG() {
		super("MBT Toolset");
		setTitle("Step-3: Test Cases Generation");
		setDescription("Generate Junit test cases.");
		String path = "icons/logo.png";
		final URL fullPathString = FileLocator.find(Platform.getBundle("plug"), new Path(path), null);
		ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
		setImageDescriptor(imageDesc);
	}
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;

		button= new Button(container, SWT.BUTTON1);
		button.setText("Generate Junit Test Cases");
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gd.horizontalSpan = layout.numColumns;
		button.setLayoutData(gd);

		concreteTests = new StyledText(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		concreteTests.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		concreteTests.setEditable(false);
		StyleRange style = new StyleRange();
		style.background = container.getDisplay().getSystemColor(SWT.COLOR_WHITE);
		concreteTests.setStyleRange(style);

		outputText = new Label(container, SWT.LEFT);
		GridData lgd = new GridData(GridData.FILL_HORIZONTAL);
		lgd.horizontalSpan = layout.numColumns;
		outputText.setLayoutData(lgd);

		progressBar = new ProgressBar(container,SWT.SMOOTH);
		progressBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridData plgd = new GridData(GridData.FILL_HORIZONTAL);
		plgd.horizontalSpan = layout.numColumns;
		progressBar.setLayoutData(plgd);

		setPageComplete(false);

		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				if(!targetClassName.equals("")){
					int progressBarSize = testCases.getPaths().size();
					outputText.setText("Generating test "+1+"/"+progressBarSize);
					Display display = container.getDisplay();
					outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
					
					MySelectionAdapter mas = new MySelectionAdapter(getShell());
					mas.setConcreteTests(concreteTests);
					mas.setOutputText(outputText);
					mas.setButton(button);
					mas.setProgressBar(progressBar);
					mas.setPathOfUmlFile(pathOfUmlFile);
					mas.setSelectedProject(selectedProject);
					mas.setTestCases(testCases);
					mas.setTargetClassName(targetClassName);
					
					button.addSelectionListener(mas); 
					button.setSelection(false);
					setPageComplete(true);
				}
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				
			}
		});
		
//		button.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseUp(MouseEvent arg0) {
//				// more code
//			}
//
//			@Override
//			public void mouseDown(MouseEvent arg0) {
//				int counter=1;
//				if(!targetClassName.equals("")){
//					int progressBarSize = testCases.getPaths().size();
//					outputText.setText("Generating test "+0+"/"+progressBarSize);
//					Display display = container.getDisplay();
//					outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
//					//					progressBar.setMinimum(0);
//					//					progressBar.setMaximum(progressBarSize);
//					initializeLogger();
//					GenerateJunitTestCases junitTests = new GenerateJunitTestCases(testCases);
//					try {
//						junitTests.initializeFileWriter(targetClassName);
//					} catch (FileNotFoundException e) {
//						logger.log(Level.SEVERE, "File Error:",e);
//						MessageDialog.openError(getShell(), "Error", "Problem has occurred while creating tests file.\n\n"
//								+ "Please check ErrorLog file.");
////						e.printStackTrace();
//					}finally {
//						fileTxt.close();
//					}
//					button.setEnabled(false);
//					//					countThread.start();
//					for (TestPath tPath : testCases.getPaths()) 
//					{
//						concreteTests.append("Generating Test Case number : " + counter+"\n\n");
//						junitTests.createSingleTest(tPath, targetClassName, pathOfUmlFile);
////						try {
////							Thread.sleep(1);
////						} catch (InterruptedException e) {
////							e.printStackTrace();
////						}
//						concreteTests.append("Test Case Number "+(counter)+" is generated !!"+"\n\n");
//						concreteTests.setTopIndex(concreteTests.getLineCount()-1);
//						outputText.setText("Generating test "+counter+"/"+progressBarSize);
//						display = container.getDisplay();
//						outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
//						//					    progressBar.setSelection (counter);
//						++counter;
//					}
//					junitTests.finishFileWriter(targetClassName);
//					generateTestCasesFile();
//					MessageDialog.openInformation(getShell(), "Message", "Test cases file has been generated in test folder of project.");
//				}
//				setPageComplete(true);
//			}

			//			private void incrementProgressBar(final int counter) {
			//				try {
			//					Thread.sleep(1000);
			//				} catch (InterruptedException e) {
			//					e.printStackTrace();
			//				}

			//				container.getDisplay().asyncExec(new Runnable(){
			//					public void run() {
			//						if(progressBar.isDisposed())
			//							return;
			//						progressBar.setSelection(counter);
			////						progressBar.redraw();
			//					}
			//				});
			//			}
//
//			@Override
//			public void mouseDoubleClick(MouseEvent arg0) {
//
//			}
//		});

		setControl(container);
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
				BufferedReader br=null;
				try {
					br = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
				} catch (FileNotFoundException e1) {
					logger.log(Level.SEVERE, "IO Error:",e1);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding tests file.\n\n"
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
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while reading file.\n\n"
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
						MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding file resources.\n\n"
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
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding tests file.\n\n"
							+ "Please check ErrorLog file.");
//					e1.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
				pr.write(finals);
				pr.close();

//				BufferedReader brr = null;
//				try {
//					brr = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
//				} catch (FileNotFoundException e1) {
//					e1.printStackTrace();
//				}
//				String sec;
//				try {
//					while((sec=brr.readLine())!=null)
//					{
//						System.out.println(sec);
//					}
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
				byte[] bytes = finals.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
				try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding file resources.\n\n"
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
	}
}
