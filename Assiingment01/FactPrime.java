package demo_2;

import java.util.Scanner;

public class FactPrime {

	public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("\nEnter the limit : ");
		int limit=sc.nextInt();
		int fact=1;
		if(limit>1)
		{
		    for(int i=1;i<=limit;i++)
		    {
		        for(int j=i;j<=i;j++)
		        {
		            fact=fact*j;
		        }
		        System.out.print(fact+" ");
		    }
		}
		else
		    System.out.print("\nInvalid Input");
	
    }
}
