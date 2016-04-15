package Driver;


/**
 * Structure to  Variables 
 * 
 * @author
 *
 */
public class AttributesStructure{
    private String attributeName;
    private String attributeType;
    private String attributeVisibility;
    private String direction;
    private Object value;
	
    
	/**
	 * @param name
	 * @param type
	 * @param visibility
	 * @param value
	 */
	public AttributesStructure(String name, String type, String visibility,
			Object value) {
		super();
		attributeName = name;
		attributeType = type;
		attributeVisibility = visibility;
		this.value = value;
	}
   
	/**
	 * 
	 */
	public AttributesStructure() {
		attributeName = "";
		attributeType = "";
		attributeVisibility = "";
	}
	/**
	 * @param variableName
	 * @param variableType
	 * @param variableVisibility
	 */
	public AttributesStructure(String variableName, String variableType, String variableVisibility) {
		this.attributeName = variableName;
		this.attributeType = variableType;
		this.attributeVisibility = variableVisibility;
	}
	
	/**
	 * @return
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * @return
	 */
	public String getAttributeType() {
		return attributeType;
	}

	/**
	 * @param attributeType
	 */
	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	/**
	 * @return
	 */
	public String getAttributeVisibility() {
		return attributeVisibility;
	}

	/**
	 * @param attributeVisibility
	 */
	public void setAttributeVisibility(String attributeVisibility) {
		this.attributeVisibility = attributeVisibility;
	}

	/**
	 * @return
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * @return
	 */
	public String printAttribute(){
		String variable = "";	
		variable+=this.attributeType+" "+this.attributeName;
		return variable;
		
	}
	/**
	 * @return
	 */
	public String printCompleteVariable(){
		String variable = "";
		variable+=this.attributeVisibility+" "+this.attributeType+" "+this.attributeName;
		return variable;
	}

}

