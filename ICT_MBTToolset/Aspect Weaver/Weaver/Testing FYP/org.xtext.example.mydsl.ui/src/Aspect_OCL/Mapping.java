package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Mapping {
	
	String Source;
	String ConstraintList;
    String Destination;

 

    public void setMappingAttribute(String [] MappingAttribute)
    {
    	Source=MappingAttribute[0];
    	ConstraintList=MappingAttribute[1];
    	Destination=MappingAttribute[2];
 
    	
    	
    	
    }
	
	
    public String getSource()
    {
    	return Source;
    	
    }
    
    public String getDestination()
    {
    	
    	return Destination;
    }
    
    public String getConstraintList()
    {
    	return ConstraintList;
    	
    }
    
		 
}
