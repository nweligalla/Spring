package com.nweligalla.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: "+ fortuneService.getFortune();
	}

	
	// add an init method
	public void doMyStartupMethod() {
		System.out.println("Inside doMyStartupMethod method");
	}
	
	//add a destroy method
	public void doMyCleanUpMethod() {
		System.out.println("Inside the doMyCleanUpMethod method");
		
	}
	
	
	
	
	
	
	
	
	
	
}
