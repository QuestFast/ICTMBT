package mbttoolset.wizard;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.TreeLayout;
import org.abego.treelayout.util.DefaultConfiguration;
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
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;

import Driver.StateMachineFlattening;
import Driver.StateMachineReader;
import Driver.StateMachineState;
import Driver.StateMachineTransition;
import Driver.TestCase;
import Driver.TestPath;
import Driver.UMLReader;
import mbttoolset.transitiontree.TransitionTree;
import mbttoolset.transitiontree.TreeFactory;
import mbttoolset.transitiontree.TextInBox;
import mbttoolset.transitiontree.TextInBoxNodeExtentProvider;
import mbttoolset.transitiontree.TextInBoxTreePane;
/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class SecondPageTT extends WizardPage{

	private Composite container;
	private Button button;
	private Button buttonVisualizeTree;
	private StyledText tTreeArea;
	private Label outputText;
	private String paths;
	private TestCase testCases;
	private String targetClassName="";
	private String treeName="";
	public static String pathOfUmlFile;
	public static String selectedProject;
	private ArrayList<String[]> transitionTreeElements = new ArrayList<String[]>();
	private Hashtable<String, ArrayList<String>> transitionsWithActions = new Hashtable<String, ArrayList<String>>();
	
	private Logger logger;
	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;

	public SecondPageTT() {
		super("Second Page");
		setTitle("Step-1: Transition Tree Generation");
		setDescription("Generate all paths of transition tree and visualize tree.");
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
		layout.numColumns = 2;

		button= new Button(container, SWT.BUTTON1);
		button.setText("Generate Transition Tree");
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gd.horizontalSpan = 1;
		button.setLayoutData(gd);
		
		buttonVisualizeTree = new Button(container, SWT.BUTTON1);
		buttonVisualizeTree.setText("Visualize Transition Tree");
		buttonVisualizeTree.setEnabled(false);
		GridData gd1 = new GridData(GridData.HORIZONTAL_ALIGN_END);
		gd1.horizontalSpan = 1;
		buttonVisualizeTree.setLayoutData(gd1);
		
		//		button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		tTreeArea = new StyledText(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		GridData gd2 = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL);
		gd2.horizontalSpan = layout.numColumns;
		tTreeArea.setLayoutData(gd2);
		tTreeArea.setEditable(false);
		StyleRange style = new StyleRange();
		style.background = container.getDisplay().getSystemColor(SWT.COLOR_WHITE);
		tTreeArea.setStyleRange(style);

		outputText = new Label(container, SWT.LEFT);
		GridData lgd = new GridData(GridData.FILL_HORIZONTAL);
		lgd.horizontalSpan = layout.numColumns;
		outputText.setLayoutData(lgd);

		setPageComplete(false);

		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent arg0) {

			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				generateTransitionTree();

				if(!getShell().isDisposed()){
					ThirdPageATC.testCases = testCases;
					if(paths != null){
						tTreeArea.setText(paths);

						outputText.setText("->TransitionTree, Transitions and States has been stored in OutputFiles directory of project.");

						Display display = container.getDisplay();
						outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
						buttonVisualizeTree.setEnabled(true);
						setPageComplete(true);
					}
					else {
//						MessageDialog.openError(getShell(), "Error!!!", "Transition tree was not generated.\n\n"
//								+ "Please check ErrorLog file.");
						getShell().dispose();
					}
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {

			}
		});

		buttonVisualizeTree.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				populateTransitionTree();
				TreeFactory.transitionTreeElements = transitionTreeElements;
				// get the sample tree
//				String treeName = "tt";
//				String treeName = "account";
//				String treeName = "meeting";
				TreeForTreeLayout<TextInBox> tree = TransitionTree.getTransitionTree(treeName);
						
				// setup the tree layout configuration
				double gapBetweenLevels = 50;
				double gapBetweenNodes = 10;
				DefaultConfiguration<TextInBox> configuration = new DefaultConfiguration<TextInBox>(
						gapBetweenLevels, gapBetweenNodes,org.abego.treelayout.Configuration.Location.Left);

				// create the NodeExtentProvider for TextInBox nodes
				TextInBoxNodeExtentProvider nodeExtentProvider = new TextInBoxNodeExtentProvider();

				// create the layout
				TreeLayout<TextInBox> treeLayout = new TreeLayout<TextInBox>(tree,
						nodeExtentProvider, configuration);

				// Create a panel that draws the nodes and edges and show the panel
				TextInBoxTreePane panel = new TextInBoxTreePane(treeLayout,transitionsWithActions.size());
				panel.setTransitionsWithActions(transitionsWithActions);
				TransitionTree.showInDialog(panel);
			}

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				
			}
		});;
		
		setControl(container);
	}
	private void generateTransitionTree(){
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String path = myWorkspaceRoot.getLocation().toString()+"/"+selectedProject;
		logger = Logger.getLogger(SecondPageTT.class.getName());
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

		if(pathOfUmlFile != null){
			FourthPageTCG.pathOfUmlFile = pathOfUmlFile;
		}
		IProject[] project=myWorkspaceRoot.getProjects();
		IFolder outputFiles=null;

		for(IProject p : project)
		{
			if(p.getName().equals(selectedProject)/*p.isOpen()*/)
			{
				IFolder inputFiles = p.getFolder("InputFiles");
				IResource[] files = null;
				try {
					files = inputFiles.members();
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding input file.\n\n"
							+ "Please check ErrorLog file.");
					//			e.printStackTrace();
					fileTxt.close();
					this.getShell().dispose();
				}
//				finally {
//					fileTxt.close();
//				}
				for(IResource file:files)
				{
					if(file.getFileExtension().equals("uml"))
					{
						pathOfUmlFile=file.getLocation().toString();
						FourthPageTCG.pathOfUmlFile = pathOfUmlFile;
					}
				}
				outputFiles=p.getFolder("OutputFiles");
				IResource[] out=null;
				try {
					if(outputFiles.exists())
						out = outputFiles.members();
					else{
						MessageDialog.openError(getShell(), "Error !!!", "No OutputFiles folder exists in project. \n\n"
								+ "Please select MBT Project or create a directory named as OutputFiles.");
						logger.log(Level.SEVERE, "Error: No OutputFiles folder exists in project. \n");
					}
//					out = outputFiles.members();
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding output file.\n\n"
							+ "Please check ErrorLog file.");
					//			e.printStackTrace();
					fileTxt.close();
					this.getShell().dispose();
				}
//				finally {
//					fileTxt.close();
//				}
				if(out != null){
					for(IResource f: out)
					{
						String s=f.getLocation().toString();
						File filee=new File(s);
						if(filee.delete())
						{
							System.out.println("File is deleted");
						}

					}
					try {
						p.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						logger.log(Level.SEVERE, "IO Error:",e);
						MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding project resources.\n\n"
								+ "Please check ErrorLog file.");
						//			e.printStackTrace();
						fileTxt.close();
						this.getShell().dispose();
					}
				}
				else
					return;
