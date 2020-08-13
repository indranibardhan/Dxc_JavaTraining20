package com.railway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Date travelDate=null;
		Date currentDate =new Date();
		
		Train train;
		int passengerNo;
		TrainDao ob=new TrainDao();
		
		System.out.println("Enter Train Number :");
		train = ob.findTrain(sc.nextInt());
		sc.nextInt();
		if (train.equals(null)) 
		{
			System.out.println("Train with given number does not exist");
		} 
		else
		{
			System.out.println("Enter date in the format DDMMYYYY");
			String travelDate2 = sc.nextLine();
			try
			{
				travelDate = new SimpleDateFormat("ddMMyyyy").parse(travelDate2);
			} 
			catch (ParseException e)
			{
				
				e.printStackTrace();
			}
			
			if (travelDate.compareTo(currentDate) < 0)
			{
				System.out.println("Check Date");
				System.exit(0);
			} 
			else
			{
				Ticket obj=new Ticket(travelDate,train);
				System.out.println("Enter Number of Passengers");
				passengerNo=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<passengerNo;i++)
				{
					System.out.println("Enter values for Passenger "+(i+1));
					System.out.println("Enter Name : ");
					String name=sc.nextLine();
					System.out.println("Enter Age : ");
					int age=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Gender (M/F)");
					char gender=(sc.next().charAt(0));
					obj.addPassenger(name, age, gender);
					sc.nextLine();
				}
				obj.writeTicket();
			}
		}

		
	}

}
