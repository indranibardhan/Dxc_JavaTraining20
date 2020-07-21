package demo_2;

import java.util.Scanner;

public class ArmstrongnbMain {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number  ");
		int x=sc.nextInt();
        		Armstrongnb object=new Armstrongnb();
         		object.armstrong(x);  
     	}

}
