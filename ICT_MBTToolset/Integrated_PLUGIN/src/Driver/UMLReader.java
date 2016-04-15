package Driver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML212UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI212UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil.Ecore2UMLConverter;

import mbttoolset.wizard.SecondPageTT;


public class UMLReader {

	protected static final ResourceSet RESOURCE_SET = new ResourceSetImpl();

	protected static void registerResourceFactories() {
		Map<String, Object> extensionFactoryMap = Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap();
		extensionFactoryMap.put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		extensionFactoryMap.put(Ecore2XMLResource.FILE_EXTENSION,
				Ecore2XMLResource.Factory.INSTANCE);
		extensionFactoryMap.put(UML22UMLResource.FILE_EXTENSION,
				UML22UMLResource.Factory.INSTANCE);
		extensionFactoryMap.put(UMLResource.FILE_EXTENSION,
				UML22UMLResource.Factory.INSTANCE);
		extensionFactoryMap.put(UMLResource.FILE_EXTENSION,
				UML22UMLResource.Factory.INSTANCE);
		extensionFactoryMap.put(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI,
				UML22UMLResource.Factory.INSTANCE);
	}

	protected static void registerPackages(ResourceSet resourceSet) {
		Map<String, Object> packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		packageRegistry.put(Ecore2XMLPackage.eNS_URI,
				Ecore2XMLPackage.eINSTANCE);
		packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(UML212UMLResource.UML_METAMODEL_NS_URI,
				UMLPackage.eINSTANCE);
		packageRegistry.put("http://www.eclipse.org/uml2/2.0.0/UML",
				UMLPackage.eINSTANCE);
		//		packageRegistry.put("http://www.eclipse.org/uml2/5.0.0/UML",
		//				UMLPackage.eINSTANCE);
	}
	public static String path="";
	public static String selectedProject;
	public Model loadModel(String uri) throws Exception{
		URI model = URI.createURI(uri);
		//		String transDir = "EMF_Lib/";		

		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		Map<String,Object> packageRegistry = RESOURCE_SET.getPackageRegistry();
		packageRegistry.put("http://www.eclipse.org/uml2/5.0.0/UML",UMLPackage.eINSTANCE);
		
		//		registerPackages(RESOURCE_SET);
		//		registerResourceFactories();
		//		URIConverter.URI_MAP.put(
		//				URI.createURI("platform:/plugin/org.eclipse.uml2.uml/"),
		//				URI.createURI("jar:file:" + transDir
		//						+ "org.eclipse.uml2.uml_3.1.2.v201010261927.jar!/"));

		Resource resource = null;
		Model _model = null;
		//		try {
		resource = RESOURCE_SET.getResource(model, true);
		//		} catch (Exception e) {
		//			System.out.println(e.getMessage());
		//		}
		_model = (Model) EcoreUtil.getObjectByType(
				resource.getContents(), UMLPackage.Literals.MODEL);
		if (_model == null) {
			makeModelCompatiable();
			_model = loadModelAgain(uri);
			//			Object _obj = resource.getContents().get(0);
			//			Package _Package = (Package) _obj;
			//			_model = (Model) _Package;
		}
		return _model;
	}

	public Model loadModelAgain(String uri) throws Exception{
		URI model = URI.createURI(uri);

		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		Resource resource = null;
		Model _model = null;
		resource = RESOURCE_SET.getResource(model, true);
		_model = (Model) EcoreUtil.getObjectByType(
				resource.getContents(), UMLPackage.Literals.MODEL);
		return _model;
	}

	public Profile loadProfile(String uri) {
		URI model = URI.createURI(uri);
		//		String transDir = "Addons/";
		registerPackages(RESOURCE_SET);
		registerResourceFactories();
		URIConverter.URI_MAP.put(
				URI.createURI("platform:/plugin/org.eclipse.uml2.uml/"),
				URI.createURI("jar:file:" + "/Users/Fitash/Documents/workspace/Plugin/Integrated_PLUGIN/Addons/"
						+ "org.eclipse.uml2.uml_3.1.2.v201010261927.jar!/"));

		Resource resource = null;
		try {
			resource = RESOURCE_SET.getResource(model, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Profile _profile = (Profile) EcoreUtil.getObjectByType(
				resource.getContents(), UMLPackage.Literals.PROFILE);
		return _profile;
	}
	/*
	 * This function reads object diagram line by line and searches for model and appliedProfile tag.
	 * It make changes to tags and builds string of file, and finally rewrite the new 
	 * text in the file. 
	 * */
	private void makeModelCompatiable() throws Exception{		
		StringBuilder fileContent = new StringBuilder();		
		FileReader fileReader = new FileReader(path);
		BufferedReader reader = new BufferedReader(fileReader);			
		String line = reader.readLine();
		boolean found = false,dontBreak = false;
		while(line != null){	
			if(line.contains("<xmi:XMI") || line.contains("</xmi:XMI>") || line.contains("<ActionLanguage:TextualRepresentation")){
				fileContent.append("");
				found = true;
				dontBreak = true;
			}
			/*
			 * Find model tag and change version
			 * */
			else if(line.contains("<uml:Model")){
				String str="";
				String []parts = line.split(" ");
				String newPart = " xmi:version=\"2.1\""+" xmlns:xmi=\"http://schema.omg.org/spec/XMI/2.1\""
						+" xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\""+" xmlns:uml=\"http://www.eclipse.org/uml2/3.0.0/UML\"";
				for(String part:parts){
					if(part.contains("xmi:id"))
						str += newPart +" "+ part;
				    else if(!part.contains("xmlns:xmi") || !part.contains("xmlns:ecore") || !part.contains("xmlns:uml") || !part.contains("xmi:version"))
				    	continue;
					else
						str += " "+part;
				}
				found = true;
				fileContent.append(str);
			}
			/*
			 * Change applied profile standard
			 * */
			else if(line.contains("<appliedProfile")){
				fileContent.append("<appliedProfile href=\"pathmap://UML_PROFILES/Standard.profile.uml#_0\"/>");
				found = true;
			}	
			/*
			 * Change applied profile standard from 'StandardL3' to 'Standard'
			 * */
			else if(line.contains("<references")){
				fileContent.append("<references xmi:type=\"ecore:EPackage\"href=\"pathmap://UML_PROFILES/Standard.profile.uml#_yzU58YinEdqtvbnfB2L_5w\"/>");
				found = true;
			}	
			else if(line.contains("</uml:Model>")){
				fileContent.append("</uml:Model>");
				found = true;
				dontBreak = true;
			}
			/*
			 * If model or appliedProfile tag is not found then append line as it is.
			 * */
			if(!found)
				fileContent.append(line);
			else
				found = false;
			line = reader.readLine();
			if(line != null && !dontBreak)
				fileContent.append(System.getProperty("line.separator"));
			dontBreak = false;
		}
		//close reader objects
		reader.close();
		fileReader.close();
		//rewrite object diagram
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		writer.write(fileContent.toString());
		writer.close();

		Thread.sleep(100);
		//refresh directory
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] project=myWorkspaceRoot.getProjects();

		for(IProject p : project)
		{
			if(p.getName().equals(selectedProject)/*p.isOpen()*/)
			{
				IFolder inputFiles = p.getFolder("InputFiles");
				inputFiles.refreshLocal(IResource.DEPTH_INFINITE, null);
			}
		}
		Thread.sleep(2000);
	}
}
