package Driver;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class XmlReader {
	public void readXml(String fileName)
	{
		 SAXBuilder saxBuilder = new SAXBuilder();
		    
		    // obtain file object 
		    File file = new File(fileName);

			try {
				// converted file to document object
				Document document = saxBuilder.build(file);
				
				// get root node from xml
				Element rootNode = document.getRootElement();
				
				// got all xml elements into a list
			    List<Element> studentList = rootNode.getChildren("attribute");
			    
			    // simple iteration to see the result on console
			    for(int i=0;i<=studentList.size()-1;i++){
			    	Element element = studentList.get(i);
			    	System.out.println(element.getAttributeValue("attributename"));
			    	
/*			    	System.out.println("First Name : "+element.getChildText("firstname"));
			    	System.out.println("Last Name : "+element.getChildText("lastname"));
			    	System.out.println("Email : "+element.getChildText("email"));
			    	System.out.println("Phone : "+element.getChildText("phone"));
	*/		    	}
				}	
			    catch(Exception e)
			    {
			    	e.printStackTrace();
			    	
			    }

	}

}
