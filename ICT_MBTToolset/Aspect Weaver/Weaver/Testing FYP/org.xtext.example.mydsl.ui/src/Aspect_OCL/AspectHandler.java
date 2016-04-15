package Aspect_OCL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AspectHandler {
	
	String [] aspectAttributes={"","","","","","0","0",""};
	
	public String[] getAspectAttribute(String Aspect_fileName)
	{
		
		
		/*String mapping; 0
		String pointcut;  1
		String context;   2
		String intro="";  3
		String advice="";  4
		int thenCounter=0; 5
		int ifCounter=0;  6
		String referredVariable;  7 */ 
		
		
		try
		{
			File file=new File(Aspect_fileName);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null)
			{
				
				if(line.contains("import_mapping"))
				{
					ReadMapping(line);
					
				}//import_mapping
				
    
				
				if(line.contains("pointcut"))
				{
					Readpointcut(line);
					
				}//pointcut
				
     		
				
				if(line.contains("context"))
				{
					Readcontext(line);
					
				}//context
				
				
				if(line.contains("post") || line.contains("inv") ||  line.contains("pre"))
				{
					if(line.contains("->"))
					{		
						Query(br,line);
						
					}// ->
					
				}//post
				
				
				if(line.contains("intro"))
				{
					Readintro(br,line);
					
					
				}//intro
							
				
				if(line.contains("advice"))
				{
					Readadvice(br,line);
						
				}// advice

			
			
			}//while
		
		}//try
		
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}//catch
				
		
		return aspectAttributes;
		
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------//
	
	
	void ReadMapping(String line)
	{
		
		String split[]=line.trim().split(" ");
		aspectAttributes[0]=split[1].trim();
		//mapping=split[1];	
		
	}
	
	//--------------------------------------------------------------------------------------------------------------------//
		void Readpointcut(String line)
		{
			String split[]=line.trim().split(" ");
			aspectAttributes[1]=split[1].trim();
			//pointcut=split[1];
			
		}
		
	//--------------------------------------------------------------------------------------------------------------------//
		void Readcontext(String line)
		{
			aspectAttributes[2]=line.trim();
			//context=line.trim();
			
		}

	//--------------------------------------------------------------------------------------------------------------------//
		void Readintro(BufferedReader br,String line)
		{
			try
			{
				String temp="";
				String temp1="";
				while((line=br.readLine())!=null)
				{
					if(line.contains("post") || line.contains("pre") || line.contains("inv"))
					{
							aspectAttributes[3]=line.trim().replace(aspectAttributes[1], "").trim();
							aspectAttributes[3]=aspectAttributes[3]+":"+"\n";
							 
							 while((line=br.readLine())!=null)
								{
									if(line.contains("}"))
									{
										aspectAttributes[3]=aspectAttributes[3]+line.trim();
										aspectAttributes[3]=aspectAttributes[3].replace("}", "").trim();
										aspectAttributes[3]=aspectAttributes[3].replaceAll("\"", "").trim();
										break;
									}
									
									aspectAttributes[3]=aspectAttributes[3]+line.trim();
								}//while
		
					 }//if post pre inv
									
				}//while
				
			}//try
			
			catch(Exception e)
			{
			System.out.println(e);
			}//catch
			
	}
		
		//--------------------------------------------------------------------------------------------------------------------//
		void Readadvice(BufferedReader br,String line)
		{
		 try
			{
				
				 String[] split=line.trim().split(" ");
				 aspectAttributes[2]=aspectAttributes[2]+" "+split[1].trim();
				 String temp;
				 
				 while((line=br.readLine())!=null)
					{
						 
					 	if(line.contains("and") || line.contains("or") || line.contains("xor"))
					 	{
					 		temp=line.trim().replace(aspectAttributes[1], "").trim();
					 		
					 		 while((line=br.readLine())!=null)
							 {
									if(line.contains("}"))
									{
										aspectAttributes[4]=aspectAttributes[4]+line.trim();
										aspectAttributes[4]=aspectAttributes[4].replace("}", "").trim();
										aspectAttributes[4]=aspectAttributes[4].replaceAll("\"", "").trim();
										break;
									}
									
									
									aspectAttributes[4]=aspectAttributes[4]+line.trim();
										
							 }//while
					 		
					 		aspectAttributes[4]=aspectAttributes[4]+" "+temp;
					 		
					 	}// and or xor
					 						 			
					 	
					}//while
				 
				
				// System.out.println(aspectAttributes[4]);
			}//try
			
			catch(Exception e)
			{
				System.out.println(e);
			}//catch
			
	}
		
		
		//--------------------------------------------------------------------------------------------------------------------//
		void Query(BufferedReader br,String temp)
		{
			
			try
			{
				
				String line;
				
				while((line=br.readLine())!=null)
				{
					if(line.contains("advice"))
					{ 
						Readadvice(br, line);
					    break;
					    
					}//if
					
					
					
					temp=temp+line.trim();
					
					
				}//while
				
				
				if(temp.contains("(thenExp)"))
				{
					int thenCounter=0;
					thenCounter++;
					aspectAttributes[5]=Integer.toString(thenCounter);
					//thenCounter++;
				}
				
				if(temp.contains("(ifExp)"))
				{
				   int ifCounter=0;
					ifCounter++;
				    
				    aspectAttributes[6]=Integer.toString(ifCounter);
				    
				    
				   String[] temp1=temp.trim().split("=");
				   
				 aspectAttributes[7]=temp1[1].trim().substring(0,temp1[1].length()-1).trim();
				}//if
				
			}//try
			
			
			catch(Exception e)
			{
				System.out.println(e);
			}

		}//query
		
	//--------------------------------------------------------------------------------------------------------------------//
		
}