//				finally {
//					fileTxt.close();
//				}
//				outputFiles=p.getFolder("OutputFiles");
			}
		}


		if(pathOfUmlFile.length()==0)
		{
			return;
		}

		StateMachineReader smReader = new StateMachineReader();
		UMLReader reader = new UMLReader();
		//		JavaCodeStructure javaCodeStructure = new JavaCodeStructure();
		boolean isExpLogged = false;
		Model model = null;
		try {
			UMLReader.path = pathOfUmlFile;
			UMLReader.selectedProject = selectedProject;
			model = reader.loadModel((new File(pathOfUmlFile)).toURI().toString());
		} catch (Exception e1) {
			logger.log(Level.SEVERE, "Invalid Model:",e1);
			isExpLogged = true;
			MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while loading UML model.\n\n"
					+ "Please check ErrorLog file.");
			//			e1.printStackTrace();
			fileTxt.close();
			this.getShell().dispose();
		}
//		finally {
//			fileTxt.close();
//		}
		if(model != null){
			try {
				smReader.processTheModel(model);
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Model Processing Error:",e);
				MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while processing UML model.\n\n"
						+ "Please check ErrorLog file.");
				//			e.printStackTrace();
				fileTxt.close();
				this.getShell().dispose();
			}
//			finally {
//				fileTxt.close();
//			}
			targetClassName=getTargetClassName(model);
			ThirdPageATC.targetClassName = targetClassName;
			//		out.println("Uml file reading completed!!");
			ArrayList<StateMachineState> states = new ArrayList<StateMachineState>();
			ArrayList<StateMachineTransition> transitions = new ArrayList<StateMachineTransition>();

			states = smReader.getStates();
			transitions = smReader.getTransitions();

			//========================================
			StateMachineFlattening stateMachineFlattening = new StateMachineFlattening();
			ArrayList<StateMachineTransition> modifiedTransitions = stateMachineFlattening.getPathReadyTransitions(transitions);

			//System.out.println("\nTestPathsGeneration :");
			//		out.println("Generating test paths...");
			testCases=new TestCase();
			testCases.generateTestPaths(modifiedTransitions, null,null,new TestPath());

			MessageConsole myConsole = findConsole("Console");
			myConsole.activate();
			MessageConsoleStream out = myConsole.newMessageStream();
			paths=testCases.printTestPaths(out);

			//create 'states' file
			byte[]  bytes = null;
			InputStream source = null;
			String finals="";
			IFile file=outputFiles.getFile("States.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
			}
			finals="";
			for (StateMachineState stateMachineState : states) {
				finals=finals+stateMachineState.getStateName()+"\n";
			}

			bytes = finals.getBytes();
			source = new ByteArrayInputStream(bytes);
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				logger.log(Level.SEVERE, "IO Error:",e);
				MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while creating states file.\n\n"
						+ "Please check ErrorLog file.");
				//			e.printStackTrace();
				fileTxt.close();
				this.getShell().dispose();
			}
