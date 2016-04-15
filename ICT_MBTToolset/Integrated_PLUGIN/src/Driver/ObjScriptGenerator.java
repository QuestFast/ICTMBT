package Driver;

import ict.mbt.oclsolver.util.Logger;
import ict.mbt.oclsolver.util.ResourceManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;


/**
 * A Class which reads the Class Diagram's uml file to generates the its
 * corresponding Class and Object Scripts.
 * 
 * @author Maham Khalid
 * @version 1.0
 */
public class ObjScriptGenerator {
	/**
	 * An instance of ResourceSet Class
	 * 
	 * @see #RESOURCE_SET
	 */
	protected final ResourceSet RESOURCE_SET = new ResourceSetImpl();

	/**
	 * A String to record all classes, associations and interfaces on the script
	 * file
	 * 
	 * @see #FileData0
	 */
	private String FileData0;

	/**
	 * A String to record all instance of classes and associations on the script
	 * file
	 * 
	 * @see #FileData
	 */
	private String FileData;

	/**
	 * A count for differentiating the owned ends with same name for association
	 * of a Class
	 * 
	 * @see #associationEndCount
	 */
	int associationEndCount;

	/**
	 * A boolean for checking whether the source model contains a nested package
	 * or not
	 * 
	 * @see #modelHasPackage
	 */
	boolean modelHasPackage;

	/**
	 * An instance of uml Package
	 * 
	 * @see #pac
	 */
	org.eclipse.uml2.uml.Package pac;

	/**
	 * An instance of uml Model for storing the resultant model
	 * 
	 * @see #resultantModel
	 */
	Model resultantModel;

	/**
	 * Name of the Object Script file to be generated
	 * 
	 * @see #objectFileName
	 */
	String objectFileName;

	/**
	 * Name of the Class Script file to be generated
	 * 
	 * @see #classFileName
	 */
	String classFileName;

	/**
	 * Path and Name of the source Class Diagram's uml file
	 * 
	 * @see #umlFilePath
	 */
	String umlFilePath;

	/**
	 * An Overloaded Constructor to create an instance of ObjScriptGenerator
	 * class and initialize its attributes.
	 * 
	 * @param umlFilPath
	 *            which contains path of the uml file of Class Diagram under
	 *            operation.
	 */
	public ObjScriptGenerator(String umlFilePath) throws Exception {
		FileData = "";
		FileData0 = "";
		associationEndCount = 1;
		objectFileName = "ObjectData.txt";
		classFileName = "ClassData.txt";
		this.umlFilePath = umlFilePath;
	}

	/**
	 * A Method which the generate the scripts for Object and Class Models
	 * according to the given Class Diagram.
	 */
	public void generateScript() throws Exception {

		File out = new File(objectFileName);
		File out1 = new File(classFileName);
		FileWriter fout = new FileWriter(out);
		FileWriter fout1 = new FileWriter(out1);

		readUMLFile();

		fout.write(FileData0 + FileData);
		fout.close();
		fout1.write(FileData0 + FileData);
		fout1.close();

		Logger.getLogger().println("input resource fetched");
	}

	/**
	 * A method to increment the value of associationEndCount
	 */
	public void incrementAssociationEndCount() {
		associationEndCount++;
	}

	/**
	 * A method to get the value of associationEndCount
	 * 
	 * @return associationEndCount
	 */
	public int getAssociationEndCount() {
		return associationEndCount;
	}

	/**
	 * A Method which initiates the processing of Class Diagram's uml file by
	 * getting the Model from uml file and passing it to another fuction.
	 */
	public void readUMLFile() throws Exception {

		File f = new File(umlFilePath);
		String uri = f.toURI().toString();

		Model model = loadModel(uri);
		processModelDetails(model);

	}

