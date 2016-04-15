package Driver;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.internal.impl.LiteralStringImpl;

/***
 * Reads State Machine and Put it into proper java code Structure
 * 
 * @author Zuria
 * 
 * 
 * @ClassesStructure is as: ParentClass (Board) BaseLass (BoardState)
 *                   DerivedClass (All Classes extended to BaseClaas)
 * */
public class StateMachineReader {
	private StartState startState;

	ArrayList<StateMachineState> states = new ArrayList<StateMachineState>();
	ArrayList<StateMachineTransition> transitions = new ArrayList<StateMachineTransition>();
	State parentState = null;
	int nestedRegNo=0;
	public StateMachineReader() {
		startState=new StartState();
	}
	protected JavaCodeStructure javaCodeStructure = new JavaCodeStructure();

	// * Temporary Lists and attributes that are passed to JavaCodeStructure
	// class
	// * for populating proper Code struture
	ClassStructure parentClass;
	ClassStructure baseClass;
	ArrayList<ClassStructure> derClassList;

	public ArrayList<StateMachineState> getStates() {
		return this.states;
	}

	public ArrayList<StateMachineTransition> getTransitions() {
		return this.transitions;
	}

	/***
	 * @param Model
	 * @return proper java code structure object containing all classes and
	 *         hierarichy
	 * @throws UnresolvedReferenceException
	 */
	public JavaCodeStructure processTheModel(Model model)
			throws UnresolvedReferenceException,java.lang.ClassCastException {

		EList<PackageableElement> members = null;
		members = model.getPackagedElements();
		for (PackageableElement element : members) {
			if (element.eClass() == UMLPackage.Literals.CLASS) {
				Class c = (Class) element;
				String parentClassName = c.getLabel();
				parentClass = new ClassStructure(parentClassName, "public",
						new ArrayList<AttributesStructure>(),
						new ArrayList<MethodsStructure>());
				baseClass = new ClassStructure(parentClassName + "State",
						"public", new ArrayList<AttributesStructure>(),
						new ArrayList<MethodsStructure>());
				derClassList = new ArrayList<ClassStructure>();

				EList<Behavior> ownedBehaviors = c.getOwnedBehaviors();
				for (Behavior beh : ownedBehaviors) {
					if (beh.eClass() == UMLPackage.Literals.STATE_MACHINE) {
						readBehaviours(beh);
					}
				}
			}
		}
		return this.javaCodeStructure;
	}

	/**
	 * @param Behavior
	 *            behavior
	 * @functionality reads behavior of state machine region wise
	 */
	private void readBehaviours(Behavior behavior) {

		StateMachine stateMachine = (StateMachine) behavior;
		EList<Region> regions = stateMachine.getRegions();
		for (Region reg : regions) {
			readRegoins(reg);
		}

	}

	/**
	 * 
	 * @param Region
	 *            region
	 * @functionality Explore region vertex by vertex
	 */

	private void readRegoins(Region region) {

		EList<Vertex> vertices = region.getSubvertices();
		for (Vertex vertex : vertices) {
			readVertices(vertex);
		}
	}

	private void readSubRegoins(Region region) {

		EList<Vertex> vertices = region.getSubvertices();
		for (Vertex vertex : vertices) {
			readSubVertices(vertex);
		}
	}

