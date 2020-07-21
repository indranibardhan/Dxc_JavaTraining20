package object;

public class Account {
	
	 private long accountnb;
	 
	public long getAccountnb() {
		return accountnb;
	}
	public void setAccountnb(long accountnb) {
		this.accountnb = accountnb;
	}
	
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double depositAmount(double deAmt)
	{
		this.balance=this.balance+deAmt;
		return this.balance;
	}
	
	public void withdraw(double wiAmt)
	{
		if(this.balance > wiAmt)
		{
			this.balance=this.balance-wiAmt;
			System.out.println(this.balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

}
