package com.inheritance;

import java.util.Scanner;

public class CricketMain {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Target Run: ");
		int targetRun=sc.nextInt();
		System.out.println("Enetr Current Over: ");
		int currentOver=sc.nextInt();
		System.out.println("Enter Current Score: ");
		int currentScore=sc.nextInt();
		
		OneDayCricket ob=new OneDayCricket(targetRun);
		ob.setCurrentOver(currentOver);
		ob.setCurrentScore(currentScore);
		
		System.out.println("Current Run Rate: ");
		System.out.println(ob.calcCurrentRunrate(currentScore,currentOver));
		System.out.println("Required Run Rate: ");
		System.out.println(ob.calcReqdRunrate((targetRun-currentScore),(ob.getMaxOver()-currentOver)));
		
	}

}
