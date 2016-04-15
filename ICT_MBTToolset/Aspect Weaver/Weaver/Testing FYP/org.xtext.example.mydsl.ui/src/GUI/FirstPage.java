package GUI;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;


public class FirstPage extends WizardPage{
	
	 private Composite container;
	 private Button Radiobtn_TextWeaver;
	 private Button Radiobtn_StatemachineWeaver;
		  
	  public FirstPage() {
		  
		    super("First Page");
		    setTitle("Select a Weaver");
		    setDescription("Two kinds of weavers one is for aspectOCL and the other one is for aspect state machine. Users can select anyone of the option.");
	  }
	  
	  @Override
	   public void createControl(final Composite parent) {
		// TODO Auto-generated method stub
			 container = new Composite(parent, SWT.NONE);
			 
			 
			 GridLayout layout = new GridLayout();
			 container.setLayout(layout);
			 layout.numColumns = 1;
			 
			 Label label1 = new Label(container, SWT.NONE);
			 GridData gd_label1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			 gd_label1.heightHint = 22;
			 label1.setLayoutData(gd_label1);
			 label1.setText("Select any weaver");
			// label1.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
			 
		
			 Radiobtn_TextWeaver=new Button(container, SWT.RADIO);
			 Radiobtn_TextWeaver.setText("Aspect OCL weaver");
			 

		     Radiobtn_StatemachineWeaver=new Button(container, SWT.RADIO);
			 Radiobtn_StatemachineWeaver.setText("State machine weaver");
			
			 setControl(container);
			 
			
			
	  }
	  
	  @Override
	  public IWizardPage getNextPage() {
	  
		  if (Radiobtn_StatemachineWeaver.getSelection()) {
			  SecondPage.reInitControls();
			  return super.getNextPage();
			}
		  else{
			  ThirdPage.reInitControls();
		      return getWizard().getPage("Third Page");
		  }
	  }
	  
	  @Override
	public boolean canFlipToNextPage() {
		// TODO Auto-generated method stub
		return true;
	}

}
