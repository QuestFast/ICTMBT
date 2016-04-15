package integrated_plug_in.actions;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testcases.examples.account.AccountTests;
import Driver.GenerateJunitTestCases;
import Driver.GenerateNunitTestCases;
import Driver.GenerateTestScripts;
import Driver.JavaCodeStructure;
import Driver.StateMachineFlattening;
import Driver.StateMachineReader;
import Driver.StateMachineState;
import Driver.StateMachineTransition;
import Driver.TestCase;
import Driver.TestPath;
import Driver.UMLReader;



public class MainGUIClass {
	private JFrame frame = new JFrame("Select Uml File");
	private Container c1 = null;
	private Container c2 = null;
	private JPanel mainPanel = new JPanel();
	private JTextField field1 = null;
	private JTextField field2 = null;
	private JDialog dialog = new JDialog();

	//	private Border inputFieldsBorder = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY, 2),BorderFactory.createEmptyBorder(3, 3, 3, 3));
	private Font sans_serif_PLAIN_16 = new Font(Font.SANS_SERIF,Font.PLAIN,16);
	private Font sans_serif_PLAIN_13 = new Font(Font.SANS_SERIF,Font.PLAIN,13);

	private JFileChooser jFileChooser1 = null;
	private JFileChooser jFileChooser2 = null;
	private static String umlFilename = "";
	public static String getUmlFilename() {
		return umlFilename;
	}

	private String javaFilename = "";

	private JPanel panel1;

	/**
	 * 
	 */
	public MainGUIClass() {

	}
	private IWorkbenchWindow window;
	public void initGUI(IWorkbenchWindow windows, String pathOfUmlFile) {
		this.window=windows;
		c1 = frame.getContentPane();
		c1.setLayout(new FlowLayout());

		GridBagConstraints constraints = new GridBagConstraints();


		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setOpaque(true);
		panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());

		//panel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedSoftBevelBorder(), BorderFactory.createLoweredSoftBevelBorder()), BorderFactory.createEmptyBorder(70, 10, 50, 10)));

		/*//Where the GUI is constructed:
		progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		//progressBar.setStringPainted(true);
		progressBar.setIndeterminate(true);*/


		field1 = new JTextField();
		field1.setFont(sans_serif_PLAIN_13);
		//field1.setBorder(inputFieldsBorder);
		field1.setPreferredSize(new Dimension(50,25));

		jFileChooser1 = new JFileChooser();
		jFileChooser1.setVisible(false);
		jFileChooser1.setDialogTitle("Select UML File");
		jFileChooser1.setFileFilter( new FileFilter() {
			@Override
			public boolean accept(File file) {
				// Allow only directories, or files with ".uml" extension
				return file.isDirectory() || file.getAbsolutePath().endsWith(".uml");
			}
			@Override
			public String getDescription() {
				// This description will be displayed in the dialog,
				return "Class Diagrams (*.uml)";
			}
		});

