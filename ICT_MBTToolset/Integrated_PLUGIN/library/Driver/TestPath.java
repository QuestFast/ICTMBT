package Driver;

import java.io.PrintWriter;
import java.util.ArrayList;

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
	 */
	public void print(PrintWriter writer) {
		writer.print("{ "+transitions.get(0).getSourceState() + " }, ");
		for (StateMachineTransition stateMachineTransition : transitions) {
			if(!stateMachineTransition.getGaurdCondition().equals("")){
				writer.print(stateMachineTransition.getGaurdCondition());}
		
			writer.print(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
		}writer.println();
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
