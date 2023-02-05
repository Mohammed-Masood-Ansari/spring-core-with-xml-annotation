package com.ty.autowire;

import org.springframework.stereotype.Component;

@Component
public class Sim {

	public void connectNetwork() {
		System.out.println("...........Connecting with hutch network...........");
	}
}
