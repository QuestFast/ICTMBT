package state.machine;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;















import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.CallEvent;
//import org.eclipse.uml2.uml.Constraint;
//import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
//import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
//import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.StateMachine;
//import org.eclipse.uml2.uml.internal.impl.TriggerImpl;
import org.eclipse.uml2.uml.resource.UMLResource;



public class UMLWriting 
{

	protected static ArrayList<Vertex > newStates = new ArrayList<Vertex>();
	public void CreateUml(ArrayList<BaseStates> baseStates,ArrayList<BaseTransitions> baseTransition,String destinationPath)
	{
		 ArrayList<String> Operation=getOperation(baseTransition);
		 ArrayList<CallEvent> CallEventList=new ArrayList<CallEvent>();
		
		//******create model
		Model NewModel = UMLFactory.eINSTANCE.createModel();
		NewModel.setName("NewModel");
		
		//******creating packages
		org.eclipse.uml2.uml.Package NewPackage = createPackage(NewModel,"NewPackage");
		
		//******creating class
		org.eclipse.uml2.uml.Class NewSupplierClass = createClass(NewPackage,"NewClass", false);
		
		 //******creating state machines	
		 org.eclipse.uml2.uml.StateMachine NewStateMachine = (StateMachine) NewSupplierClass.createOwnedBehavior("NewStateMachine", UMLPackage.Literals.STATE_MACHINE);

		 //******creating outer region
	     org.eclipse.uml2.uml.Region NewRegionOfStateMachine = NewStateMachine.createRegion("NewRegion");
	     
	     
	     //******create Operation and CalEvent Package element
	     for(int i=0;i<Operation.size();i++)
	     {
		    	 org.eclipse.uml2.uml.Operation operation=null;
		    	 String OperationName=null;
		    	 
		    	 if(Operation.get(i).contains("("))  //operation contain Parameter
		    	 {
		    	      OperationName=Operation.get(i).substring(0, Operation.get(i).indexOf('('));
			          operation = createOwnedOperation(NewStateMachine,OperationName);
			          
			          String OwnedParameter=Operation.get(i).substring(Operation.get(i).indexOf('(')+1, Operation.get(i).indexOf(')'));
			          String[] split=OwnedParameter.split(",");
			          
			          for(int j=0;j<split.length;j++)
			          {
			        	  ValueSpecification vs=operation.createOwnedParameter(null, null).createDefaultValue(null, null, UMLPackage.Literals.LITERAL_STRING);
			        	  LiteralString ls = (LiteralString) vs;
			        	  ls.setValue(split[j]);
			          }
		    	 }//if
		    	 
		    	 else
		    	 {
		    		 OperationName=Operation.get(i);
		             operation = createOwnedOperation(NewStateMachine,OperationName);
		    	 }//else
		       
		    	 //create package element for trigger
		        PackageableElement NewPackage1 = createPackageForTrigger(NewModel,OperationName);
		        CallEvent ce = (CallEvent) NewPackage1;
		        ce.setOperation(operation);
		       
		        CallEventList.add(ce);   // save all the event in the list
	     }//Operation
	     
	       
	   
	     //******creating Vertex(states)
	    for (BaseStates state : baseStates)
		{
		      Vertex NewVertex =  NewRegionOfStateMachine.createSubvertex(state.Name, UMLPackage.Literals.STATE);
		      State s=(State) NewVertex;
		    	    
			 if(state.StateInvariant!=null)
			  {
				    s.createStateInvariant(null).createSpecification(null,null, UMLPackage.Literals.LITERAL_STRING);
					ValueSpecification vs = s.getStateInvariant().getSpecification();
					LiteralString ls = (LiteralString) vs;
					ls.setValue(state.StateInvariant);
			   }//if

			   newStates.add(NewVertex);
		}//for 
	    
	    
	    //******creating Pseudostate 
	    for (BaseStates state : baseStates)
	 	{ 
	    	 Vertex SourceState=null;
	    	 Vertex TargerState=null;
	    	 
	    	 if(state.StartState==true) 
	    	 {
	    		  SourceState =  NewRegionOfStateMachine.createSubvertex("Start", UMLPackage.Literals.PSEUDOSTATE);

				 for(int i=0;i<newStates.size();i++)
				 {
					 if(newStates.get(i).getLabel().equals(state.Name))
					 {
						 TargerState=newStates.get(i);
					 }
				 }//for
				 
				 Transition newTransition = NewRegionOfStateMachine.createTransition(null);
				 newTransition.setSource(SourceState);
				 newTransition.setTarget(TargerState);
	    		
	    	 }//if
	    	 
	    	 if(state.FinalState==true)
	       	 {
	    		 TargerState =  NewRegionOfStateMachine.createSubvertex(null, UMLPackage.Literals.FINAL_STATE);
	    		 
	    		 for(int i=0;i<newStates.size();i++)
				 {
					 if(newStates.get(i).getLabel().equals(state.Name))
					 {
						 SourceState=newStates.get(i);
					 }
				 }//for
	    		 
	    		 Transition newTransition = NewRegionOfStateMachine.createTransition(null);
				 newTransition.setSource(SourceState);
				 newTransition.setTarget(TargerState);
				 
	       	 }//if
	 	}//for


	    //******creating NewTransition 
	    int transCounter=0;
	     for (BaseTransitions transition : baseTransition)
	     {
	    	 transCounter++;
	    	 String TransitionName="T"+transCounter;
	    	//************ Create New Transition ************//
	    	 //Transition newTransition = NewRegionOfStateMachine.createTransition(TransitionName);
	    	Transition newTransition = NewRegionOfStateMachine.createTransition(transition.Name);

	    	  /*System.out.println("");
	    	  System.out.println(transition.SourceState+"--"+transition.TargetState);
	    	  for(int i=0;i<transition.Trigger.size();i++)
	    	  {
	    		  System.out.println(transition.Trigger.get(i));
	    	  }*/
	    	  
	    	//************ Set Source and Target of newTransition ************//
	    	  State Source_States=null;
			  State Target_States=null;
			  
			  for(int i=0;i<newStates.size();i++)
			  {
					  if(transition.SourceState.equalsIgnoreCase(newStates.get(i).getName()))
					  {
						  Source_States =(State)newStates.get(i);
					  }//if
					  
					  
					  if(transition.TargetState.equalsIgnoreCase(newStates.get(i).getName()))
					  {
						  Target_States =(State)newStates.get(i);
					  }//if
			  }//for
			 
			  newTransition.setSource(Source_States);
			  newTransition.setTarget(Target_States);
			  
			//************ Set Guard condition of newTransition ************//
			  if(transition.GuardCondition!=null)
			  { 
					 newTransition.createGuard(null, UMLPackage.Literals.CONSTRAINT);
				     newTransition.getGuard().createSpecification(null,null, UMLPackage.Literals.LITERAL_STRING);
				     ValueSpecification vs = newTransition.getGuard().getSpecification();
				     LiteralString ls = (LiteralString) vs;
				     ls.setValue(transition.GuardCondition);
			  }
			  
			//************ Set Effect of newTransition ************//
			 if(transition.Effect!=null)
			 {
				 newTransition.createEffect(transition.Effect, UMLPackage.Literals.OPAQUE_BEHAVIOR);
			 }
					 
		   
			//************ Set Trigger of newTransition ************//
			  for(int i=0;i<transition.Trigger.size();i++)
			  {
				 // System.out.println(transition.SourceState+"--"+transition.TargetState+"---"+transition.Trigger.size());
				 
				  String trigger=transition.Trigger.get(i).trim();
				  
				  if(trigger.contains("("))
				  {
					trigger=trigger.substring(0, trigger.indexOf('('));
				  }//if
				  
				  for(int j=0;j<CallEventList.size();j++)
				  {
					  
					  if(CallEventList.get(j).getLabel().equals(trigger))
					  {
						  newTransition.createTrigger(null).setEvent(CallEventList.get(j));
					  }
				  }//for
			  }
			
			  
	     }//for
	     
	       //"C:/Users/Saqib/Desktop/NewModelCreated"
	     save(NewModel, URI.createFileURI(destinationPath).appendSegment("NewModel").appendFileExtension(UMLResource.FILE_EXTENSION)); 
		//save(NewModel, URI.createURI("C:/Users/Saqib/Desktop/NewModelCreated").appendSegment("NewModel").appendFileExtension(UMLResource.FILE_EXTENSION)); 
	}
	
