package mbttoolset.wizard;

import org.eclipse.jface.wizard.Wizard;
/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class MainWizard extends Wizard{

	protected FirstPage one;
	protected SecondPageTT two;
	protected ThirdPageATC three;
	protected FourthPageTCG four;

	public MainWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "MBT Toolset";
	}

	@Override
	public void addPages() {
		one = new FirstPage();
		two = new SecondPageTT();
		three = new ThirdPageATC();
		four = new FourthPageTCG();
		
		addPage(one);
		addPage(two);
		addPage(three);
		addPage(four);
	}

	@Override
	public boolean performFinish() {
		return true;
	}
}
