package demo_2;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Enter the limit: ");
		int l=sc.nextInt();
		
		for(int i=1; i<=l; i++)
		{
			
			System.out.println(num+"*"+i+"="+ num*i );
		}
		

	}

}
