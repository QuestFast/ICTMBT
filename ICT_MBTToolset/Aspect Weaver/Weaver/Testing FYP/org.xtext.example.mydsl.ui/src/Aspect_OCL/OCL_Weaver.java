package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;



public class OCL_Weaver {

	//-------------------------------------------------------------------------------------------------------------------//
	public String  copyConstraints(String constraintfile){
		
		try{
			
			
			
			File file=new File(constraintfile);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
	
			
			File fileWriter=new File("Temporary.txt");
			FileWriter fw=new FileWriter(fileWriter);
			PrintWriter pw=new PrintWriter(fw);
			
			String line="";
			
			while((line=br.readLine())!=null)
			{
				pw.println(line);
			}
			
			br.close();
			pw.close();
		}
		catch(Exception e){
		}
		
		return "Temporary.txt";
	}
	
	
	public void Weave_OCL_Constraints(Aspect aspect,Mapping mapping,String constraintfile,String outputfile,int CaseNo) throws IOException
	{
		String fileName=copyConstraints(constraintfile);
		
	
		
	    if(CaseNo==1)
		{
		 	WritingToFileCaseOne( aspect, mapping,fileName, outputfile);
			
			
		}//case 1
	    
	    
	    else if (CaseNo==2)
	    {
	    	
	    	WritingToFileCaseTwo(aspect, mapping,fileName, outputfile);
	    }
	    
	    
	    else
	    {
	    	
	    	WritingToFileCaseThree(aspect, mapping,fileName, outputfile);
	    }
	    
	    
		
		
	}//
	
	
//----------------------------------------------------------------------------------------------//
	void WritingToFileCaseOne(Aspect aspect,Mapping mapping,String FileName,String outputfile)
	{
		try
		{

			String Source=mapping.getSource();
			String split[]=mapping.getConstraintList().split(",");
			
			String context=aspect.getContext();
			String advice=aspect.getAdvice();
			String intro=aspect.getIntro();
			
			int ifCounter=aspect.getifCounter();
			int thenCounter=aspect.getthenCounter();
			String referredVariable=aspect.getreferredVariable();
		
			
			
		    for (int i = 0; i < split.length; i++)
			{
				String ActualContext=replaceContextName(context,Source,split[i]);
				
				File file=new File(FileName);
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				
				File fileWriter=new File(outputfile);
				FileWriter fw=new FileWriter(fileWriter);
				PrintWriter pw=new PrintWriter(fw);
				
				String line="";
				
				while((line=br.readLine())!=null)
				{
					
					if(line.trim().contains(ActualContext.trim()))
					{
						
						pw.println(line);
						
						
						if(!advice.equals(""))
						{
							Add_OCL_Constraints_In_CaseOne(br,pw,Source, split[i].trim(),advice,ifCounter,thenCounter,referredVariable);
							

							
						}
						
						
						if(!intro.equals(""))
						{
							
							Add_OCL_Constraints_In_CaseOne(br,pw,Source, split[i].trim(),intro,ifCounter,thenCounter,referredVariable);
							
						}
										
						
						
					}//if  it contain context
					
					
					else
					{	 
						pw.println(line);
					}//else
					
					
					
				}//while
				
				br.close();
				pw.close();
				Shift_From_One_File_To_Another(FileName,outputfile);
				
				
			}//for  
		
		}//try
		
		catch(Exception e)
		{
			
			System.out.println(e);
		}//catch
		
		
	}
	
	
//--------------------------------------------------------------------------------------------------//
	
void Add_OCL_Constraints_In_CaseOne(BufferedReader br, PrintWriter pw,String Source, String replaceWord,String intro_Advice,int ifCounter,int thenCounter,String referredVariable) throws IOException
{
	if(ifCounter!=0)
	{
		
		append_Ifcase_CaseOne(br,pw,intro_Advice,Source,replaceWord,referredVariable);
		
	}//if
	
	else if(thenCounter!=0)
	{
		
		append_IfThen_CaseOne(br,pw,intro_Advice,Source,replaceWord);    //////////////////// implement if-then case here 
		
		
	}//if
	
	else
	{
	
		String addLine=replace_Intro_Advice(Source, replaceWord,intro_Advice);     // intro_Advice is OCL expression
		pw.println(addLine);
	}
	

}


// -------------------------------------------------------------------------------------///

public void append_IfThen_CaseOne(BufferedReader br,PrintWriter pw,String intro_Advice,String Source,String replaceWord) throws IOException
{
	String appendLine="";
	String line;
	while((line=br.readLine())!=null)
	{
		
		if(line.contains("then"))
		{
			

		
			  String [] token = line.split("\\s+");
			  
			  
			
				for (int i = 0; i < token.length; i++) 
				{
				
					if(token[i].equals("then"))
					{
						
						String addLine=replace_Intro_Advice(Source, replaceWord,intro_Advice);
						appendLine=appendLine+" "+token[i]+"\n"+addLine;

					} 
					
					else
					{
						appendLine=appendLine+" "+token[i];
						
					} 
					
				}//for
				
				pw.println(appendLine);
			
			
			break;	
			
		}//if
		
		
		else
		{
			pw.println(line);
			
		}//else
		
		
	}//While

}

//---------------------------------------------------------------------------------------------------------------//

public void append_Ifcase_CaseOne(BufferedReader br,PrintWriter pw, String  intro_Advice, String  Source,String replaceWord,String referredVariable) throws IOException
{
	String line;
	while((line=br.readLine())!=null)
	{ 
		String ifCondition="";
	    
		if(line.contains("context"))
	    {	
	    	pw.println(line);
	    	break;
	    	
	    }//if
		
		
	    else if(line.contains("if"))
		{
	    	
				if(line.contains(")"))
				{
					ifCondition=ifCondition+line;
					
					if(ifCondition.contains(referredVariable))
					{
						
						
				    	append_In_if_Condition_CaseOne( ifCondition,pw, intro_Advice, Source, replaceWord);
					}
					
			   	}//if
			
			
			
				else
				{
					ifCondition=ifCondition+line;
					while((line=br.readLine())!=null)
					{
							if(line.contains(")"))
							{
								ifCondition=ifCondition+line;
								
								if(ifCondition.contains(referredVariable))
								{
									append_In_if_Condition_CaseOne(ifCondition,pw, intro_Advice, Source, replaceWord);
								}
							
								break;
							}
							
							else
							{
								ifCondition=ifCondition+line;
							}
						
				  }//while
					
			  }//else
		
		
		
			
		}//else if
		
		
		else
		{  
			pw.println(line);
			
		}//else
		
		
	}//while
	
}

//--------------------------------------------------------------------------------------------------//
public void append_In_if_Condition_CaseOne(String ifCondition,PrintWriter pw, String intro_Advice, String Source,String  replaceWord)
{
	
	StringBuilder builder = new StringBuilder(ifCondition);
	
	for (int i = 0; i < ifCondition.length(); i++) {
		if(ifCondition.charAt(i)=='(')
		{
			
			String addLine=replace_Intro_Advice(Source, replaceWord,intro_Advice);
			builder.insert(i+1,addLine.trim()+" " );
			pw.println(builder);
			
		}
	}

}

//-----------------------------------------------------------------------------------------------------//

void WritingToFileCaseTwo(Aspect aspect,Mapping mapping,String FileName,String outputfile) throws IOException
{
	
	
	
	String Source=mapping.getSource();
	String destination=mapping.getDestination();
	String split[]=mapping.getConstraintList().split(",");
	
	String context=aspect.getContext();
	String advice=aspect.getAdvice();
	String intro=aspect.getIntro();
	
	int ifCounter=aspect.getifCounter();
	int thenCounter=aspect.getthenCounter();
	String referredVariable=aspect.getreferredVariable();

	
	for (int i = 0; i < split.length; i++)
	{
		
		String split1[]=split[i].split("->");
		String ActualContext=replaceContextName(context,Source,split1[0].trim());
		

		
		File file=new File(FileName);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		File fileWriter=new File(outputfile);
		FileWriter fw=new FileWriter(fileWriter);
		PrintWriter pw=new PrintWriter(fw);
		
		String line="";
		
		
		
		
		while((line=br.readLine())!=null)
		{
			
			if(line.trim().contains(ActualContext)) 
			{
				
				
				pw.println(line);
				
				if(!advice.equals(""))
				{
					Add_OCL_Constraints_In_CaseTwo(br,pw,Source,destination, split1,advice,ifCounter,thenCounter,referredVariable);
					

					
				}
				
				
				if(!intro.equals(""))
				{
					
					Add_OCL_Constraints_In_CaseTwo(br,pw,Source,destination, split1,intro,ifCounter,thenCounter,referredVariable);
					
				}
					
		
				

				
			} //if  context line matches
			
			
			else
			{
				pw.println(line);
			
			}//else
			
			
			
		}//while
		
		br.close();
		pw.close();
		Shift_From_One_File_To_Another(FileName,outputfile);
		
		
		
	} //for main
	
	
	



}


//--------------------------------------------------------------------------------------------------//
void Add_OCL_Constraints_In_CaseTwo(BufferedReader br, PrintWriter pw,String Source,String destination, String []split1,String intro_Advice,int ifCounter,int thenCounter,String referredVariable)
{

	if(ifCounter!=0)
	{
		append_Ifcase_CaseTwo(br,pw,Source,destination,intro_Advice,split1,referredVariable);

		
	}//if
	
	else if(thenCounter!=0)
	{
		append_IfThen_CaseTwo(br,pw,Source,destination,intro_Advice,split1); 		
		
	}//if
	
	else
	{
	
		String addLine=replace_Intro_Advice(Source,split1[0].trim(),intro_Advice);
		 addLine=replace_Intro_Advice(destination,split1[1].trim(),addLine);
		
		pw.println(addLine);
	}
	
	

}

//----------------------------------------------------------------------------------------------------//
void append_IfThen_CaseTwo(BufferedReader br,PrintWriter pw,String Source,String destination,String intro_Advice,String[] split1)
{

	String appendLine="";
	String line;
	
	try
	{
	
		while((line=br.readLine())!=null)
		{
			
			if(line.contains("then"))
			{
	            
				String [] token = line.split("\\s+");
				
				for (int i = 0; i < token.length; i++) 
				{
				
					if(token[i].equals("then"))
					{
						
						String addLine=replace_Intro_Advice(Source,split1[0].trim(),intro_Advice);
					    addLine=replace_Intro_Advice(destination,split1[1].trim(),addLine); 
						appendLine=appendLine+" "+token[i]+"\n "+addLine;
						
					} 
					
					else
					{
						appendLine=appendLine+" "+token[i];
					}
					
				}
				
				pw.println(appendLine);
				
				break;
				
				
			}//if
			
			
			else
			{
				pw.println(line);
			}
			
			
		}//While
	
	}//try
	
	catch(Exception e)
	{
		System.out.println(e);
	}

	

}

//--------------------------------------------------------------------------------------------------//
void append_Ifcase_CaseTwo(BufferedReader br,PrintWriter pw,String Source,String destination,String intro_Advice,String [] split1,String referredVariable)
{

	try
	{
		String line;
		while((line=br.readLine())!=null)
		{ 
			String ifCondition="";
			    
				if(line.contains("context"))
			    {	
			    	pw.println(line);
			    	break;
			    	
			    }//if
				
				
			    else if(line.contains("if"))
				{
			    	
						if(line.contains(")"))
						{
							ifCondition=ifCondition+line;
							
							
							referredVariable=referredVariable.replace(destination, split1[1].trim());
							if(ifCondition.contains(referredVariable))
							{
								 Insert_In_if_Condition_CaseTwo(ifCondition, pw, Source, destination, intro_Advice, split1);
							}
							
					   	}//if
					
					
					
						else
						{
							ifCondition=ifCondition+line;
							while((line=br.readLine())!=null)
							{
									if(line.contains(")"))
									{
										
										ifCondition=ifCondition+line;
										referredVariable=referredVariable.replace(destination, split1[1].trim());
										if(ifCondition.contains(referredVariable))
										{
											Insert_In_if_Condition_CaseTwo( ifCondition, pw, Source, destination, intro_Advice, split1);
										}
									
										break;
									}
									
									else
									{
										ifCondition=ifCondition+line;
									}
								
						  }//while
							
					  }//else
				
				
				
					
				}//else if
				
				
				else
				{  
					pw.println(line);
					
				}//else
				
			
		}//while
		
	}//try
	
	catch(Exception e)
	{
		System.out.println(e);
		
	}


}


//--------------------------------------------------------------------------------------------------//

public void Insert_In_if_Condition_CaseTwo(String ifCondition,PrintWriter pw,String source,String destination,String intro_Advice,String split1[])
{
	

     StringBuilder builder = new StringBuilder(ifCondition);
	
	for (int i = 0; i < ifCondition.length(); i++) {
		if(ifCondition.charAt(i)=='(')
		{
			
			String addLine=replace_Intro_Advice(source, split1[0].trim(),intro_Advice);
			addLine=replace_Intro_Advice(destination, split1[1].trim(),addLine);
			builder.insert(i+1,addLine.trim()+" ");
			
			pw.println(builder);
			
		}
	}
	
	

}


//--------------------------------------------------------------------------------------------------//
public void WritingToFileCaseThree(Aspect aspect,Mapping mapping,String FileName,String outputfile)
{
	
	try
	{
	
		String Source=mapping.getSource();
		String destination=mapping.getDestination();
		String ConstraintsList=mapping.getConstraintList();
		
		String context=aspect.getContext();
		String advice=aspect.getAdvice();
		String intro=aspect.getIntro();
		
		int thenCounter=aspect.getthenCounter();
		
		
		
		
		String split[]=	ConstraintsList.split("#");
	
		for (int i = 0; i < split.length; i++)
		{   
			
			String split1[]=split[i].split("->"); 
			String ActualContext=replaceContextName(context,Source,split1[0].trim());
			
			String var=split1[1].substring(1, split1[1].length()-2);
			String split2[]=var.trim().split(",");
			
			
			File file=new File(FileName);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			File fileWriter=new File(outputfile);
			FileWriter fw=new FileWriter(fileWriter);
			PrintWriter pw=new PrintWriter(fw);

			String line;
			while((line=br.readLine())!=null)
			{
				if(line.trim().contains(ActualContext.trim()))
				{
					
					
					pw.println(line);
					
					
					
					if(!advice.equals(""))
					{
				
						Add_OCL_Constraints_In_CaseThree(br,pw,Source,split1,destination,split2,thenCounter,advice);
					}
					
					
					if(!intro.equals(""))
					{
						
						Add_OCL_Constraints_In_CaseThree(br,pw,Source,split1,destination,split2,thenCounter,intro);
					}
						
					
					
	
				}//if  context is present
				
				
				else
				{
					
					pw.println(line);
				}//else
				
				
				
			}//while
			
			
			
			br.close();
			pw.close();
			Shift_From_One_File_To_Another(FileName,outputfile);
			
			
		}//for 
	
	
	}//try
	
	catch(Exception e)
	{
		System.out.println(e);
		
	}
}

//--------------------------------------------------------------------------------------------------//
void Add_OCL_Constraints_In_CaseThree(BufferedReader br,PrintWriter pw,String Source,String[] split1, String destination,String []split2,int thenCounter,String intro_advice)
{
	String[] DestinationAlphabets=destination.split(",");
	

	    
	    String addLine=replace_Intro_Advice(Source,split1[0].trim(),intro_advice);
	    
		
		for (int j = 0; j < DestinationAlphabets.length; j++) 
		{
			addLine=replace_Intro_Advice(DestinationAlphabets[j].trim(),split2[j],addLine);
		}
		
		
		
		pw.println(addLine);
	
	
	
}

//-----------------------------------------------------------------------------------------------------------------//	
String replace_Intro_Advice(String Source, String Original ,String advice_Intro )
{
	String patternStr = "(?<!\\w)"+ Source +"(?!\\w)";
	String addLine=advice_Intro.replaceAll(patternStr, Original);
	return addLine;

}
	
	
	
//-------------------------------------------------------------------------------------------------//	
void Shift_From_One_File_To_Another(String FileName,String outputfile) throws IOException
{
	File file=new File(outputfile);
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	
	
	File fileWriter=new File(FileName);
	FileWriter fw=new FileWriter(fileWriter);
	PrintWriter pw=new PrintWriter(fw);
	
	
	String line;
	while((line=br.readLine())!=null)
	{
		pw.println(line);	
	}
	
	br.close();
	pw.close();
}


//-------------------------------------------------------------------------------------------------//
	
	 String replaceContextName(String context,String Source,String temp)
	{
		String result="";
		if(context.contains("::"))
		{
			int index=context.indexOf(":");
			
			String var=context.substring(0, index);
			
			
			String [] split=var.split(" ");
			split[1]=split[1].replace(Source, temp);
			result=split[0]+" "+split[1];
			result=result+context.substring(index, context.length());	
			return result;
		}
		
		else
		{
			String [] split=context.split(" ");
			result=split[0].trim()+" ";
			result=result+split[1].trim().replace(Source.trim(), temp.trim());
			return result;		 
		}
		
		
	}

//----------------------------------------------------------------------------------------------------------//
	
}
