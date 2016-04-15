package Driver;

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

import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;




public class MainGUIClass {
	private JFrame frame = new JFrame("Integrated Software Testing Toolset");
	private Container c1 = null;
	private Container c2 = null;
	private JPanel mainPanel = new JPanel();
	private Color backgroundColor = new Color(245,245,248);
	private Color color1 = new Color(243,255,226);
	private JTextField field1 = null;
	private JTextField field2 = null;
	private JDialog dialog = new JDialog();
	
	private Border inputFieldsBorder = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY, 2),BorderFactory.createEmptyBorder(3, 3, 3, 3));
	private Font sans_serif_PLAIN_16 = new Font(Font.SANS_SERIF,Font.PLAIN,16);
	private Font sans_serif_PLAIN_13 = new Font(Font.SANS_SERIF,Font.PLAIN,13);
	
	private JFileChooser jFileChooser1 = null;
	private JFileChooser jFileChooser2 = null;
	private static String umlFilename = "";
	public static String getUmlFilename() {
		return umlFilename;
	}

	private JProgressBar progressBar;
	
	private String javaFilename = "";
	private JTextArea activityArea1 = null;
	private JTextArea activityArea2 = null;
	private JPanel panel1;
	
	/**
	 * 
	 */
	public void initGUI() {
		
		c1 = frame.getContentPane();
		c1.setLayout(new FlowLayout());
		c1.setBackground(backgroundColor);
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		
		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setOpaque(true);
		mainPanel.setBackground(backgroundColor);
		
		JLabel pleaseWaitLabel = new JLabel("Please wait...");
		pleaseWaitLabel.setFont(sans_serif_PLAIN_16);
		dialog.setLocationRelativeTo(null);
		dialog.setTitle("Please Wait...");
		dialog.add(pleaseWaitLabel);
		dialog.setSize(100, 40);
//		dialog.pack();
		dialog.setVisible(false);
		
		panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		panel1.setBackground(new Color(255,255,255));
		panel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedSoftBevelBorder(), BorderFactory.createLoweredSoftBevelBorder()), BorderFactory.createEmptyBorder(70, 10, 50, 10)));
		
		JLabel label1 = new JLabel("Integrated Software Testing Toolset");
		label1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,36));
		
		
		/*//Where the GUI is constructed:
		progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		//progressBar.setStringPainted(true);
		progressBar.setIndeterminate(true);*/
		
		
		field1 = new JTextField();
		field1.setFont(sans_serif_PLAIN_13);
		field1.setBorder(inputFieldsBorder);
		field1.setPreferredSize(new Dimension(300,35));
		
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
        JButton fileChooserBtn1 = new JButton("Select UML File");
		fileChooserBtn1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		fileChooserBtn1.setBackground(new Color(239,236,202));
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
		panel1.add(label1,constraints);
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
		submitBtn.setForeground(new Color(250,250,250));
//		submitBtn.setFont(cantarell.deriveFont(Font.PLAIN, 24));
		submitBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		submitBtn.setBackground(new Color(125,109,104));
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
		activityPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		JLabel resultLabel = new JLabel("Results");
		resultLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,26));
		
		activityArea1 = new JTextArea();
		activityArea1.setLineWrap(false);
		activityArea1.setEditable(false);
		activityArea1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

		JScrollPane activityPane1 = new JScrollPane(activityArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		activityPane1.setPreferredSize(new Dimension(800,350));
		activityPanel1.add(activityPane1);


		
		outputContainerConstraints.insets = new Insets(10,0,10,0);
		outputContainerConstraints.weightx = 1;
		outputContainerConstraints.gridwidth = 1;
		outputContainerConstraints.gridx = 0;
		outputContainerConstraints.gridy = 0;
		outputContainer.add(resultLabel,outputContainerConstraints);
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
		frame.setBounds(0, 0, 1000,700);
		frame.setMinimumSize(new Dimension(800,550));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
	 * 
	 */
	protected void start() {
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
		
		StateMachineReader smReader = new StateMachineReader();
		UMLReader reader = new UMLReader();
		JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

		Model model = null;
		try {
			model = reader.loadModel((new File(umlFilename))
					.toURI().toString());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			javaCodeStructure = smReader.processTheModel(model);
		} catch (UnresolvedReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		String targetClassName=getTargerClassName(model);
		

		ArrayList<StateMachineState> states;
		ArrayList<StateMachineTransition> transitions = null;
		
		states = smReader.getStates();
		transitions = smReader.getTransitions();
		
		//========================================
		StateMachineFlattening stateMachineFlattening = new StateMachineFlattening();
		ArrayList<StateMachineTransition> modifiedTransitions = stateMachineFlattening.getPathReadyTransitions(transitions);
		
		//System.out.println("\nTestPathsGeneration :");
		TestCase testCases=new TestCase();
		testCases.generateTestPaths(modifiedTransitions, null,null,new TestPath());
		
		//testCases.printTestPaths(null);
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
		GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);
		GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);
		
		nUnitTestCases.createnunitTestCaseFile(targetClassName);
//		junitTestCases.createJunitTestCaseFile("Mario");
		//junitTestCases.createJunitTestCaseFile(targetClassName);
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
		
	
	/*	Result result = JUnitCore.runClasses(AccountTests.class);
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
				activityArea1.setText(activityArea1.getText()+"\n"+"testQuery"+i+" didnt executed correctly ");;
			}
			else
			{
				activityArea1.setText(activityArea1.getText()+"\n"+"testQuery"+i+" executed correctly ");;
			}
		}
		*/

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
			activityArea1.setText("Please Wait...");
			
//			activityArea2.setText("Please Wait...");
			
			start();
//			dialog.setVisible(false);
			JOptionPane.showMessageDialog(frame, "FINISHED!!!","Complete",JOptionPane.INFORMATION_MESSAGE);
			c1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btn.setEnabled(true);
//			progressBar.setVisible(false);
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
		 */
		public void mouseEntered(MouseEvent arg0) {
			btn.setBackground(new Color(97,84,81));
		}
		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
		 */
		public void mouseExited(MouseEvent arg0) {
			btn.setBackground(new Color(125,109,104));
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
