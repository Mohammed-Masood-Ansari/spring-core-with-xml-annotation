package com.ty.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileSim {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Mobile mobile = (Mobile)applicationContext.getBean("mobile");
		mobile.doCall();
	}
}
