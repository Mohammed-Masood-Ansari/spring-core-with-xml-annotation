package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myEmployee")
public class Employee {

	private int empId;
	private String empName;
	
	@Value(value ="123")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Value(value = "Ayushi")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void getEMp() {
		System.out.println("empId = "+empId);
		System.out.println("empName = "+empName);
	}
}
