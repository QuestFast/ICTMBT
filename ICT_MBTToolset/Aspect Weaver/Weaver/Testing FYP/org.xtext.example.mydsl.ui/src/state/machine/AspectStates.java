package state.machine;
import java.util.ArrayList;


public class AspectStates extends StateMachineStates{

	public ArrayList<String> Constraint;
	public String Stereotype;
	
	AspectStates(String Name,ArrayList<String> Constraint,String Stereotype) {
		
		super(Name);
		
	    this.Stereotype=Stereotype;
	    this.Constraint=Constraint;
	}

}