	/**
	 * A Method which initialize all the arraylists for storing model components
	 * and invokes functions for reading and writing model details.
	 * 
	 * @param sourceModel
	 *            which is the model of given Class Diagram.
	 */
	public void processModelDetails(Model sourceModel) {
		ArrayList<String> clsNames = new ArrayList<String>();
		ArrayList<Integer> clsCount = new ArrayList<Integer>();
		ArrayList<Class> clist = new ArrayList<Class>();
		ArrayList<Interface> ilist = new ArrayList<Interface>();
		ArrayList<Association> asso = new ArrayList<Association>();

		readModelDetails(sourceModel, clsNames, clsCount, clist, ilist, asso);
		writeModelDetails(sourceModel, clsNames, clsCount, clist, ilist, asso);

	}

	/**
	 * A Method which reads the source model details and process its every
	 * component and fills the ArrayLists.
	 * 
	 * @param sourceModel
	 *            which is the model of given Class Diagram.
	 * @param clsNames
	 *            ArrayList<String> which contains names of classes in the
	 *            source model.
	 * @param clsCount
	 *            ArrayList<Integer> which contains instance counts of Classes
	 *            in source model.
	 * @param clist
	 *            ArrayList<Class> which contains an instance for each Class in
	 *            source model
	 * @param ilist
	 *            ArrayList<Interface> which contains an instance for each
	 *            interface in source model.
	 * @param asso
	 *            ArrayList<Association> which contains an instance for each
	 *            association in source model.
	 */

	public void readModelDetails(Model sourceModel, ArrayList<String> clsNames,
			ArrayList<Integer> clsCount, ArrayList<Class> clist,
			ArrayList<Interface> ilist, ArrayList<Association> asso) {

		modelHasPackage = false;
		resultantModel = createModel("Object Diagram");
		EList<PackageableElement> sourcePackagedElements = sourceModel
				.getPackagedElements();
		pac = UMLFactory.eINSTANCE.createPackage();
		for (PackageableElement sourceElement : sourcePackagedElements) {
			if (sourceElement.eClass() == UMLPackage.Literals.PACKAGE) {
				modelHasPackage = true;
				org.eclipse.uml2.uml.Package pack = (org.eclipse.uml2.uml.Package) sourceElement;
				pac = resultantModel.createNestedPackage(pack.getName()
						+ " : NBP");
				EList<PackageableElement> members = pack.getPackagedElements();
				for (PackageableElement element : members) {
					computeElementType(element, clist, ilist, asso, clsNames,
							clsCount);
				}
			}
			computeElementType(sourceElement, clist, ilist, asso, clsNames,
					clsCount);
		}
		populateLists(clist, ilist, clsNames, clsCount);

	}

	/**
	 * A Method which initiates the Class and Association script writing and
	 * generates a resultant uml model.
	 * 
	 * @param sourceModel
	 *            which is the model of given Class Diagram.
	 * @param clsNames
	 *            ArrayList<String> which contains names of classes in the
	 *            source model.
	 * @param clsCount
	 *            ArrayList<Integer> which contains instance counts of Classes
	 *            in source model.
	 * @param clist
	 *            ArrayList<Class> which contains an instance for each Class in
	 *            source model
	 * @param ilist
	 *            ArrayList<Interface> which contains an instance for each
	 *            interface in source model.
	 * @param asso
	 *            ArrayList<Association> which contains an instance for each
	 *            association in source model.
	 */
	public void writeModelDetails(Model sourceModel,
			ArrayList<String> clsNames, ArrayList<Integer> clsCount,
			ArrayList<Class> clist, ArrayList<Interface> ilist,
			ArrayList<Association> asso) {

		writeClassScript(clist, clsCount, clsNames);
		writeAssociationScript(asso);

		save(resultantModel,
				URI.createURI("ClassModel").appendSegment("ObjectDiagram")
						.appendFileExtension(UMLResource.FILE_EXTENSION));

		if (modelHasPackage == true) {
			PrintPackage(pac);
		} else {
			PrintPackage(resultantModel);
		}

	}

