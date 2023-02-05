package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="myStudent")
public class Student {

	@Value(value="Preeti")
	String name;
	@Value(value = "pree1997@gmail.com")
	String email;
	
	public void getData() {
		System.out.println("name= "+name);
		System.out.println("email = "+email);
	}
}
