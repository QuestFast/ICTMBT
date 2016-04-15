package ictmbt.casestudy.account;

import static org.junit.Assert.*;
import ict.mbt.oclsolver.distance.ObjectTuple;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import Driver.MtbToolSet;

public class Test1 {
	private ArrayList<ObjectTuple[]> data;

	@Test
	public void test() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/account/accountmodel.uml");
		data=mtbToolSet.callToolSet("Account","[balance>1000 and amount>10]");
		assertNotEquals(null, data);
	//	fail("Not yet implemented");
	}
	@Test
	public void test1() throws Exception {
		MtbToolSet mtbToolSet=new MtbToolSet("C:/Users/Zainab/workspace3/ICT_MBTToolset/ICT_MBTToolset/Case studies/account/accountmodel.uml");
		data=mtbToolSet.callToolSet("Account","[balance>1000 and amount>10]");
		assertTrue(!data.isEmpty());
	//	fail("Not yet implemented");
	}

}