	/**
	 * A Method which generates and records the instances of Classes in the
	 * source model and their attributes.
	 * 
	 * @param classList
	 *            ArrayList<Class> which contains an instance for each Class in
	 *            source model.
	 * @param instanceCount
	 *            ArrayList<Integer> which contains instance counts of Classes
	 *            in source model.
	 * @param classNames
	 *            ArrayList<String> which contains names of classes in the
	 *            source model.
	 */
	public void writeClassScript(ArrayList<Class> classList,
			ArrayList<Integer> instanceCount, ArrayList<String> classNames) {

		String targetClassName = "";
		String targetAttributeName = "";

		for (int k = 0; k < classList.size(); k++) {
			Class currentClass = classList.get(k);
			String currentClassName = classList.get(k).getName();
			int indexOfCurrentClass = classNames
					.indexOf(currentClass.getName());
			Class targetClass = classList.get(k);

			// traverse for all instances of currentClass (i.e., the source
			// class)
			for (int s = 1; s < instanceCount.get(indexOfCurrentClass) + 1; s++) {

				targetClassName = currentClassName;
				targetClass.setName(currentClass.getName() + ":"
						+ targetClass.getName().substring(0, 1) + s);
				FileData = FileData + "OBJECT#" + targetClassName + "$"
						+ targetClassName.substring(0, 1) + s + "\r";

				EList<Property> currentClassProperty = targetClass
						.getOwnedAttributes();
				for (Property pr : currentClassProperty) {
					targetAttributeName = pr.getName();
					pr.setName(targetAttributeName + ":"
							+ pr.getName().substring(0, 1) + s);
					FileData = FileData + "ATTRIBUTE#" + targetClassName + "$"
							+ targetAttributeName + "$"
							+ targetAttributeName.substring(0, 1) + s + "\r";
					Logger.getLogger().println(" " + pr.getName());
					pr.setName(targetAttributeName);
				}
			}
			if (modelHasPackage == true) {
				targetClass.setPackage(pac);

			} else {
				targetClass.setPackage(resultantModel);

			}
		}
	}

	/**
	 * A Method which generates and records the instances of associations in the
	 * source model.
	 * 
	 * @param associationsList
	 *            ArrayList<Association> which contains an instance for each
	 *            association in source model.
	 */
	public void writeAssociationScript(ArrayList<Association> associationsList) {
		String targetAssociationName = "";
		// traverse all associations in the source model
		for (int k = 0; k < associationsList.size(); k++) {
			Association currentAssociation = associationsList.get(k);

			FileData = FileData + "LINK#";

			EList<Property> currentAssociationMemberEnds = currentAssociation
					.getMemberEnds();
			for (Property end : currentAssociationMemberEnds) {
				FileData = FileData + end.getType().getName() + "$"
						+ end.getName() + "$" + end.getUpper() + "%";
			}
			FileData = FileData + "\r";

			targetAssociationName = associationsList.get(k).getName();
			if (modelHasPackage == true) {
				currentAssociation.setPackage(pac);
			} else {
				currentAssociation.setPackage(resultantModel);
			}
		}
	}

	/**
	 * A method which saves the supplied uml model on a uml file
	 * 
	 * @param package_
	 *            which contains the resultant uml model.
	 * @param uri
	 *            which contains the entire destination path where the file
	 *            would be saved.
	 */
	public void save(org.eclipse.uml2.uml.Package package_, URI uri) {
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.getContents().add(package_);

		try {
			resource.save(null);
			Logger.getLogger().println("Saved .....");
		} catch (IOException ioe) {
			Logger.getLogger().error(ioe);
		}
	}

