package state.machine;
import java.util.ArrayList;


public class StatemachineTransition {
	
	public String Name;
	public String SourceState;
	public String TargetState;
	public String GuardCondition;
	public ArrayList<String> Trigger;
	//public String[] Trigger;
	public String Effect;
	
	StatemachineTransition(String Name,String SourceState,String TargetState,String GuardCondition,ArrayList<String> Trigger, String Effect)
	{
		this.Name=Name;
		this.SourceState=SourceState;
		this.TargetState=TargetState;
		this.GuardCondition=GuardCondition;
		this.Effect=Effect;
		this.Trigger=Trigger;
		
	}
	public void setGuard(String GuardCondition)
	{
		this.GuardCondition=GuardCondition;
	}
	
	public String getGuard()
	{
		return this.GuardCondition;
	}
	

	public String setEffect(String Effect)
	{
		return this.Effect=Effect;
	}
	
	public void addTrigger(String Trigger)
	{
		this.Trigger.add(Trigger);
	}
	
	
	
	public ArrayList<String> getTrigger()
	{
		return this.Trigger;
	}

}//class