	/**
	 * @param vertex
	 */
	private void readSubVertices(Vertex vertex) {

		/** States (Derive Classes) */
		State state=null;
		Boolean isPseudostate=false;
		Pseudostate pseudostate=null;
		String derivedClassName=null;
		if(vertex.eClass() == UMLPackage.Literals.STATE)
		{
			isPseudostate=false;
			state = (State) vertex;
			derivedClassName= state.getLabel(); // Derived class name
		}
		else if (vertex.eClass() == UMLPackage.Literals.PSEUDOSTATE)
		{
			isPseudostate=true;
			pseudostate= (Pseudostate) vertex;
			if (pseudostate.getKind().getLiteral().equalsIgnoreCase("choice"))
			{
				derivedClassName= pseudostate.getKind().getLiteral(); // Derived class name
			}
			else return;
		}
		else
			return;
		//------------- Add in States Array List-----------
		StateMachineState stateLabel = null;
		stateLabel = new StateMachineState(derivedClassName, this.parentState != null ? this.parentState.getLabel() : null);

		boolean contains = containsStateAlready(derivedClassName,
				stateLabel.getParentStateName());
		if (contains == false)
			states.add(stateLabel);

		ArrayList<MethodsStructure> methodStruct; // class methods list
		ArrayList<AttributesStructure> paramList; // methods Parameter list

		EList<Transition> outgoingTransitions;
		outgoingTransitions = getOutgoingTransitions(state, isPseudostate, pseudostate);
		methodStruct = new ArrayList<MethodsStructure>();
		paramList = new ArrayList<AttributesStructure>();

		for (Transition trans : outgoingTransitions) {
			getTransitions(trans, paramList, methodStruct, derivedClassName);

		}
		derClassList.add(new ClassStructure(derivedClassName, "public", null,
				methodStruct));

	}

	/**
	 * 
	 * @param vertex
	 * @functionality Explore each vertex state by state and extract
	 */
	private void readVertices(Vertex vertex) {

		/** States (Derive Classes) */
		State state=null;
		Boolean isPseudostate=false;
		Pseudostate pseudostate=null;
		String derivedClassName=null;
		if(vertex.eClass() == UMLPackage.Literals.STATE)
		{
			isPseudostate=false;
			state = (State) vertex;
			derivedClassName= state.getLabel();
		}
		else if (vertex.eClass() == UMLPackage.Literals.PSEUDOSTATE)
		{
			isPseudostate=true;
			pseudostate= (Pseudostate) vertex;
			if (pseudostate.getKind().getLiteral().equalsIgnoreCase("choice"))
			{
				derivedClassName= pseudostate.getKind().getLiteral();
			}
			else return;
		}
		else
			return;
		//------------- Add in States Array List-----------
		StateMachineState stateLabel = null;
		stateLabel = new StateMachineState(derivedClassName, this.parentState != null ? this.parentState.getLabel() : null);

		boolean contains = containsStateAlready(derivedClassName,
				stateLabel.getParentStateName());
		if (contains == false)
			states.add(stateLabel);
		//--------------------------------------------------

		// Nested Regions
		if (isPseudostate==false && state.getRegions() != null) {
			this.parentState = state;
			EList<Region> regions = state.getRegions();
			for (Region reg : regions) { // parallel regions
				this.nestedRegNo++;
				readSubRegoins(reg);
			}this.nestedRegNo=0;
		}
		//return from Nested <region/>
		this.parentState = null;
		// -----------------------------------------------------------------------------

		ArrayList<MethodsStructure> methodStruct; // class methods list
		ArrayList<AttributesStructure> paramList; // methods Parameter list

		EList<Transition> outgoingTransitions;
		outgoingTransitions = getOutgoingTransitions(state, isPseudostate, pseudostate);
		methodStruct = new ArrayList<MethodsStructure>();
		paramList = new ArrayList<AttributesStructure>();

		for (Transition trans : outgoingTransitions) {
			getTransitions(trans, paramList, methodStruct, derivedClassName);
		}

		derClassList.add(new ClassStructure(derivedClassName, "public", null,
				methodStruct));

	}

	/**
	 * @param state
	 * @param isPseudostate
	 * @param pseudostate
	 * @return
	 */
	public EList<Transition> getOutgoingTransitions(State state,
			Boolean isPseudostate, Pseudostate pseudostate) {
		EList<Transition> outgoingTransitions;
		if(isPseudostate==false)
			outgoingTransitions= state.getOutgoings();
		else
			outgoingTransitions = pseudostate.getOutgoings();
		return outgoingTransitions;
	}