	/**
	 * A method that computes the type of source model's element and adds it in
	 * the corresponding ArrayList.
	 * 
	 * @param element
	 *            which is the PackageableElement of the source model
	 * @param sourceClassList
	 *            which is used for storing every Class in the source model
	 * @param sourceInterfaceList
	 *            which is used for storing every Interface in the source model
	 * @param sourceAssociationList
	 *            which is used for storing every Association in the source
	 *            model
	 * @param classNames
	 *            which is used for storing names of all Classes in the source
	 *            model
	 * @param instanceCount
	 *            which is used for keeping record of total number of instances
	 *            of every class in the source model
	 */
	public void computeElementType(PackageableElement element,
			ArrayList<Class> sourceClassList,
			ArrayList<Interface> sourceInterfaceList,
			ArrayList<Association> sourceAssociationList,
			ArrayList<String> classNames, ArrayList<Integer> instanceCount) {
		if (element.eClass() == UMLPackage.Literals.CLASS) {
			Class sourceClass = (Class) element;
			sourceClassList.add(sourceClass);
			computeClass(sourceClass);

		}
		if (element.eClass() == UMLPackage.Literals.ASSOCIATION) {

			Association sourceAssociation = (Association) element;
			sourceAssociationList.add(sourceAssociation);
			computeAssociation(sourceAssociation, classNames, instanceCount);

		}
		if (element.eClass() == UMLPackage.Literals.INTERFACE) {
			Interface i = (Interface) element;
			sourceInterfaceList.add(i);
			FileData0 = FileData0 + "MINTERFACE#" + element.getName() + "\r";
		}

	}

	/**
	 * A method which reads and records all the attributes, operations and
	 * constraints of the source class passed to it.
	 * 
	 * @param sourceClass
	 *            which is Class of source model.
	 */
	public void computeClass(Class sourceClass) {

		FileData0 = FileData0 + "CLASS#" + sourceClass.getName() + "\r";

		EList<Operation> ownedOperations = sourceClass.getAllOperations();
		EList<Class> superclasses = sourceClass.getSuperClasses();
		EList<Property> ownedAttribute = sourceClass.getOwnedAttributes();

		for (Class supClass : superclasses) {
			EList<Property> superClassAttributes = supClass
					.getOwnedAttributes();
			ownedAttribute.addAll(superClassAttributes);

		}

		EList<Constraint> ownedrules = sourceClass.getOwnedRules();

		for (Constraint rule : ownedrules) {
			Logger.getLogger().println(rule.getQualifiedName());
			Logger.getLogger().println(rule.getSpecification().toString());
		}
		for (Property beh : ownedAttribute) {

			Logger.getLogger().println("attribute name:" + beh.getName());
			Logger.getLogger().println("*******Type******* " + beh.getType());

			if (beh.getType() == null) {
				String name = ((NamedElement) beh.getOwner()).getName();
				throw new RuntimeException(
						"An attribute must have a type :: Found : "
								+ beh.getName() + " in class :" + name
								+ " type : null");

			}
			if (beh.getType().eClass() == UMLPackage.Literals.PRIMITIVE_TYPE) {
				PrimitiveType pt = (PrimitiveType) beh.getType();
				FileData0 = FileData0 + "OWNEDATTRIBUTE#"
						+ sourceClass.getName() + "$" + beh.getName() + "$"
						+ pt.getName() + "\r";
			}

			else {

				if (beh.getName().length() == 0) {
					beh.setName(beh.getType().getName().toLowerCase());
				}
				FileData0 = FileData0 + "OWNEDATTRIBUTE#"
						+ sourceClass.getName() + "$" + beh.getName() + "$"
						+ beh.getType().getName() + "\r";
			}

		}
		for (Operation oper : ownedOperations) {

			// System.out.println(oper.getName());
			EList<Constraint> ownedrules1 = oper.getOwnedRules();
			for (Constraint rule : ownedrules1) {
				Logger.getLogger().println(rule.getQualifiedName());
				Logger.getLogger().println(rule.getSpecification().toString());
			}
		}
	}

