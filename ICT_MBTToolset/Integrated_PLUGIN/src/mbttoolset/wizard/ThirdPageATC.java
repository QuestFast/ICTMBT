package mbttoolset.wizard;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import Driver.GenerateJunitAbstractTestCases;
import Driver.TestCase;

/**
 * @author Hassan Sartaj
 * @version 1.0
 */
public class ThirdPageATC extends WizardPage{

	private Button button;
	private Label outputText;
	private StyledText abstractTests;
	private Composite container;
	public static TestCase testCases;
	public static String targetClassName="";

	public ThirdPageATC() {
		super("MBT Toolset");
		setTitle("Step-2: Abstract Test Cases Generation");
		setDescription("Text area will display generated abstract test cases.");
		String path = "icons/logo.png";
		final URL fullPathString = FileLocator.find(Platform.getBundle("plug"), new Path(path), null);
		ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
		setImageDescriptor(imageDesc);
	}
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
  
		button= new Button(container, SWT.BUTTON1);
		button.setText("Generate Abstract Test Cases");
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gd.horizontalSpan = layout.numColumns;
		button.setLayoutData(gd);
		
		abstractTests = new StyledText(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		abstractTests.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		abstractTests.setEditable(false);
		StyleRange style = new StyleRange();
	    style.background = container.getDisplay().getSystemColor(SWT.COLOR_WHITE);
	    abstractTests.setStyleRange(style);
		
	    outputText = new Label(container, SWT.LEFT);
		GridData lgd = new GridData(GridData.FILL_HORIZONTAL);
		lgd.horizontalSpan = layout.numColumns;
		outputText.setLayoutData(lgd);
		
	    setPageComplete(false);
		
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				if(targetClassName != null && testCases != null){
					GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
					String text = abstractTestCases.createAbstractTestCaseFile(targetClassName);
					abstractTests.setText(text);
					FourthPageTCG.testCases = testCases;
					FourthPageTCG.targetClassName = targetClassName;
					
					outputText.setText("-> Abstract test cases are generated.");
					Display display = container.getDisplay();
					outputText.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
				}
				setPageComplete(true);
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				
			}
		});
		
//		if(targetClassName != null && testCases != null){
//		GenerateJunitAbstractTestCases abstractTestCases= new GenerateJunitAbstractTestCases(testCases);
//		String text = abstractTestCases.createAbstractTestCaseFile(targetClassName);
//		abstractTests.setText(text);
//		}
	   
//		FourthPageTCG.testCases = testCases;
//		FourthPageTCG.targetClassName = targetClassName;
		
		setControl(container);
//		if(!testCases.getPaths().isEmpty() && text != null){
//			canFlipToNextPage();
//			setPageComplete(true);
//		}
//		setPageComplete(true);
//		setPageComplete(false);
	}
}
