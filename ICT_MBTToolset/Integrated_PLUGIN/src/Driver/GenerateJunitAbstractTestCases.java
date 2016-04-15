package Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.uml2.uml.Model;

public class GenerateJunitAbstractTestCases {


	private ArrayList<ParameterStructure> parameter;
	private TestCase testcases;
	private ParameterReader pmReader;
	/**
	 * @param testcases
	 */
	public GenerateJunitAbstractTestCases(TestCase testcases) {
		super();
		this.testcases = testcases;
		pmReader= new ParameterReader();
		parameter=new ArrayList<ParameterStructure>();
	}

	
	
	public String createAbstractTestCaseFile(String testClassName) {
	String text="";
		//PrintWriter writer = null;
		//writer.println("public class "+testClassName+"AbstractTests{");
		text+="\npublic class "+testClassName+"AbstractTests{";
		
		int counter=1;
		for (TestPath tPath : testcases.getPaths()) {
			ArrayList<String> writtenParameters=new ArrayList<String>();
			ArrayList<StateMachineTransition> transitions = tPath.getStateMachineTransitions();
			//writer.println("\t@Test");
			//writer.println("\tpublic void testQuery"+counter+"(){");
			text+="\n"+"\t@Test";
			text+="\n"+"\tpublic void testQuery"+counter+"(){";
			
//			writer.println("\t\t"+transitions.get(0).getSourceState()+" obj = new "+transitions.get(0).getSourceState()+"();");
		//	writer.println("\t\t"+testClassName+" obj = new "+testClassName+"();");
			text+="\n\t\t"+testClassName+" obj = new "+testClassName+"();";
			
			for (StateMachineTransition stateMachineTransition : transitions) {
				if(!stateMachineTransition.getTransitionName().equals(""))
				{
					for(ParameterStructure parameterStructure:parameter)
					{
						if(parameterStructure.getClassName().equals(testClassName) && parameterStructure.getFunctionName().equals(stateMachineTransition.getTransitionName()))
						{
							ArrayList<String>parameters=parameterStructure.getArgument();
							for(int param=0;param<parameters.size();param++)
							{
								String paramete=parameters.get(param);
								boolean checkrepeat=false;
						/*		for(String checkParamters:writtenParameters)
								{
									if(checkParamters.equals(paramete))
									{
										checkrepeat=true;
									}

									
								}
								if(!checkrepeat)
								{
								writer.print(paramete);
								
									writer.println("=null;");
									writtenParameters.add(paramete);
								}
					*/			
							}
						}
					}
					
//					writer.print("\t\tobj."+stateMachineTransition.getTransitionName()+"(");
					text+="\n\t\tobj."+stateMachineTransition.getTransitionName()+"(";
					
					for(ParameterStructure ps:parameter)
					{
						if(ps.getClassName().equals(testClassName) && ps.getFunctionName().equals(stateMachineTransition.getTransitionName()))
						{
							ArrayList<String>parameters=ps.getArgument();
					/*		for(int param=0;param<parameters.size();param++)
							{
								String paramete=parameters.get(param);
								String[] listofParam=paramete.split(" ");
								writer.print(listofParam[1]);
								if(param!=parameters.size()-1)
								{
									writer.print(",");
								}
							}
					*/	}
					}
					//writer.println(");");
					text+=");";
					
				}
				//System.out.println(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
			}
			counter++;
			//writer.println("\t}");
			text+="\n\t}\n";
			//writer.println();
		}
		text+="}\n";
//		writer.println("}");
	//	writer.close();
		return text;
	}
}