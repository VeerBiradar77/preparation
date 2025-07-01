package preparation.com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	// lambda expressions were introduced to bring functional programming to java.
	// they provide concise way to represent anonymous functions
	// it is mostly used to pass behavior as a parameters(ex, sorting, filtering,
	// iterating)
	
	//Key Point is - replaces the biolerplate anonymous classes.

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C");

		// without lambda
		for (String s : list) {
			System.out.println(s);
		}

		// with lambda
		list.forEach(s -> System.out.println(s));

	}

}
