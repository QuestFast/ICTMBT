package state.machine;
//import java.util.ArrayList;


public class StateMachineStates
{
    public String Name;
    public boolean Visited;
    
    StateMachineStates(String Name)
    {
    	this.Name=Name;
    	this.Visited=false;	
    }
    
    public void setVisited()
    {
    	this.Visited=true;
    }

}
