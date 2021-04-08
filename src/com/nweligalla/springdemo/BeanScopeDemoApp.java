package com.nweligalla.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if the object are same
		
		System.out.println("Pointing to the same object " + (coach==alphaCoach?true:false));
		System.out.println("Memory location of coach "+coach);
		System.out.println("Memory location of alphacoach "+alphaCoach);
		
		//close context
		
		context.close();
	}

}
