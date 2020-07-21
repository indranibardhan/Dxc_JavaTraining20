package demo_2;

import java.util.Scanner;

public class EvenNatural {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The first 10 natural even numbers are: ");
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("\n");
	}

}
