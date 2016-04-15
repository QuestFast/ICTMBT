
import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTests{
	@Test
	public void testQuery1(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(1975);
obj.setAmount(33);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery2(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(1115);
obj.setAmount(12);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery3(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(2020);
obj.setAmount(50);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery4(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery5(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery6(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(2016);
obj.setAmount(95);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery7(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(1962);
obj.setAmount(41);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery8(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(1090);
obj.setAmount(14);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery9(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(1972);
obj.setAmount(44);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery10(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(1973);
obj.setAmount(15);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery11(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(1108);
obj.setAmount(26);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery12(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(2019);
obj.setAmount(52);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery13(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery14(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(1997);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery15(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(1121);
obj.setAmount(22);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery16(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery17(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(2011);
obj.setAmount(99);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery18(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery19(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(1122);
obj.setAmount(24);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery20(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(1034);
obj.setAmount(54);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery21(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery22(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
obj.setAmount(100);
		obj.withdraw();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		obj.deposit();
		assertEquals(obj.isActive(),true);
obj.setBalance(1965);
obj.setAmount(90);
		obj.withdraw();
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

}
