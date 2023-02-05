package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CowApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Cow cow = (Cow)applicationContext.getBean("cow");
		cow.eat();
	}
}
