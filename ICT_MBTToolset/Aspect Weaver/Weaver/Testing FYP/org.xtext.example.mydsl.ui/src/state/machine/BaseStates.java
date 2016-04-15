package state.machine;
//import java.util.ArrayList;


public class BaseStates extends StateMachineStates{

    public String StateInvariant;
    public boolean StartState;
    public boolean FinalState;
    
	BaseStates(String Name,String StateInvariant) {
		super(Name);
		this.StateInvariant=StateInvariant;
		this.StartState=false;
		this.FinalState=false;
	}
	
	public String getStateInvariant()
	{
		return this.StateInvariant;
	}
	public void setStateInvariant(String StateInvariant )
	{
		this.StateInvariant=StateInvariant;
	}
	public void setStartState(boolean status)
	{
		this.StartState=status;
	}
	public void setFinalState(boolean status)
	{
		this.FinalState=status;
	}
}
