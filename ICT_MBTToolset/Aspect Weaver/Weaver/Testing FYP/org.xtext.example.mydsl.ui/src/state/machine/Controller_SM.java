package state.machine;

public class Controller_SM {
	
	public void getStatemachines(String BaseStatemachines,String[] AspectStatemachine,String destinationPath){
	   
		String BaseSM_Name=BaseStatemachines;
		
		String []AspectSM_Names=new String[AspectStatemachine.length];
		AspectSM_Names=AspectStatemachine;
		
		SMWeaver mSMWeaver=new SMWeaver();
		mSMWeaver.WeaveStateMachines(BaseSM_Name, AspectSM_Names,destinationPath);

	}


}
