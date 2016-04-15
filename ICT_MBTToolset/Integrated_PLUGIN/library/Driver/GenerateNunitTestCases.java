package Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.uml2.uml.Model;

public class GenerateNunitTestCases {

	private ArrayList<ParameterStructure> parameter;
	private TestCase testcases;
	private ParameterReader pmReader;
	/**
	 * @param testcases
	 */
	public GenerateNunitTestCases(TestCase testcases) {
		super();
		this.testcases = testcases;
		pmReader= new ParameterReader();
		parameter=new ArrayList<ParameterStructure>();
	}
	public void readModel()
	{
		UMLReader reader=new UMLReader();
		Model model = reader.loadModel((new File("InputFiles/Blank Package.uml"))
				.toURI().toString());
		parameter=pmReader.readModel(model);
	}
	
	/**
	 * @param testClassName
	 */
	public void createnunitTestCaseFile(String testClassName) {
	//	System.out.println("in n unit");
		PrintWriter writer = null;
		readModel();
		try {
			writer = new PrintWriter("test/testcases/examples/account/"+testClassName+"NunitTests.cs");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 		writer.println("using System;");
		writer.println("using NUnit;");
		writer.println("using NUnit_Application;");
		writer.println("using NUnit.Framework;");
//		writer.println("import static org.junit.Assert.fail;");
		writer.println("namespace NUnit_Application.Test \n{	\n\n");
		writer.println("[TestFixture]\n	");
		writer.println("public class "+testClassName+"Tests{");
		int counter=1;
		for (TestPath tPath : testcases.getPaths()) {
			ArrayList<String> writtenParameters=new ArrayList<String>();
			ArrayList<StateMachineTransition> transitions = tPath.getStateMachineTransitions();
			writer.println("\t[TestCase]");
			writer.println("\tpublic void testQuery"+counter+"(){");
			
//			writer.println("\t\t"+transitions.get(0).getSourceState()+" obj = new "+transitions.get(0).getSourceState()+"();");
			writer.println("\t\t"+testClassName+" obj = new "+testClassName+"();");
			for (StateMachineTransition stateMachineTransition : transitions) 
			{
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
								for(String checkParamters:writtenParameters)
								{
									if(checkParamters.equals(paramete))
									{
										checkrepeat=true;
									}

									
								}
								if(!checkrepeat)
								{

							String []words = paramete.split(" ");
								if(words[0].equals("Integer"))
									writer.print("int "+words[1]+"=0");
								else
								writer.print(paramete);
									
								writer.println(";\n");
									writtenParameters.add(paramete);
								}
								
							}
						}
					}
					
					writer.print("\t\tobj."+stateMachineTransition.getTransitionName()+"(");
					for(ParameterStructure ps:parameter)
					{
						if(ps.getClassName().equals(testClassName) && ps.getFunctionName().equals(stateMachineTransition.getTransitionName()))
						{
							ArrayList<String>parameters=ps.getArgument();
							for(int param=0;param<parameters.size();param++)
							{
								String paramete=parameters.get(param);
								String[] listofParam=paramete.split(" ");
								writer.print(listofParam[1]);
								if(param!=parameters.size()-1)
								{
									writer.print(",");
								}
							}
						}
					}
					writer.println(");");
					
				}
				//System.out.println(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
			}
			counter++;
			writer.println("\t}");
			writer.println();
		}
		
		writer.println("}\t}");
		writer.close();
	}
}