	/**
	 * A method which reads and records the mutiplicities of owned ends of the
	 * source association passed to it and fills the ArrayLists accordingly
	 * 
	 * @param sourceAssociation
	 *            which is the source association
	 * @param classNames
	 *            which is used for storing names of all Classes in the source
	 *            model
	 * @param instanceCount
	 *            which is used for keeping record of total number of instances
	 *            of every class in the source model
	 */
	public void computeAssociation(Association sourceAssociation,
			ArrayList<String> classNames, ArrayList<Integer> instanceCount) {

		FileData0 = FileData0 + "ASSOCIATION#";

		EList<Property> memends = sourceAssociation.getMemberEnds();

		for (Property end : memends) {
			org.eclipse.uml2.uml.LiteralUnlimitedNatural s = (org.eclipse.uml2.uml.LiteralUnlimitedNatural) end
					.getUpperValue();
			if (s == null) {
				end.setUpper(1);
			} else if (s.getValue() == -1) {
				/**
				 * TODO: change the hardcoded value
				 */

				end.setUpper(10);
			}

			String str = "";
			str = end.getLower() + ".." + end.getUpper();
			if (end.getName().length() == 0) {
				end.setName(end.getType().getName().toLowerCase()
						+ getAssociationEndCount());
				incrementAssociationEndCount();
			}
			FileData0 = FileData0 + end.getType().getName() + "$"
					+ end.getName() + "$" + str + "%";

			if (end.getUpper() > 1) {

				boolean chk = false;
				chk = classNames.contains(end.getType().getName());
				Logger.getLogger().println("------" + chk);
				Logger.getLogger().println(
						"From Assoc Name : = " + end.getType().getName()
								+ "  Count : =" + end.getUpper());
				if (chk == false) {
					classNames.add(end.getType().getName());
					instanceCount.add(end.getUpper());
					Logger.getLogger().println(
							"Assoc : False Index " + end.getType().getName()
									+ " ADDED  " + end.getUpper());
				} else {
					int v1 = -1;
					v1 = classNames.indexOf(end.getType().getName());
					int v2 = -1;
					v2 = instanceCount.get(v1);
					Logger.getLogger().println(
							"Assoc : True Index " + v1 + " Count : " + v2);
					if (v2 < 10) {
						v2 = v2 + end.getUpper();
						instanceCount.remove(v1);
						instanceCount.add(v1, v2);
						Logger.getLogger().println(
								"Assoc : True Index " + end.getType().getName()
										+ " ADDED  " + instanceCount.get(v1));
					}
				}
			}

		}
		FileData0 = FileData0 + "\r";
	}

	/**
	 * A method which updates the instance counts for the classes not involved
	 * in any association
	 * 
	 * @param classList
	 *            which contains list of all classes in the source model
	 * @param classNames
	 *            which contains names of all the classes in the source model
	 * @param instanceCount
	 *            which contains instance counts for each class in the source
	 *            model
	 */
	public void processClassNames(ArrayList<Class> classList,
			ArrayList<String> classNames, ArrayList<Integer> instanceCount) {
		for (int i = 0; i < classList.size(); i++) {
			boolean flg = false;
			flg = classNames.contains(classList.get(i).getName());
			if (flg == false) {
				classNames.add(classList.get(i).getName());
				instanceCount.add(1);
			}

		}
	}

	/**
	 * A method which populates the lists for class/interface names and their
	 * instance counts
	 * 
	 * @param classList
	 *            which contains list of all classes in the source model
	 * @param interfaceList
	 *            which contains list of all interfaces in the source model
	 * @param classNames
	 *            which contains names of all the classes in the source model
	 * @param instanceCount
	 *            which contains instance counts for each class in the source
	 *            model
	 */
	public void populateLists(ArrayList<Class> classList,
			ArrayList<Interface> interfaceList, ArrayList<String> classNames,
			ArrayList<Integer> instanceCount) {
		processClassNames(classList, classNames, instanceCount);
		processInterfaces(interfaceList, classNames, instanceCount);

	}

