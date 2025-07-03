package com.demo.designpatterns.factory;

//Cliet code
public class FactoryDemo {

	// when and why to use factory method pattern
	// use case => when we have superclass but let subclasses which class to
	// instantiate
	// CLient code should not depend on the concrete classes

	// why => Loose coupling ->client code uses interface.
	// open/closed principles Add new product without changing client code
	public static void main(String[] args) {

		Creater creator1 = new ConcreteCreatorA();
		Product product1 = creator1.factoryMethod();
		product1.create();

		Creater creator2 = new ConcreteCreatorB();
		Product product2 = creator2.factoryMethod();
		product2.create();

	}

}
