package com.inheritance;

public abstract class Cricket extends Object {
	
	int maxOver,
	targetScore,
	currentOver,
	currentScore;

	public int getMaxOver() {
		return maxOver;
	}

	public int getTargetScore() {
		return targetScore;
	}

	public int getCurrentOver() {
		return currentOver;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	
	public Cricket(int maxOver,int targetScore)
	{
		this.maxOver=maxOver;
		this.targetScore=targetScore;
	}
	abstract double calcCurrentRunrate(int currenyScore,double currentOver);
	abstract double calcReqdRunrate(int remainingRuns,double remainingOvers);
	

}
