package Aspect_OCL;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class WeavingTool {

	Aspect aspect;
	Mapping mapping;
	OCL_Weaver OCLweaverObj;
	String[] MappingAttribute;
	AspectHandler aspectHandlerObj=new AspectHandler();
	MappingHandler mappinghandlerObj=new MappingHandler();
	
	public void Read_Aspect(String Aspect_fileName)
	{
		
		String[] AspectAttributes=aspectHandlerObj.getAspectAttribute(Aspect_fileName);
		
		aspect=new Aspect();
		aspect.setAspectAttribute(AspectAttributes);
		
	}
	
	//--------------------------------------------------------------------------------------------------//	
	public boolean Read_Mapping(String mapping_folder)
	{
		
		try{
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 String Mapping_FileName="";
			Mapping_FileName=aspect.getMapping();
		
			
			Mapping_FileName=mapping_folder+"\\"+Mapping_FileName.trim()+".mydsl";
			
			
			MappingAttribute=mappinghandlerObj.getMappingAttribute(Mapping_FileName);
			
			
			
			
			 if(MappingAttribute==null) {   // if mapping file is not present 
			    	
			    
			    	String info=Mapping_FileName +" file is not present in mapping folder";
			   	    JOptionPane.showMessageDialog(null,info,"Dialog",JOptionPane.ERROR_MESSAGE);
			    	return false;       
			    }
			    
			    else{
			    	
				    mapping=new Mapping();
				    mapping.setMappingAttribute(MappingAttribute);
			    	return true;
			    }	    
		   
		 
		}
		
		catch(Exception e){
			
		}
		
		return true;
		
	}
	
	
	//--------------------------------------------------------------------------------------------------//
	public void merge_OCL_Constraints(String constraintfile,String outputfile)
	{
		try{
		OCLweaverObj=new OCL_Weaver();
		OCLweaverObj.Weave_OCL_Constraints(aspect, mapping,  constraintfile, outputfile,Integer.parseInt(MappingAttribute[3]));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	//--------------------------------------------------------------------------------------------------//
}
