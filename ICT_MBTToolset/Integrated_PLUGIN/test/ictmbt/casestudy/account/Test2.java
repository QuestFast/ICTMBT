package ictmbt.casestudy.account;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Driver.MtbToolSet;
import ict.mbt.oclsolver.distance.ObjectTuple;

public class Test2 {

	private ArrayList<ObjectTuple[]> data;

	@Test
	public void test() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/account/accountmodel.uml");
		data=mtbToolSet.callToolSet("Account","[balance=100 and amount=100]");
		assertNotEquals(null, data);
	//	fail("Not yet implemented");
	}
	@Test
	public void test1() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/account/accountmodel.uml");
		data=mtbToolSet.callToolSet("Account","[balance=100 and amount=100]");
		assertTrue(!data.isEmpty());
	//	fail("Not yet implemented");
	}

}
