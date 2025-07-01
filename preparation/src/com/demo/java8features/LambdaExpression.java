package com.demo.java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	// lambda expressions were introduced to bring functional programming to java.
	// they provide concise way to represent anonymous functions
	// it is mostly used to pass behavior as a parameters(ex, sorting, filtering,
	// iterating)

	// Key Point is - replaces the biolerplate anonymous classes.

	public static void run() {
		List<String> list = Arrays.asList("A", "B", "C");

		// without lambda
		for (String s : list) {
			System.out.println(s);
		}

		// with lambda
		list.forEach(s -> System.out.println(s));
		
		//sorting using lambda
		List<String>names=Arrays.asList("veer","raj","sandhya","shivam","aavni");
		names.sort((a, b) -> a.compareTo(b));
		System.out.println("Sorted names:" + names);
		
		//loop using lambda with foreach
		
		names.forEach(name -> System.out.println("Hello:"+ name));

	}

}
