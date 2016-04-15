package state.machine;
import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;


public class StateMachineReader {

	ArrayList<AspectTransition> AspecttransitionList = new ArrayList<AspectTransition>();
	ArrayList<AspectStates> AspectstatesList = new ArrayList<AspectStates>();
	
	ArrayList<BaseTransitions> BasetransitionList = new ArrayList<BaseTransitions>();
	ArrayList<BaseStates> BasestatesList = new ArrayList<BaseStates>();
	
	public void ReadStateMachines(String StateMachineName)
	{
		try
		{
			UMLReader reader = new UMLReader();
			//Model model = reader.loadModel((new File("AspectStateMachine/"+StateMachineName)).toURI().toString());
			
			Model model = reader.loadModel((new File(StateMachineName)).toURI().toString());
			processTheModel(model);
						
		}
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}//ReadStateMachine
	
	//***********************************************************************************//
		public void processTheModel(Model model)throws Exception
		{
			EList<PackageableElement> members = model.getPackagedElements();
			
			for (PackageableElement element : members)
			{
				if (element.eClass() == UMLPackage.Literals.STATE_MACHINE)
				{
					readRegions(element);
				}
			}
			
		}//processTheModel
		
		//***********************************************************************************//
		public void readRegions(PackageableElement element) 
		{
			String StateMachineName="";
			StateMachine stateMachine = (StateMachine) element;
			
			String condition=IdentifyAspect(stateMachine);
			if(condition.contains("<<Aspect>>"))
			{
				StateMachineName="Aspect";
			}
			
			else
			{
				StateMachineName="Base";
			}
			
			EList<Region> regions = stateMachine.getRegions();
			for (Region reg : regions) 
			{
				readRegoins(reg,StateMachineName);
			}
		}
		
		//***********************************************************************************//
		private String IdentifyAspect(StateMachine stateMachine)
		{
			String value="";
			EList<Constraint>ownedRules=stateMachine.getOwnedRules();
			for (Constraint Rule : ownedRules)
			{
				ValueSpecification Specifications = Rule.getSpecification();
				LiteralString expr=(LiteralString)Specifications;		
				value=expr.getValue();	
			}
			return value;
		}
		//***********************************************************************************//
		private void readRegoins(Region region,String StateMachineName)
		{

			EList<Vertex> vertices = region.getSubvertices();
			for (Vertex vertex : vertices) 
			{
				readVertices(vertex,StateMachineName);
			}
		}
		
		//***********************************************************************************//
		private void readVertices(Vertex vertex,String StateMachineName) 
		{
			State state=null;
			Boolean isPseudostate=false;
			Pseudostate pseudostate=null;
			String StartState=null;

			
			if(vertex.eClass() == UMLPackage.Literals.STATE)
			{
				isPseudostate=false;
				state = (State) vertex;
				setStateAttribute(state,StateMachineName);
				setTransitionAttribute(state,StateMachineName);
			}
			
			else if (vertex.eClass() == UMLPackage.Literals.PSEUDOSTATE)
			{
				isPseudostate=true;
				pseudostate= (Pseudostate) vertex;
				if(StateMachineName.equals("Base"))
				{
				     StartState=gettingStartState(pseudostate,StateMachineName);
					
				}//if
				
			}//else if
			
			/*else if (vertex.eClass() == UMLPackage.Literals.FINAL_STATE)
			{
				System.out.println("hello");
			}*/
			setStartState(StartState);
			
		}
		
		//***********************************************************************************//
		public void setStartState(String StartState)
		{
			
			if(StartState!=null)
			{
				for(int i=0;i<BasestatesList.size();i++)
				{
					if(BasestatesList.get(i).Name.trim().equals(StartState.trim()))
					{
						BasestatesList.get(i).setStartState(true);	
					}//if
				}//for
			}//if
		}

		//***********************************************************************************//
		public String gettingStartState(Pseudostate pseudostate,String StateMachineName)
		{
			String StartState=null;
			
				EList<Transition> outgoingTransitions= getOutgoingTransitionsFromPseudostate(pseudostate);
				for (Transition trans : outgoingTransitions)
				{
					StartState=trans.getTarget().getLabel();
				}
				
			return StartState;
		}
		//***********************************************************************************//
		public void setStateAttribute(State state,String StateMachineName)
		{
			if(StateMachineName.equals("Base"))
			{
				BaseStates stateobj = null;	
			    String StateInvariant=getStateInvariant(state);
				stateobj=new BaseStates(state.getLabel(),StateInvariant);
				BasestatesList.add(stateobj);
			}
			
			else
			{
				AspectStates stateobj = null;
				ArrayList<String> Constraint=getConstraint(state);	

				String Stereotype=getStereotype(Constraint);
				stateobj=new AspectStates(state.getLabel(), Constraint, Stereotype);
				AspectstatesList.add(stateobj);
			}
			
		
		}
		
