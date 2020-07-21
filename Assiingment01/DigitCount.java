package demo_2;

import java.util.Scanner;

public class DigitCount {
	
	public static void main(String[] args)
    {
        int r,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        while(a!=0)
        {
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
        System.out.println("Sum of the digits are: " + sum);
    }

}
