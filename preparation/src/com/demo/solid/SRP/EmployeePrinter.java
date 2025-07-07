package com.demo.solid.SRP;

//this class only handles printing employee details, does not store or chane emp data

public class EmployeePrinter {

//Method to print Employee Info
	public void printEmployee(Employee employee) {
		System.out.println("Employee name: " + employee.getName());
		System.out.println("Employee Id : " + employee.getId());
	}
}
