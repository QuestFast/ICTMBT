package Driver;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

public class ParameterReader {
	private ArrayList<ParameterStructure> parameter;
	public ParameterReader() {
	parameter= new ArrayList<ParameterStructure>();
	}
	/**
	 * @param model
	 * @return
	 */
	public ArrayList<ParameterStructure> readModel(Model model) {
		EList<PackageableElement> members = model.getPackagedElements();
		for (PackageableElement element : members)
		{
			if (element.eClass() == UMLPackage.Literals.CLASS)
			{
				Class c = (Class)element;
				System.out.println(c.getName());
				EList<Operation> ownedOperations=c.getOwnedOperations();
				for(Operation operation:ownedOperations)
				{
					ParameterStructure ps=new ParameterStructure();
					ps.setClassName(c.getName());
					ps.setFunctionName(operation.getName());
					boolean parameterExists=false;
					EList<Parameter> parameter=operation.getOwnedParameters();
					String argumentname="";
					for(Parameter param:parameter)
					{
						parameterExists=true;
						String name= param.getName();
						
						
						
//						param.;
						Type t = param.getType();
						if(t instanceof PrimitiveType){
							PrimitiveType pt = (PrimitiveType) t;
					String parameterName=pt.toString();
					String[] list=parameterName.split("#");
					String typeofParameter=list[list.length-1];
					typeofParameter=typeofParameter.substring(0, typeofParameter.length()-1);
					  argumentname=typeofParameter+" "+name;
					
				//pt.get
							//	Resource res= pt.;
						
						}
//						String type=param.getType().toString();
//						System.out.println(type);
						ps.addArgument(argumentname);
						
					}
					if(parameterExists)
					{
						this.parameter.add(ps);
					}
				}
			}
		}
		return this.parameter;
		
	}
}
