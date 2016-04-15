package Driver;

import java.util.ArrayList;

public class ParameterDetails {
	private String parameterName;
	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public ArrayList<String> getParameterValues() {
		return parameterValues;
	}
	public void setParameterValues(ArrayList<String> parameterValues) {
		this.parameterValues = parameterValues;
	}
	private String parameterType;
	private ArrayList<String> parameterValues;
	
	public ParameterDetails() {
	parameterName="";
	parameterType="";
	parameterValues=new ArrayList<String>();
	}
	public void add(String value)
	{
		parameterValues.add(value);
	}
	

}
