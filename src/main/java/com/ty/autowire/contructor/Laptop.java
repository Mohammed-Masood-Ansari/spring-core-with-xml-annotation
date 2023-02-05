package com.ty.autowire.contructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	Usb usb;

	@Autowired
	public Laptop(Usb usb) {
		super();
		this.usb = usb;
	}
	

	public void getLaptop() {
		System.out.println("usb connecting");
		usb.getUsb();
	}
}
