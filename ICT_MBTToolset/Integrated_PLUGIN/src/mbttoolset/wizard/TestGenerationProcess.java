package mbttoolset.wizard;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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

import Driver.GenerateJunitAbstractTestCases;
import Driver.GenerateJunitTestCases;
import Driver.StateMachineFlattening;
import Driver.StateMachineReader;
import Driver.StateMachineState;
import Driver.StateMachineTransition;
import Driver.TestCase;
import Driver.TestPath;
import Driver.UMLReader;

/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class TestGenerationProcess implements IRunnableWithProgress{
	private TestCase testCases;
	private String targetClassName="";
	private String pathOfUmlFile;
	private String selectedProject;
	private boolean isCancelled;
	private boolean isError;
	
	private String errorMsg;
	
	private Logger logger;
	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;

	public boolean isError() {
		return isError;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		monitor.beginTask("Generating test cases...", IProgressMonitor.UNKNOWN);
		//generate transition tree
		generateTransitionTree();
		if(isError){
			monitor.done();
			return;
		}
		initializeLogger();
		monitor.setTaskName("Transition tree is generated...");
		//create abstract tests
		GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
		abstractTestCases.createAbstractTestCaseFile(targetClassName);
		monitor.setTaskName("Abstract test cases are generated...");
		//create junit tests
		GenerateJunitTestCases junitTests = new GenerateJunitTestCases(testCases);
		try {
			junitTests.initializeFileWriter(targetClassName);
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "File Error:",e);
			isError = true;
			errorMsg ="Problem has occurred while creating tests file.\n\n"
					+ "Please check ErrorLog file.";
//			e.printStackTrace();
		}finally {
			fileTxt.close();
		}
		

		monitor.setTaskName("Generating Junit Test Cases...");
		int counter=1;
		isCancelled = false;
		for (TestPath tPath : testCases.getPaths()) 
		{
			monitor.setTaskName("Generating Test Case number : " + counter);
			try {
				junitTests.createSingleTest(tPath, targetClassName, pathOfUmlFile);
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Error:",e);
				isError = true;
				errorMsg = "Test case generation process completed with errors (see ErrorLog file).";
//				e.printStackTrace();
			}
			monitor.setTaskName("Test Case Number "+(counter)+" is generated.");
			++counter;
			if (!monitor.isCanceled())
				Thread.sleep(10);
			else{
				isCancelled = true;
				break;
			}
		}
		junitTests.finishFileWriter(targetClassName);
		if(!isCancelled){
			generateTestCasesFile();
		}
		monitor.done();
	}
	public boolean isCancelled() {
		return isCancelled;
	}
	public void setPathOfUmlFile(String pathOfUmlFile) {
		this.pathOfUmlFile = pathOfUmlFile;
	}
	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
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
	private void generateTransitionTree(){
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		initializeLogger();
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
					isError = true;
					errorMsg = "Problem has occurred while finding input file.\n\n"
							+ "Please check ErrorLog file.";
					//			e.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
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
						isError = true;
						errorMsg = "No OutputFiles folder exists in project. \n"
								+ "Please select MBT Project or create a directory named as OutputFiles.";
						logger.log(Level.SEVERE, "Error: "+errorMsg);
					}