	//***********************************************************************************//
	public String getStateInvariant(State state)
	{
		String condition=null;

		Constraint StateInvariant=state.getStateInvariant();
		if(StateInvariant!=null)
		{
			ValueSpecification Specifications= StateInvariant.getSpecification();
			LiteralString expr=(LiteralString)Specifications;
		    condition=expr.getValue();
		}

		return condition;
	}
	 //***********************************************************************************//
	 public void setTransitionAttribute(State state,String StateMachineName)
	 {
		 
			EList<Transition> outgoingTransitions= getOutgoingTransitions(state);
				
			
			if(StateMachineName.equals("Base"))
			{
			
				  for (Transition trans : outgoingTransitions)
				  {	
						String SourceState = getStateName((Vertex)trans.getSource());
						String TargetState = getStateName((Vertex)trans.getTarget());
						
						
						if(trans.getTarget().eClass()==UMLPackage.Literals.FINAL_STATE)  /// in case when base state machine contain the final state
						{
							setFinalState(TargetState);		
						}//if
					
						String GuardCondition=getTransitionGuard(trans);
						ArrayList<String> Trigger=getTransitionTriggers(trans);
						String Effect=getTransitionEffect(trans);
						
						if (trans.getLabel() != null) 
						{
							BaseTransitions transObj=new BaseTransitions(trans.getLabel(), SourceState, TargetState, GuardCondition, Trigger, Effect);
						    BasetransitionList.add(transObj);
						}
				   }//for
					
			}//if
			else // in case of Aspect StateMachine 
			{
				
				 for (Transition trans : outgoingTransitions)
				 {
	
						String SourceState = getStateName((Vertex)trans.getSource());
						String TargetState = getStateName((Vertex)trans.getTarget());

						String GuardCondition=getTransitionGuard(trans);
						ArrayList<String> Trigger=getTransitionTriggers(trans);
						String Effect=getTransitionEffect(trans);
						ArrayList<String>Constraint=getTransitionConstraint(trans);
						
						String Stereotype=getStereotype(Constraint);
				
						
						if (trans.getLabel() != null) 
						{
						  AspectTransition transObj=new AspectTransition(trans.getLabel(), SourceState, TargetState, GuardCondition, Trigger, Effect, Constraint, Stereotype);
						  AspecttransitionList.add(transObj);
						}
				  }//for
			}//else
			
	     }
	 
	   //***********************************************************************************//
		 public void setFinalState(String TargetState)
		 {
			 for(int i=0;i<BasestatesList.size();i++)
			 {
				  if(BasestatesList.get(i).Name.trim().equals(TargetState.trim()))
				  {
						BasestatesList.get(i).setFinalState(true);	
						//System.out.println(BasestatesList.get(i).Name);
				  }//if
			 }//for
			
		 }
		
