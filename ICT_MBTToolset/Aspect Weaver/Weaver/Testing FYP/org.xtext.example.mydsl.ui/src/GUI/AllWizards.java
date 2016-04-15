package GUI;



import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;


public class AllWizards extends Wizard{
	
	protected FirstPage one;
	protected SecondPage second;
	protected ThirdPage third;
	
	  public AllWizards() {
		    super();
		    setNeedsProgressMonitor(true);
	  }

	  @Override
	  public String getWindowTitle() {
	    return "Selection";
	  }
	  
	  @Override
	  public void addPages() {
	    one = new FirstPage();
	    second = new SecondPage();
	    third = new ThirdPage();
	    
	    addPage(one);
	    addPage(second);
	    addPage(third);
	  }
	  
	  @Override
	  public boolean performFinish() {
	    return true;
	  }
	  
	  public boolean canFinish() {

		  IWizardPage[] pages = getPages();
		  if(getContainer().getCurrentPage() == second && getContainer().getCurrentPage().isPageComplete() && SecondPage.Finish==true)
		  {
			  
			  return true;
		  }
		  else if(getContainer().getCurrentPage() == third && getContainer().getCurrentPage().isPageComplete() && ThirdPage.Finish==true)
		  {
			  return true;
		  }

			return false;
		}



	
}
