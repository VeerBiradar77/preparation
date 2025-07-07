package com.demo.solid.SRP;
//Main class to test
public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Rohan", 1);
			
		EmployeePrinter printer = new EmployeePrinter();
		
		printer.printEmployee(employee);

	}

}