	/**
	 * A method which updates the instance counts for the interfaces not
	 * involved in any association
	 * 
	 * @param interfaceList
	 *            which contains list of all interfaces in the source model
	 * @param classNames
	 *            which contains names of all the classes and interfaces in the
	 *            source model
	 * @param instanceCount
	 *            which contains instance counts for each class and interface in
	 *            the source model
	 */
	public void processInterfaces(ArrayList<Interface> interfaceList,
			ArrayList<String> classNames, ArrayList<Integer> instanceCount) {
		for (int i = 0; i < interfaceList.size(); i++) {
			boolean flg = false;
			flg = classNames.contains(interfaceList.get(i).getName());
			if (flg == false) {
				classNames.add(interfaceList.get(i).getName());
				instanceCount.add(1);
			}

		}
	}

	/*
	 * public void printArrays() { Logger.getLogger().println("CURRENT");
	 * for(int i=0;i<clsNames.size();i++) {
	 * Logger.getLogger().print(clsNames.get(i)+",");
	 * 
	 * } Logger.getLogger().println(" "); for(int j=0;j<clsCount.size();j++) {
	 * Logger.getLogger().print(clsCount.get(j)+",");
	 * 
	 * } Logger.getLogger().println(" ");
	 * Logger.getLogger().println("CURRENT END "
	 * +clsNames.size()+" pppp "+clsCount.size()); }
	 */
	/**
	 * A method which loads the model of the given Class Diagram
	 * 
	 * @param ur
	 *            the uri of source Class Diagram
	 * @return the model of source Class Diagram
	 */
	/**
	 * @param ur
	 * @return
	 */
	public Model loadModel(String ur) {
//		Logger.getLogger().println("Loading model..");

		URI model = URI.createURI(ur);
		//String transDir = "C:/Users/mahamkhalid/workspace_emf/OCL_Solver_Release_Aug_2013/EMF_Lib/";
//		URIConverter.URI_MAP.put(
//				URI.createURI("platform:/plugin/org.eclipse.uml2.uml/"),
//				URI.createURI("jar:file:" + "EMF_Lib/"+ "org.eclipse.uml2.uml_3.1.2.v201010261927.jar!/"));
//		
//		Map<String,Object> packageRegistry = RESOURCE_SET.getPackageRegistry();
//		packageRegistry.put("http://www.eclipse.org/uml2/5.0.0/UML",UMLPackage.eINSTANCE);
//
//		URI uri = URI.createURI("jar:file:" + "EMF_Lib"+
//				 "/org.eclipse.uml2.uml.resources-3.1.0.v201005031530.jar!/");
//		ResourceManager.registerResources(uri, RESOURCE_SET);
		
		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		Map<String,Object> packageRegistry = RESOURCE_SET.getPackageRegistry();
		packageRegistry.put("http://www.eclipse.org/uml2/5.0.0/UML",UMLPackage.eINSTANCE);

		Resource resource = null;
		try {
			resource = RESOURCE_SET.getResource(model, true);
		} catch (Exception e) {
			Logger.getLogger().error(e);
		}

		Model _model = (Model) EcoreUtil.getObjectByType(
				resource.getContents(), UMLPackage.Literals.MODEL);
		// org.eclipse.uml2.uml.Package _model =
		// (org.eclipse.uml2.uml.Package)EcoreUtil.getObjectByType(resource.getContents(),
		// UMLPackage.Literals.PACKAGE);
//		Logger.getLogger().println("Model loaded");

		return _model;
	}

	/**
	 * A method to create a uml Model.
	 * 
	 * @param name
	 *            which is the desired name of the model to be created
	 * @return the resultant model
	 */
	public static Model createModel(String name) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);

		Logger.getLogger().println(
				"Model '" + model.getQualifiedName() + "' created.");

		return model;
	}

	/**
	 * A method to print the components of a given Model
	 * 
	 * @param package_
	 *            the model whose details are to be printed
	 */
	void PrintPackage(org.eclipse.uml2.uml.Package package_) {
		EList<PackageableElement> members = package_.getPackagedElements();
		for (PackageableElement e : members) {
			Logger.getLogger().println("name = " + e.getName());
		}
	}

}
