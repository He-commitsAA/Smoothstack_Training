/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/**
 * @author William
 * 
 *         Has and executes several methods that return lambda expressions
 *         performing specific actions.
 *
 */
public class Lambdas {

	/**
	 * Takes input from the command line args and calls methods that return the
	 * lambda expressions.
	 */
	public static void main(String[] args) {

		for (int i = 1; i < args.length - 1; i = i + 2) {
			int option = Integer.parseInt(args[i]);
			int input = Integer.parseInt(args[i + 1]);
			switch (option) {
			case 1:
				System.out.println(oddOrEven().apply(input));
				break;
			case 2:
				System.out.println(isItPrime().apply(input));
				break;
			case 3:
				System.out.println(isPalindrome().apply(input));
				break;
			}
		}
	}

	/*
	 * Figures out if number is odd or even.
	 */
	static IntFunction<String> oddOrEven() {

		return (d -> {

			if (d % 2 == 0) {
				return "EVEN";
			} else {
				return "ODD";
			}

		});
	}

	/*
	 * Figures out if number is prime.
	 */
	static IntFunction<String> isItPrime() {

		return (f -> {
			if (f == 1) {
				return "NEITHER PRIME NOR COMPOSITE";
			}
			int[] intArray = IntStream.range(2, f).toArray();
			int[] filteredInts = Arrays.stream(intArray).filter(e -> (f % e == 0)).toArray();
			if (filteredInts.length > 0) {
				return "COMPOSITE";
			} else {
				return "PRIME";
			}
		});
	}

	/*
	 * Figures out if number is palindrome.
	 */
	static IntFunction<String> isPalindrome() {
		return (h -> {
			int number = h;
			ArrayList<Integer> digits = new ArrayList<>();
			while (number > 0) {
				digits.add(number % 10);
				number /= 10;
			}
			for (int i = (digits.size() - 1) / 2; i >= 0; i--) {
				if (digits.get(i) != digits.get(digits.size() - (1 + i))) {
					return "NOT PALINDROME";
				}
			}
			return "PALINDROME";
		});
	}
}