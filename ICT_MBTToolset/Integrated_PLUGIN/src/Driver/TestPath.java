package Driver;

import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.ui.console.MessageConsoleStream;


/**
 * @author
 *
 */
public class TestPath {

	ArrayList<StateMachineTransition> transitions=new ArrayList<StateMachineTransition>();
	
	public TestPath(){
	}
	
	public void addNextStateMachineTransition(StateMachineTransition stateMachineTransition) {
		transitions.add(stateMachineTransition);
	}
	public String check() {
		String tPath = "{ "+transitions.get(0).getSourceState() + " }, ";
		for (StateMachineTransition stateMachineTransition : transitions)
		{
			tPath += stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ";
		}
		return tPath;
	}
	
	public ArrayList<StateMachineTransition> getStateMachineTransitions() {
		return this.transitions;
	}
	
	/**
	 * @return
	 */
	public ArrayList<StateMachineTransition> copyTransitions() {
		ArrayList<StateMachineTransition> transitions1=new ArrayList<StateMachineTransition>();
		for (StateMachineTransition stateMachineTransition : transitions) {
			transitions1.add(stateMachineTransition);
		}
		return transitions1;
	}
	
	/**
	 * @param writer
	 * @param out 
	 */
	public String print(PrintWriter writer, MessageConsoleStream out) {
		String finals="{ "+transitions.get(0).getSourceState() + " }, ";
		
		//writer.print("{ "+transitions.get(0).getSourceState() + " }, ");
		for (StateMachineTransition stateMachineTransition : transitions) {
			if(!stateMachineTransition.getGaurdCondition().equals("")){
			//	writer.print(stateMachineTransition.getGaurdCondition());
//				out.print(stateMachineTransition.getGaurdCondition());
				
				finals+=stateMachineTransition.getGaurdCondition();
				
				}
		
//			writer.print(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
//			out.print(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
			finals=finals+stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ";
		}//writer.println();
//		out.println();
//		out.println();
		finals+="\n";
		return finals;
	}
	
	public void consolePrint() {
		System.out.print(transitions.get(0).getSourceState()+", ");
		for (StateMachineTransition stateMachineTransition : transitions) {
			System.out.print(stateMachineTransition.getTransitionName() + ", " + stateMachineTransition.getTargetState() + ", ");
		}System.out.println();
	}
	
	/**
	 * @param writer
	 */
	public void mapKeysAgainsTransitions(PrintWriter writer)
	{
		for (StateMachineTransition stateMachineTransition : transitions) {
			if(stateMachineTransition.getTransitionName().equalsIgnoreCase("movebackward"))
			{
				writer.print("LeftKey { "+stateMachineTransition.getTransitionName()+" }, ");
			}
			else if(stateMachineTransition.getTransitionName().equalsIgnoreCase("moveforward"))
			{
				writer.print("RightKey { "+stateMachineTransition.getTransitionName()+" }, ");
			}
			else if(stateMachineTransition.getTransitionName().equalsIgnoreCase("Jump"))
			{
				writer.print("SPACE { "+stateMachineTransition.getTransitionName()+" }, ");
			}
			else
			{
				writer.print("{ "+stateMachineTransition.getTransitionName()+" }, ");
			}
		}
		writer.println();
	}
}