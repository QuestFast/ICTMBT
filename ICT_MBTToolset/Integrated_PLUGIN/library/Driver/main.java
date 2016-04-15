package Driver;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class main {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
	/*	XmlReader xmlReader=new XmlReader();
		xmlReader.readXml("generatedData.xml");
		*/
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		MainGUIClass guiObj = new MainGUIClass();
		guiObj.initGUI();
		
		
		
		/*StateMachineReader smReader = new StateMachineReader();
		UMLReader reader = new UMLReader();
		JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

		Model model = reader.loadModel((new File("InputFiles/accountStateMachine.uml"))
				.toURI().toString());
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
		
		testCases.printTestPaths();
		System.out.println("\nTestCaseGeneration :");
		testCases.mapKeysAgainstPaths();
		System.out.println("\nAll Test Cases have been written to \"TestCases.txt\"");
		//========================================
		
		//generate junit test cases
		GenerateJunitTestCases junitTestCases = new GenerateJunitTestCases(testCases);
		GenerateNunitTestCases nUnitTestCases= new GenerateNunitTestCases(testCases);
		
		nUnitTestCases.createnunitTestCaseFile(targetClassName);
//		junitTestCases.createJunitTestCaseFile("Mario");
		junitTestCases.createJunitTestCaseFile(targetClassName);
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
		}*/
	}

	/*public static String getTargerClassName(Model model) {
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
	}*/
	
}
