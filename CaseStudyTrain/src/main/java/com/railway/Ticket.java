package com.railway;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ticket {

	private int counter=100;
	private String pnr;
	private Date travelDate;
	Train train;
	
	TreeMap<Passenger,Double> passenger=new TreeMap<Passenger,Double>();
	
	//Passenger passenger=new Passenger();
	
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}

	
	
	/*public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Double> getPassenger() {
		return passenger;
	}

	public void setMap(TreeMap<Passenger, Double> passenger) {
		this.passenger = passenger;
	}*/

	public String generatePNR()
	{
		DateFormat d=new SimpleDateFormat("yyMMdd");
		String date=d.format(travelDate);
		char S=(train.getSourceStation()).charAt(0);
		char D=(train.getDestinationStation()).charAt(0);
		pnr=S + D +"-"+date+"-"+counter;
		counter++;
		return pnr;
		
	}
	public double calcPassengerFare(Passenger object)
	{
		double Fare=train.getTicketPrice();
		double fare;
		
		if(object.getAge()<=12)
		{
			fare=Fare*0.5;
		}
		else if(object.getAge()>=60)
		{
			fare=Fare*0.6;
		}
		else if(object.getGender()=='F')
		{
			fare=Fare*0.75;
		}
		else
		{
			fare=Fare;
		}
		return fare;
	}
	
	public void addPassenger(String name, int age, char gender)
	{
		Passenger object= new Passenger(name,age,gender);
		passenger.put(object, calcPassengerFare(object));
	}
	
	public double calculateTotalTicketPrice() 
	{
		double totalTicketprice=0;
		for (Entry<Passenger, Double> map: passenger.entrySet())
		{
			totalTicketprice = totalTicketprice + (double) map.getValue();
		}

		return totalTicketprice;
	}
	
	private StringBuilder generateTicket()
	{
		StringBuilder ticket=new StringBuilder();
		
		ticket.append("PNR:" + generatePNR()+"\n");
		ticket.append("Train No: "+train.getTrainNo()+"\n");
		ticket.append("Train Name: "+train.getTrainName()+"\n");
		ticket.append("Form: "+train.getSourceStation()+"\n");
		ticket.append("To: "+train.getDestinationStation()+"\n");
		DateFormat date2 = new SimpleDateFormat("dd/MM/yyyy" + "\n");
		ticket.append("Travel Date :" + date2.format(travelDate) + "\n");
		ticket.append("Passengers : " + "\n");
		
		ticket.append("Name" + "\t\t" + "Age" + "\t\t" + "Gender" + "\t\t" + "Fare"+"\n");
		
		for (Entry<Passenger, Double> map : passenger.entrySet()) {
			Passenger object = (Passenger) map.getKey();
			ticket.append(object.getName() + "\t\t" + object.getAge() + "\t\t" + object.getGender() + "\t\t"
					+ (double) map.getValue() + "\n");
		}
		ticket.append("Total Price" + calculateTotalTicketPrice());
		return ticket;
	}
	
	public void writeTicket()
	{
		generateTicket();
		BufferedWriter bw=null;
		
		try
		{
			File ticketfile=new File("printedticket.txt");
			if(!ticketfile.exists())
			{
				ticketfile.createNewFile();
			}
			FileWriter fw = new FileWriter(ticketfile);
			bw = new BufferedWriter(fw);
			bw.write(generateTicket().toString());
			System.out.println("Ticket Printed with PNR"+pnr);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				System.out.println("Error in closing the BufferedWriter" + e);
			}
		}
		
	}
	

}
