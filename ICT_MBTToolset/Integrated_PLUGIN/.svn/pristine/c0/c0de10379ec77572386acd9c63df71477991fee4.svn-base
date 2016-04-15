package Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import org.eclipse.uml2.uml.Model;

import snt.oclsolver.distance.ObjectTuple;

public class GenerateJunitTestCases {

	private ArrayList<ParameterStructure> parameter;
	private TestCase testcases;
	private ParameterReader pmReader;
	private ArrayList<ObjectTuple[]> data;
	/**
	 * @param testcases
	 */
	public GenerateJunitTestCases(TestCase testcases) {
		super();
		this.testcases = testcases;
		pmReader= new ParameterReader();
		parameter=new ArrayList<ParameterStructure>();
	}
	public void readModel()
	{
		UMLReader reader=new UMLReader();
		Model model = reader.loadModel((new File(MainGUIClass.getUmlFilename()))
				.toURI().toString());
		parameter=pmReader.readModel(model);
	}


	/**
	 * @param testClassName
	 */
	public void createJunitTestCaseFile(String testClassName) {
		PrintWriter writer = null;
		readModel();
		try {
			writer = new PrintWriter("test/testcases/examples/account/"+testClassName+"Tests.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}MtbToolSet mtbToolSet=new MtbToolSet();

		writer.println("package testcases.examples.account;");
		writer.println();
		writer.println("import static org.junit.Assert.*;");
		writer.println("import account."+Character.toUpperCase(testClassName.charAt(0))+testClassName.substring(1, testClassName.length())+";");
		writer.println("import org.junit.Test;");
		//		writer.println("import static org.junit.Assert.fail;");
		writer.println();
		writer.println("public class "+testClassName+"Tests{");
		int counter=1;
		for (TestPath tPath : testcases.getPaths()) 
		{
			//TestPath tPath=testcases.getPaths().get(0);
			ArrayList<String> writtenParameters=new ArrayList<String>();
			ArrayList<StateMachineTransition> transitions = tPath.getStateMachineTransitions();
			writer.println("\t@Test");
			writer.println("\tpublic void testQuery"+counter+"(){");


			//			writer.println("\t\t"+transitions.get(0).getSourceState()+" obj = new "+transitions.get(0).getSourceState()+"();");
			writer.println("\t\t"+testClassName+" obj = new "+testClassName+"();");
			ArrayList<String> notInTransitionButInClassDiagram =null;

			for (StateMachineTransition stateMachineTransition : transitions) 
			{
				if(!stateMachineTransition.getTransitionName().equals(""))
				{
					if(!stateMachineTransition.getGaurdCondition().equals("") && !stateMachineTransition.getGaurdCondition().equals("[]"))
					{
						try {
							data=mtbToolSet.callToolSet(testClassName,stateMachineTransition.getGaurdCondition());
							for(ObjectTuple[] objectTuples:data)
							{
								notInTransitionButInClassDiagram = new ArrayList<String>();

								for(int i=0;i<objectTuples.length;i++)
								{
									boolean uniqueAttribute=true;
									String attribute=objectTuples[i].getAttributeName();
									for(ParameterStructure parameterStructure:parameter)
									{
										ArrayList<String>parameters=parameterStructure.getArgument();
										for(String parameterName:parameters)
										{
											String[] parameter=parameterName.split(" ");
											if(parameter[1].equals(attribute))
											{
												uniqueAttribute=false;
											}
										}
									}
									if(uniqueAttribute)
									{
										notInTransitionButInClassDiagram.add(attribute);
									}
								}
							}

							for(String uniqueMethods:notInTransitionButInClassDiagram)
							{
								String stringToWrite="set"+Character.toUpperCase(uniqueMethods.charAt(0))+uniqueMethods.substring(1, uniqueMethods.length());
								System.out.print(stringToWrite+"(");
								writer.print("obj."+stringToWrite+"(");
								String value="";
								if(data != null) {
									for(int i=0; i <data.size();i++)
									{
										ObjectTuple[] object=data.get(i);
										for(int j=0;j<object.length;j++)
										{
											if(object[j].getAttributeName().equals(uniqueMethods))
											{

												value=object[j].getOneValue()+"";
												break;
											}
										}
									}									
								}

								if(!value.equals(""))
								{
									writer.print(""+value);
									System.out.print(""+value);

								}
								else {
									Random rand = new Random();
									int randNum = rand.nextInt(1000);
									writer.println("="+randNum+";");
								}
								writer.println(");");
								System.out.println(");");

								//	writer.print("set"+un);
							}
						} catch (Exception e) {

							e.printStackTrace();
						}

					}
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
									writer.print(paramete);
									System.out.print(paramete);
									String value="";
									if(data != null) {
										for(int i=0; i <data.size();i++)
										{
											ObjectTuple[] object=data.get(i);
											for(int j=0;j<object.length;j++)
											{
												if(object[j].getAttributeName().equals(paramete.split(" ")[1]))
												{

													value=object[j].getOneValue()+"";
													break;
												}
											}
										}									
									}

									if(!value.equals(""))
									{
										System.out.println("="+value+";");
										writer.println("="+value+";");
									}
									else
									{
										Random rand = new Random();
										int randNum = rand.nextInt(1000);
										writer.println("="+randNum+";");
									}
									writtenParameters.add(paramete);
								}
								else
								{

									writer.print("\t\t"+paramete.split(" ")[1]);
									//									System.out.print(paramete);
									String value="";
									if(data != null) {
										for(int i=0; i <data.size();i++)
										{
											ObjectTuple[] object=data.get(i);
											for(int j=0;j<object.length;j++)
											{
												if(object[j].getAttributeName().equals(paramete.split(" ")[1]))
												{
													
													value=object[j].getOneValue()+"";
													break;
												}
											}
										}										
									}

									if(!value.equals(""))
									{
										System.out.println("="+value+";");
										writer.println("="+value+";");
									}
									else
									{
										Random rand = new Random();
										int randNum = rand.nextInt(1000);
										writer.println("="+randNum+";");
									}

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
					String assertequation="\t\tassertEquals(";
					assertequation+="obj.is"+Character.toUpperCase(stateMachineTransition.getTargetState().charAt(0))+stateMachineTransition.getTargetState().substring(1, stateMachineTransition.getTargetState().length())+"(),true);";

					writer.println(assertequation);

				}
				//System.out.println(stateMachineTransition.getTransitionName() + ", { " + stateMachineTransition.getTargetState() + " }, ");
			}
			counter++;
			writer.println("\t}");
			writer.println();
		}

		writer.println("}");
		writer.close();
	}
}
