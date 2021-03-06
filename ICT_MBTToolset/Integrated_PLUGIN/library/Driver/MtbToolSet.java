package Driver;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Vector;

import snt.oclsolver.distance.ClassDiagramTestData;
import snt.oclsolver.distance.DistanceCalculator;
import snt.oclsolver.distance.ObjectTuple;
import snt.oclsolver.distance.Problem;
import snt.oclsolver.distance.SimpleProblem;
import snt.oclsolver.driver.ConstraintParts;
import snt.oclsolver.driver.FinalDriver;
import snt.oclsolver.reader.ObjScriptGenerator;
import snt.oclsolver.search.AVM;
import snt.oclsolver.search.Search;

public class MtbToolSet {
	int values[];
	Vector attributes;

	/**
	 * @param testClassName
	 * @param guard
	 * @return
	 * @throws Exception
	 */
	public ArrayList<ObjectTuple[]> callToolSet(String testClassName,String guard) throws Exception 
	{
		if(guard.length() < 2) {
			return null;
		}
		guard=guard.substring(1, guard.length()-1);
		for(int i=0;i<guard.length();i++)
		{
			if(Character.isLetter(guard.charAt(i)))
			{
				if(guard.length()>i+3)
				{
					if((guard.charAt(i)=='a' && guard.charAt(i+1)=='n' && guard.charAt(i+2)=='d') && guard.charAt(i+3)==' ')
					{
						i=i+3;
					}
					else if((guard.charAt(i)=='o' && guard.charAt(i+1)=='r' && guard.charAt(i+2)==' '))
					{
						i=i+2;
					}
					else if(i==0)
					{
						guard="a."+guard;
						i+=2;
						for(;i<guard.length();i++)
						{
							if(Character.isLetter(guard.charAt(i)) || guard.charAt(i)==' ')
							{

							}
							else
							{
								break;
							}
						}
					}
					else
					{
						guard=guard.substring(0, i)+"a."+guard.substring(i, guard.length());
						i+=2;
						for(;i<guard.length();i++)
						{
							if(Character.isLetter(guard.charAt(i)) || guard.charAt(i)==' ')
							{

							}
							else
							{
								break;
							}
						}
					}
				}
			}
		}


		ConstraintParts queries[] = new ConstraintParts[1];
		int startR = -1, numberOfRuns = -1;

		// specifying the constraints
		String p1 = "";
		String p2 = "";
		String p3 = "";
		String p4 = "";
		String p5 = "";
		String p6 = "";
		ConstraintParts obj1 = new ConstraintParts();
		obj1.getParts().clear();

		ArrayList<ObjectTuple[]> data=new ArrayList<ObjectTuple[]>();
		String constraint=testClassName+".allInstances()->forAll(a|"+guard+")";
		p1 =constraint; // P


		obj1.getParts().add(p1);
		obj1.setType(2);
		queries[0] = obj1;
		Search[] SA = new Search[] { new AVM()};
		String strLine;
		String filePath = MainGUIClass.getUmlFilename();
		// reading the class diagram
		ObjScriptGenerator driver = new ObjScriptGenerator(filePath);
		driver.generateScript();
		FinalDriver obj = new FinalDriver();
		ClassDiagramTestData.setFileNames(obj.getclassDiag(), obj.getObjDiag());
		// Problem.optimize =true;
		int k=31;
		for (Search sv : SA) // search algorithm
		{
			BufferedWriter file = new BufferedWriter(new FileWriter(
					sv.getShortName() + "-Break-"+ startR + "-"
							+ numberOfRuns + ".txt"));
			k=31;
			for (int k1 = 0; k1 < queries.length; k1++) // Problem
			{
				ArrayList<String> parts = queries[k1].getParts();
				int op = queries[k1].getType();
				for (int i = startR; i <= 0; i++) // runs
				{
					ClassDiagramTestData.reset(filePath);
					Problem p = null;
					int[][] v = null;
					int[][] v1 = null;
					boolean found = false;
					long start = 0;
					int steps = 0;
					long elapsedTimeMillis = 0;
					float elapsedTimeSec = 0;
					double fitness1 = 0.0, fitness2 = 0.0, fitness1Neg = 0.0, fitness2Neg = 0.0;
					int tSteps = 0;
					float tTime = 0;
					int count=0;
					boolean firstFound = false;


					switch (op) // boolean operator (and/or/implies/xor)
					{
					case 1: //and
						for(int l=0;l<parts.size();l++)// constraint parts
						{

							//					tSteps = 0;
							//					tTime = 0;
							firstFound = false;
							p = new SimpleProblem(parts.get(l));
							p.initializeWithRanges(queries[k1].getRanges());

							sv.setMaxIterations(3000);
							Search.validateConstraints(p);
							start = System.currentTimeMillis();
							v = sv.search(p);
							found = p.getFitness(v) == 0d;
							if(found==true)
							{
								count++;
							}
							steps = sv.getIteration();
							elapsedTimeMillis = System.currentTimeMillis() - start;
							elapsedTimeSec = elapsedTimeMillis / 1000F;
							tSteps += steps;
							tTime += elapsedTimeSec;
							firstFound = found;

							ClassDiagramTestData.reset(filePath);
						}
						file.write(sv.getShortName());
						file.write("\tBreak");
						file.write(" \t " + i);
						file.write(" \t " + (k));
						if (tSteps < parts.size()*3000 && (count==parts.size())) {
							file.write(" \t " + tSteps );
							file.write(" \t " + found);
						} else {
							file.write(" \t"+ parts.size()*3000);
							file.write(" \t false");
						}

						file.write(" \t " + (tTime ) + "\r\n");
						file.flush();
						break;
					case 2://or
						double[] distances=new double[parts.size()];
						boolean satisfied=false;
						for(int l=0;l<parts.size();l++)// constraint parts
						{
							p = new SimpleProblem(parts.get(l));
							p.initializeWithRanges(queries[k1].getRanges());
							//						p.processProblem(parts.get(l));
							sv.setMaxIterations(3000);
							Search.validateConstraints(p);
							start = System.currentTimeMillis();
							v = sv.search(p);


							ObjectTuple[] array=p.getQueryVariables();

							data.add(array);

							fitness1 = p.getFitness(v);
							found = fitness1 == 0d;

							if(found==true)
							{
								steps = sv.getIteration();
								elapsedTimeMillis = System.currentTimeMillis() - start;
								elapsedTimeSec = elapsedTimeMillis / 1000F;
								file.write(sv.getShortName());
								file.write("\tBreak");
								file.write(" \t " + i);
								file.write(" \t " + (k));
								file.write(" \t " + steps);
								file.write(" \t " + found);
								file.write(" \t " + elapsedTimeSec + "\r\n");
								file.flush();
								satisfied=true;
								break;
							}
							distances[l]=fitness1;
							ClassDiagramTestData.reset(filePath);
						}
						if(satisfied==false)
						{
							DistanceCalculator objdc=new DistanceCalculator(0);
							int index=objdc.getMinValue(distances);

							p = new SimpleProblem(parts.get(index));
							p.initializeWithRanges(queries[k1].getRanges());
							//p.processProblem(parts.get(index));
							sv.setMaxIterations(3000);
							Search.validateConstraints(p);
							start = System.currentTimeMillis();
							v = sv.search(p);
							found = p.getFitness(v) == 0d;
							steps = sv.getIteration();
							elapsedTimeMillis = System.currentTimeMillis() - start;
							elapsedTimeSec = elapsedTimeMillis / 1000F;
							file.write(sv.getShortName());
							file.write("\tBreak");
							file.write(" \t " + i);
							file.write(" \t " + (k));
							file.write(" \t " + steps);
							file.write(" \t " + found);
							file.write(" \t " + elapsedTimeSec + "\r\n");
							file.flush();
						}
						break;
					case 3://implies

						p = new SimpleProblem(parts.get(1));
						p.initializeWithRanges(queries[k1].getRanges());
						//						p.processProblem(parts.get(1));
						sv.setMaxIterations(100);
						Search.validateConstraints(p);
						v = sv.search(p);
						fitness2 = p.getFitness(v);
						found = fitness2 == 0d;

						ClassDiagramTestData.reset(filePath);
						p = new SimpleProblem("not(" + parts.get(0) + ")");
						p.initializeWithRanges(queries[k1].getRanges());
						//p.processProblem("not(" + parts.get(0) + ")");
						sv.setMaxIterations(100);
						Search.validateConstraints(p);
						v = sv.search(p);
						fitness1Neg = p.getFitness(v);
						found = fitness1Neg == 0d;
						ClassDiagramTestData.reset(filePath);

						if (fitness1Neg <= fitness2) {
							p = new SimpleProblem("not(" + parts.get(0) + ")");
							p.initializeWithRanges(queries[k1].getRanges());
							//p.processProblem("not(" + parts.get(0) + ")");

							sv.setMaxIterations(3000);
							Search.validateConstraints(p);
							start = System.currentTimeMillis();
							v = sv.search(p);
							found = p.getFitness(v) == 0d;

							steps = sv.getIteration();
							elapsedTimeMillis = System.currentTimeMillis()
									- start;
							elapsedTimeSec = elapsedTimeMillis / 1000F;

							file.write(sv.getShortName());
							file.write("\tBreak");
							file.write(" \t " + i);
							file.write(" \t " + (k));

							file.write(" \t " + tSteps);
							file.write(" \t " + found);

							file.write(" \t " + elapsedTimeSec + "\r\n");
							file.flush();
						} else {
							p = new SimpleProblem(parts.get(1));
							p.initializeWithRanges(queries[k1].getRanges());
							//p.processProblem(parts.get(1));

							sv.setMaxIterations(3000);
							Search.validateConstraints(p);
							start = System.currentTimeMillis();
							v = sv.search(p);
							found = p.getFitness(v) == 0d;

							steps = sv.getIteration();
							elapsedTimeMillis = System.currentTimeMillis()
									- start;
							elapsedTimeSec = elapsedTimeMillis / 1000F;

							file.write(sv.getShortName());
							file.write("\tBreak");
							file.write(" \t " + i);
							file.write(" \t " + (k));

							file.write(" \t " + steps);
							file.write(" \t " + found);

							file.write(" \t " + elapsedTimeSec + "\r\n");
							file.flush();
						}

						break;
						// case 4:
						// //BufferedWriter file3 = new BufferedWriter(new
						// FileWriter(sv.getShortName()+"-Break-"+op+"-"+startR+"-"+numberOfRuns+".txt"));
						// for (int target=2;target<=2;target++)
						// {
						// double fitness1= 0.0, fitness2=0.0,
						// fitness1Neg=0.0,fitness2Neg=0.0;
						//
						// for(int i=startR; i<=numberOfRuns; i++)
						// {
						// int tSteps=0;
						// float tTime=0;
						// boolean firstFound=false;
						// Problem p= new SimpleProblem(queries[1]);
						// p.processProblem(queries[1]);
						// sv.setMaxIterations(100);
						// Search.validateConstraints(p);
						// int[][] v = sv.search(p);
						// fitness1=p.getFitness(v);
						// boolean found = fitness1==0d;
						//
						//
						// p= new SimpleProblem(queries[target]);
						// p.processProblem(queries[target]);
						// sv.setMaxIterations(100);
						// Search.validateConstraints(p);
						// v = sv.search(p);
						// fitness2=p.getFitness(v);
						// found = fitness2==0d;
						//
						//
						// p= new SimpleProblem("not("+queries[1]+")");
						// p.processProblem("not("+queries[1]+")");
						// sv.setMaxIterations(100);
						// Search.validateConstraints(p);
						// v = sv.search(p);
						// fitness1Neg=p.getFitness(v);
						// found = fitness1Neg==0d;
						//
						// p= new SimpleProblem("not("+queries[target]+")");
						// p.processProblem("not("+queries[target]+")");
						// sv.setMaxIterations(100);
						// Search.validateConstraints(p);
						// v = sv.search(p);
						// fitness2Neg=p.getFitness(v);
						// found = fitness2Neg==0d;
						//
						//
						//
						// if ((fitness1+fitness2Neg)>(fitness1Neg+fitness2))
						// {
						// p= new SimpleProblem(queries[1]);
						// p.processProblem(queries[1]);
						//
						// sv.setMaxIterations(10000);
						// Search.validateConstraints(p);
						// long start = System.currentTimeMillis();
						// v = sv.search(p);
						// found = p.getFitness(v)==0d;
						//
						//
						// int steps = sv.getIteration();
						// long elapsedTimeMillis =
						// System.currentTimeMillis()-start;
						// float elapsedTimeSec = elapsedTimeMillis/1000F;
						// tSteps+=steps;
						// tTime+=elapsedTimeSec;
						// firstFound =found;
						//
						// p= new SimpleProblem("not("+queries[target]+")");
						// p.processProblem("not("+queries[target]+")");
						//
						// sv.setMaxIterations(10000);
						// Search.validateConstraints(p);
						// start = System.currentTimeMillis();
						// int[][] v1 = sv.search(p);
						// found = p.getFitness(v1)==0d;
						//
						//
						// steps = sv.getIteration();
						// elapsedTimeMillis = System.currentTimeMillis()-start;
						// elapsedTimeSec = elapsedTimeMillis/1000F;
						// file.write(sv.getShortName());
						// file.write("\tBreak");
						// file.write(" \t " + i);
						// file.write(" \t " + (target-1));
						// if ((tSteps+steps)< 10000&&(firstFound &&found))
						// {
						// file.write(" \t " + (tSteps+steps));
						// file.write(" \t " + found);
						// }
						// else
						// {
						// file.write(" \t 10000");
						// file.write(" \t false");
						// }
						// file.write(" \t " + tTime+"\r\n");
						// file.flush();
						// }
						// else
						// {
						// p= new SimpleProblem("not("+queries[1]+")");
						// p.processProblem("not("+queries[1]+")");
						//
						// sv.setMaxIterations(10000);
						// Search.validateConstraints(p);
						// long start = System.currentTimeMillis();
						// v = sv.search(p);
						// found = p.getFitness(v)==0d;
						//
						//
						// int steps = sv.getIteration();
						// long elapsedTimeMillis =
						// System.currentTimeMillis()-start;
						// float elapsedTimeSec = elapsedTimeMillis/1000F;
						// tSteps+=steps;
						// tTime+=elapsedTimeSec;
						// firstFound =found;
						//
						// p= new SimpleProblem(queries[target]);
						// p.processProblem(queries[target]);
						//
						// sv.setMaxIterations(10000);
						// Search.validateConstraints(p);
						// start = System.currentTimeMillis();
						// int[][] v1 = sv.search(p);
						// found = p.getFitness(v1)==0d;
						//
						//
						// steps = sv.getIteration();
						// elapsedTimeMillis = System.currentTimeMillis()-start;
						// elapsedTimeSec = elapsedTimeMillis/1000F;
						// file.write(sv.getShortName());
						// file.write("\tBreak");
						// file.write(" \t " + i);
						// file.write(" \t " + (target-1));
						// if ((tSteps+steps)< 10000&&(firstFound &&found))
						// {
						// file.write(" \t " + (tSteps+steps));
						// file.write(" \t " + found);
						// }
						// else
						// {
						// file.write(" \t 10000");
						// file.write(" \t false");
						// }
						// file.write(" \t " +
						// (tTime+elapsedTimeSec+elapsedTimeSec)+"\r\n");
						// file.flush();
						// }
						//
						// }
						//
						//
						// }
						// //file3.flush();
						// //file3.close();
						// break;

					}

				}
				k++;
			}
			file.close();
		}
		return data;
	}




}
