package com.demo.solid.SRP;

//SRE - Single responsibility principle :- A class should have only one reason to change
//in simple a class should do only one job
//this class only handles employee data

public class Employee {
	private String name;
	private int id;
	
	public Employee(String name , int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
		
}
