package demo_2;

import java.util.Scanner;

public class LargestNb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int max,i;
		
		System.out.println("Enter the nb of elements in array: ");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array: ");
		for(i=0; i<=n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		max=a[0];
		for(i=0; i<=n; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The largest nb is : "+ max);
	}

}
