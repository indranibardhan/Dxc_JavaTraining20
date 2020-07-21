package demo_2;

import java.util.Scanner;

public class NCR {
	
	public static int fact(int n)
	{
		int fact=1, i;
        for(i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("Enter r : ");
		int r=sc.nextInt();
		
		System.out.print("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
        //System.out.print("\nNPR = " +(fact(n)/(fact(n-r))));
	}


}
