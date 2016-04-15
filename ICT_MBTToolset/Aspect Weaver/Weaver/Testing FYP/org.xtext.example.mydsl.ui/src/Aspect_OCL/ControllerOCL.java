package Aspect_OCL;

public class ControllerOCL {
	
	WeavingTool weaverObj=new WeavingTool();
	
	public void Read_Aspect(String Aspect_fileName)
	{
		weaverObj.Read_Aspect(Aspect_fileName);

		
		
		
	}
		
	//--------------------------------------------------------------------------------------------------//
	
	
	public boolean Read_Mapping(String mapping_folder)
	{

		
		boolean mappingPresent=weaverObj.Read_Mapping(mapping_folder);
		
		return mappingPresent;
		
	}

	//--------------------------------------------------------------------------------------------------//
	
	public void merge_OCL_Constraints(String constraintfile,String outputfile)
	{

		weaverObj.merge_OCL_Constraints(constraintfile,outputfile);
			
	}
	
}
