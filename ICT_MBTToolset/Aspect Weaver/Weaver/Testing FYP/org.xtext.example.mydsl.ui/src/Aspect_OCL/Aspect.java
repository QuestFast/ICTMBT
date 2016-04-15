package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Aspect {

	String mapping;
	String pointcut;
	String context;
	String intro="";
	String advice="";
	int thenCounter=0;
	int ifCounter=0;
	String referredVariable;
	
	
	
	public void setAspectAttribute(String [] AspectAttributes)
	{
		mapping=AspectAttributes[0];
		pointcut=AspectAttributes[1];
		context=AspectAttributes[2];
		intro=AspectAttributes[3];
		advice=AspectAttributes[4];
		thenCounter=Integer.parseInt(AspectAttributes[5]);
		ifCounter=Integer.parseInt(AspectAttributes[6]);
		referredVariable=AspectAttributes[7];
			
	}
	
	
	public String getMapping()
	{
		
		return mapping;
	}
	
	
	public String getContext()
	{
		return context;
		
	}
	
	
	public String getAdvice()
	{
		return advice;
		
	}
	
	
	public String getIntro()
	{
		return intro;
		
	}
	
	public int getifCounter()
	{
		return ifCounter;
	}
	
	
	public int getthenCounter()
	{
		return thenCounter;
	}
	
	
	public String getreferredVariable()
	{
		
		return referredVariable;
	}
}//class
