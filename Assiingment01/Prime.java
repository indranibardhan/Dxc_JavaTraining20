package demo_2;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0 && n!=1)
			System.out.println("This a PRIME NUMBER");
		else
			System.out.println("This ia NOT A  PRIME NUMBER");
	}

}
