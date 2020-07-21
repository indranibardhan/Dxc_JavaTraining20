package com.inheritance;

public class OneDayCricket extends Cricket{
	
	public OneDayCricket(int targetScore)
	{
		//this.maxOver=50;
		//this.targetScore=targetScore;
		super(targetScore,50);
	}
	double calcReqdRunrate(int remainingRuns,double remainingOvers)
	{
		return (remainingRuns/remainingOvers);
	}
	double calcCurrentRunrate(int currenyScore,double currentOver)
	{
		return (currenyScore/currentOver);
	}

}
