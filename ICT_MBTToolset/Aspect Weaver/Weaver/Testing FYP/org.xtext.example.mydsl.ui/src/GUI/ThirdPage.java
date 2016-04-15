package GUI;



import javax.swing.JOptionPane;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import Aspect_OCL.ControllerOCL;

public class ThirdPage extends WizardPage {

	 private Composite container;
	 private static Text text_aspect,text_mapping,text_constraint,text_output;
	 private static Label lblSpecifyAspect,lblSpecifyMapping,lblSpecifyConstraint,lblSpecifydest;

	 public static boolean Finish=false;

	
	 public ThirdPage() {
		    super("Third Page");
		    setTitle("Select");
		    setDescription("provide aspect,mapping and constraint so that cross cutting concern written as aspect are weave with the actual constraint");
	  }
	 
	 public static void reInitControls() {
		  
		  Finish=false;
		  if(text_aspect!=null){
			  text_aspect.setText("");
		  }
		  if(text_mapping!=null){
			  text_mapping.setText("");
		  }
		  if(text_constraint!=null){
			  text_constraint.setText("");
		  }
		  if(text_output!=null){
			  text_output.setText("");
		  }
		  if(lblSpecifyAspect!=null){
			  lblSpecifyAspect.setText("");
		  }
		  if(lblSpecifyMapping!=null){
			  lblSpecifyMapping.setText("");
		  }
		  if(lblSpecifyConstraint!=null){
			  lblSpecifyConstraint.setText("");
		  }
		  if(lblSpecifydest!=null){
			  lblSpecifydest.setText("");
		  }
			  
	}
	
	 
	 @Override
	   public void createControl(final Composite parent) {
		 
	     container = new Composite(parent, SWT.NONE);
	     container.setLayout(null);
		
	        Label lblAspectfile = new Label(container, SWT.NONE);
			lblAspectfile.setBounds(22, 23, 97, 15);
			lblAspectfile.setText("Select Aspect File");
			
			lblSpecifyAspect = new Label(container, SWT.NONE);
			lblSpecifyAspect.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			lblSpecifyAspect.setBounds(148, 23,206, 15);
			lblSpecifyAspect.setText("");
		
			text_aspect = new Text(container, SWT.BORDER);
			text_aspect.setBounds(22, 44, 349, 21);
			
			Button btnaspect = new Button(container, SWT.NONE);
			btnaspect.addSelectionListener(new SelectionAdapter() {
			 	@Override
			 	public void widgetSelected(SelectionEvent e) {
			 		 FileDialog dialog = new FileDialog (parent.getShell(), SWT.OPEN); 
			 		   String[] filterExt = { "*.mydsl*" };
				       dialog.setFilterExtensions(filterExt);
			 	       String selected = dialog.open();
			 	       if(selected!=null)
			 	       {
			 	    	  lblSpecifyAspect.setText("");
			 	    	  text_aspect.setText(selected);
			 	       }
			 	}
			 });
			btnaspect.setBounds(391, 42, 75, 25);
			btnaspect.setText("Browse");
			
			Label lblMapping = new Label(container, SWT.NONE);
			lblMapping.setBounds(22, 79, 123, 15);
			lblMapping.setText("Select mapping folder");
			
			lblSpecifyMapping = new Label(container, SWT.NONE);
			lblSpecifyMapping.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			lblSpecifyMapping.setBounds(147, 79, 193, 15);
			lblSpecifyMapping.setText("");
			
			text_mapping = new Text(container, SWT.BORDER);
			text_mapping.setBounds(22, 108, 350, 21);
			
			Button btnmapping = new Button(container, SWT.NONE);
			btnmapping.addSelectionListener(new SelectionAdapter() {
			 	@Override
			 	public void widgetSelected(SelectionEvent e) {
			 		DirectoryDialog dialog = new DirectoryDialog(parent.getShell(), SWT.OPEN);
			 		String selected = dialog.open();
			 	       if(selected!=null)
			 	       {
			 	    	  lblSpecifyMapping.setText("");
			 	    	 text_mapping.setText(selected);
			 	       }
			 	}
			 });
			btnmapping.setBounds(391, 106, 75, 25);
			btnmapping.setText("Browse");
			
			Label lblSelectConstraintFile = new Label(container, SWT.NONE);
			lblSelectConstraintFile.setBounds(22, 148, 112, 15);
			lblSelectConstraintFile.setText("Select constraint file");
			
			lblSpecifyConstraint = new Label(container, SWT.NONE);
			lblSpecifyConstraint.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			lblSpecifyConstraint.setBounds(148, 148, 193, 15);
			lblSpecifyConstraint.setText("");
			
			text_constraint = new Text(container, SWT.BORDER);
			text_constraint.setBounds(22, 172, 350, 21);
			
			Button btnContraint = new Button(container, SWT.NONE);
			btnContraint.addSelectionListener(new SelectionAdapter() {
			 	@Override
			 	public void widgetSelected(SelectionEvent e) {
			 		 FileDialog dialog = new FileDialog (parent.getShell(), SWT.OPEN); 
			 		   String[] filterExt = { "*.txt*" };
				       dialog.setFilterExtensions(filterExt);
			 	       String selected = dialog.open();
			 	       if(selected!=null)
			 	       {
			 	    	  lblSpecifyConstraint.setText("");
			 	    	 text_constraint.setText(selected);
			 	       }
			 	}
			 });
			btnContraint.setBounds(391, 170, 75, 25);
			btnContraint.setText("Browse");
			
			Label lblSelectTheDestination = new Label(container, SWT.NONE);
			lblSelectTheDestination.setBounds(22, 207, 112, 15);
			lblSelectTheDestination.setText("Select file for output");
			
			lblSpecifydest = new Label(container, SWT.NONE);
			lblSpecifydest.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			lblSpecifydest.setBounds(148, 207, 201, 15);
			lblSpecifydest.setText("");
			
			text_output = new Text(container, SWT.BORDER);
			text_output.setBounds(22, 228, 351, 21);
			
			Button btnOutput = new Button(container, SWT.NONE);
			btnOutput.addSelectionListener(new SelectionAdapter() {
			 	@Override
			 	public void widgetSelected(SelectionEvent e) {
			 		 FileDialog dialog = new FileDialog (parent.getShell(), SWT.OPEN); 
			 		   String[] filterExt = { "*.txt*" };
				       dialog.setFilterExtensions(filterExt);
			 	       String selected = dialog.open();
			 	       if(selected!=null)
			 	       {
			 	    	  lblSpecifydest.setText("");
			 	    	 text_output.setText(selected);
			 	       }
			 	}
			 });
			btnOutput.setBounds(391, 226, 75, 25);
			btnOutput.setText("Browse");
			
			Button btnWeave = new Button(container, SWT.NONE);
			btnWeave.addSelectionListener(new SelectionAdapter() {
			 	@Override
			 	public void widgetSelected(SelectionEvent e) {
			 
			 		if(text_aspect.getText().equals(""))
			 		{
			 			lblSpecifyAspect.setText("* Please specify the aspect file");
			 		}
					
			 		if(text_mapping.getText().equals(""))
			 		{
			 			lblSpecifyMapping.setText("* Please specify the mapping folder");
			 		}
			 		if(text_constraint.getText().equals(""))
			 		{
						 lblSpecifyConstraint.setText("* Please specify the constraint file");
			 		}
			 		if(text_output.getText().equals(""))
			 		{
			 			lblSpecifydest.setText("* Please Specify the output file");
			 		}
			 		
			 		else
			 		{
			 			Finish=true;
			 		    setPageComplete(true);
			 			callAspectFunction();
			 			
			 		}
			 	}
			 });
			btnWeave.setBounds(391, 268, 75, 25);
			btnWeave.setText("Weave");
			
	     setPageComplete(false);
	     setControl(container);
	 }
	 
	
	 public void callAspectFunction(){
	
		 ControllerOCL _controller=new ControllerOCL();
		 _controller.Read_Aspect(text_aspect.getText());
		boolean mappingPresent= _controller.Read_Mapping(text_mapping.getText());
		
		if(mappingPresent==true){     //if mapping file is present in mapping folder
			
		 _controller.merge_OCL_Constraints(text_constraint.getText(),text_output.getText());
		 String info="Output is generated in "+text_output.getText()+" file";
		 JOptionPane.showMessageDialog(null,info,"Dialog",JOptionPane.INFORMATION_MESSAGE);
		 
		}
		

		 
		 
	 }
}