	/**
	 * @param derivedClassName
	 * @param parentStateName
	 * @return
	 */
	public boolean containsStateAlready(String derivedClassName, String parentStateName) {
		boolean contains = false;
		for (int i = 0; i < states.size(); i++) {
			StateMachineState element = states.get(i);
			if (derivedClassName.equalsIgnoreCase(element.getStateName()) && ((parentStateName==null && element.getParentStateName()==null) || parentStateName.equalsIgnoreCase(element.getParentStateName())))
			{
				contains = true;
			}
		}
		return contains;
	}

	/**
	 * 
	 * @param transition
	 * @param paramList
	 * @param methodStruct
	 * @param derivedClassName
	 * 
	 * @functionality handles guards condition ( conditional expressions ) and
	 *                bodies
	 */
	private void getTransitions(Transition transition,
			ArrayList<AttributesStructure> paramList,
			ArrayList<MethodsStructure> methodStruct, String derivedClassName) {

		/****** guard condition **********/
		String condition = "";
		EList<Constraint> ownedRules = transition.getOwnedRules();
		for (Constraint Rule : ownedRules) {
			ValueSpecification Specifications = Rule.getSpecification();
			if(Specifications instanceof OpaqueExpression){
				OpaqueExpression expr = (OpaqueExpression) Specifications;

				condition += expr.getBodies().toString();
			}
			if(Specifications instanceof LiteralStringImpl){
				LiteralStringImpl expr = (LiteralStringImpl) Specifications;
				condition += expr.getValue();
			}
		}

		StateMachineTransition trans = null;
		String targetState,sourceState;
		targetState = getStateName((Vertex)transition.getTarget());
		sourceState = getStateName((Vertex)transition.getSource());
		//-------------------
		if (transition.getLabel() != null) {

			trans = new StateMachineTransition(transition.getLabel(),
					sourceState, targetState,
					this.parentState != null ? this.parentState.getLabel() : null , condition!=null ? condition : null, "Region"+this.nestedRegNo);

			EList<Transition> list=transition.getSource().getIncomings();
			boolean isStart=false;


			for(Transition transition2:list)
			{
				if(transition2.getSource().eClass()==UMLPackage.Literals.PSEUDOSTATE &&(startState.getStart().equals("") || startState.getStart().equals(transition2.getTarget().getName())))
				{
					if(startState.getStart().equals(""))
					{
						startState.setStart(transition.getSource().getName());
					}
					else
					{

					}
					isStart=true;	
				}
			}




			//		System.out.println(trans.getSourceState());
			//org.eclipse.uml2.uml.internal.impl.ConstraintImpl g= (ConstraintImpl) transition.getGuard();
			EList<Constraint> owned=transition.getOwnedRules();
			for(Constraint cons: owned)
			{
				ValueSpecification vs;
				vs=cons.getSpecification();
				//	System.out.println(vs.stringValue());
			}


			trans.setStart(isStart);
			//	System.out.println(transition.getSource().getName()+" " + isStart);
			transitions.add(trans);
		}
		else if (transition.getEffect() != null) {

			trans = new StateMachineTransition(transition.getEffect()
					.getName(), sourceState,
					targetState,
					this.parentState != null ? this.parentState.getLabel() : null, condition!=null ? condition : null, "Region"+this.nestedRegNo);
			EList<Transition> list=transition.getSource().getIncomings();
			boolean isStart=false;

			for(Transition transition2:list)
			{
				if(transition2.getSource().eClass()==UMLPackage.Literals.PSEUDOSTATE)
				{
					isStart=true;	
				}
			}
			System.out.println(transition.getSource().getName());
			transitions.add(trans);
		}
	}

	public String getStateName(Vertex vertex) {
		String stateName;
		if( vertex.eClass() == UMLPackage.Literals.PSEUDOSTATE)
		{
			stateName=((Pseudostate)vertex).getKind().getLiteral();
		}
		else
			stateName=((State)vertex).getName();
		return stateName;
	}

	// **************** Other Useful methods ******************

	/**
	 * 
	 * @param String
	 * @functionality print string on console
	 */
	public void print(String data) {
		System.out.println(data);
	}
	// /*********************************************/
}