	 /**********************************************************************************/
     protected static PackageableElement createPackageForTrigger(org.eclipse.uml2.uml.Package event, String name) 
     {
		PackageableElement event_ = event.createPackagedElement(name, UMLPackage.Literals.CALL_EVENT);
		return event_;
	 }
    
	 /*************************************************************************************/
	 protected static org.eclipse.uml2.uml.Operation createOwnedOperation(org.eclipse.uml2.uml.StateMachine operation, String name) 
	 {
			org.eclipse.uml2.uml.Operation operation_ = operation.createOwnedOperation(name, null, null);			
			return operation_;
	 }
	 
	/*************************************************************************************/
    protected static org.eclipse.uml2.uml.Package createPackage(org.eclipse.uml2.uml.Package nestingPackage, String name) 
    {
		org.eclipse.uml2.uml.Package package_ = nestingPackage.createNestedPackage(name);
		
		return package_;
	}
    
    /************************************************************************************/
    protected static org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package package_, String name, boolean isAbstract) 
    {
		org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass(name,isAbstract);
		return class_;
	}
	
	 /*************************************************************************************/
     protected static void save(org.eclipse.uml2.uml.Package package_, URI uri)
	 {
				Resource resource = new ResourceSetImpl().createResource(uri);
			    resource.getContents().add(package_);
				try {
						resource.save(null);
						//System.out.println("Done.");
					} 
				catch (IOException ioe) {
						System.out.println(ioe.getMessage());
					}
	 }
		      
    /******************************************************************************************/
    public ArrayList<String> getOperation(ArrayList<BaseTransitions> baseTransition)
    {
        ArrayList<String> Operation=new ArrayList<String>();
        
    	for(int i=0;i<baseTransition.size();i++)
    	{
    		ArrayList<String> Trigger=baseTransition.get(i).Trigger;
    		for(int j=0;j<Trigger.size();j++)
    		{
    			if(Operation.size()==0)
    			{
    				Operation.add(Trigger.get(j).trim());
    			}//if
    			else
    			{
    				if(!Operation.contains(Trigger.get(j).trim()))
    				{
    					Operation.add(Trigger.get(j).trim());
    				}//if
    			}//else
    		}//for
    		
    	}//for
    		
      	return Operation;
    }

}//UMLWriting
