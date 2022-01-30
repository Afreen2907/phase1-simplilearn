package com.example.domain;

public class Manager extends Employee {

	private String deptName;
	
	public Manager(int empId, String name, String ssn, double salary, String dept) {
		super(empId, name, ssn, salary);
		deptName = dept;
	}

	public String getDeptName() {
		return deptName;
	}
	
	
}
