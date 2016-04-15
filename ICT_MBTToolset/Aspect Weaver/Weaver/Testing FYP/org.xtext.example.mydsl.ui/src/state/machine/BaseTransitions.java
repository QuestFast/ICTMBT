package state.machine;
import java.util.ArrayList;


public class BaseTransitions extends StatemachineTransition{

	BaseTransitions(String Name, String SourceState, String TargetState,String GuardCondition, ArrayList<String> Trigger, String Effect)
	{
		super(Name, SourceState, TargetState, GuardCondition, Trigger, Effect);
	}

}
