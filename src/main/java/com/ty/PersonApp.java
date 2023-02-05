package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Person person = (Person) applicationContext.getBean("myPerson");
		person.getPerson();
	}
}
