package com.demo.designpatterns.factory;

abstract class Creater {

	//factory method : lets subclasses decides what to create
	public abstract Product factoryMethod();
}
