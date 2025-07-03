package com.demo.designpatterns.factory;

public class ConcreteCreatorB extends Creater {

	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
