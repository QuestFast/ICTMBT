package state.machine;
import java.util.ArrayList;


public class AspectTransition extends StatemachineTransition{
	
	//public String[] Constraint;
	public ArrayList<String> Constraint;
	public String Stereotype;
	
	AspectTransition(String Name, String SourceState, String TargetState,
			String GuardCondition, ArrayList<String> Trigger, String Effect,ArrayList<String> Constraint, String Stereotype) {
		super(Name, SourceState, TargetState, GuardCondition, Trigger, Effect);
		
		
		this.Stereotype=Stereotype;
		this.Constraint=Constraint;

	}
	
	
	public ArrayList<String> getConstraint()
	{	
		return this.Constraint;
	}


}
