package testcases.examples.account;

import static org.junit.Assert.*;
import account.Account;
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
Integer amount=704;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		amount=840;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery6(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery7(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery8(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery9(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery12(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery13(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery14(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
	}

	@Test
	public void testQuery15(){
		Account obj = new Account();
		obj.open();
		assertEquals(obj.isActive(),true);
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
obj.setBalance(100);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
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
Integer amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isInactive(),true);
		obj.reopen();
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.deposit(amount);
		assertEquals(obj.isActive(),true);
		amount=100;
		obj.withdraw(amount);
		assertEquals(obj.isActive(),true);
		obj.close();
		assertEquals(obj.isInactive(),true);
	}

}
