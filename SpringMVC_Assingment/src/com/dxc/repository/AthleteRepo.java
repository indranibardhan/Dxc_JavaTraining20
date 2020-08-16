package com.dxc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dxc.beans.Athlete;

@Component
public class AthleteRepo {
	//int c=0;

	List<Athlete> athlete=new ArrayList<Athlete>();

	public List<Athlete> getAthelete() {
		return athlete;
	}

	public void setAthelete(List<Athlete> athlete) {
		this.athlete = athlete;
	}

	

	public void addAthlete(Athlete athlete) {
		// TODO Auto-generated method stub
		this.athlete.add(athlete);
		//c++;
	}
	
	
}
