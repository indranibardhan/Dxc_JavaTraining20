package demo_2;

import java.util.Scanner;

public class AscendingOrder {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp;
		
		System.out.println("Enter the nb of element to sort : ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the unsorted array: ");
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<n-1; i++)
		{
			for(j=0; j<n-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted list: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
