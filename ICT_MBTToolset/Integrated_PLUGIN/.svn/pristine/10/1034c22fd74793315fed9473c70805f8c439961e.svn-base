package Driver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateTestScripts {
	String filename;
	ArrayList<ParameterDetails> parameters;
	/**
	 * @param file
	 */
	public GenerateTestScripts(String file)
	{
		
		filename=file;
		parameters=new ArrayList<ParameterDetails>();
	}
	public void generateScripts()
	{
		
		try {
			populateParameters();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		generateScript();
		
		
	}
	public void generateScript()
	{
		
	}
	/**
	 * @throws IOException
	 */
	public void populateParameters() throws IOException
	{
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("InputFiles/"+filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String reader;
		ParameterDetails parameterDetails = null;
		
		while( (reader=bufferedReader.readLine())!=null)
		{
			if(reader.contains(":"))
			{
				parameterDetails=new ParameterDetails();
				String[] data=reader.split(":");
				parameterDetails.setParameterName(data[0]);
				parameterDetails.setParameterType(data[1]);
				parameters.add(parameterDetails);
			}
			else
			{
				parameterDetails.add(reader);
			}
		}
	}

}