//			finally {
//				fileTxt.close();
//			}

			//create 'transitions' file
			file=outputFiles.getFile("Transitions.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
			}
			file=outputFiles.getFile("Transitions.txt");		
			PrintWriter writer = null;
			try {
				writer = new PrintWriter("Transitions.txt");
				for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
					finals=finals+stateMachineTransition.getTransitionName()+"\n";
				}
				bytes = finals.getBytes();
				source = new ByteArrayInputStream(bytes);
				try {
					file.create(source, IResource.NONE, null);
				}catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while creating transitions file.\n\n"
							+ "Please check ErrorLog file.");
					//			e.printStackTrace();
					fileTxt.close();
					this.getShell().dispose();
				}
//				finally {
//					fileTxt.close();
//				}
				PlatformUI.getWorkbench().
				getEditorRegistry().getDefaultEditor(file.getName());
			} catch (FileNotFoundException e) {
				logger.log(Level.SEVERE, "IO Error:",e);
				MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while finding existing file.\n\n"
						+ "Please check ErrorLog file.");
				//			e.printStackTrace();
				fileTxt.close();
				this.getShell().dispose();
			} finally {
				writer.close();
//				fileTxt.close();
			}

			//create 'transitions tree' file
			finals=testCases.printTestPaths(out);
			file = outputFiles.getFile("TransitionTree.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while deleting transition tree file.\n\n"
							+ "Please check ErrorLog file.");
					//			e.printStackTrace();
					fileTxt.close();
					this.getShell().dispose();
				}
//				finally {
//					fileTxt.close();
//				}
			}
			bytes = finals.getBytes();
			source = new ByteArrayInputStream(bytes);
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				logger.log(Level.SEVERE, "IO Error:",e);
				MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while creating transition tree file.\n\n"
						+ "Please check ErrorLog file.");
				//			e.printStackTrace();
				fileTxt.close();
				this.getShell().dispose();
			}
//			finally {
//				fileTxt.close();
//			}
			PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
		}
		else if(model == null && isExpLogged == false){
			logger.log(Level.SEVERE, "Invalid Model: \n UML model could not load. Please recheck the model.");
			MessageDialog.openError(getShell(), "Error!!!", "Problem has occurred while loading UML model.\n\n"
					+ "Please check ErrorLog file.");
			//			e1.printStackTrace();
			this.getShell().dispose();
			fileTxt.close();
		}
		fileTxt.close();
	}
	private String getTargetClassName(Model model) {
		//read target class name
		String targetClassName=null;
		for(PackageableElement elems: model.getPackagedElements()) {
			if(elems instanceof org.eclipse.uml2.uml.internal.impl.ClassImpl) {
				org.eclipse.uml2.uml.internal.impl.ClassImpl classname = (ClassImpl) elems;
				for(Behavior beh: classname.getOwnedBehaviors()) {
					if(beh instanceof StateMachineImpl) {
						targetClassName = elems.getName();
						treeName = targetClassName;
						break;
					}
				}
			}
		}
		return targetClassName;
	}
	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault(); 
		IConsoleManager conMan = plugin.getConsoleManager(); 
		IConsole[] existing = conMan.getConsoles(); 
		for (int i = 0; i < existing.length; i++) 
			if (name.equals(existing[i].getName())) 
				return (MessageConsole) existing[i]; 
		//no console found, so create a new one 
		MessageConsole myConsole = new MessageConsole(name, null); 
		conMan.addConsoles(new IConsole[]{myConsole}); 
		return myConsole;
	}
	private void populateTransitionTree(){
		String[]parts = paths.split("::");
		for(String part: parts){
			if(part.contains(",")){
				String[]states = part.split(",");
				String[]extractedStates = new String[states.length];
				int i=0;
				for(int s = 0;s<states.length;s++){
					String state = states[s];
					if(state.contains("{") && state.contains("}")){
						state = state.replace("{", "");
						state = state.replace("}", "");
						extractedStates[i] = state.trim();
						i++;
					}
					else{
						if(!state.contains("\n") || (state.contains("\n") && state.contains("\r"))){							
							String transition = states[s-1].trim()+"#"+states[s+1].trim();
							transition = transition.replace("{", "");
							transition = transition.replace("}", "");
							transition = transition.trim();
							
							if(state.contains("\n") && state.contains("\r")){
								state = state.replace("\r", " ");
								state = state.replace("\n", "");
							}
							
							if(transitionsWithActions.containsKey(transition)){
								ArrayList<String> actions = transitionsWithActions.get(transition);
								if(!actions.contains(state))
									actions.add(state);
							}
							else{
								ArrayList<String> actions = new ArrayList<String>();
								actions.add(state);
								transitionsWithActions.put(transition, actions);
							}
						}
					}
				}
				transitionTreeElements.add(extractedStates);
			}
		}
//		System.err.println(transitionsWithActions);
		//print
//		System.out.println("TT paths:");
//		for(String[] path: transitionTreeElememts){
//			for(String p: path){
//				System.out.print(p +"-");
//			}
//			System.out.println();
//		}
	}
}
