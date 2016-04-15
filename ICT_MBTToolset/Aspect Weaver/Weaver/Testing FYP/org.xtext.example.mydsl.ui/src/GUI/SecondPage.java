package GUI;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResource;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML212UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.wb.swt.SWTResourceManager;

import state.machine.Controller_SM;
import state.machine.UMLReader;




public class SecondPage extends WizardPage {
	
/*	 private Composite container;
	 private static Text text1,text_dest;
	 private static List list;
	 String[] filterExt = { "*.uml*" };
	 private static Label lblerrorbs,lblerroras,lblDest ;
	 public static boolean Finish=false;*/

	private Composite container;
	private static Text text_BS,text_dest;
	private static List list_AS;
	private static Label lblerrorbs,lblerroras,lblDest ;
	public static boolean Finish=false;
	 String[] filterExt = { "*.uml*" };
	
	  public SecondPage() {
		    super("Second Page");
		    setTitle("Select");
		    setDescription("Provide aspect and base satetmachine as well as output folder so that weaved result is generated in desire destination ");
	  }
	  
	  public static void reInitControls() {
		  
		  Finish=false;
		  if(text_BS!=null){
			  text_BS.setText("");
		  }
		  if(text_dest!=null){
			  text_dest.setText("");
		  }
		  if(list_AS!=null){
			  list_AS.removeAll();
		  }
		  if(lblerrorbs!=null){
			  lblerrorbs.setText("");
		  }
		  if(lblerroras!=null){
			  lblerroras.setText("");
		  }
		  if(lblDest!=null){
			  lblDest.setText("");
		  }
			  
	}
	  @Override
	   public void createControl(final Composite parent) {
		// TODO Auto-generated method stub
		  
		     container = new Composite(parent, SWT.NONE);
		     container.setLayout(null);
		     container.getShell().setSize(510, 510);
		     container.setVisible(false);
		     
		     Label label1 = new Label(container, SWT.NONE);
		     label1.setBounds(22, 23, 139, 15);
		     label1.setText("Select base statemachine");
		     
		     lblerrorbs = new Label(container, SWT.NONE);
		     lblerrorbs.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		     lblerrorbs.setBounds(163, 21,210, 15);
		     lblerrorbs.setText("");
			 
		     text_BS = new Text(container, SWT.BORDER);
		     text_BS.setBounds(22, 44, 349, 21);
		    
		     
		     Button btnBrowse_bs = new Button(container, SWT.NONE);
		     btnBrowse_bs.addSelectionListener(new SelectionAdapter() {
		    	 @Override
		    	public void widgetSelected(SelectionEvent e) {
		    		 FileDialog dialog = new FileDialog (parent.getShell(), SWT.OPEN); 
				       
				       dialog.setFilterExtensions(filterExt);
			 	       String selected = dialog.open();
			 	       if(selected!=null)
			 	       {
			 	    	   lblerrorbs.setText("");
			 	    	  text_BS.setText(selected);
			 	       }
		    	}
			});
		     btnBrowse_bs.setBounds(388, 42, 75, 25);
		     btnBrowse_bs.setText("Browse");
		     
		     
		
			 Label label2 = new Label(container, SWT.NONE);
			 label2.setBounds(22, 85, 150, 15);
			 label2.setText("Select Aspect Statemachine");
			 
			 
			 lblerroras = new Label(container, SWT.NONE);
			 lblerroras.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			 lblerroras.setBounds(178, 85, 223, 15);
			 lblerroras.setText("");
			 
			 list_AS = new List(container, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			 list_AS.setBounds(22, 106, 349, 94);
			 

			 Button btnBrowse_As = new Button(container, SWT.NONE);
			 btnBrowse_As.addSelectionListener(new SelectionAdapter() {
				 	@Override
				 	public void widgetSelected(SelectionEvent e) {
				       FileDialog dialog = new FileDialog (parent.getShell(), SWT.OPEN|SWT.MULTI); 
				       
				       dialog.setFilterExtensions(filterExt);
			 	       String selected = dialog.open();
			 	       
			 	       if(selected!=null)
			 	       {
			 	    	  lblerroras.setText("");
			 	          String path=dialog.getFilterPath();
			 	          path=path+"\\";
			 	    	  String[] files = dialog.getFileNames(); 
			 	    	  for(int i=0;i<files.length;i++)
			 	    	  {
			 	    		  String text=path+files[i];
			 	    		 list_AS.add(text);
			 	    	  }//for
			 	       }//if
     			}
				 });
			 btnBrowse_As.setBounds(388, 105, 75, 25);
			 btnBrowse_As.setText("Browse");
			 
			 Button btnRemove = new Button(container, SWT.NONE);
			 btnRemove.addSelectionListener(new SelectionAdapter() {
				 	@Override
				 	public void widgetSelected(SelectionEvent e) {
				 		list_AS.removeAll();
				 		
				 	}
				 });
			 btnRemove.setBounds(388, 136, 75, 25);
			 btnRemove.setText("Remove");
			 
			 Label lblSpecifyTheDestination = new Label(container, SWT.NONE);
			 lblSpecifyTheDestination.setBounds(22, 216, 156, 15);
			 lblSpecifyTheDestination.setText("Specify the output folder");
			 
			 text_dest = new Text(container, SWT.BORDER);
			 text_dest.setBounds(22, 237, 349, 21);
			 
			 lblDest = new Label(container, SWT.NONE);
			 lblDest.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			 lblDest.setBounds(189, 216, 210, 15);
			 lblDest.setText("");
			 
			 Button btnBrowse_dest = new Button(container, SWT.NONE);
			 btnBrowse_dest.addSelectionListener(new SelectionAdapter() {
				 	@Override
				 	public void widgetSelected(SelectionEvent e) {
				 		DirectoryDialog dialog = new DirectoryDialog(parent.getShell(), SWT.OPEN);
				 		String selected = dialog.open();
				 	       if(selected!=null)
				 	       {
				 	    	  lblDest.setText("");
				 	    	  text_dest.setText(selected);
				 	       }
				 	}
				 });
			 btnBrowse_dest.setBounds(388, 233, 75, 25);
			 btnBrowse_dest.setText("Browse");
			 
			 Button btnWeave = new Button(container, SWT.NONE);
			 btnWeave.addSelectionListener(new SelectionAdapter() {
				 	@Override
				 	public void widgetSelected(SelectionEvent e) {
				 		

				 		if(text_BS.getText().equals(""))
				 		{
				 			lblerrorbs.setText("* Please select the base state machine");
				 		}
				 		//System.out.println(list.getItemCount());
				 		if(list_AS.getItemCount()==0)
				 		{
				 			 lblerroras.setText("* Please select the aspect state machine");
				 		}
				 		
				 		if(text_dest.getText().equals(""))
				 		{
				 			 lblDest.setText("* Please specify the destination folder");
				 		}
				 		
				 		else
				 		{
				 			Finish=true;
				 		    setPageComplete(true);
				 			
				 			String BaseStatemachines=text_BS.getText();
				 			String Destination=text_dest.getText();
				 			
				 			String[] AspectStatemachine=new String[list_AS.getItemCount()];
							for(int i=0;i<list_AS.getItemCount();i++)
							{
								AspectStatemachine[i]=list_AS.getItem(i);	
							}//for
							      
				 			Controller_SM c_obj=new Controller_SM();     ///call to weaver function for weaving the statemachine			 			
				 			c_obj.getStatemachines(BaseStatemachines, AspectStatemachine,Destination);
				 		
				 	
				 		}
				 		
				    
				 	}
				 });
			 btnWeave.setBounds(388, 269, 75, 25);
			 btnWeave.setText("Weave");
			 
			 setPageComplete(false);
			 setControl(container);
	  }

	
	  
	@Override
	public boolean canFlipToNextPage() {
		  return false;
	}

}
