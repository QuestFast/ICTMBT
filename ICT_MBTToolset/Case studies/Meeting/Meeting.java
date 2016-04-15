
public class Meeting {

	private int durationInMinutes;
	private int durationInHours;
	private int noOfParticipants;
	
	public Meeting() {
	}
	
	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	public void setDurationInMinutes(int i) {
		this.durationInMinutes = i;
	}
	
	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setNoOfParticipants(int i) {
		this.noOfParticipants = i;
	}
	
	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public boolean isSuspend() {
		return true;
	}

	public Object meetingbreak() {
		return null;
	}

	public int resume() {
		return 0;
		
	}

	public boolean isResume() {
		if((this.durationInMinutes > 15 && this.durationInMinutes < 30) || (this.durationInMinutes >= 5 && this.durationInMinutes <=15))
			return true;
		else 
			return false;
	}

	public boolean isEnd() {
		if(this.durationInHours <= 5 && this.noOfParticipants >=5)
			return true;
		else 
			return false;
	}

	public void conclude(Integer durationInHours2, Integer noOfParticipants2) {
		this.durationInHours = durationInHours2;
		this.noOfParticipants = noOfParticipants2;
	}

	public void conclude() {
		
	}


	public void startPresentation(Integer durationInHours2, Integer noOfParticipants2) {
		this.durationInHours = durationInHours2;
		this.noOfParticipants = noOfParticipants2;
	}
	
	public void startPresentation() {

	}

	public boolean isPresentation() {
		if(this.durationInHours == 0 && this.noOfParticipants >= 5)
			return true;
		else 
			return false;
	}


	public void startDemo(Integer durationInMinutes2) {
		this.durationInMinutes = durationInMinutes2;
	}
	public void startDemo() {
	}

	public boolean isDemo() {
		if((this.durationInMinutes > 15 && this.durationInMinutes <=30) || (this.durationInMinutes >= 5 && this.durationInMinutes <=15))
			return true;
		else 
			return false;
	}

	public void startDiscussion(Integer durationInMinutes2) {
		this.durationInMinutes = durationInMinutes2;
	}
	public void startDiscussion() {
	}

	public boolean isDiscussion() {
		if(this.durationInMinutes > 5 && this.durationInMinutes <=15)
			return true;
		else 
			return false;
	}

	public void startQAs(Integer durationInMinutes2) {
		this.durationInMinutes = durationInMinutes2;
	}
	
	public void startQAs() {
	}
	
	public boolean isQuestionAnswerSession() {
		if(this.durationInMinutes > 10 && this.durationInMinutes <=20)
			return true;
		else 
			return false;
	}

	public void startBreak() {
		
	}

	public void setDurationInMinutes(Object resume) {

	}

	public boolean isConcludingSession() {
		if(this.durationInMinutes > 5 && this.durationInMinutes <=10)
			return true;
		else 
			return false;
	}

	public void lastSession(Integer durationInMinutes2) {
		this.durationInMinutes = durationInMinutes2;
	}

	public void lastSession() {
	}
	
	public void repeatDemo(Integer durationInMinutes2) {
		this.durationInMinutes = durationInMinutes2;
	}
	
	public void repeatDemo() {
	}

	public void repeatPresentation(Integer durationInMinutes2, Integer noOfParticipants2) {
		this.durationInMinutes = durationInMinutes2;
		this.noOfParticipants = noOfParticipants2;
	}
	
	public void repeatPresentation() {
	}
}