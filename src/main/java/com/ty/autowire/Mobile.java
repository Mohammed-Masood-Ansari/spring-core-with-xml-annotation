package com.ty.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	Sim sim;
	
	public void doCall() {
		System.out.println("Calling to someone......");
		sim.connectNetwork();
	}
}
