package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myPerson")
public class Person {

	private int id;
	private String name;
	
	public Person(@Value(value ="456") int id, @Value(value = "anas") String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void getPerson() {
		
		System.out.println("id = "+id);
		System.out.println("Name = "+name);
		
	}
}
