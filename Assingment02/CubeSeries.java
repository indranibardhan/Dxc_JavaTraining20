package demo_2;

import java.util.Scanner;

public class CubeSeries {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r;
		
		System.out.println("Enter the total nb of elements in series: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			//r=pow(n,3);
			r=(i*i*i);
			System.out.println(r);
		}
	}
	
}
