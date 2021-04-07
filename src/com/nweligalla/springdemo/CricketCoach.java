package com.nweligalla.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fileds
	
	 private String emailAddress;
	 private String team;

	
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg Constructor");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setTeam");
		this.team = team;
	}



	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
