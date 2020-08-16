package com.dxc.beans;

public class Athlete {
	
	private static int counter=0;
	private int athleteId;
	private String athleteName;
	private char athleteGender;
	private String category;
	private String athleteEmail;
	private long athleteMobile;
	
	public Athlete() {
		super();
		// TODO Auto-generated constructor stub
		this.athleteId=counter+1;
	}

	public Athlete(int athleteId, String athleteName, char athleteGender, String category, String athleteEmail,
			long athleteMobile) {
		super();
		//this.athleteId=athleteId;
		this.athleteId = 1+counter;
		this.athleteName = athleteName;
		this.athleteGender = athleteGender;
		this.category = category;
		this.athleteEmail = athleteEmail;
		this.athleteMobile = athleteMobile;
	}

	public int getAthleteId() {
		return athleteId;
	}

	public void setAthleteId(int athleteId) {
		this.athleteId = athleteId;
	}

	public String getAthleteName() {
		return athleteName;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public char getAthleteGender() {
		return athleteGender;
	}

	public void setAthleteGender(char athleteGender) {
		this.athleteGender = athleteGender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAthleteEmail() {
		return athleteEmail;
	}

	public void setAthleteEmail(String athleteEmail) {
		this.athleteEmail = athleteEmail;
	}

	public long getAthleteMobile() {
		return athleteMobile;
	}

	public void setAthleteMobile(long athleteMobile) {
		this.athleteMobile = athleteMobile;
	}

	
}
