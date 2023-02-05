package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");

		Student student = (Student) applicationContext.getBean("myStudent");
		student.getData();

	}
}
