package com.ty.autowire.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bird {

	Wing wing;

	@Autowired
	public void setWing(Wing wing) {
		this.wing = wing;
	}
	
	public void getBird() {
		System.out.println("bird are flying and ...");
		wing.moveWing();
	}
}
