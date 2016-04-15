package Driver;

import java.util.ArrayList;

import org.jdom2.Element;

import snt.oclsolver.distance.ClassDiagramTestData;
import snt.oclsolver.distance.ObjectTuple;
import snt.oclsolver.distance.SimpleProblem;
import snt.oclsolver.driver.FinalDriver;
import snt.oclsolver.reader.ObjScriptGenerator;
import snt.oclsolver.search.Search;

public class GenerateData {
	private String guard;
	/**
	 * @param guards
	 * @param className
	 * @return
	 */
	public ObjectTuple[] generate(String guards,String className)
	{
		this.guard=guards;
		
		ArrayList<ObjectTuple[]> generatedData= new ArrayList<ObjectTuple[]>();
		
		String filePath = "/accountStateMachine.uml";
			ObjScriptGenerator driver = null;
			try {
				driver = new ObjScriptGenerator(filePath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				driver.generateScript();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			//--------------------------

			for(int i=0;i<guard.length();i++)
			{
				if(Character.isLetter(guard.charAt(i)))
				{
					if(i==0)
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


			FinalDriver obj = new FinalDriver();
			ClassDiagramTestData.setFileNames(obj.getclassDiag(), obj.getObjDiag());
			Search[] SA = new Search[] { new snt.oclsolver.search.AVM() };
					String constraint=className+".allInstances()->forAll(a|"+guard+")";
			//String constraint = "Account.allInstances()->forAll(a| a.amount > 100 and a.amount >1000)"; // P1
			int[][] v = null;
			Element classname = null;
			for (Search sv : SA) // search algorithm
			{
				SimpleProblem p = new SimpleProblem(constraint);
				sv.setMaxIterations(3000);
				v = sv.search(p);
				ObjectTuple[] array=p.getQueryVariables();
				for(int i=0;i<array.length;i++)
				{
					if(array[i].getValue()==null)
					{
						array[i].setValue(v[i]);
					}
				}

				boolean found = p.getFitness(v) == 0d;



				if (found == true) {

					return array;


				}
			}
			return null;
		}
}
