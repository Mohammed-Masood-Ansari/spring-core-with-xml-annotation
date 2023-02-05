package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
		Employee employee = (Employee) applicationContext.getBean("myEmployee");
		employee.getEMp();
	}
}
