package com.demo.designpatterns.factory;

public class ConcreteCreatorA extends Creater {

	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}