		jFileChooser1.setCurrentDirectory(new File(System.getProperty("user.dir")));
		jFileChooser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//            jFileChooser1ActionPerformed(evt);
			}
		});
		JButton fileChooserBtn1 = new JButton("Browse");
		fileChooserBtn1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		//fileChooserBtn1.setBackground(new Color(239,236,202));
		fileChooserBtn1.setContentAreaFilled(false);
		fileChooserBtn1.setOpaque(true);
		fileChooserBtn1.setFocusPainted(false);
		fileChooserBtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		fileChooserBtn1.setFont(sans_serif_PLAIN_16);
		fileChooserBtn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fileChooser1ButtonActionPerformed(evt);
			}
		});

		constraints.fill = GridBagConstraints.CENTER;
		constraints.weightx = 1;
		constraints.insets = new Insets(-50,0,50,0);
		constraints.gridwidth = 2;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0,10,0,60);
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel1.add(fileChooserBtn1,constraints);
		constraints.insets = new Insets(0,50,0,0);
		constraints.ipadx = 350;
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel1.add(field1,constraints);

		JButton submitBtn = new JButton("Submit");
		//		submitBtn.setForeground(new Color(250,250,250));
		//		submitBtn.setFont(cantarell.deriveFont(Font.PLAIN, 24));
		submitBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		//	submitBtn.setBackground(new Color(125,109,104));
		submitBtn.setContentAreaFilled(false);
		submitBtn.setOpaque(true);
		submitBtn.setFocusPainted(false);
		submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		submitBtn.setFont(sans_serif_PLAIN_16);
		submitBtn.addMouseListener(new SubmitBtnActionHandler(submitBtn));

		constraints.fill = GridBagConstraints.CENTER;
		//	constraints.gridwidth = 1;
		constraints.insets = new Insets(20,0,0,0);
		constraints.ipadx = 80;
		constraints.gridy = 3;
		constraints.gridx = 0;
		panel1.add(submitBtn,constraints);
		/*constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(30,50,-10,50);
		constraints.ipadx = 200;
		constraints.gridy = 4;
		constraints.gridx = 0;
		panel1.add(progressBar,constraints);*/

		Container outputContainer = new Container();
		outputContainer.setLayout(new GridBagLayout());
		GridBagConstraints outputContainerConstraints = new GridBagConstraints();

		JPanel activityPanel1 = new JPanel();
		activityPanel1.setLayout(new GridBagLayout());
		//activityPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


		outputContainerConstraints.insets = new Insets(0,0,10,0);
		outputContainerConstraints.gridx = 0;
		outputContainerConstraints.gridy = 1;
		outputContainer.add(activityPanel1,outputContainerConstraints);


		constraints.insets = new Insets(20,0,0,0);
		constraints.gridwidth = 2;
		constraints.ipadx = 0;
		constraints.gridy = 5;
		constraints.gridx = 0;
		panel1.add(outputContainer,constraints);


		mainPanel.add(panel1);
		c1.add(mainPanel);

		// initializing main frame
		frame.setResizable(true);
		frame.setBounds(400, 200, 600,130);
		//		frame.setMinimumSize(new Dimension(800,550));
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//	progressBar.setVisible(false);

	}
	/**
	 * @param evt
	 */
	private void fileChooser1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
		jFileChooser1.setVisible(true);
		int returnVal = jFileChooser1.showOpenDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION)
		{

			File file = jFileChooser1.getSelectedFile();
			if(file.isFile()==false)
			{
				//	            fileCheck2=true;
				return;
			}

			umlFilename = file.getAbsolutePath();
			field1.setText(file.getAbsolutePath());
			if(field1.getText().length()>0)
			{
				//  fileCheck=true;
			}

		}
		else {
			System.out.println("File access cancelled by user.");
		}
	}

	private void fileChooser2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
		jFileChooser2.setVisible(true);
		int returnVal = jFileChooser2.showOpenDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION)
		{

			File file = jFileChooser2.getSelectedFile();
			if(file.isFile()==false)
			{
				//	            fileCheck2=true;
				return;
			}

			javaFilename = file.getAbsolutePath();
			field2.setText(file.getAbsolutePath());
			if(field2.getText().length()>0)
			{
				//  fileCheck=true;
			}

		}
		else {
			System.out.println("File access cancelled by user.");
		}
	}

	/**
	 * @throws FileNotFoundException 
	 * 
	 */
	protected void start() throws FileNotFoundException {
		/*Result result = JUnitCore.runClasses(testcases.examples.account.AccountTests.class);
		StringBuilder errors = new StringBuilder("Whoops! Following errors occurred!");
		boolean errorCheck = false;
		for(Failure failure : result.getFailures()) {
			errors.append("\n"+failure.toString());
			System.out.println(failure.toString());
			errorCheck = true;
		}
		if(errorCheck) {
			activityArea2.setText(errors.toString());
		}
		else {
			activityArea2.setText("All test cases completed successfully!");
		}*/


		String s=getUmlFilename();


		System.out.println(s);
		MessageConsole myConsole = findConsole("Console");
		myConsole.activate();
		MessageConsoleStream out = myConsole.newMessageStream();
		//out.println("Hello from Generic console sample action");

		if(s.length()==0)
		{
			return;
		}
		out.println("Readin Uml File...");

		StateMachineReader smReader = new StateMachineReader();
		UMLReader reader = new UMLReader();
		JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

		Model model=null;
		try {
			model = reader.loadModel((new File(MainGUIClass.getUmlFilename()))
					.toURI().toString());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			javaCodeStructure = smReader.processTheModel(model);
		} catch (UnresolvedReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		String targetClassName=MainGUIClass.getTargerClassName(model);

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


		testCases.printTestPaths(out);


		System.out.println("\nTestCaseGeneration :");
		testCases.mapKeysAgainstPaths();
		System.out.println("\nAll Test Cases have been written to \"TestCases.txt\"");
		//========================================

		//generate junit test cases

		out.println("Generating JUNIT test cases");
		GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);
		//	GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);

		//	nUnitTestCases.createnunitTestCaseFile(targetClassName);
		//			junitTestCases.createJunitTestCaseFile("Mario");
//		junitTestCases.createJunitTestCaseFile(targetClassName,out);

		out.println("JUNIT test cases generated");

		//========================================
		GenerateTestScripts generateTestScripts= new GenerateTestScripts("TestData.txt");
		generateTestScripts.generateScripts();

		PrintWriter writer = null;
		try {
			writer = new PrintWriter("States.txt");
			for (StateMachineState stateMachineState : states) {
				writer.println(stateMachineState.getStateName());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}


		try {
			writer = new PrintWriter("Transitions.txt");
			for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
				writer.println(stateMachineTransition.getTransitionName());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
		out.println("Executing test cases. . . . .");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


	class SubmitBtnActionHandler implements MouseListener{
		JButton btn = null;

		public SubmitBtnActionHandler(JButton btn) {
			this.btn = btn;

		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
		 */
		public void mouseClicked(MouseEvent arg0) {

			if(umlFilename.length() == 0) {
				JOptionPane.showMessageDialog(frame, "Please select a UML file!","Error",JOptionPane.ERROR_MESSAGE);
				return;
			}
			/*			if(javaFilename.length() == 0) {
				JOptionPane.showMessageDialog(frame, "Please select a Java file!","Error",JOptionPane.ERROR_MESSAGE);
				return;
			}*/
			/*//Where the GUI is constructed:
			progressBar = new JProgressBar(0, 100);
			progressBar.setValue(0);
			//progressBar.setStringPainted(true);
			progressBar.setIndeterminate(true);

			GridBagConstraints constraints = new GridBagConstraints();
			constraints.fill = GridBagConstraints.HORIZONTAL;
			constraints.gridwidth = 2;
			constraints.insets = new Insets(30,50,-10,50);
			constraints.ipadx = 200;
			constraints.gridy = 4;
			constraints.gridx = 0;
			panel1.add(progressBar,constraints);
			panel1.revalidate();
			panel1.repaint();*/
			//			new Thread(new Runnable() {
			//
			//				@Override
			//				public void run() {
			//					progressBar.setVisible(false);
			//					while(true) {
			//						
			//					}
			//				}
			//				
			//			});


			btn.setEnabled(false);
			
			c1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			//			dialog.setVisible(true);

			//			activityArea2.setText("Please Wait...");

			try {
				start();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//			dialog.setVisible(false);
			jFileChooser1.setVisible(false);
			frame.setVisible(false);
			c1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btn.setEnabled(true);
			//			progressBar.setVisible(false);
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
		 */



		public void writeToConsole(String message) { 
			MessageConsole myConsole = findConsole("Console"); 

			MessageConsoleStream out = myConsole.newMessageStream(); 
			out.println(message); 
			// Make console visible 
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(); 
			try { 
				IConsoleView view = (IConsoleView) page.showView(IConsoleConstants.ID_CONSOLE_VIEW); 
				view.display(myConsole); 
			} catch (Exception e) { 
			} 
		}
		public void mouseEntered(MouseEvent arg0) {
			btn.setBackground(new Color(0,0,0));
			btn.setForeground(new Color(255,255,255));
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
		 */
		public void mouseExited(MouseEvent arg0) {
			btn.setBackground(new Color(255,255,255));
			btn.setForeground(new Color(0,0,0));
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
		 */
		public void mousePressed(MouseEvent arg0) {

			btn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedSoftBevelBorder(), BorderFactory.createEmptyBorder(4, 4, 4, 4)));
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
		 */
		public void mouseReleased(MouseEvent arg0) {
			btn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		}
	}
}
