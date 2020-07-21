package pattern;

import java.util.Scanner;

public class PatternTri {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the nb of row: ");
		int r=sc.nextInt();
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(+j);
			}
			System.out.print("\n");
		}
	}
}