//					out = outputFiles.members();
				} catch (CoreException e) {
					logger.log(Level.SEVERE, "IO Error:",e);
					isError = true;
					errorMsg ="Problem has occurred while finding output file.\n\n"
							+ "Please check ErrorLog file.";
					//			e.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
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
						isError = true;
						errorMsg ="Problem has occurred while finding project resources.\n\n"
								+ "Please check ErrorLog file.";
						//			e.printStackTrace();
					}
					finally {
						fileTxt.close();
					}
				}
				else
					return;
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

		Model model = null;
		try {
			model = reader.loadModel((new File(pathOfUmlFile)).toURI().toString());
		} catch (Exception e1) {
			logger.log(Level.SEVERE, "Invalid Model:",e1);
			isError = true;
			errorMsg = "Problem has occurred while loading UML model.\n\n"
					+ "Please check ErrorLog file.";
			//			e1.printStackTrace();
		}
		finally {
			fileTxt.close();
		}
		if(model != null){
			try {
				smReader.processTheModel(model);
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Model Processing Error:",e);
				isError = true;
				errorMsg ="Problem has occurred while processing UML model.\n\n"
						+ "Please check ErrorLog file.";
				//			e.printStackTrace();
			}
			finally {
				fileTxt.close();
			}
			targetClassName=getTargetClassName(model);
			ThirdPageATC.targetClassName = targetClassName;
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
//			testCases.printTestPaths(out);

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
				isError = true;
				errorMsg ="Problem has occurred while creating states file.\n\n"
						+ "Please check ErrorLog file.";
				//			e.printStackTrace();
			}
			finally {
				fileTxt.close();
			}

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
					isError = true;
					errorMsg ="Problem has occurred while creating transitions file.\n\n"
							+ "Please check ErrorLog file.";
					//			e.printStackTrace();
				}
				finally {
					fileTxt.close();
				}
				PlatformUI.getWorkbench().
				getEditorRegistry().getDefaultEditor(file.getName());
			} catch (FileNotFoundException e) {
				logger.log(Level.SEVERE, "IO Error:",e);
				isError = true;
				errorMsg ="Problem has occurred while finding existing file.\n\n"
						+ "Please check ErrorLog file.";
				//			e.printStackTrace();
			} finally {
				writer.close();
				fileTxt.close();
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
					isError = true;
					errorMsg ="Problem has occurred while deleting transition tree file.\n\n"
							+ "Please check ErrorLog file.";
					//			e.printStackTrace();
				}
				finally {
					fileTxt.close();
					//pageShell.getShell().dispose();
				}
			}
			bytes = finals.getBytes();
			source = new ByteArrayInputStream(bytes);
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				logger.log(Level.SEVERE, "IO Error:",e);
				isError = true;
				errorMsg ="Problem has occurred while creating transition tree file.\n\n"
						+ "Please check ErrorLog file.";
				//			e.printStackTrace();
			}
			finally {
				fileTxt.close();
			}
			PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
		}
		else if(model == null){
			logger.log(Level.SEVERE, "Invalid Model: \n UML model could not load. Please recheck the model.");
			isError = true;
			errorMsg = "Problem has occurred while loading UML model.\n\n"
					+ "Please check ErrorLog file.";
			fileTxt.close();
		}
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
						errorMsg = "No source (src) or test directory exists.\n"
							+ "Please select MBT Project or create source (src) or test directory.";
						isError = true;
						logger.log(Level.SEVERE,"Error: "+errorMsg);
					}
				}
				BufferedReader br=null;
				try {
					br = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
				} catch (FileNotFoundException e1) {
					logger.log(Level.SEVERE, "IO Error:",e1);
					isError = true;
					errorMsg = "Problem has occurred while finding tests file.\n\n"
							+ "Please check ErrorLog file.";
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
					isError = true;
					errorMsg = "Problem has occurred while reading file.\n\n"
							+ "Please check ErrorLog file.";
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
						isError = true;
						errorMsg = "Problem has occurred while finding file resources.\n\n"
								+ "Please check ErrorLog file.";
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
					isError = true;
					errorMsg = "Problem has occurred while finding tests file.\n\n"
							+ "Please check ErrorLog file.";
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
					isError = true;
					errorMsg = "Problem has occurred while finding file resources.\n\n"
							+ "Please check ErrorLog file.";
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
	private String getTargetClassName(Model model) {
		//read target class name
		String targetClassName=null;
		for(PackageableElement elems: model.getPackagedElements()) {
			if(elems instanceof org.eclipse.uml2.uml.internal.impl.ClassImpl) {
				org.eclipse.uml2.uml.internal.impl.ClassImpl classname = (ClassImpl) elems;
				for(Behavior beh: classname.getOwnedBehaviors()) {
					if(beh instanceof StateMachineImpl) {
						targetClassName = elems.getName();
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
}
