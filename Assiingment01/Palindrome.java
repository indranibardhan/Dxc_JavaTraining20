package demo_2;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int temp,r,rev=0;
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			rev=rev*10;
			rev=rev+r;
			temp=temp/10;
		}
		if(rev==n)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
			
	}

}
