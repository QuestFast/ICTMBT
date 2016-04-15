package integrated_plug_in.actions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
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
import Driver.StateMachineState;
import Driver.StateMachineTransition;
import Driver.TestCase;
import Driver.TestPath;


public class MainClass {

	private static String targetClassName="";
	private JFrame frame = new JFrame("Software Testing Tool Set");
	private static Container c1 = new Container();
	private JTextArea activityArea1;
	private static MessageConsoleStream out;
	private int count;
	private static ImageIcon nextIcon;
	private static IFolder outputFiles;
	private static ArrayList<StateMachineTransition> modifiedTransitions; 
	private static IWorkbenchWindow window;
	private static String pathOfUmlFile;
	private static TestCase testCases;
	private String finals;
	private static IFolder testfiles;
	private static ArrayList<StateMachineState> states;
	JButton nextBtn = new JButton("Next");

	JButton finishBtn = new JButton("Finish");
	private static final String JDT_NATURE = "org.eclipse.jdt.core.javanature";
	public MainClass(String targetClassName, ArrayList<StateMachineTransition> modifiedTransitions, MessageConsoleStream out, IFolder outputFiles, IWorkbenchWindow window, String pathOfUmlFile, String finals, TestCase testCases, IFolder testfiles, ArrayList<StateMachineState> states){
		this.targetClassName= targetClassName;
		this.modifiedTransitions= modifiedTransitions;
		this.out=out;
		this.outputFiles=outputFiles;
		this.states=states;
		this.window= window;
		this.finals=finals;
		this.testfiles=testfiles;
		this.pathOfUmlFile= pathOfUmlFile;
		this.testCases=testCases;
		init();

		count=0;
	}
	public MainClass(String name){
		//		umlfile=name;
	}


