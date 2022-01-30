package com.example.client;

import com.example.domain.Employee;
import com.example.domain.Manager;

public class Application {

	public static void main(String[] args) {
//		Employee emp = new Employee(1, "John Smith", "011-22-334455", 1234554);
		
		//emp.empId = 101; //legal if this field is private
						 // but  good for OO practice when usiing encapsulation
		
		Manager mgr = new Manager(1, "John Smith", "011-22-334455", 1234554, "Marketing");
		mgr.changeName("J");
		mgr.raiseSalary(300);

	}

}
