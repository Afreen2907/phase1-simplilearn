package com.example.domain;

public class Employee {
	
	//step1 : hide implementation details (encapsulate the data)
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	//make classes as immutable as possible
	//constructor
	// step3: remove the no-arg constructor, implement a constructor to set the value of all field
	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	//step2: changeName, raiseSalary make sense in the context of an Employee
	public void changeName (String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}
	
	public void raiseSalary(double increase) {
		this.salary += increase;
	}
	
	//getter method
	
	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}


	public double getSalary() {
		return salary;
	}

	
	

}