		 //***********************************************************************************//
		 public String getTransitionEffect(Transition transition) 
		 {
			    String effect=null;
				Behavior BehObj = transition.getEffect();
			
				if(BehObj != null)
				{
					effect = BehObj.getName().trim();
				}

			 return effect;
		 }
		 //***********************************************************************************//
		 public ArrayList<String> getTransitionTriggers(Transition transition) 
		 {
			 ArrayList<String> TriggerList=new ArrayList<String>();
			 String Savetrigers = "";
			 
			 
			 EList<Trigger> trigger=transition.getTriggers();

			 for (int i=0;i<trigger.size();i++)
			 {
				 
				 Event event =  transition.getTriggers().get(i).getEvent();
				
				 if(event.eClass() == UMLPackage.Literals.CALL_EVENT)
				 {
					  CallEvent callEvent = (CallEvent) event;
					  Savetrigers = callEvent.getOperation().getName().trim();
	  
					  EList<Parameter> OwnedParameter=callEvent.getOperation().getOwnedParameters();
					  
					  if(OwnedParameter.size()>0)
						  Savetrigers=Savetrigers+"(";
					  for(int k=0;k<OwnedParameter.size();k++)
					  {  
							String owned_para=OwnedParameter.get(k).getDefault().trim();
							Savetrigers=Savetrigers+owned_para+",";
							
					  }//for
					  
					  if(OwnedParameter.size()>0)
					  {
						  Savetrigers=Savetrigers.substring(0, Savetrigers.length()-1);
						  Savetrigers=Savetrigers+")";
					  }
					  
					  TriggerList.add(Savetrigers);
				   }//if
			    }//for

			return TriggerList;
		 }
	    //***********************************************************************************//
		public String getStateName(Vertex vertex) 
		{
			String stateName;
			if( vertex.eClass() == UMLPackage.Literals.PSEUDOSTATE)
			{
				stateName=((Pseudostate)vertex).getKind().getLiteral();
			}
			else
				stateName=((State)vertex).getName();
			
			return stateName;
		}

		
		//***********************************************************************************//
		 public String getTransitionGuard(Transition transition )
		 {
			    String condition =null;
				EList<Constraint> ownedRules = transition.getOwnedRules();
				
				
				for (Constraint Rule : ownedRules)
				{
					ValueSpecification Specifications = Rule.getSpecification();
					LiteralString expr=(LiteralString)Specifications;		
					String temp=expr.getValue();
					if(!temp.contains("<<"))   // both constraint ad guard condition condition is define in the owned rule tag so for
						                      // differentiating the guard condition with constraint we use "<<" because constraint contain "<<" characters
					{
					  condition=temp;	
					}
						
				}

			 return condition;
		 }
		 
			//***********************************************************************************//
		 public ArrayList<String> getTransitionConstraint(Transition transition )
		 {
			
			    ArrayList<String> condition = new ArrayList<String>();
	            String Constraint="";

				
				EList<Constraint> ownedRules = transition.getOwnedRules();
				for (Constraint Rule : ownedRules)
				{		
					ValueSpecification Specifications = Rule.getSpecification();
					LiteralString expr=(LiteralString)Specifications;		
					String temp=expr.getValue();
					if(temp.contains("<<"))
					{
						Constraint=Constraint+temp+"@";
					}
				}
 
				if(ownedRules.size()>0)
				{
					String[] split=Constraint.split("@");
					for(int i=0;i<split.length;i++)
					{
						condition.add(split[i]);
					}
				}
				
			 return condition;
		 }
		//***********************************************************************************//
		public ArrayList<String> getConstraint(State state)
		{

			ArrayList<String> condition=new ArrayList<String>();
			
			EList<Constraint> ownedRules = state.getOwnedRules();
			for (Constraint Rule : ownedRules) 
			{
				ValueSpecification Specifications = Rule.getSpecification();
				LiteralString expr=(LiteralString)Specifications;
			
				String temp=expr.getValue();
				condition.add(temp);
			}//for

			return condition;
		}
		
		//***********************************************************************************//
		public String getStereotype(ArrayList<String> Constraint)
		{
			String Stereotype="";
			for(int i=0;i<Constraint.size();i++)
			{
				String condition=Constraint.get(i).substring(Constraint.get(i).indexOf("<<")+2, Constraint.get(i).indexOf(">>"));
				Stereotype=Stereotype+condition+",";
			}
			
			return Stereotype;
		}
		
		//***********************************************************************************//
		public EList<Transition> getOutgoingTransitionsFromPseudostate(Pseudostate pseudostate)
		{
			EList<Transition> outgoingTransitions;
					
			outgoingTransitions= pseudostate.getOutgoings();
			
			return outgoingTransitions;
		}
		//***********************************************************************************//
		public EList<Transition> getOutgoingTransitions(State state)
		{
			EList<Transition> outgoingTransitions;
			
			outgoingTransitions= state.getOutgoings();
	
			return outgoingTransitions;
		}
		
		//***********************************************************************************//
		
		public ArrayList<AspectTransition> getAspectTransition()
		{
			return this.AspecttransitionList;
		}
		
		//***********************************************************************************//
		public ArrayList<AspectStates> getAspectStates()
		{
			return this.AspectstatesList;
		}
		
		//***********************************************************************************//
		
		public ArrayList<BaseTransitions> getBaseTransition()
		{
				return this.BasetransitionList;
		}
					
		//***********************************************************************************//
		public ArrayList<BaseStates> getBaseStates()
		{
				return this.BasestatesList;
		}

}//class
