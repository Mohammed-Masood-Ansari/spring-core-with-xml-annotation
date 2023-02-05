package com.ty.autowire.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirdApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Bird bird = (Bird)applicationContext.getBean("bird");
		bird.getBird();
	}
}
