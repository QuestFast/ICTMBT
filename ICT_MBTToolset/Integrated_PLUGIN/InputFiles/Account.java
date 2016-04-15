
public class Account {
	private double balance;
	private String name;
	public boolean isActive()
	{
		if(balance>=0)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isInactive()
	{
		if(balance<=0)
		{
			return true;
		}
		else
			return false;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}

	public Account() {
		this.balance = 1000.0;
	}
	public Account(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(int withdrawAmount) {
		 balance=balance - withdrawAmount;
	}

	public void deposit(int depositAmount) {
		this.balance = balance + depositAmount;
	}
	public void withdraw() {
//		this.balance = balance - withdrawAmount;
	}

	public void deposit() {
//		this.balance = balance + depositAmount;
	}
	
	public void open() {
		balance=10;
	}

	public void close() {
		balance=0;
	}
	
	public boolean validateDepositAmount(double depositAmount){
		if(depositAmount > 0)
			return true;
		else 
			return false;
	}
	public void reopen() {
		balance=10;
	}
}