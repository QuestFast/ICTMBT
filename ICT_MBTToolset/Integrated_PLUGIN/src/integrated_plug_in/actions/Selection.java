package integrated_plug_in.actions;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import jodd.util.ClassLoaderUtil;
import mbttoolset.wizard.FourthPageTCG;
import mbttoolset.wizard.MainWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testcases.examples.account.AccountTests;
import Driver.GenerateJunitAbstractTestCases;
import Driver.GenerateJunitTestCases;
import Driver.JavaCodeStructure;
import Driver.StateMachineFlattening;
import Driver.StateMachineReader;
import Driver.StateMachineState;
import Driver.StateMachineTransition;
import Driver.TestCase;
import Driver.TestPath;
import Driver.UMLReader;


public class Selection  implements IWorkbenchWindowActionDelegate{
	private JFrame frame = new JFrame("Select");
	private Container c1 = new Container();
	private IWorkbenchWindow window;
	
	
	Selection(IWorkbenchWindow window)
	{
		this.window = window;	
	}
	public void init(IWorkbenchWindow window) {
		;
	}
	public void init(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		WizardDialog dialog = new WizardDialog(null, new MainWizard());
		dialog.setPageSize(200, 300);
		dialog.open(); 
//		FourthPageTCG.generateTestData = true;
		
//		c1 = frame.getContentPane();
//		c1.setLayout(new BorderLayout());
//		
//		JButton btn1 = new JButton("All in one go");
//		btn1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
//		btn1.setToolTipText("Button1");
//		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btn1.setPreferredSize(new Dimension(150, 30));
//		btn1.addMouseListener(new SubmitBtn1ActionHandler(btn1));
//		
//		JButton btn2 = new JButton("Step by Step");
//		btn2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
//		btn2.setToolTipText("Button2");
//		btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btn2.setPreferredSize(new Dimension(150, 30));
//		btn2.addMouseListener(new SubmitBtn2ActionHandler(btn2));
//		
//		JPanel panel1 = new JPanel();
//		panel1.setLayout(new GridBagLayout());
//		
//		GridBagConstraints constraints = new GridBagConstraints();
//		constraints.insets = new Insets(5, 5, 5, 5);
//		panel1.add(btn1,constraints);
//		constraints.gridx = 1;
//		panel1.add(btn2,constraints);
//		
//		c1.add(panel1);
//		
//		frame.setResizable(false);
//		frame.setBounds(0, 0, 300,100);
//		frame.setMinimumSize(new Dimension(200,100));
//		frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
//		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class SubmitBtn1ActionHandler implements MouseListener {

		JButton btn = null;
		
		public SubmitBtn1ActionHandler(JButton btn) {
			super();
			this.btn = btn;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			//JOptionPane.showMessageDialog(c1, "Button1 Clicked!","Information",JOptionPane.INFORMATION_MESSAGE);
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			
			String pathOfUmlFile="";
			IProject[] project=myWorkspaceRoot.getProjects();
			IFolder testfiles = null;
			IFolder outputFiles=null;
			
			
			
			for(IProject p : project)
			{
//				System.out.println(p.getLocation());
				if(p.isOpen())
				{
					System.out.println("Project with  " +p.getName()+" is Open");
					 IFolder inputFiles = p.getFolder("InputFiles");
					 IResource[] files = null;
					 try {
					files = inputFiles.members();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 for(IResource file:files)
					 {
						if(file.getFileExtension().equals("uml"))
						{
							pathOfUmlFile=file.getLocation().toString();
						testfiles=p.getFolder("src");
						outputFiles=p.getFolder("OutputFiles");
						IResource[] out=null;
						try {
							out = outputFiles.members();
						} catch (CoreException e) {
							// TODO Auto-generated catch block
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
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						outputFiles=p.getFolder("OutputFiles");
						//outputFiles=
						}
					 }
					  
				}
			}
			
			System.out.println(pathOfUmlFile);
			
			MessageConsole myConsole = findConsole("Console");
			myConsole.activate();
			MessageConsoleStream out = myConsole.newMessageStream();
			//out.println("Hello from Generic console sample action");

			if(pathOfUmlFile.length()==0)
			{
				return;
			}
			out.println("Reading Uml File...");

			StateMachineReader smReader = new StateMachineReader();
			UMLReader reader = new UMLReader();
			JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

			Model model = null;
			try {
				model = reader.loadModel((new File(pathOfUmlFile))
						.toURI().toString());
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			try {
				javaCodeStructure = smReader.processTheModel(model);
			} catch (UnresolvedReferenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			String targetClassName=MainGUIClass.getTargerClassName(model);

			out.println("Uml file reading completed!!");
			ArrayList<StateMachineState> states;
			ArrayList<StateMachineTransition> transitions = null;

			states = smReader.getStates();
			transitions = smReader.getTransitions();

			//========================================
			StateMachineFlattening stateMachineFlattening = new StateMachineFlattening();
			ArrayList<StateMachineTransition> modifiedTransitions = stateMachineFlattening.getPathReadyTransitions(transitions);
			
			//System.out.println("\nTestPathsGeneration :");
			out.println("Generating test paths...");
			TestCase testCases=new TestCase();
			testCases.generateTestPaths(modifiedTransitions, null,null,new TestPath());
			out.println("Test paths generated!!");

			out.println("Test paths are :");


			String finals="";
			finals=testCases.printTestPaths(out);
			IFile file = outputFiles.getFile("TransitionTree.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
//				file.delete(true, null);
			}
			byte[] bytes = finals.getBytes();
		    InputStream source = new ByteArrayInputStream(bytes);
		    try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    //window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			
		    IWorkbenchPage page = window.getActivePage();
		    
		    
		    IEditorDescriptor desc = PlatformUI.getWorkbench().
		    		getEditorRegistry().getDefaultEditor(file.getName());
/*
		    try {
			//	page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
		   */
			System.out.println("\nTestCaseGeneration :");
			try {
				testCases.mapKeysAgainstPaths();
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println("\nAll Test Cases have been written to \"TestCases.txt\"");
			//========================================

			//generate junit test cases

			out.println("Generating JUNIT test cases");
			GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);
			
			GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
			String text= abstractTestCases.createAbstractTestCaseFile(targetClassName);
			//	GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);

			//	nUnitTestCases.createnunitTestCaseFile(targetClassName);
			//			junitTestCases.createJunitTestCaseFile("Mario");
			junitTestCases.createJunitTestCaseFile(targetClassName,out,pathOfUmlFile);

			out.println("JUNIT test cases generated");
			
			
			file=outputFiles.getFile("Abstract.txt");

			//========================================
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				file.delete(true, null);
			}
			
			bytes = text.getBytes();
		    source = new ByteArrayInputStream(bytes);
		    try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    /*
		    desc = PlatformUI.getWorkbench().
		    		getEditorRegistry().getDefaultEditor(file.getName());

		    try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
			*/
			//========================================

			BufferedReader br=null;
			try {
				br = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String s;
			finals="";
			try {
				while((s=br.readLine())!=null)
				{
					finals+=s+"\n";
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			file = testfiles.getFile(targetClassName+"Tests.java");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					testfiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				file.delete(true, null);
			}
			
			//File f= new File(targetClassName+"Tests.java");
			
			PrintWriter pr=null;
			try {
				pr = new PrintWriter(new File(targetClassName+"Tests.java"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			pr.write(finals);
			pr.close();
			
			BufferedReader brr = null;
			try {
				brr = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String sec;
			try {
				while((sec=brr.readLine())!=null)
				{
					System.out.println(sec);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				bytes = finals.getBytes();
			    source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		/*	    desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());

			    try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 
			*/
			file=outputFiles.getFile("States.txt");

			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
//				file.delete(true, null);
			}
			//========================================
			finals="";
			//file=outputFiles.getFile("States.txt");

			PrintWriter writer = null;
			try {
				//writer = new PrintWriter("States.txt");
				for (StateMachineState stateMachineState : states) {
					finals=finals+stateMachineState.getStateName()+"\n";
//					writer.println(stateMachineState.getStateName());
				}
				
			bytes = finals.getBytes();
			  source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 /*   desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());

			    try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} */
			} finally {
			//	writer.close();
			}
			finals="";
			
			file=outputFiles.getFile("Transitions.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
//				file.delete(true, null);
			}
			file=outputFiles.getFile("Transitions.txt");
			
			try {
				writer = new PrintWriter("Transitions.txt");
				for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
					finals=finals+stateMachineTransition.getTransitionName()+"\n";
//					
					
//					writer.println(stateMachineTransition.getTransitionName());
				}
				bytes = finals.getBytes();
				source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());
/*
			    try {
			//		page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} */
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				writer.close();
			}
			
			
			//ClassLoaderUtil.addFileToClassPath(targetClassName+"Tests.class", null);
			/*out.println("Executing test cases. . . . .");
			//class c=c targetClassName+"Tests.class".;
			Class classs = null;
			try {
				classs = Class.forName(targetClassName+"Tests.class");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

				Result result = JUnitCore.runClasses(classs);
				StringBuilder errors = new StringBuilder("Whoops! Following errors occurred!");
				boolean errorCheck = false;
				for(Failure failure : result.getFailures()) {
					errors.append("\n"+failure.toString());
					System.out.println(failure.toString());

				}


				for(int i=1;i<=result.getRunCount();i++)
				{
					if(errors.toString().contains("testQuery"+i))
					{
						out.println("\n"+"testQuery"+i+" didnt executed correctly ");
					}
					else
					{
						out.println("\n"+"testQuery"+i+" executed correctly ");;

					}
				
				}
			 */
			frame.setVisible(false);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
	
	private static MessageConsole findConsole(String name) {
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
	/**
	 * @param model
	 * @return
	 */
	protected static String getTargerClassName(Model model) {
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
	
	private class SubmitBtn2ActionHandler implements MouseListener {

		JButton btn = null;
		
		public SubmitBtn2ActionHandler(JButton btn) {
			super();
			this.btn = btn;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
//			JOptionPane.showMessageDialog(c1, "Button2 Clicked!","Information",JOptionPane.INFORMATION_MESSAGE);

frame.setVisible(false);
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				
			
			String pathOfUmlFile="";
			IProject[] project=myWorkspaceRoot.getProjects();
			IFolder testfiles = null;
			IFolder outputFiles=null;
			
			for(IProject p : project)
			{
//				System.out.println(p.getLocation());
				if(p.isOpen())
				{
					System.out.println("Project with  " +p.getName()+" is Open");
					 IFolder inputFiles = p.getFolder("InputFiles");
					 IResource[] files = null;
					 try {
					files = inputFiles.members();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 for(IResource file:files)
					 {
						if(file.getFileExtension().equals("uml"))
						{
							pathOfUmlFile=file.getLocation().toString();
						testfiles=p.getFolder("src");
						outputFiles=p.getFolder("OutputFiles");
						IResource[] out=null;
						try {
							out = outputFiles.members();
						} catch (CoreException e) {
							// TODO Auto-generated catch block
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
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						outputFiles=p.getFolder("OutputFiles");
						//outputFiles=
						}
					 }
					  
				}
			}
			
			System.out.println(pathOfUmlFile);
			
			MessageConsole myConsole = findConsole("Console");
			myConsole.activate();
			MessageConsoleStream out = myConsole.newMessageStream();
			//out.println("Hello from Generic console sample action");

			if(pathOfUmlFile.length()==0)
			{
				return;
			}
			out.println("Reading Uml File...");

			StateMachineReader smReader = new StateMachineReader();
			UMLReader reader = new UMLReader();
			JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

			Model model = null;
			try {
				model = reader.loadModel((new File(pathOfUmlFile))
						.toURI().toString());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				javaCodeStructure = smReader.processTheModel(model);
			} catch (UnresolvedReferenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			String targetClassName=MainGUIClass.getTargerClassName(model);
			out.println("Uml file reading completed!!");
			ArrayList<StateMachineState> states;
			ArrayList<StateMachineTransition> transitions = null;

			states = smReader.getStates();
			transitions = smReader.getTransitions();

			
			//========================================
			StateMachineFlattening stateMachineFlattening = new StateMachineFlattening();
			ArrayList<StateMachineTransition> modifiedTransitions = stateMachineFlattening.getPathReadyTransitions(transitions);
			
			//System.out.println("\nTestPathsGeneration :");
			out.println("Generating test paths...");
			TestCase testCases=new TestCase();
			testCases.generateTestPaths(modifiedTransitions, null,null,new TestPath());
			out.println("Test paths generated!!");

			out.println("Test paths are :");


			String finals="";
			finals=testCases.printTestPaths(out);
			IFile file = outputFiles.getFile("TransitionTree.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				file.delete(true, null);
			}
			byte[] bytes = finals.getBytes();
		    InputStream source = new ByteArrayInputStream(bytes);
		    try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    IWorkbenchPage page = window.getActivePage();
		    IEditorDescriptor desc = PlatformUI.getWorkbench().
		    		getEditorRegistry().getDefaultEditor(file.getName());
/*
		    try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} */
		    MainClass mcc= new MainClass(targetClassName,modifiedTransitions,out,outputFiles,window,pathOfUmlFile,finals,testCases,testfiles,states);
		   
			System.out.println("\nTestCaseGeneration :");
	//		testCases.mapKeysAgainstPaths();
			System.out.println("\nAll Test Cases have been written to \"TestCases.txt\"");
			//========================================

			//generate junit test cases

			out.println("Generating JUNIT test cases");
		
		//	GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);
			
		//	GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
			//String text= abstractTestCases.createAbstractTestCaseFile(targetClassName);
			//	GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);

			//	nUnitTestCases.createnunitTestCaseFile(targetClassName);
			//			junitTestCases.createJunitTestCaseFile("Mario");
			
		//	junitTestCases.createJunitTestCaseFile(targetClassName,out,pathOfUmlFile);
	/*
			out.println("JUNIT test cases generated");
			
			
			file=outputFiles.getFile("Abstract.txt");

			//========================================
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				file.delete(true, null);
			}
			
			bytes = text.getBytes();
		    source = new ByteArrayInputStream(bytes);
		    try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		    desc = PlatformUI.getWorkbench().
		    		getEditorRegistry().getDefaultEditor(file.getName());

		    try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
			//========================================

			BufferedReader br=null;
			try {
				br = new BufferedReader(new FileReader(new File(targetClassName+"Tests.java")));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String s;
			finals="";
			try {
				while((s=br.readLine())!=null)
				{
					finals+=s+"\n";
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			file = testfiles.getFile(targetClassName+"Tests.java");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
				try {
					testfiles.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				file.delete(true, null);
			}
			
				bytes = finals.getBytes();
			    source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());

			    try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 
			
			file=outputFiles.getFile("States.txt");

			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
//				file.delete(true, null);
			}
			//========================================
			finals="";
			//file=outputFiles.getFile("States.txt");

			PrintWriter writer = null;
			try {
				//writer = new PrintWriter("States.txt");
				for (StateMachineState stateMachineState : states) {
					finals=finals+stateMachineState.getStateName()+"\n";
//					writer.println(stateMachineState.getStateName());
				}
				
			bytes = finals.getBytes();
			  source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());

			    try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 
			} finally {
			//	writer.close();
			}
			finals="";
			
			file=outputFiles.getFile("Transitions.txt");
			if(file.exists())
			{
				File f=new File(file.getLocation().toString());
				f.delete();
//				file.delete(true, null);
			}
			file=outputFiles.getFile("Transitions.txt");
			
			try {
				writer = new PrintWriter("Transitions.txt");
				for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
					finals=finals+stateMachineTransition.getTransitionName()+"\n";
//					
					
//					writer.println(stateMachineTransition.getTransitionName());
				}
				bytes = finals.getBytes();
				source = new ByteArrayInputStream(bytes);
			    try {
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    desc = PlatformUI.getWorkbench().
			    		getEditorRegistry().getDefaultEditor(file.getName());

			    try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				writer.close();
			}
			out.println("Executing test cases. . . . .");
				Result result = JUnitCore.runClasses(AccountTests.class);
				StringBuilder errors = new StringBuilder("Whoops! Following errors occurred!");
				boolean errorCheck = false;
				for(Failure failure : result.getFailures()) {
					errors.append("\n"+failure.toString());
					System.out.println(failure.toString());

				}


				for(int i=1;i<=result.getRunCount();i++)
				{
					if(errors.toString().contains("testQuery"+i))
					{
						out.println("\n"+"testQuery"+i+" didnt executed correctly ");
					}
					else
					{
						out.println("\n"+"testQuery"+i+" executed correctly ");;

					}
				
				}

*/

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}