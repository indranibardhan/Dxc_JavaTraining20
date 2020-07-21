package demo_2;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rev=0,temp;
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		while(n!=0)
		{
			temp=n%10;
			rev=rev*10;
			rev=rev+temp;
			n=n/10;
		}
		System.out.println("The reverse number is: " + rev);
	}

}
