package ictmbt.casestudy.meeting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Driver.MtbToolSet;
import ict.mbt.oclsolver.distance.ObjectTuple;

public class Test6 {

	private ArrayList<ObjectTuple[]> data;

	@Test
	public void test() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes>5 and durationInMinutes<=15]");
		assertNotEquals(null, data);
	//	fail("Not yet implemented");
	}
	@Test
	public void test1() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes>5 and durationInMinutes<=15]");
		assertTrue(!data.isEmpty());
	//	fail("Not yet implemented");
	}

	@Test
	public void test2() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes<=5 and noOfParticipants>=5]");
		assertNotEquals(null, data);
	//	fail("Not yet implemented");
	}
	@Test
	public void test3() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes<=5 and noOfParticipants>=5]");
		assertTrue(!data.isEmpty());
	//	fail("Not yet implemented");
	}
	@Test
	public void test4() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes>5 and durationInMinutes<=10]");
		assertNotEquals(null, data);
	//	fail("Not yet implemented");
	}
	@Test
	public void test5() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/meeting/model.uml");
		data=mtbToolSet.callToolSet("Meeting","[durationInMinutes>5 and durationInMinutes<=10]");
		assertTrue(!data.isEmpty());
	//	fail("Not yet implemented");
	}

}
