package com.demo.designpatterns;

public class Singelton {

	// use case -> when we need only one instance of the class
	// common for logging, config, DB connections

	// why -> control access to shared resources
	// saves memory avoid multiple instances
	// provide global access point

	// holds the single instance
	private static Singelton instance;

	// private constructor prevent instanciation from other classes
	private Singelton() {
		System.out.println("Singleton instance created");
	}

	// provides global access point
	public static Singelton getInstance() {
		if (instance == null) {
			// lazy initailization create only when needed
			instance = new Singelton();
		}
		return instance;
	}

	// ex method
	public void showMessage() {
		System.out.println("Hello fron singleton!");
	}

	public static void main(String[] args) {
		Singelton s1 = Singelton.getInstance();
		Singelton s2 = Singelton.getInstance();

		// both ref point to the same object
		s1.showMessage();
		System.out.println(s1 == s2); // true

	}

}
