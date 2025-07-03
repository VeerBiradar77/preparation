package com.demo.designpatterns.factory;

public class ConcreteProductA implements Product{

	//when and why to use factory method pattern
	//use case => when we have superclass but let subclasses which class to instantiate
	//CLient code should not depend on the concrete classes
	
	//why => Loose coupling ->client code uses interface.
	//open/closed principles Add new product without changing client code
	
	public void create() {
		System.out.println("Product A creted");
	}
}
