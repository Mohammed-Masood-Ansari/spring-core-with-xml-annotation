package com.ty.autowire.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Laptop laptop = (Laptop)applicationContext.getBean("laptop");
		laptop.getLaptop();
	}
}