	public void init(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		c1 = frame.getContentPane();
		c1.setLayout(new BorderLayout());
		
//		JButton nextBtn = new JButton("Next");
		nextBtn.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,13));
		nextBtn.setToolTipText("Next");
		nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nextBtn.setBorder(BorderFactory.createEmptyBorder(5, 2, 5, 5));
		nextBtn.setPreferredSize(new Dimension(80,25));
		nextBtn.addMouseListener(new NextBtnActionHandler(nextBtn));

		finishBtn.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,13));
		finishBtn.setToolTipText("Finish");
		finishBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		finishBtn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 3));
		finishBtn.setPreferredSize(new Dimension(80,25));
		finishBtn.addMouseListener(new FinishBtnActionHandler(finishBtn));
		finishBtn.setEnabled(false);
		
		
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(2, 5, 3, 10));
		bottomPanel.add(nextBtn);
		bottomPanel.add(finishBtn);
		
		activityArea1 = new JTextArea();
		activityArea1.setLineWrap(false);
		activityArea1.setEditable(false);
		activityArea1.setText(finals);
		activityArea1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
		JScrollPane activityPane1 = new JScrollPane(activityArea1);
		activityPane1.setPreferredSize(new Dimension(800,500));
		activityPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10), BorderFactory.createLineBorder(new Color(200,200,200), 1)));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setLayout(new BorderLayout());
		toolBar.add(bottomPanel,BorderLayout.EAST);
		toolBar.setFloatable(false);
		toolBar.setRollover(true);
		c1.add(toolBar,BorderLayout.SOUTH);
		
		c1.add(activityPane1,BorderLayout.CENTER);
		
		frame.setResizable(true);
		frame.setBounds(0, 0, 800,600);
		frame.setMinimumSize(new Dimension(600,450));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		private class NextBtnActionHandler implements MouseListener {

		JButton btn = null;
		ImageIcon hoverIcon = new ImageIcon("images/icons/Next-hover.png");

		public NextBtnActionHandler(JButton btn) {
			super();
			this.btn = btn;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {

			//	TestCase testCases=new TestCase();
			String text="";
			if(count==0)
			{
				//testCases.generateTestPaths(modifiedTransitions, null,null,new TestPath());
				//activityArea1.setEditable(true);

				count++;
				GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
				text = abstractTestCases.createAbstractTestCaseFile(targetClassName);
				activityArea1.setText(text);
				nextBtn.setText("Generate");

			}

			/*
		    try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} */
			else if(count==1)
			{
				text=activityArea1.getText();
				//String cases=activityArea1.getText();


				System.out.println("\nTestCaseGeneration :");
				try {
					testCases.mapKeysAgainstPaths();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("\nAll Test Cases have been written to \"TestCases.txt\"");
				//========================================

				//generate junit test cases

				//	out.println("Generating JUNIT test cases");


				GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);


				//	GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);

				//	nUnitTestCases.createnunitTestCaseFile(targetClassName);
				//			junitTestCases.createJunitTestCaseFile("Mario");

				junitTestCases.createJunitTestCaseFile(targetClassName,out,pathOfUmlFile);


				out.println("JUNIT test cases generated");


				IFile file=outputFiles.getFile("Abstract.txt");

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
					//					file.delete(true, null);
				}

				byte[] bytes = text.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
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
				count++;
			}
			else if(count==2){
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
				IFile file = testfiles.getFile(targetClassName+"Tests.java");
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
					//					file.delete(true, null);
				}
				activityArea1.setEditable(true);
				activityArea1.setText(finals);
				count++;
			}
			else if(count==3){
				nextBtn.setEnabled(false);
			
				IFile file = testfiles.getFile(targetClassName+"Tests.java");
				finals=activityArea1.getText();
				byte[] bytes = finals.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
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
					//					file.delete(true, null);
					try {
						outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				//========================================
				finals="";
				//file=outputFiles.getFile("States.txt");

				PrintWriter writer = null;
				try {
					//writer = new PrintWriter("States.txt");
					for (StateMachineState stateMachineState : states) {
						finals=finals+stateMachineState.getStateName()+"\n";
						//						writer.println(stateMachineState.getStateName());
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
					try {
						outputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//					file.delete(true, null);
				}
				file=outputFiles.getFile("Transitions.txt");

				try {
					writer = new PrintWriter("Transitions.txt");
					for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
						finals=finals+stateMachineTransition.getTransitionName()+"\n";
						//						

						//						writer.println(stateMachineTransition.getTransitionName());
					}
					bytes = finals.getBytes();
					source = new ByteArrayInputStream(bytes);
					try {
						file.create(source, IResource.NONE, null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			/*		Result result = JUnitCore.runClasses(AccountTests.class);
					StringBuilder errors = new StringBuilder("Whoops! Following errors occurred!");
					boolean errorCheck = false;
					activityArea1.setText("");
					for(Failure failure : result.getFailures()) {
						errors.append("\n"+failure.toString());
						System.out.println(failure.toString());

					}


					for(int i=1;i<=result.getRunCount();i++)
					{
						if(errors.toString().contains("testQuery"+i))
						{
							activityArea1.setText(activityArea1.getText()+"\n"+"testQuery"+i+" didnt executed correctly ");
						}
						else
						{
							activityArea1.setText(activityArea1.getText()+"\n"+"testQuery"+i+" executed correctly ");;

						}
					
					}*/

					//frame.setVisible(false);
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
				activityArea1.setText("All files are written.");
				count++;
				nextBtn.setEnabled(false);
				finishBtn.setEnabled(true);
				//change class path for junit 
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				    IWorkspaceRoot root = workspace.getRoot();
				    // Get all projects in the workspace
				    IProject[] projects = root.getProjects();
				    // Loop over all projects
				    for (IProject project : projects) {
				      try {
				        // only work on open projects with the Java nature
				        if (project.isOpen() && project.isNatureEnabled(JDT_NATURE)) {
				          changeClassPath(project);
				        }
				      } catch (CoreException e) {
				        e.printStackTrace(); 
				      }
				    }
			}
			else if(count==4)
			{//frame.setVisible(false);
			}
		}

		private void changeClassPath(IProject project) throws JavaModelException {
		    IJavaProject javaProject = JavaCore.create(project);
		    IClasspathEntry[] entries = javaProject.getRawClasspath();
		    IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];

		    System.arraycopy(entries, 0, newEntries, 0, entries.length);

		    // add a new entry using the path to the container
		    Path junitPath = new Path("org.eclipse.jdt.junit.JUNIT_CONTAINER/4");
		    IClasspathEntry junitEntry = JavaCore
		        .newContainerEntry(junitPath);
		    newEntries[entries.length] = JavaCore
		        .newContainerEntry(junitEntry.getPath());
		    javaProject.setRawClasspath(newEntries, null);
		  }

		private int countdots(String string) {
			int i=0;
			for(int j=0;j<string.length();j++)
			{
				if(string.charAt(j)=='.')
				{
					i++;
				}
			}
			return i;
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			//btn.setIcon(this.hoverIcon);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			//btn.setIcon(nextIcon);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
//			if(count==1)
//				nextBtn.setEnabled(false);
		//	frame.setVisible(false);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}
	

		protected String getTargerClassName(Model model) {
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

	}
	private class FinishBtnActionHandler implements MouseListener {

		JButton btn = null;
		
		public FinishBtnActionHandler(JButton btn) {
			super();
			this.btn = btn;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
//			JOptionPane.showMessageDialog(c1, "Hi Fitash! :)","Information",JOptionPane.INFORMATION_MESSAGE);
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

}
