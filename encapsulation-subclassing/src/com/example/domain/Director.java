package com.example.domain;

public class Director extends Manager{
	private double budget;

	public Director(int empId, String name, String ssn, double salary, String dept, double budget) {
		super(empId, name, ssn, salary, dept);
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

	public boolean approveExpense(double amount) {
		System.out.println("Approve: " + amount);
		return true;
	}
}
