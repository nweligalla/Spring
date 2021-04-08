package com.nweligalla.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach coach =context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods on the bean
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		//call literal methods
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		
		//close the context
		context.close();

	}

}
