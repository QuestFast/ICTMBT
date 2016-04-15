package mbttoolset.wizard;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.swt.widgets.Shell;
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
public class ProgressBarUI extends ProgressBarDialog{
	private String[] info = null;
	private TestCase testCases;
	private String targetClassName="";
	private String pathOfUmlFile;
	private String selectedProject;

	public ProgressBarUI(Shell parent) {
		super(parent);
	}

	public void setPathOfUmlFile(String pathOfUmlFile) {
		this.pathOfUmlFile = pathOfUmlFile;
	}
	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
	}
	@Override
	public void initGuage() {
		//generate transition tree
		generateTransitionTree();
		String text1 = "Transition tree is generated...";
		//create abstract tests
		GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
		abstractTestCases.createAbstractTestCaseFile(targetClassName);
		String text2 = "Abstract test cases are generated...";
		//create junit tests
		int progressBarSize = testCases.getPaths().size();
		GenerateJunitTestCases junitTests = new GenerateJunitTestCases(testCases);
		//		junitTests.initializeFileWriter(targetClassName);

		info = new String[(progressBarSize*2)+3];
		info[0] = text1;
		info[1] = text2;
		info[2] = "Generating Junit Test Cases...";
		int counter=1,i=3;
		for (TestPath tPath : testCases.getPaths()) 
		{
			info[i] ="Generating Test Case number : " + counter;
			//			junitTests.createSingleTest(tPath, targetClassName, pathOfUmlFile);
			++i;
			info[i] ="Test Case Number "+(counter)+" is generated !!";
			++counter;
			++i;
		}
		//		junitTests.finishFileWriter(targetClassName);


		//	    for (int i = 0; i < info.length; i++) {
		//	      info[i] = "process task " + i + ".";
		//	    }
		this.setExecuteTime((progressBarSize*2)+3);
		this.setMayCancel(true);
		this.setProcessMessage("Processing....");
		this.setShellTitle("MBT Toolset");

	}

	@Override
	protected String process(int arg0) {
		try{
			Thread.sleep((long)(Math.random() * 800));
		}catch(Exception e){e.printStackTrace();}

		return info[arg0 - 1];
	}

	private void generateTransitionTree(){
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		if(pathOfUmlFile != null){
			FourthPageTCG.pathOfUmlFile = pathOfUmlFile;
		}
		//			String pathOfUmlFile="";
		IProject[] project=myWorkspaceRoot.getProjects();
		//			IFolder testfiles = null;
		IFolder outputFiles=null;

		for(IProject p : project)
		{
			//			System.out.println(p.getLocation());
			if(p.getName().equals(selectedProject)/*p.isOpen()*/)
			{
				System.out.println("Project with  " +p.getName()+" is Open");
				IFolder inputFiles = p.getFolder("InputFiles");
				IResource[] files = null;
				try {
					files = inputFiles.members();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				for(IResource file:files)
				{
					if(file.getFileExtension().equals("uml"))
					{
						pathOfUmlFile=file.getLocation().toString();
					}
				}
				outputFiles=p.getFolder("OutputFiles");
				IResource[] out=null;
				try {
					out = outputFiles.members();
				} catch (CoreException e) {
					e.printStackTrace();
				}
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
					e.printStackTrace();
				}
				outputFiles=p.getFolder("OutputFiles");
			}
		}


		if(pathOfUmlFile.length()==0)
		{
			return;
		}

		StateMachineReader smReader = new StateMachineReader();
		UMLReader reader = new UMLReader();

		Model model = null;
		try {
			model = reader.loadModel((new File(pathOfUmlFile))
					.toURI().toString());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			smReader.processTheModel(model);
		} catch (UnresolvedReferenceException e) {
			e.printStackTrace();
		}	
		targetClassName=getTargetClassName(model);
		//			ThirdPageATC.targetClassName = targetClassName;
		//		out.println("Uml file reading completed!!");
		ArrayList<StateMachineState> states;
		ArrayList<StateMachineTransition> transitions = null;

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
//		paths=testCases.printTestPaths(out);

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
			e.printStackTrace();
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
			} catch (CoreException e) {
				e.printStackTrace();
			}
			PlatformUI.getWorkbench().
			getEditorRegistry().getDefaultEditor(file.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			writer.close();
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
				e.printStackTrace();
			}
		}
		bytes = finals.getBytes();
		source = new ByteArrayInputStream(bytes);
		try {
			file.create(source, IResource.NONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}	
		PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
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
