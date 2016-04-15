package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class MappingHandler {

	String[] MappingAttribute;
	int ConstraintList_Counter=0;
			
	/*
	*/
	
	
	public String[] getMappingAttribute(String Mapping_FileName)
	{
	
		String Source="";
		String ConstraintList="";
	    String Destination="";
	    int CaseNo=0;
		try
		{
			File file=new File(Mapping_FileName);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			MappingAttribute=new String[4];
			String line;
			while((line=br.readLine())!=null)
			{
			   line=line.trim();
			   
			   
			   if(line.contains("let"))
			   {
					   Source=ProcessLetExpression(line); // it identify that either bracket is present with let expression or not
					  
					   
					   if(Source.contains("->"))
					   {
						       String[] split1=Source.split(" ");
							   String[] split=split1[1].split("->");
							   
							   Source=split[0];   //assign value to T i-e (let T->A:)
							
							   /*********************** Case 2*************************/
							    if(split[1].length()==1)  //(let T->A:) if only one destination is present that is 'A'.
								{
							    	//Destination=new String[1];
							    	//Destination[0]=split[1].toString();
							    	
							    	Destination=split[1];
							    	ConstraintList=ReadLetBracket(br);
							    	
							    	CaseNo=2;
							    	
								}//if
							    
							    /*********************** Case 3*************************/
							    else  //(let T->{A,B,TT}:) if more than one destination is present that is '{A,B,TT}'.
							    {
							    	
							    	split[1]=split[1].substring(split[1].indexOf('{')+1,split[1].indexOf('}'));  //// split[1]=A,B,TT
							    	
							    	//Destination=new String[split[1].split(",").length];
							    	//Destination=split[1].split(",");    //it contain A , B , TT
							    	
							    	Destination=split[1];
							    	ConstraintList=ReadLetBracket(br);
							    	
							    	//// addition of # in constraint list
							    	ConstraintList=Addition_Of_Hash_In_ConstraintsList(ConstraintList);
							    	
							    	
							    	
							    	CaseNo=3;
							    }//else
						  
						   
					   }//if
					   
					   /*******************Case 1*******************/
					   else
					   {
						   String[] split=Source.split(" ");		   
						   Source=split[1];   //assign value to T i-e (let T:)
						   
						   ConstraintList=ReadLetBracket(br);
						   CaseNo=1;
					   }//else
					     
			      break;
			   }//if
			   
		     }//while
			
			MappingAttribute[0]=Source;
			MappingAttribute[1]=ConstraintList;
			MappingAttribute[2]=Destination;
			MappingAttribute[3]=Integer.toString(CaseNo);
			//System.out.println(ConstraintList);
		}//try
		
		catch(Exception e)
		{
			//System.out.println(e);
		}//catch
		
		
		return MappingAttribute;
	
			
	}
	
	
	//------------------------------------------------------------------------------------//
	 String ProcessLetExpression(String line)
	{
		int lastIndex=line.length()-1;
		char lastCharacter=line.charAt(lastIndex);
		if(lastCharacter=='{')
		{
			  ConstraintList_Counter=1;
		}
		else
		{
			  ConstraintList_Counter=2;
		}
		
		line=line.substring(0,line.indexOf(':'));
		return line;
	}
	 
		//---------------------------------------------------------------------------------//
	 String ReadLetBracket(BufferedReader br)
	{
		 String ConstraintList="";	 
		try
		{
	        String line;
		    String newLine="";     //////// This will also work for "let T:" expression
			while((line=br.readLine())!=null)
		    {
			    newLine=newLine+line.trim();
		    }
			      
		
			if(ConstraintList_Counter==1)
		    {
			      ConstraintList=newLine.substring(0, newLine.length()-2);   //save the body of let expression
			}//if
			   
			else
			{
			       ConstraintList=newLine.substring(newLine.indexOf('{')+1, newLine.length()-2);
			}//else
				
			
		}//try
		catch(Exception e)
		{
			System.out.println(e);
		}//catch
		return ConstraintList;
	}
	 
	 
//----------------------------------------------------------------------------------------------//
String Addition_Of_Hash_In_ConstraintsList(String ConstraintList)
{
	String result="";
	ConstraintList=ConstraintList+",";
	
	for (int i = 0; i < ConstraintList.length(); i++) 
	{
		if(i!=ConstraintList.length()-1)
		{
	
			if(ConstraintList.charAt(i)=='}'  &&  ConstraintList.charAt(i+1)==',')
			{
				
				result=result+ConstraintList.charAt(i)+ConstraintList.charAt(i+1)+"#";
				i++;
			
				
			}
			
			else
			{
				result=result+ConstraintList.charAt(i);
			}
			
		}
		
		
		else
		{
			
			result=result+ConstraintList.charAt(i);
			
		}
	}

	return result;

}

//----------------------------------------------------------------------------------------------//
	 
	
}
