package object;
import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		Account ob=new Account();
		
		System.out.println("Enter the account number: ");
		long acNb=sc.nextLong();
		ob.setAccountnb(acNb);
		
		System.out.println("Enter the balance: ");
		double bal=sc.nextLong();
		ob.setBalance(bal);
		
		System.out.println("Enter the amount to deposit: ");
		double Amtdeposit=sc.nextLong();
		ob.depositAmount(Amtdeposit);
		
		System.out.println("Enter the amount to withdraw: ");
		double Amtwithdraw=sc.nextLong();
		ob.withdraw(Amtwithdraw);
		
		System.out.println("The balance is: " + ob.getBalance());
		sc.close();
		
	}
}
