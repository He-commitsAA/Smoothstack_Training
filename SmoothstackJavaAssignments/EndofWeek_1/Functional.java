/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author William
 * 
 *         Performs several operations on lists using functional programming
 *         techniques.
 *
 */
public class Functional {

	/**
	 * Carries out functional programming techniques by calling methods as needed.
	 * Formats inputs and outputs into a demo.
	 */
	public static void main(String[] args) {

		System.out.print("Demo for rightDigit():\n");

		ArrayList<Integer> rightDigit1 = new ArrayList<Integer>(Arrays.asList(1, 22, 93));
		rightDigit1.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		rightDigit(rightDigit1).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<Integer> rightDigit2 = new ArrayList<Integer>(Arrays.asList(16, 8, 886, 8, 1));
		rightDigit2.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		rightDigit(rightDigit2).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<Integer> rightDigit3 = new ArrayList<Integer>(Arrays.asList(10, 0));
		rightDigit3.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		rightDigit(rightDigit3).forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println();

		System.out.print("Demo for doubling():\n");

		ArrayList<Integer> doubling1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		doubling1.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		doubling(doubling1).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<Integer> doubling2 = new ArrayList<Integer>(Arrays.asList(6, 8, 6, 8, -1));
		doubling2.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		doubling(doubling2).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<Integer> doubling3 = new ArrayList<Integer>(Arrays.asList());
		doubling3.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		doubling(doubling3).forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println();

		System.out.print("Demo for noX():\n");

		ArrayList<String> noX1 = new ArrayList<String>(Arrays.asList("ax", "bb", "cx"));
		noX1.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		noX(noX1).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<String> noX2 = new ArrayList<String>(Arrays.asList("xxax", "xbxbx", "xxcx"));
		noX2.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		noX(noX2).forEach(a -> System.out.print(a + " "));
		System.out.println();

		ArrayList<String> noX3 = new ArrayList<String>(Arrays.asList("x"));
		noX3.forEach(a -> System.out.print(a + " "));
		System.out.print(":");
		System.out.println();
		noX(noX3).forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println();

	}
	
	/*
	 * Finds the rightmost digit.
	 */

	static ArrayList<Integer> rightDigit(ArrayList<Integer> numbers) {
		ArrayList<Integer> rightmost = new ArrayList<>();
		numbers.forEach(a -> rightmost.add(a % 10));
		return rightmost;
	}
	
	/*
	 * Doubles integers.
	 */

	static ArrayList<Integer> doubling(ArrayList<Integer> numbers) {
		ArrayList<Integer> doubles = new ArrayList<>();
		numbers.forEach(a -> doubles.add(a * 2));
		return doubles;
	}
	
	/*
	 * Eliminates x's from Strings.
	 */

	static ArrayList<String> noX(ArrayList<String> myStrings) {
		ArrayList<String> withoutX = new ArrayList<>();
		myStrings.forEach(a -> {
			char[] characters = a.toCharArray();
			ArrayList<Character> charactersNoX = new ArrayList<>();
			for (int i = 0; i < characters.length; i++) {
				if (characters[i] != 'x') {
					charactersNoX.add(characters[i]);
				}
			}
			withoutX.add(charactersNoX.toString());
		});
		return withoutX;
	}
}