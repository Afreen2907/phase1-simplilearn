package com.example.client;

import com.example.domain.Employee;

public class Application {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//emp.empId = 101; //legal if this field is public
						 // but not good for OO practice
		
		emp.setEmpId(101); //this is okay
		emp.setName("John Smith");
		emp.setSsn("011-22-2467");
		emp.setSalary(120345.05);

	}

}
