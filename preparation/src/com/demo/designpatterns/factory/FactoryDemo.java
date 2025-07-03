package com.demo.designpatterns.factory;

//Cliet code
public class FactoryDemo {

	public static void main(String[] args) {

		Creater creator1 = new ConcreteCreatorA();
		Product product1 = creator1.factoryMethod();
		product1.create();
		
		Creater creator2 = new ConcreteCreatorB();
		Product product2 = creator2.factoryMethod();
		product2.create();

	}

}
