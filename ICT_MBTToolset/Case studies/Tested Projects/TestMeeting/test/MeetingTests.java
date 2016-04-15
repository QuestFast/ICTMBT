
import static org.junit.Assert.*;
import org.junit.Test;

public class MeetingTests{
	@Test
	public void testQuery1(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(23);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery2(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInMinutes(10);
		obj.lastSession();
		assertEquals(obj.isConcludingSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery3(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(97);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery4(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery5(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(94);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery6(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(28);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery7(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInMinutes(10);
		obj.lastSession();
		assertEquals(obj.isConcludingSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery8(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(7);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery9(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery10(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(27);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery11(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(71);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery12(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInMinutes(10);
		obj.lastSession();
		assertEquals(obj.isConcludingSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery13(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(99);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery14(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery15(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.repeatDemo();
		assertEquals(obj.isDemo(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(80);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery16(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(9);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery17(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInMinutes(10);
		obj.lastSession();
		assertEquals(obj.isConcludingSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery18(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(21);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery19(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
obj.setDurationInMinutes(15);
		obj.startDiscussion();
		assertEquals(obj.isDiscussion(),true);
obj.setDurationInMinutes(20);
		obj.startQAs();
		assertEquals(obj.isQuestionAnswerSession(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery20(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(30);
		obj.startDemo();
		assertEquals(obj.isDemo(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(36);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery21(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
obj.setDurationInMinutes(15);
obj.setNoOfParticipants(5);
		obj.repeatPresentation();
		assertEquals(obj.isPresentation(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(1);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

	@Test
	public void testQuery22(){
		Meeting obj = new Meeting();
obj.setDurationInHours(0);
obj.setNoOfParticipants(5);
		obj.startPresentation();
		assertEquals(obj.isPresentation(),true);
		obj.startBreak();
		assertEquals(obj.isSuspend(),true);
obj.setDurationInMinutes(1);
		obj.resume();
		assertEquals(obj.isResume(),true);
obj.setDurationInHours(5);
obj.setNoOfParticipants(5);
		obj.conclude();
		assertEquals(obj.isEnd(),true);
	}

}
