package state.machine;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.JProgressBar;


public class Menu {

	private JFrame frame;
	private JTextField textField;
    Pattern pattern = Pattern.compile("\\.([^.]*)$");
    private JLabel ErrorLabelForBS;
    private JLabel ErrorLabelForAS;
    
	private Timer timer=null;
	private int count =0;
	JProgressBar progressBar;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 664, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAspectWeaver = new JLabel("Aspect Weaver");
		lblAspectWeaver.setForeground(Color.WHITE);
		lblAspectWeaver.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 22));
		lblAspectWeaver.setBounds(216, 11, 178, 42);
		frame.getContentPane().add(lblAspectWeaver);
		
		JLabel lblBaseStatemachine = new JLabel("Base Statemachine");
		lblBaseStatemachine.setForeground(Color.WHITE);
		lblBaseStatemachine.setFont(new Font("Simplified Arabic", Font.ITALIC, 17));
		lblBaseStatemachine.setBounds(35, 99, 175, 23);
		frame.getContentPane().add(lblBaseStatemachine);
		
		ErrorLabelForBS = new JLabel("");
		ErrorLabelForBS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ErrorLabelForBS.setForeground(Color.RED);
		ErrorLabelForBS.setBounds(183, 108, 351, 14);
		frame.getContentPane().add(ErrorLabelForBS);
		
	    ErrorLabelForAS = new JLabel("");
	    ErrorLabelForAS.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    ErrorLabelForAS.setForeground(Color.RED);
		ErrorLabelForAS.setBounds(205, 206, 329, 14);
		frame.getContentPane().add(ErrorLabelForAS);
		
		textField = new JTextField();
		textField.setBounds(35, 133, 383, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(35, 54, 387, 34);
		frame.getContentPane().add(progressBar);

		
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 JFileChooser sourceFileChooser = new JFileChooser();
				 sourceFileChooser.setMultiSelectionEnabled(true);
				 sourceFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	             sourceFileChooser.showOpenDialog(frame);
	                 
	               File[] sourceFiles = sourceFileChooser.getSelectedFiles();
	                 
	                for (File sourceFile: sourceFiles){ 
	                	
	                	textField.setText(sourceFile.getAbsolutePath());
	                } 
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBounds(442, 131, 92, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAspectStatemachines = new JLabel("Aspect Statemachines");
		lblAspectStatemachines.setForeground(Color.WHITE);
		lblAspectStatemachines.setFont(new Font("Simplified Arabic", Font.ITALIC, 17));
		lblAspectStatemachines.setBounds(39, 200, 171, 23);
		frame.getContentPane().add(lblAspectStatemachines);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 234, 383, 133);
		frame.getContentPane().add(scrollPane);

		final DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		scrollPane.setViewportView(list);
		
		//************   button for aspect state machine *****************//
		JButton btnBrowser = new JButton("Browse");
		btnBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 JFileChooser sourceFileChooser = new JFileChooser();
				 sourceFileChooser.setMultiSelectionEnabled(true);
				 sourceFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	             sourceFileChooser.showOpenDialog(frame);      
	                 
	               File[] sourceFiles = sourceFileChooser.getSelectedFiles();

		           for (File sourceFile: sourceFiles)
		           { 
		                model.addElement(sourceFile.getAbsolutePath());
		           }//for 

			}
		});
		btnBrowser.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnBrowser.setBounds(442, 234, 92, 34);
		frame.getContentPane().add(btnBrowser);
		
		JButton btnNewButton_1 = new JButton("Weave");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			    //******** take base statemachine file name ***********//
				String BaseStatemachines=textField.getText();
				String[] AspectStatemachine=new String[model.size()];
			
				 //******** take aspect statemachine file names and save it in an array ***********//
				for(int i=0;i<model.size();i++)
				{
					AspectStatemachine[i]=model.get(i).toString();
				}
				
				
				/*
				 * Check base state machine
				 * Check whether the user select a correct file or not
				 * User may select no file or any file having extension except than .uml
				 */
						
				//**********************Base StateMachine*********************************//
				boolean fileExtensionForBS=false;
				boolean fileExtensionForAS=false;
				
				if(textField.getText().equals(""))
				{
					ErrorLabelForBS.setText("Please select the base state machine");
				}
				
				else
				{
					fileExtensionForBS=CheckFileExtensionForBaseStateMachine(BaseStatemachines);
					if(fileExtensionForBS==false)
					{
						ErrorLabelForBS.setText("Please select the file having .uml extension");
					}//if
					
					else
						ErrorLabelForBS.setText("");

				}
				
				//***********************Aspect StateMachine********************************//
				if(model.size()==0)
				{
					ErrorLabelForAS.setText("Please select the aspect state machine");
				}
				
				
				else   
				{		
						String[] aspectStateMachine=new String[model.size()];
						for(int i=0;i<model.size();i++)
						{
						    	aspectStateMachine[i]=model.get(i).toString();	
						}//for
						      
						fileExtensionForAS=CheckFileExtensionForAspectStateMachine(aspectStateMachine);

						if(fileExtensionForAS==false)
						{
							ErrorLabelForAS.setText("Please select the file having .uml extension");
						}//if
							
						else
							ErrorLabelForAS.setText("");
				}//else
				
				if(fileExtensionForBS==true && fileExtensionForAS==true)
				{
					 timer.start();
					 
					Controller_SM c_obj=new Controller_SM();     ///call to weaver function for weaving the statemachine
					String a=textField_1.getText();
					
					c_obj.getStatemachines(BaseStatemachines, AspectStatemachine,a);
					
				}//if

			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton_1.setBounds(442, 333, 92, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();
				progressBar.setValue(0);
			}
		});
		btnNewButton_2.setBounds(442, 286, 94, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 390, 383, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		 timer=new Timer(10, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					count++;
					progressBar.setValue(count);
					
					if(progressBar.getValue()<100){
						// progressBar.setIndeterminate(true);
						progressBar.setValue(progressBar.getValue()+50);
				
					}//if
					if(progressBar.getValue()==100){
					 // progressBar.setIndeterminate(false);
						timer.stop();
					}
			}});

	}
	
	
	///****************************************//
	public boolean CheckFileExtensionForBaseStateMachine(String StatemachineName)
	{
		String fileExtension = null;
		boolean result=false;
		 Matcher matcher = pattern.matcher(StatemachineName);

 		if (matcher.find()) 
 		{
 			fileExtension = matcher.group(1);
 		}//if
 		
 		if(fileExtension.equals("uml"))  //if file except .uml extension is browse then it give error
		{
 			result=true;
		}//if
 		
 		return result;
	}
	
	///****************************************//
		public boolean CheckFileExtensionForAspectStateMachine(String[] StatemachineName)
		{
			String fileExtension = null;
			boolean result=true;
			for(int i=0;i<StatemachineName.length;i++)
			{
				 Matcher matcher = pattern.matcher(StatemachineName[i]);
				 if (matcher.find()) 
			 	 {
			 			fileExtension = matcher.group(1);
			 	 }//if

				 if(!fileExtension.equals("uml"))  //if file except .uml extension is browse then it give error
				 {
					   result=false;
			 			break;
				 }//if
				
			}//for

	 		return result;
		}
}
