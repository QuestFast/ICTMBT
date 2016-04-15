package Driver;

import java.util.ArrayList;

public class ParameterStructure {
	
	private String className;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	private String functionName;
	public ParameterStructure()
	{
		argument=new ArrayList<String>();
	}
	
	private ArrayList<String> argument;
	
	public void addArgument(String arg)
	{
		argument.add(arg);
	}
	public ArrayList<String> getArgument() {
		return argument;
	}
	public void setArgument(ArrayList<String> argument) {
		this.argument = argument;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	

}
