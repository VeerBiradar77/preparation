package com.demo.designpatterns.factory;

public class ConcreteProductB implements Product {

	@Override
	public void create() {
		System.out.println("Product B created");
		
	}
}
