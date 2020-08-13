package com.railway;

public class Train {
	
	private int trainNo;
	private String TrainName;
	private String sourceStation;
	private String destinationStation;
	private double ticketPrice;

	public Train() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Train(int trainNo, String trainName, String sourceStation, String destinationStation, double ticketPrice) {
		super();
		this.trainNo = trainNo;
		TrainName = trainName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.ticketPrice = ticketPrice;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return TrainName;
	}

	public void setTrainName(String trainName) {
		TrainName = trainName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
	

}
