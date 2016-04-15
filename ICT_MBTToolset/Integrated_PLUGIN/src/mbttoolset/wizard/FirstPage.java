package mbttoolset.wizard;
import java.io.IOException;
import java.net.URL;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class FirstPage extends WizardPage{

	//	private Label sutLabel;
	private Label modelLabel;
	private Text modelPath;
	//	private Text sutPath;
	private Text projPath;
	private Button projectBrowseButton;
	private Button modelBrowseButton;
	//	private Button sutBrowseButton;
	private Button basicModeButton;
	private Button expertModeButton;
	private Composite container;

	private Logger logger;
	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;

	public FirstPage() {
		super("MBT Toolset");
		setTitle("Configuration Settings:");
		setDescription("Provide initial configuration and select a mode for execution.");

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
		layout.numColumns = 6;

		Group group1 = new Group(container, SWT.SHADOW_ETCHED_IN);
		group1.setText("Execution Mode");
		GridData lgde = new GridData(GridData.FILL_HORIZONTAL);
		lgde.horizontalSpan = layout.numColumns;
		group1.setLayoutData(lgde);

		Label label1 = new Label(group1, SWT.NONE);
		label1.setText("Select Mode: ");
		lgde = new GridData(GridData.FILL_HORIZONTAL);
		lgde.horizontalSpan = layout.numColumns;
		label1.setLayoutData(lgde);
		label1.setLocation(20,20);
		label1.pack();
		// expert mode	
		expertModeButton = new Button(group1, SWT.RADIO);
		expertModeButton.setText("Custom Mode");
		GridData gde = new GridData(GridData.FILL_HORIZONTAL);
		gde.horizontalSpan = layout.numColumns;
		expertModeButton.setLayoutData(gde);
		expertModeButton.setSelection(true);
		expertModeButton.setLocation(20,40);
		expertModeButton.pack();
		// basic mode	
		basicModeButton = new Button(group1, SWT.RADIO);
		basicModeButton.setText("Basic Mode");
		GridData gdb = new GridData(GridData.FILL_HORIZONTAL);
		gdb.horizontalSpan = layout.numColumns;
		basicModeButton.setLayoutData(gdb);
		basicModeButton.setSelection(false);
		basicModeButton.setLocation(20,60);
		basicModeButton.pack();

		//space
		Label label2 = new Label(container, SWT.NONE);
		label2.setText("");
		GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
		gd2.horizontalSpan = layout.numColumns;
		label2.setLayoutData(gd2);

		//select project
		Label pLabel = new Label(container, SWT.NONE);
		pLabel.setText("Select Project ");
		projPath = new Text(container, SWT.BORDER);
		GridData pdata = new GridData(GridData.FILL_HORIZONTAL);
		pdata.horizontalSpan = 4;
		projPath.setLayoutData(pdata);
		projectBrowseButton= new Button(container, SWT.PUSH);
		projectBrowseButton.setText("Browse");
		//space
		Label label3 = new Label(container, SWT.NONE);
		label3.setText("");
		//		GridData gd3 = new GridData(GridData.FILL_HORIZONTAL);
		//		gd3.horizontalSpan = layout.numColumns;
		label3.setLayoutData(gd2);
		//import input files
		final Button checkButton = new Button(container, SWT.CHECK);
		checkButton.setText("Specify Model File");
		GridData cgd1 = new GridData(GridData.FILL_HORIZONTAL);
		cgd1.horizontalSpan = 6;
		checkButton.setLayoutData(cgd1);

		modelLabel = new Label(container, SWT.NONE);
		modelLabel.setText("UML Model (SM) ");
		modelLabel.setEnabled(false);
		modelPath = new Text(container, SWT.BORDER);
		modelPath.setEnabled(false);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 4;
		modelPath.setLayoutData(data);
		modelBrowseButton= new Button(container, SWT.PUSH);
		modelBrowseButton.setText("Browse");
		modelBrowseButton.setEnabled(false);

		//		sutLabel = new Label(container, SWT.NONE);
		//		sutLabel.setText("System Under Test (SUT) ");
		//		sutLabel.setEnabled(false);
		//		sutPath = new Text(container, SWT.BORDER);
		//		sutPath.setEnabled(false);
		//		GridData sdata = new GridData(GridData.FILL_HORIZONTAL);
		//		sdata.horizontalSpan = 4;
		//		sutPath.setLayoutData(sdata);
		//		sutBrowseButton= new Button(container, SWT.PUSH);
		//		sutBrowseButton.setText("Browse");
		//		sutBrowseButton.setEnabled(false);

		//				GridData gds = new GridData(GridData.HORIZONTAL_ALIGN_END);
		//				gds.horizontalSpan = 3;
		//				sutBrowseButton.setLayoutData(gds);

		//		Label label1 = new Label(container, SWT.NONE);
		//		label1.setText("Select Mode: ");
		//		GridData lgde = new GridData(GridData.FILL_HORIZONTAL);
		//		lgde.horizontalSpan = layout.numColumns;
		//		label1.setLayoutData(lgde);
		//		// expert mode	
		//		expertModeButton = new Button(container, SWT.RADIO);
		//		expertModeButton.setText("Expert Mode");
		//		GridData gde = new GridData(GridData.FILL_HORIZONTAL);
		//		gde.horizontalSpan = layout.numColumns;
		//		expertModeButton.setLayoutData(gde);
		//		expertModeButton.setSelection(true);    
		//		// basic mode	
		//		basicModeButton = new Button(container, SWT.RADIO);
		//		basicModeButton.setText("Basic Mode");
		//		GridData gdb = new GridData(GridData.FILL_HORIZONTAL);
		//		gdb.horizontalSpan = layout.numColumns;
		//		basicModeButton.setLayoutData(gdb);
		//		basicModeButton.setSelection(false);

		setControl(container);

		basicModeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				//				setPageComplete(false);
				//				ProgressBarUI pb = new ProgressBarUI(container.getShell());
				//				pb.initGuage();
				//				pb.open();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//				setPageComplete(false);
			}
		});

		expertModeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				setPageComplete(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				setPageComplete(false);
			}
		});

		projectBrowseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				ElementListSelectionDialog dialog = new ElementListSelectionDialog(container.getShell(), new LabelProvider());
				String[] list=populateProjectsList();
				dialog.setElements(list);
				dialog.setTitle("Select a project from list of workspace projects");
				// user pressed cancel
				if (dialog.open() != Window.OK) {
					return;
				}
				Object[] result = dialog.getResult(); 
				projPath.setText(result[0].toString());
			}
		});

		//		sutBrowseButton.addSelectionListener(new SelectionAdapter() {
		//			public void widgetSelected(SelectionEvent event) {
		//				FileDialog dlg = new FileDialog(container.getShell());
		//				//				DirectoryDialog dlg = new DirectoryDialog(container.getShell());
		//
		//				// Set the initial filter path according
		//				// to anything they've selected or typed in
		//				dlg.setFilterPath(sutPath.getText());
		//
		//				// Change the title bar text
		//				dlg.setText("Select a SUT");
		//
		//				String [] extensions = {"*.java","*.jar"};
		//				dlg.setFilterExtensions(extensions);
		//				// Customizable message displayed in the dialog
		//				//				dlg.setMessage("Select a SUT");
		//
		//				// Calling open() will open and run the dialog.
		//				// It will return the selected directory, or
		//				// null if user cancels
		//				String dir = dlg.open();
		//				if (dir != null) {
		//					// Set the text box to the new selection
		//					sutPath.setText(dir);
		//				}
		//			}
		//		});
		modelBrowseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				FileDialog file = new FileDialog(container.getShell());
				//				DirectoryDialog dlg = new DirectoryDialog(container.getShell());

				// Set the initial filter path according
				// to anything they've selected or typed in
				file.setFilterPath(modelPath.getText());

				// Change the title bar text
				file.setText("Select a UML model");

				String [] extensions = {"*.uml","*.UML","*.xmi","*.XMI"};
				file.setFilterExtensions(extensions);
				// Customizable message displayed in the dialog
				//				file.setMessage("Select a UML model");

				// Calling open() will open and run the dialog.
				// It will return the selected directory, or
				// null if user cancels
				String dir = file.open();
				if (dir != null) {
					// Set the text box to the new selection
					modelPath.setText(dir);
				}
			}
		});
		checkButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if(checkButton.getSelection() == true){
					modelPath.setEnabled(true);
					//					sutPath.setEnabled(true);
					modelBrowseButton.setEnabled(true);
					//					sutBrowseButton.setEnabled(true);
					modelLabel.setEnabled(true);
					//					sutLabel.setEnabled(true);
				}
				else{
					modelPath.setEnabled(false);
					//					sutPath.setEnabled(false);
					modelBrowseButton.setEnabled(false);
					//					sutBrowseButton.setEnabled(false);
					modelLabel.setEnabled(false);
					//					sutLabel.setEnabled(false);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});
	}


	public org.eclipse.jface.wizard.IWizardPage getNextPage() {
		//kind of hack to detect without overriding WizardDialog#nextPressed()
		boolean isNextPressed = "nextPressed".equalsIgnoreCase(Thread.currentThread().getStackTrace()[2].getMethodName());
		if (isNextPressed) {
			boolean validatedNextPress = this.nextPressed();
			if (!validatedNextPress) {
				return this;
			}
		}
		if(projPath.getText().isEmpty()){
			return this;
		}
		boolean isModelPresent = isModelPresent();
		if(basicModeButton.getSelection()==true)
			return this;
		else if(expertModeButton.getSelection()==true && isModelPresent==true)
			return super.getNextPage();
		else if(expertModeButton.getSelection()==true && isModelPresent==false && modelPath.getText().isEmpty())
			return this;
		else if(expertModeButton.getSelection()==true && isModelPresent==false && !modelPath.getText().isEmpty())
			return super.getNextPage();
		return null;
	}

	/**
	 * @see WizardDialog#nextPressed()
	 * @see WizardPage#getNextPage()
	 */
	protected boolean nextPressed() {
		boolean validatedNextPressed = true;

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String path = myWorkspaceRoot.getLocation().toString()+"/"+projPath.getText();
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

		try {
			if(projPath.getText().isEmpty()){
				MessageDialog.openError(getShell(), "Error !!!","Please choose one project from workspace.");
			}
			else{
				boolean isModelPresent = isModelPresent();
				if(isModelPresent == false)
					validatedNextPressed = false;
				if(basicModeButton.getSelection()==true && isModelPresent==false && modelPath.getText().isEmpty()){
					MessageDialog.openError(getShell(), "Error !!!", "No UML model file is present in input folder of project. \n\n"
							+ "Please select UML model file.");
				}
				else if(basicModeButton.getSelection()==true && isModelPresent==true){
					TestGenerationProcess tgp = new TestGenerationProcess();
					tgp.setSelectedProject(projPath.getText());
					ProgressMonitorDialog dialog = new ProgressMonitorDialog(container.getShell());
					dialog.run(true, true, tgp);
					if(tgp.isCancelled())
						MessageDialog.openWarning(getShell(), "Warning", "Test case generation process has been cancelled.\n\n"
								+"Test cases file is not generated!!!");
					else if(tgp.isError())
					{
						fileTxt.close();
						MessageDialog.openError(getShell(), "Error", tgp.getErrorMsg());
						this.getShell().dispose();
					}
					else
						MessageDialog.openInformation(getShell(), "Message", "Test cases file has been generated in test folder of project.");
				}
				else if(basicModeButton.getSelection()==true && isModelPresent==false && !modelPath.getText().isEmpty()){
					TestGenerationProcess tgp = new TestGenerationProcess();
					tgp.setPathOfUmlFile(modelPath.getText());
					tgp.setSelectedProject(projPath.getText());
					ProgressMonitorDialog dialog = new ProgressMonitorDialog(container.getShell());
					dialog.run(true, true, tgp);
					if(tgp.isCancelled())
						MessageDialog.openWarning(getShell(), "Warning", "Test case generation process has been cancelled.\n\n"
								+"Test cases file is not generated!!!");
					else if(tgp.isError())
					{
						fileTxt.close();
						MessageDialog.openError(getShell(), "Error", tgp.getErrorMsg());
						this.getShell().dispose();
					}
					else
						MessageDialog.openInformation(getShell(), "Message", "Test cases file has been generated in test folder of project.");
				}

				else if(expertModeButton.getSelection()==true && isModelPresent==true){
					SecondPageTT.selectedProject = projPath.getText();
					FourthPageTCG.selectedProject = projPath.getText();
				}
				else if(expertModeButton.getSelection()==true && isModelPresent==false && modelPath.getText().isEmpty()){
					MessageDialog.openError(getShell(), "Error !!!", "No UML model file is present in input folder of project. \n\n"
							+ "Please select UML model file.");
				}
				else if(expertModeButton.getSelection()==true && isModelPresent==false && !modelPath.getText().isEmpty()){
					SecondPageTT.selectedProject = projPath.getText();
					SecondPageTT.pathOfUmlFile = modelPath.getText();
					FourthPageTCG.selectedProject = projPath.getText();
					//				MessageDialog.openInformation(getShell(), "path",modelPath.getText());
				}
			}
		} catch (Exception ex) {
			logger.log(Level.SEVERE,"Error validation when pressing Next",ex);
			//			System.out.println("Error validation when pressing Next: " + ex);
		}
		finally{
			fileTxt.close();
		}
		return validatedNextPressed;
	}
	private boolean isModelPresent() {		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		boolean isPresent = false;
		IProject[] project=myWorkspaceRoot.getProjects();
		for(IProject p : project)
		{
			if(p.getName().equals(projPath.getText()) && p.isOpen())
			{
				IFolder inputFiles = p.getFolder("InputFiles");
				IResource[] files = null;
				try {
					if(inputFiles.exists())
						files = inputFiles.members();
					else{
						MessageDialog.openError(getShell(), "Error !!!", "No InputFiles folder exists in project. \n\n"
								+ "Please select MBT Project or create a directory named as InputFiles.");
						logger.log(Level.SEVERE, "Error: No InputFiles folder exists in project. \n");
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if(files != null){
					for(IResource file:files)
					{
						if(file.getFileExtension().equalsIgnoreCase("uml"))
						{
							isPresent = true;
							try {
								p.refreshLocal(IResource.DEPTH_INFINITE, null);
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
		return isPresent;
	}
	private String[] populateProjectsList() {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] project=myWorkspaceRoot.getProjects();
		String[] list = new String[project.length];

		int i=0;
		for(IProject p : project)
		{
			if(p.isOpen()){
				list[i++] = p.getName();
			}
		}
		return list;
	}
}
