package Driver;

/**
 * @author
 *
 */
public class StartState {
	private String start;
	
	public StartState() {
		start="";
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		
		if(!start.equals(""))
		{
			this.start = start;
		}
	}
	

}
