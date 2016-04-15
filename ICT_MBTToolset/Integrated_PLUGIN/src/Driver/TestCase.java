package Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.ui.console.MessageConsoleStream;

/**
 * @author Zuria
 *
 */
public class TestCase {
	public ArrayList<TestPath> getPaths() {
		return paths;
	}

	public void mapKeysAgainstPaths() throws FileNotFoundException
	{
		PrintWriter writer=null;
		Integer i=0;
		    File file=new File("TestCases.txt");
			writer = new PrintWriter(file);
			for (TestPath tPath : paths) {
				i++;
				writer.print(i +":: ");
				//System.out.print(i +":: ");
				tPath.mapKeysAgainsTransitions(writer);
			}
		 
	}

	ArrayList<TestPath> paths=new ArrayList<TestPath>();
	ArrayList<TestPath> prefferedTestPaths=new ArrayList<TestPath>();

	/**
	 * @param path
	 * @param target
	 * @param source
	 * @return
	 */
	public Boolean isTargetDuplicateInPath(TestPath path, String target,String source) {
		Boolean isduplicate=false;
		ArrayList<StateMachineTransition> pathTransitions=new ArrayList<StateMachineTransition>();
		pathTransitions=path.getStateMachineTransitions();
		if(target!=null)
		{
			for (StateMachineTransition stateMachineTransition : pathTransitions) {
				
				if((stateMachineTransition.getTargetState()!=null && target.equalsIgnoreCase(stateMachineTransition.getTargetState()))
						|| (stateMachineTransition.getSourceState()!=null && source.equalsIgnoreCase(stateMachineTransition.getSourceState())))
					isduplicate=true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param transitions
	 * @param targetState
	 * @param transitionName
	 * @param testPath
	 * @return Boolean
	 */
	public Boolean generateTestPaths(ArrayList<StateMachineTransition> transitions, String targetState, String transitionName, TestPath testPath) {
		Boolean foundTerminal=false;
		if(testPath.getStateMachineTransitions().size()>0)
		{
			int visitedIndex=0;

			for (StateMachineTransition stateMachineTransition : transitions) {
				if(stateMachineTransition.getSourceState().equalsIgnoreCase(targetState) && !isTargetDuplicateInPath(testPath, stateMachineTransition.getTargetState(),stateMachineTransition.getSourceState()))
				{foundTerminal=true;

				ArrayList<StateMachineTransition> nonVisitedTransitions = getNonVisitedTransitions(transitions, visitedIndex);
				//----------------------------------------
				TestPath ttPath = copyPreviousTestPath(testPath);
				ttPath.addNextStateMachineTransition(stateMachineTransition);
				//----------------------------------------
				foundTerminal=generateTestPaths(nonVisitedTransitions, stateMachineTransition.getTargetState(), stateMachineTransition.getTransitionName(), ttPath);
				}
				visitedIndex++;
			}
			if(!foundTerminal)
			{
				//remove duplicate paths
				String tstPth = testPath.check();
				if(!checkTestPaths(tstPth))
				{
					System.out.println(tstPth);
					paths.add(testPath);
					foundTerminal=true;
				}
			}
		}

		else
		{
			for(StateMachineTransition stateMachineTransition:transitions)
			{
				String startPathFromState="";
				if(stateMachineTransition.isStart())
				{
					startPathFromState=stateMachineTransition.getSourceState();
					for (int i = 0; i < transitions.size(); i++) {
						if (transitions.get(i).getSourceState().equalsIgnoreCase(startPathFromState)) {
							testPath=new TestPath();
							testPath.addNextStateMachineTransition(transitions.get(i));

							foundTerminal=true;
							foundTerminal=generateTestPaths(transitions, transitions.get(i).getTargetState(), transitions.get(i).getTransitionName(), testPath);
						}
					}		

				}

			}
		}
		return foundTerminal;

	}


	public Boolean checkTestPaths(String tp)
	{
		for (TestPath tPath : paths)
		{
			if(tPath.check().equalsIgnoreCase(tp))
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @param tPath
	 * @return TestPath
	 */
	public TestPath copyPreviousTestPath(TestPath tPath) {
		TestPath ttPath=new TestPath();
		for (StateMachineTransition stateMachineTransition2 : tPath.getStateMachineTransitions()) {
			ttPath.addNextStateMachineTransition(stateMachineTransition2);
		}
		return ttPath;
	}


	/**
	 * 
	 * @param transitions
	 * @param visitedIndex
	 * @return ArrayList<StateMachineTransition>
	 */
	public ArrayList<StateMachineTransition> getNonVisitedTransitions(
			ArrayList<StateMachineTransition> transitions, int visitedIndex) {
		ArrayList<StateMachineTransition> nonVisitedTransitions=new ArrayList<StateMachineTransition>();
		for (StateMachineTransition sMTransition : transitions) {
			nonVisitedTransitions.add(sMTransition);
		}
		nonVisitedTransitions.remove(visitedIndex);
		return nonVisitedTransitions;
	}
	
	
	public String printTestPaths(MessageConsoleStream out) {
		PrintWriter writer=null;
		Integer i=0;
		String finals="";
		
		try {
			//writer = new PrintWriter("/Users/Fitash/Documents/workspace/Plugin/Integrated_PLUGIN/Data/TransitionTree.txt");
			for (TestPath tPath : paths) {
				finals=finals+"\n";
				i++;
			//	writer.print(i +":: ");
//				out.print(i +":: ");
				finals=finals+i +":: ";
				finals=finals+tPath.print(writer,out);
			}
		}
		finally {
		//	writer.close();
		}
		return finals;
		
		
	}
	
	public void printPathsOnConsole() {
		Integer i=0;
			for (TestPath tPath : paths) {
				i++;
				System.out.print(i +":: ");
				tPath.consolePrint();
			}
	}


	/**
	 * 
	 * @param transition
	 * @param modifiedTransitions
	 * @return Boolean
	 */
	public Boolean containsTransition(StateMachineTransition transition, ArrayList<StateMachineTransition> modifiedTransitions) {
		for (StateMachineTransition stateMachineTransition : modifiedTransitions) {
			if(transition.getTransitionName()!=null && stateMachineTransition.getTransitionName().equalsIgnoreCase(transition.getTransitionName()) &&
					(transition.getSourceState()!=null && stateMachineTransition.getSourceState().equalsIgnoreCase(transition.getSourceState())) &&
					(transition.getTargetState()!=null && stateMachineTransition.getTargetState().equalsIgnoreCase(transition.getTargetState())) &&
					transition.getRegionNo().equalsIgnoreCase(stateMachineTransition.getRegionNo()))
			{
				return true;
			}
		}
		return false;
	}
	

}
