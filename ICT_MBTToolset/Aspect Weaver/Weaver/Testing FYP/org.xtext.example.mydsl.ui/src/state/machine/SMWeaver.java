package state.machine;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class SMWeaver {
	
public void WeaveStateMachines(String BaseSM_Name,String[] AspectSM_Names,String destinationPath) {
		
   try{
		   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	
		  //************* check that whether we browse aspect statemachine in place of base statemachine

			StateMachineReader baseSMobj=new StateMachineReader();
			baseSMobj.ReadStateMachines(BaseSM_Name);
			
			ArrayList<BaseTransitions> Basetransition=baseSMobj.getBaseTransition();
		    ArrayList<BaseStates> Basestates=baseSMobj.getBaseStates();

	        boolean errorResult=false; 
		
			for(int i=0;i<AspectSM_Names.length;i++)
			{
				
				 StateMachineReader aspectSMobj=new StateMachineReader();
			     aspectSMobj.ReadStateMachines(AspectSM_Names[i]);
				
			     ArrayList<AspectTransition> Aspecttransition=aspectSMobj.getAspectTransition();
			     ArrayList<AspectStates> Aspectstates=aspectSMobj.getAspectStates();
			  
			     errorResult=weaving(Basestates,Basetransition,Aspectstates,Aspecttransition);

			   /*  for(int j=0;j<Basetransition.size();j++)
			     System.out.println(Basetransition.get(j).SourceState+"--"+Basetransition.get(j).TargetState+"---"+Basetransition.get(j).Trigger.size());*/
			     if(errorResult==false)
			     {
				    UMLWriting umlObj=new UMLWriting();
				    umlObj.CreateUml(Basestates, Basetransition,destinationPath);
					String info="Base State machine has been weaved\nOutput generated in "+destinationPath
							    +"\n folder having the file called NewModel.uml";
					JOptionPane.showMessageDialog(null,info,"Dialog",JOptionPane.INFORMATION_MESSAGE);
				 }
			    else   //if(errorResult==true)
			    	break;
			  
			}//for
		}//try
		catch(Exception e)
   		{
			System.out.println(e);
		}
	}
	
	
	//*********************************************************************************************//
	
	public boolean weaving(ArrayList<BaseStates> Basestates, ArrayList<BaseTransitions> Basetransition,ArrayList<AspectStates> Aspectstates,ArrayList<AspectTransition> Aspecttransition)
	{
	     boolean errorResult=false;
	     
	     errorResult=WeaveTransition(Basestates,Basetransition,Aspectstates,Aspecttransition);
	     
	     if(errorResult==false)
	    	 errorResult=WeaveStates(Basestates,Basetransition,Aspectstates,Aspecttransition);

	    	 
	     return errorResult;

	}//weaving
	
	//*********************************************************************************************//
	 public boolean WeaveStates(ArrayList<BaseStates> Basestates, ArrayList<BaseTransitions> Basetransition,ArrayList<AspectStates> Aspectstates,ArrayList<AspectTransition> Aspecttransition)
	 {
			boolean errorResult=false;
			for(int i=0;i<Aspectstates.size();i++)
			{
				if(Aspectstates.get(i).Visited==false)
				{
					if(Aspectstates.get(i).Stereotype.contains("Pointcut"))
					{	
						 ArrayList<String> State=readStatePointcutConstraints(Aspectstates.get(i),Basestates,Basetransition);
						 if(State.size()==0)
						 {
							 errorResult=true;
							 break;
						 }//if
					}
					
					else if(Aspectstates.get(i).Stereotype.contains("Introduction"))  //State contain Introduction stereotype
					{
						AddNewIntroState(Basestates,Aspectstates.get(i));
					}
				}
			}//for
			
			return errorResult;
	 }
	 
	//*********************************************************************************************//
	public void AddNewIntroState(ArrayList<BaseStates> Basestates, AspectStates aspectState)
	{
		BaseStates newState=new BaseStates(aspectState.Name,null);
		newState.setVisited();
		Basestates.add(newState);
	}
	//*********************************************************************************************//
	public boolean WeaveTransition(ArrayList<BaseStates> Basestates, ArrayList<BaseTransitions> Basetransition,ArrayList<AspectStates> Aspectstates,ArrayList<AspectTransition> Aspecttransition)
	{
		boolean errorResult=false;
		for(int i=0;i<Aspecttransition.size();i++)
		{
			AspectTransition transition=Aspecttransition.get(i);
			
			if(transition.Stereotype.contains("Pointcut"))
			{	
				markStatesVisited(transition,Aspectstates);
				errorResult=IdentifyPointcutConstraints(transition,Basetransition);
			}
			
			else if(transition.Stereotype.contains("Introduction"))
			{
			
				markStatesVisited(transition,Aspectstates); 
				errorResult=IdentifyIntoductionTransition(transition,Aspectstates,Basestates,Basetransition);
			}
	
		}//for
		
		return errorResult;
	}
	//*********************************************************************************************//
	public boolean IdentifyIntoductionTransition(AspectTransition aspectTransition,ArrayList<AspectStates> Aspectstates,ArrayList<BaseStates> Basestates, ArrayList<BaseTransitions> Basetransition)
	{
		boolean errorResult=false;
		ArrayList<String> States=new ArrayList<String>();
		String sourceState=aspectTransition.SourceState.trim();
		String targetState=aspectTransition.TargetState.trim();
				
		///get state whole information
		AspectStates sourceStateInfo=getStateInfo(sourceState,Aspectstates);
		AspectStates targetStateInfo=getStateInfo(targetState,Aspectstates);
		
		if(sourceStateInfo.Stereotype.contains("Pointcut") && targetStateInfo.Stereotype.contains("Pointcut"))
		{
			ArrayList<String> sourceStates=readStatePointcutConstraints(sourceStateInfo,Basestates,Basetransition);
			ArrayList<String> targetStates=readStatePointcutConstraints(targetStateInfo,Basestates,Basetransition);
			
			if(sourceStates.size()>0 && targetStates.size()>0)
			{
				if(sourceStates.size()>1)
				{
					for(int i=0;i<sourceStates.size();i++)
					{
					  addNewTransitionsInBaseTransitions(Basetransition,sourceStates.get(i),targetStates.get(0),aspectTransition); //multiple source states with one target state
					}
	
					
				}//if
				else
				{
	     			for(int i=0;i<targetStates.size();i++)
					{
						addNewTransitionsInBaseTransitions(Basetransition,sourceStates.get(0),targetStates.get(i),aspectTransition); //multiple target states with one source state
					}
					
					
				}//else
			
			}//if
			
			else
			  errorResult=true;
			
		}//if
		else if(targetStateInfo.Stereotype.contains("Introduction"))   //target contain introduction stereotype
		{	
		   
			States=readStatePointcutConstraints(sourceStateInfo,Basestates,Basetransition); // pass "sourceStateInfo" state bcz it contain pointcut constraint
			if(States.size()==0)errorResult=true;
			for(int i=0;i<States.size();i++)
			{
			     addNewTransitionsInBaseTransitions(Basetransition,States.get(i),targetStateInfo.Name,aspectTransition); //multiple source states with one target state
			}
			
		}//if
		
		else      //source contain introduction stereotype
		{
			States=readStatePointcutConstraints(targetStateInfo,Basestates,Basetransition);
			if(States.size()==0)errorResult=true;
			for(int i=0;i<States.size();i++)
			{
				addNewTransitionsInBaseTransitions(Basetransition,sourceStateInfo.Name,States.get(i),aspectTransition); //multiple target states with one source state
			}
			
		}//else
	
		return  errorResult;
	}
	//*********************************************************************************************//
	
	//*********************************************************************************************//
	public void addNewTransitionsInBaseTransitions(ArrayList<BaseTransitions> Basetransition,String sourceState,String targetState,AspectTransition aspectTransition)
	{
		///  Add new Transitions //////
		BaseTransitions newTransition=new BaseTransitions(aspectTransition.Name, sourceState, targetState, aspectTransition.GuardCondition, aspectTransition.Trigger, aspectTransition.Effect);
		Basetransition.add(newTransition);
		
	}
	
	
	//*********************************************************************************************//
	public ArrayList<String> readStatePointcutConstraints(AspectStates aspectState,ArrayList<BaseStates> Basestates,ArrayList<BaseTransitions> Basetransition)
	{
	   
		boolean errorResult=false;
		ArrayList<String> States=new ArrayList<String>();
		String Type="";
		for(int j=0;j<aspectState.Constraint.size();j++)
		{
			
			if(aspectState.Constraint.get(j).contains("Pointcut"))
			{
			     String[] PointcutConstraint=aspectState.Constraint.get(j).split(",");
			    
			     for(int i=0;i<PointcutConstraint.length;i++)
			     {
			    	 if(PointcutConstraint[i].contains("type"))  /// PointConstraint[i]=type=SelectionType::Subset
						{
							Type=getType(PointcutConstraint[i].trim());
							
							
							if(Type.equals("All"))
							{
								States=getBaseStates(Type,"",Basestates);
								
								
							}//if
							
							
						}//if  
						

						if(PointcutConstraint[i].contains("selectionConstraint"))
						{
							
							States=getBaseStates(Type,PointcutConstraint[i].trim(),Basestates);
							if(States.size()==0)
								break;
							
						}//if
						
						if(PointcutConstraint[i].contains("beforeAdvice"))
						{
							errorResult=ReadAdviceOnStates(aspectState,PointcutConstraint[i],States,Basestates,"Before",Basetransition);
						    if(errorResult==true)
						    	break;
						}
						
					    if(PointcutConstraint[i].contains("afterAdvice"))
						{
					    	errorResult=ReadAdviceOnStates(aspectState,PointcutConstraint[i],States,Basestates,"After",Basetransition);
					    	if(errorResult==true)
						    	break;
						}
						
						if(PointcutConstraint[i].contains("aroundAdvice"))
						{
							
							errorResult=ReadAdviceOnStates(aspectState,PointcutConstraint[i],States,Basestates,"Around",Basetransition);
							if(errorResult==true)
						    	break;
						}
						

			    	 
			    	 
			     }//for
				
			}//if
			
		}//for
		
		return States;
		
	}
	
	//*********************************************************************************************//
	public boolean ReadAdviceOnStates(AspectStates aspectState,String PointcutConstraint,ArrayList<String> StatesForWeaving,ArrayList<BaseStates> baseStates,String Pointcut_AdviceType,ArrayList<BaseTransitions> Basetransition)
	{
		/*
		 * beforeAdvice="CheckNumberOfCallsBeforeAdvice"
		 * AdviceType=Before,After,Around
		 */
		boolean errorResult=false;
		int errorCounter=0;
		String Pointcut_AdviceName="";
		Pointcut_AdviceName=PointcutConstraint.substring(PointcutConstraint.indexOf("\"")+1, PointcutConstraint.length()-1).trim(); //AdviceName=AddGuardBeforeAdvice
		ArrayList<String> StateConstraint=aspectState.Constraint;

		for(int i=0;i<StateConstraint.size();i++)
		{
            String[] TokenTransition=StateConstraint.get(i).split(",");
			
			/*
			 * AdviceType= Before,After,Around,Introduction,Pointcut
			 */
			String AdviceType=TokenTransition[0].substring(TokenTransition[0].indexOf("<<")+2, TokenTransition[0].indexOf(">>")).trim();	
			String AdviceName=TokenTransition[0].substring(TokenTransition[0].indexOf("\"")+1, TokenTransition[0].length()-1).trim();	
			   
		
			if(AdviceType.equals(Pointcut_AdviceType) && AdviceName.equals(Pointcut_AdviceName))
			{
				errorCounter++;
				//String AdviceConstraint define the invariance that is added in the state invariant
				String AdviceConstraint=TokenTransition[1];
				
				if(AdviceConstraint.contains("inv")) // in case of before and after when invariant is added in state
				{
				   AdviceConstraint=TokenTransition[1].substring(TokenTransition[1].indexOf(":")+1, TokenTransition[1].length()-1).trim();
				}
				else  // in case of around advice
				{
					 AdviceConstraint=TokenTransition[1].substring(TokenTransition[1].indexOf("\"")+1, TokenTransition[1].length()-1).trim();
					
				}
				WeaveStates(AdviceType,AdviceConstraint,StatesForWeaving,baseStates, Basetransition);
				 
			}	 
		}//for
		
		if(errorCounter==0)
		{
			String error="No "+Pointcut_AdviceType+" advice \n is present on state";
			JOptionPane.showMessageDialog(null,error,"Dialog",JOptionPane.ERROR_MESSAGE);	
			errorResult=true;
		}//if
		
		return errorResult;
	}
	
	//*********************************************************************************************//
	public void WeaveStates(String AdviceType,String AdviceConstraint,ArrayList<String> StatesForWeaving,ArrayList<BaseStates> baseStates,ArrayList<BaseTransitions> Basetransition)
	{
		if(AdviceType.equals("Before") || AdviceType.equals("After"))
		{
			
			for(int i=0;i<baseStates.size();i++)
			{
				for(int j=0;j<StatesForWeaving.size();j++)
				{
					if(baseStates.get(i).Name.equals(StatesForWeaving.get(j)))
					{
						if(baseStates.get(i).StateInvariant!=null)  //StateInvaraint is already present the in this case concatenate the new state invariant with the already existing invariant
						{
							String NewStateInvariant=baseStates.get(i).getStateInvariant();
							NewStateInvariant=NewStateInvariant+" and "+AdviceConstraint;
							baseStates.get(i).setStateInvariant(NewStateInvariant);
							//System.out.println("1");
						}
						else  // no state invariant exist before
						{//System.out.println("2");
							baseStates.get(i).setStateInvariant(AdviceConstraint);
							//System.out.println("2: "+baseStates.get(i).getStateInvariant());
						}
					}
				}
			}//for
		}//Before-After
		
		else  //Around
		{
			for(int i=0;i<baseStates.size();i++)
			{
				for(int j=0;j<StatesForWeaving.size();j++)
				{
					if(baseStates.get(i).Name.equals(StatesForWeaving.get(j)))
					{
						UpdateTransitionSourceOrTarget(baseStates.get(i).Name,AdviceConstraint,Basetransition);  // in case of around if state name changes than transition source or target is also going to change

						baseStates.get(i).Name=AdviceConstraint;
					}//if
				}//for
			}//for	
		}//else
	}
	
	//*********************************************************************************************//
	public void UpdateTransitionSourceOrTarget(String OldStateName,String UpdatedStateName,ArrayList<BaseTransitions> Basetransition)
	{
		for(int i=0;i<Basetransition.size();i++)
		{
			if(Basetransition.get(i).SourceState.trim().equals(OldStateName))
			{
				Basetransition.get(i).SourceState=UpdatedStateName;
			}//if
			
			if(Basetransition.get(i).TargetState.trim().equals(OldStateName))
			{
				Basetransition.get(i).TargetState=UpdatedStateName;
			}//if
		}//for
		
	}
	//*********************************************************************************************//
	public ArrayList<String> getBaseStates(String Type,String selectionConstraint,ArrayList<BaseStates> Basestates)
	{
		ArrayList<String> States=new ArrayList<String>();
		
		
		
		if(Type.equals("Subset"))
		{
			String StateNotPresent="";
			String[] stateName=null;
			selectionConstraint=selectionConstraint.trim();
			selectionConstraint=selectionConstraint.substring('\"',selectionConstraint.length()-1).trim();
			
			
			if(selectionConstraint.contains("="))
			{
				String[] tempList=selectionConstraint.split("or"); 
				stateName=new String[tempList.length];
				for(int i=0;i<tempList.length;i++)    
				{
					String[] temp=tempList[i].trim().split("=");
					temp[1]=temp[1].trim();
					temp[1]=temp[1].substring(temp[1].indexOf('\'')+1, temp[1].length()-1).trim();
					//States.add(statesName[1]);
					
					boolean ans=check_Existance_Of_States_In_Base_States(temp[1],Basestates);
					if(ans==false)
						StateNotPresent=StateNotPresent+temp[1]+"\n";
					
					stateName[i]=temp[1];

				}//for
				
				
				if(StateNotPresent.length()==0){      //if all the states which are define in pointcut is present in base state machine then save all the states in State array
					for(int i=0;i<stateName.length;i++){
						States.add(stateName[i]);
					}//for
				}//if transitionNameNotPresent.size()==0
				
				else{		// display error if state is not present in base state machine				
					JOptionPane.showMessageDialog(null,"Following states are not present in base state machine"+StateNotPresent,"Dialog",JOptionPane.ERROR_MESSAGE);	
				}//else
				
				
			}//if
			
			
			else   /// contain "<>"
			{
				
				if(selectionConstraint.contains("or"))
				{
					String[] tempList=selectionConstraint.trim().split("or"); 
					stateName=new String[tempList.length];
					
					for(int i=0;i<tempList.length;i++)    
					{
						String[] tempList1=tempList[i].trim().split("<>");
						tempList1[1]=tempList1[1].trim();
						tempList1[1]=tempList1[1].substring(tempList1[1].indexOf('\'')+1, tempList1[1].length()-1).trim();
						stateName[i]=tempList1[1];
	
					}//for
					
			
					
				}//if  "or" is present
				
				else   // in case where no "or" operator is present 
				{
					String[] tempList=selectionConstraint.trim().split("<>");
					stateName=new String[1];
					tempList[1]=tempList[1].trim();
					stateName[0]=tempList[1].substring(tempList[1].indexOf('\'')+1, tempList[1].length()-1).trim();
					
				}//else
				
				
				
				for(int i=0;i<Basestates.size();i++)
				{
					int counter=0;
					for(int j=0;j<stateName.length;j++)
					{
						if(stateName[j].trim().equals(Basestates.get(i).Name.trim()))
						{
							counter++;
						}//if
						
					}//for
					
					if(counter==0)
					{
						States.add(Basestates.get(i).Name.trim());
					}//if
					
				}//for
				
				
			}//else  "<>"		
			
		}//if
		
		else if(Type.equals("One"))
		{	
			selectionConstraint=selectionConstraint.trim();
			
			selectionConstraint=selectionConstraint.substring(selectionConstraint.indexOf('\"')+1, selectionConstraint.length()-1).trim();
			String name=selectionConstraint.substring(selectionConstraint.indexOf("\'")+1, selectionConstraint.length()-1).trim();
			
		
			boolean ans=check_Existance_Of_States_In_Base_States(name,Basestates);
			if(ans==true)
			States.add(name);
	
			else
			{
				
			JOptionPane.showMessageDialog(null,"' "+name+" ' state is not present in base state machine","Dialog",JOptionPane.ERROR_MESSAGE);
			}
				
			
		}//else if
		
		else  //All
		{
			for(int i=0;i<Basestates.size();i++)
			{
				States.add(Basestates.get(i).Name);
			}
			
		}//else
		
		return States;
	}
	//*********************************************************************************************//
	public AspectStates getStateInfo(String stateName,ArrayList<AspectStates> Aspectstates)
	{
		
		AspectStates newState=null;
		for(int i=0;i<Aspectstates.size();i++)
		{
			if(Aspectstates.get(i).Name.equals(stateName))
		     {
				newState=Aspectstates.get(i);
			     break;
			 }
		}
		
		return newState;
	}
	//*********************************************************************************************//
	public void markStatesVisited(AspectTransition transition,ArrayList<AspectStates> Aspectstates)
	{
	     //System.out.println(transition.SourceState+" "+transition.TargetState);
		  for(int i=0;i<Aspectstates.size();i++)
		  {
			 
			  if(!Aspectstates.get(i).Stereotype.contains("Introduction"))
			  { //System.out.println(Aspectstates.get(i).Name+"--"+Aspectstates.get(i).Stereotype);
				  if(Aspectstates.get(i).Name.equals(transition.SourceState) || Aspectstates.get(i).Name.equals(transition.TargetState))
				  {
					  Aspectstates.get(i).setVisited();
				  }//if
			  }
			  
		  }//for
	}
	
	//*********************************************************************************************//
	public boolean IdentifyPointcutConstraints(AspectTransition transition,ArrayList<BaseTransitions> Basetransition)
	{
		boolean errorResult=false;
		ArrayList<String> Constraint=transition.Constraint;
		
		for(int i=0;i<Constraint.size();i++)
		{
			String substring=Constraint.get(i).substring(Constraint.get(i).indexOf("<<")+2, Constraint.get(i).indexOf(">>")).trim();  //<<Pointcut>>OCLConstraint
		  	if(substring.equals("Pointcut"))
		  	{
		  		errorResult=ReadTransitionPointcutConstraint(Constraint.get(i),Basetransition,transition);
		  		 //need to break here or not any transition may contain more than one pointcut or not.
		  	}//if
		  	
		  	
		}//for
		
		return errorResult;
	}
	
	//*********************************************************************************************//
	
	public boolean ReadTransitionPointcutConstraint(String Constraint,ArrayList<BaseTransitions> Basetransition,AspectTransition aspectTransition)
	{
		
		/*
		 * errorResult==true means an error has occurred
		 * errorResult==false means no error  occurr
		 */
	    boolean errorResult=false;
		String Type="";
	    ArrayList<String>TransitionsForWeaving=new ArrayList<String>();
		String selectionConstraint="";
		
		String[] PointConstraint=Constraint.trim().split(",");
		
		for(int i=0;i<PointConstraint.length;i++)
		{
			if(PointConstraint[i].contains("type"))  /// PointConstraint[i]=type=SelectionType::Subset
			{
				Type=getType(PointConstraint[i].trim());
				if(Type.equals("All"))
				{
					TransitionsForWeaving=getBaseTransitionDefineInSelectionConstraint(Type,"",Basetransition);     // ""=selection constraints
					
				}//if
				
				
			}//if  
			

			if(PointConstraint[i].contains("selectionConstraint"))
			{
				selectionConstraint=selectionConstraint+PointConstraint[i].trim();
				TransitionsForWeaving=getBaseTransitionDefineInSelectionConstraint(Type,PointConstraint[i].trim(),Basetransition);
				
				if(TransitionsForWeaving.size()==0)
				{ 
					errorResult=true;
				    break;
				}
		
			}//if
			
			if(PointConstraint[i].contains("beforeAdvice"))
			{
    			  errorResult=ReadAdviceOnTransition(PointConstraint[i],aspectTransition,"Before",TransitionsForWeaving,Basetransition,selectionConstraint);
    			
    			  if(errorResult==true)
			    	  break;
			}
				
			if(PointConstraint[i].contains("afterAdvice"))
			{	
			     errorResult=ReadAdviceOnTransition(PointConstraint[i],aspectTransition,"After",TransitionsForWeaving,Basetransition,selectionConstraint);
			     if(errorResult==true)
			    	  break;
			}
				
			if(PointConstraint[i].contains("aroundAdvice"))
			{
				errorResult=ReadAdviceOnTransition(PointConstraint[i],aspectTransition,"Around",TransitionsForWeaving,Basetransition,selectionConstraint);
				if(errorResult==true)
			    	  break;
			}

			
		}//for	
		
		return errorResult;
	}
	
	//*********************************************************************************************//	
	public boolean ReadAdviceOnTransition(String PointcutConstraint,AspectTransition aspectTransition,String Pointcut_AdviceType,ArrayList<String> TransitionsForWeaving,ArrayList<BaseTransitions> Basetransition,String selectionConstraint)
	{
		/*
		 * beforeAdvice="AddGuardBeforeAdvice"
		 * AdviceType=Before,After,Around
		 */
		boolean errorResult=false;
        int checkAdvice=0;  // use for error "means either there is any contraint in the transition that contain the particular advice type=before,after,around"
		String Pointcut_AdviceName="";
		Pointcut_AdviceName=PointcutConstraint.substring(PointcutConstraint.indexOf("\"")+1, PointcutConstraint.length()-1).trim(); //AdviceName=AddGuardBeforeAdvice
		
		ArrayList<String> TransitionConstraint=aspectTransition.Constraint;
		for(int i=0;i<TransitionConstraint.size();i++)
		{
			int Counter=0;
			String[] TokenTransition=TransitionConstraint.get(i).split(",");
			
			/*
			 * AdviceType= Before,After,Around,Introduction,Pointcut
			 */
			String AdviceType=TokenTransition[0].substring(TokenTransition[0].indexOf("<<")+2, TokenTransition[0].indexOf(">>")).trim();	
			String AdviceName=TokenTransition[0].substring(TokenTransition[0].indexOf("\"")+1, TokenTransition[0].length()-1).trim();	
			
		 
			if(AdviceType.equals(Pointcut_AdviceType) && AdviceName.equals(Pointcut_AdviceName))
			{
				checkAdvice++;   
				//String AdviceConstraint define whether we have to add in trigger,effect or guard condition
				 String AdviceConstraint=TokenTransition[1].substring(TokenTransition[1].indexOf("\"")+1, TokenTransition[1].length()-1).trim();

				
				
				//Check whether the constraint is going to be apply on transition effect or not
				 
				 if(aspectTransition.Effect!=null)
				 {
					if(AdviceConstraint.contains(aspectTransition.Effect))
				    { 
						WeaveEffect(TransitionsForWeaving,aspectTransition.Effect,Basetransition,AdviceType);
						Counter++;
				    }
				 }
				
				//Check whether the constraint is going to be apply on transition Trigger or not
			    for(int j=0;j<aspectTransition.Trigger.size();j++)
			    {
			    	
			        String trigger=aspectTransition.Trigger.get(j); 
					String triggerWithParameter=trigger;  //triggerWithParameter may or may not contain owned parameter
					
			        if(trigger.contains("("))
			        {
			        	trigger=trigger.substring(0, trigger.indexOf('(')).trim();	
			        }
			       // System.out.println("hello"+trigger+"--"+AdviceConstraint.trim());
				   if(trigger.equals(AdviceConstraint.trim()))
				   {
					   WeaveTrigger(TransitionsForWeaving,triggerWithParameter,Basetransition,AdviceType,selectionConstraint);
					   Counter++;
					   break;
				   }//if
			    }//for
			    
			    if(Counter==0) // constraint is going to be applied on guard condition
			    {		
			    	if(aspectTransition.GuardCondition==null)
			    	{
			    		String error="No Effect , Trigger\nor Guard Condition weaved ";
			    		JOptionPane.showMessageDialog(null,error,"Dialog",JOptionPane.ERROR_MESSAGE);
			    		 errorResult=true;
			    	}
			    	
			    	else
			    	{			
			    	   WeaveGuard(TransitionsForWeaving,aspectTransition.GuardCondition,Basetransition,AdviceType);
			    	}
			    }
			   
			    	
			}//if
		}//for
		
		if(checkAdvice==0)
		{
			String error="No "+Pointcut_AdviceType+" advice found";
			JOptionPane.showMessageDialog(null,error,"Dialog",JOptionPane.ERROR_MESSAGE);
			errorResult=true;
		}//if
		
		return errorResult;
	}
	
	//*********************************************************************************************//
	public void WeaveEffect(ArrayList<String> TransitionsForWeaving,String newEffect,ArrayList<BaseTransitions> Basetransition,String AdviceType)
	{
		if(AdviceType.equals("Before") || AdviceType.equals("After"))
		{			
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{			
						//check whether the base StateMachine transition already contain the effect or not
						if(Basetransition.get(i).Effect==null)  // transition does not already contain any guard condition yet
						{
							Basetransition.get(i).setEffect(newEffect);
						}
						
					}//if
				}//for
				
			}//for
			
		}//if
		else //around
		{
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{
						Basetransition.get(i).Effect=newEffect;  //replace the already existing effect with new name
						
					}
				}
				
			}
			
		}//else
		
	}
	//*********************************************************************************************//
	public void WeaveTrigger(ArrayList<String> TransitionsForWeaving,String newTrigger,ArrayList<BaseTransitions> Basetransition,String AdviceType,String selectionConstraint)
	{
		if(AdviceType.equals("Before") || AdviceType.equals("After"))
		{
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{	
						//Add New Trigger in the existing Triggers	
						Basetransition.get(i).addTrigger(newTrigger);
						
					}//if
				}//for
			}//for
			
		}//if Before and After
		if(AdviceType.equals("Around"))
		{
			String[] eventName=getEventName(selectionConstraint);
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{
						int counter=0;
					   //Replace the match trigger name the new trigger name
							
						 for (int k = 0; k <  Basetransition.get(i).getTrigger().size(); k++) 
							{
							     for(int l=0;l<eventName.length;l++)
							     {
							    	  if( Basetransition.get(i).Trigger.get(k).trim().equals(eventName[l].trim()))
										{
											 Basetransition.get(i).Trigger.remove(k);
											counter++;
										}
							     }//for
								
							}//for
						 
						 if(counter!=0)
						 Basetransition.get(i).Trigger.add(newTrigger);
						
					}//if
					
				}//for
			}//for
						
		}//if Around
			
	}
	
	//*********************************************************************************************//
	public String[] getEventName(String selectionConstraint)
	{
		String[] triggerName=null;

		selectionConstraint=selectionConstraint.substring( selectionConstraint.indexOf('(')+1, selectionConstraint.indexOf(')')).trim();
		
	
			if(selectionConstraint.contains("or"))
			{
				String[] tempList1=selectionConstraint.split("or");
				triggerName=new String[tempList1.length];
				for(int i=0;i<tempList1.length;i++)
				{
					tempList1[i]=tempList1[i].trim();
					String tempList2=tempList1[i].substring(tempList1[i].indexOf('\'')+1,tempList1[i].length()-1).trim();
					triggerName[i]=tempList2;
				}//for
				
				
			}//if "or" present
			
			
			else   // case where or is not present
			{
				triggerName=new String[1];
				selectionConstraint=selectionConstraint.trim();
				triggerName[0]=selectionConstraint.substring(selectionConstraint.indexOf('\'')+1, selectionConstraint.length()-1).trim();
				
			}//else
			
			return triggerName;
	}
	//*********************************************************************************************//
	public void WeaveGuard(ArrayList<String> TransitionsForWeaving,String GuardCondition,ArrayList<BaseTransitions> Basetransition,String AdviceType)
	{
		if(AdviceType.equals("Before") || AdviceType.equals("After"))
		{		
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{	
						//check whether the base StateMachine transition already contain the guard condition or not
						if(Basetransition.get(i).GuardCondition==null)  // transition does not already contain any guard condition yet
						{
							Basetransition.get(i).setGuard(GuardCondition);
						}
						else  //guard condition is already present
						{
							String guard=Basetransition.get(i).getGuard();
							
							 guard=guard+" "+"and "+GuardCondition;
							 Basetransition.get(i).setGuard(guard);
							// System.out.println(Basetransition.get(i).Name+"--"+Basetransition.get(i).GuardCondition);
						}//else//if
				    }//if
				}//for
			}//for
		}//if
		
		if(AdviceType.equals("Around"))
		{
			for(int i=0;i<Basetransition.size();i++)
			{
				for(int j=0;j<TransitionsForWeaving.size();j++)
				{
					if(Basetransition.get(i).Name.equals(TransitionsForWeaving.get(j)))
					{
						//check whether the base StateMachine transition already contain the guard condition or not
						if(Basetransition.get(i).GuardCondition==null)  // transition does not already contain any guard condition yet
						{
							Basetransition.get(i).setGuard(GuardCondition);
						}
						else  //guard condition is already present
						{
							String guard=Basetransition.get(i).getGuard();
							
							 guard=GuardCondition;
							 Basetransition.get(i).setGuard(guard);
							 //System.out.println(Basetransition.get(i).Name+"--"+Basetransition.get(i).GuardCondition);
						}//else
						
					}//if
				}//for
				
			}//for
		}//if around

	}
	
	
	//*********************************************************************************************//	
	public ArrayList<String> getBaseTransitionDefineInSelectionConstraint(String Type,String selectionConstraint,ArrayList<BaseTransitions> Basetransition)
	{
	
		ArrayList<String> Transitions=new ArrayList<String>();
		if(Type.equals("Subset"))
		{
			
			//-------------------------------------------------------------------------//
			selectionConstraint=selectionConstraint.trim();
			selectionConstraint=selectionConstraint.substring(selectionConstraint.indexOf('\"')+1, selectionConstraint.length()-1).trim();
			
			
			String[] transitionName=null;
			String transitionNameNotPresent="";
		
			
			if(selectionConstraint.contains("self.name"))
			{
			
				if(selectionConstraint.contains("="))
				{
					String[] tempList=selectionConstraint.split("or"); 
					transitionName=new String[tempList.length];
					
					for(int i=0;i<tempList.length;i++)    
					{
						String[] tempList1=tempList[i].trim().split("=");
						tempList1[1]=tempList1[1].trim();
						tempList1[1]=tempList1[1].substring(tempList1[1].indexOf('\'')+1, tempList1[1].length()-1).trim();
						
						boolean ans=check_Existance_Of_Transitions_In_Base_Transition(tempList1[1],Basetransition);
						if(ans==false)
							transitionNameNotPresent=transitionNameNotPresent+tempList1[1]+"\n";
						
						transitionName[i]=tempList1[1];
						//
	
					}//for
					
					
					if(transitionNameNotPresent.length()==0){
						for(int i=0;i<transitionName.length;i++){
							Transitions.add(transitionName[i]);
						}//for
					}//if transitionNameNotPresent.size()==0
					
					else{						
						JOptionPane.showMessageDialog(null,"Following Transitions are not present in base state machine"+transitionNameNotPresent,"Dialog",JOptionPane.ERROR_MESSAGE);	
					}//else
					
					
				}//if
				
				else   //in case of "<>"
				{
				
					
					if(selectionConstraint.contains("or"))
					{
						String[] tempList=selectionConstraint.trim().split("or"); 
						transitionName=new String[tempList.length];
						
						for(int i=0;i<tempList.length;i++)    
						{
							String[] tempList1=tempList[i].trim().split("<>");
							tempList1[1]=tempList1[1].trim();
							tempList1[1]=tempList1[1].substring(tempList1[1].indexOf('\'')+1, tempList1[1].length()-1);
							transitionName[i]=tempList1[1].trim();
		
						}//for
						
				
						
					}//if  "or" is present
					
					else   // in case where no "or" operator is present 
					{
						String[] tempList=selectionConstraint.split("<>");
						transitionName=new String[1];
						tempList[1]=tempList[1].trim();
						transitionName[0]=tempList[1].substring(tempList[1].indexOf('\'')+1, tempList[1].length()-1).trim();
						
					}//else
					
					
					
					
					for(int i=0;i<Basetransition.size();i++)
					{
						int counter=0;
						for(int j=0;j<transitionName.length;j++)
						{
							if(transitionName[j].trim().equals(Basetransition.get(i).Name.trim()))
							{
								counter++;
							}//if
							
						}//for
						
						if(counter==0)
						{
							Transitions.add(Basetransition.get(i).Name.trim());
						}//if
						
				 }//for
					
					
				}//else  "<>"	
				
			}//if self.name is present
			
			
			else    // in case of event.name
			{
				String[] triggerName=null;

				selectionConstraint=selectionConstraint.substring( selectionConstraint.indexOf('(')+1, selectionConstraint.indexOf(')')).trim();
			
					if(selectionConstraint.contains("or"))
					{
						String[] tempList1=selectionConstraint.split("or");
						triggerName=new String[tempList1.length];
						for(int i=0;i<tempList1.length;i++)
						{
							tempList1[i]=tempList1[i].trim();
							String tempList2=tempList1[i].substring(tempList1[i].indexOf('\'')+1,tempList1[i].length()-1).trim();
							triggerName[i]=tempList2;
						}//for
						
						
					}//if "or" present
					
					
					else   // case where or is not present
					{
						triggerName=new String[1];
						selectionConstraint=selectionConstraint.trim();
						triggerName[0]=selectionConstraint.substring(selectionConstraint.indexOf('\'')+1, selectionConstraint.length()-1).trim();
						
					}//else
					
					
					
				if(selectionConstraint.contains("="))
				{
					boolean ans=check_Existance_Of_Triggers_In_Base_Transition(triggerName,Basetransition);
					
					if(ans==false)
					{
						
						String temp="";
						for(int l=0;l<triggerName.length;l++){
							temp=temp+triggerName[l]+"\n";
						}//for
						JOptionPane.showMessageDialog(null,"Transitions which contain following "+temp+" triggers are not present","Dialog",JOptionPane.ERROR_MESSAGE);	
					}//if
					
					else
					{
						for(int i=0;i<Basetransition.size();i++)
						{
							ArrayList<String> triggers=Basetransition.get(i).Trigger;   //collect all triggers of a transition  	
							
							for(int j=0;j<triggers.size();j++)
							{
								//int counter=0;
								for(int k=0;k<triggerName.length;k++)
								{
									if(triggers.get(j).trim().equals(triggerName[k]))
									{
										if(!Transitions.contains(Basetransition.get(i).Name.trim()))
										   Transitions.add(Basetransition.get(i).Name.trim());
										
										//counter++;	
										break;
									}//if
									
								}//for
								
								//if(counter!=0)
								//	break;
								
							}//for  trigger
								
						}//for transitions 
						
					}//else 
					
				}//if
				
				else   // "<>"
				{
					for(int i=0;i<Basetransition.size();i++)
					{
						int counter=0;
						ArrayList<String> triggers=Basetransition.get(i).Trigger;   //collect all triggers of a transition 
						for(int j=0;j<triggers.size();j++)
						{
							for(int k=0;k<triggerName.length;k++)
							{
								if(triggers.get(j).trim().equals(triggerName[k].trim()))
								{
									counter++;
									break;
								}//if
								
							}//for
							
							if(counter!=0)
								break;
					
							
						}// for trigger
						
						if(counter==0)
						{
							Transitions.add(Basetransition.get(i).Name.trim());
						}//if
					}//baseTransitions
					
				}//else
					
				
			}//else
			
		
						
		}//if type=Subset
		
     //----------------------------------------------------------------------------------------------------------------------//	
		else if(Type.equals("One"))
		{
			
			selectionConstraint=selectionConstraint.substring(selectionConstraint.indexOf('\"')+1, selectionConstraint.length()-1).trim();
			String[] split=selectionConstraint.trim().split("=");  // event|event.name='dial'
			split[1]=split[1].trim();
			split[1]=split[1].substring(1, split[1].length()-1).trim();  //triggerName=dial  // self.name='T1'  // removing quotes
			
			
			if(split[0].contains("self.name"))    //split[0] contain "self.name"  
			{
				
				boolean result=check_Existance_Of_Transitions_In_Base_Transition(split[1].trim(),Basetransition);
				
				if(result==true)
				Transitions.add(split[1].trim());	// split[1] contain the name of transition like 'T1'  and T1 is the value of self.name	
			
				else
					JOptionPane.showMessageDialog(null,"No ' "+split[1].trim()+" ' transition exists in base state machinne","Dialog",JOptionPane.ERROR_MESSAGE);    // 'T1' transition is not present in base transitions
			}//if
			
			else      //split[0] contain  "event.name" that is "dial"
			{
				String triggerName=split[1];   //split[1]=dial  
				for(int i=0;i<Basetransition.size();i++)
				{
					ArrayList<String> triggers=Basetransition.get(i).Trigger;   //collect all triggers of a transition  	
					
					for(int j=0;j<triggers.size();j++)
					{
						if(triggers.get(j).trim().equals(triggerName))      // triggerName=dial   
						{
							Transitions.add(Basetransition.get(i).Name);
							break;
							
						}//if
											
					}//for  trigger
									
				}//for transitions
				
				if(Transitions.size()==0)
					JOptionPane.showMessageDialog(null,"Transition having ' "+triggerName+" ' trigger does not exist in base state machine","Dialog",JOptionPane.ERROR_MESSAGE);
						
			}//else
			
			

			
		}//else if type=One
		
		
		
		//----------------------------------------------------------------------------------------------------------------------//		
		else  //ALL	
		{
			for(int i=0;i<Basetransition.size();i++)
			{
				Transitions.add(Basetransition.get(i).Name.trim());   // Save Names of all Transitions in Transition Array 
			}
			
		}//else
		  
	
		return Transitions;
			
	}
	
	
	//*********************************************************************************************//
	public String getType(String typeExpression)
	{
		if(typeExpression.contains("Subset"))
			return "Subset";
		
		else if(typeExpression.contains("One"))
			return "One";
		
		else
			return "All";
		
	}

	
	//*********************************************************************************************//
    public boolean check_Existance_Of_Transitions_In_Base_Transition(String TransitionName,ArrayList<BaseTransitions> Basetransitions){
    	
    	boolean result=false;
    	
    	for(int i=0;i<Basetransitions.size();i++){
    		
    		if(Basetransitions.get(i).Name.trim().equals(TransitionName.trim())){
    			
    			result=true;
    		}
    	}
    	return result;
    }
    
	//*********************************************************************************************//
public boolean check_Existance_Of_Triggers_In_Base_Transition(String[] TriggersName,ArrayList<BaseTransitions> Basetransitions){
    	
    	boolean result=false;
    	
    	for(int i=0;i<Basetransitions.size();i++){
    		
    	ArrayList<String> triggers=Basetransitions.get(i).Trigger;

    		for(int j=0;j<TriggersName.length;j++){
    			
    			if(triggers.contains(TriggersName[j])){
    	    		result=true;
    	    	}//if
    			
    		}
    		
    	}
    	return result;
    }

//*********************************************************************************************//
public boolean check_Existance_Of_States_In_Base_States(String state,ArrayList<BaseStates> baseState){
	boolean result=false;
	
	for(int i=0;i<baseState.size();i++){
		
		if(baseState.get(i).Name.trim().equals(state.trim())){
			result=true;
		}
	}
	
	return result;
}
}
