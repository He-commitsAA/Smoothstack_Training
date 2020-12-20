/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.StringBuilder;

/**
 * @author William
 * 
 *         Creates an ArrayList of Integers and tells you if each is odd or
 *         even.
 *
 */
public class OddEven {

	/**
	 * Creates and transforms list of Integers to String that shows whether
	 * each Integer is odd or even.
	 */
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();
		int arraySize = 5;
		for (int i = 1; i <= arraySize; i++) {
			integers.add(i);
		}

		List<String> labeledIntegers = integers.stream().map(OddEven::oddOrEven).collect(Collectors.toList());

		StringBuilder numStr = new StringBuilder();

		labeledIntegers.forEach(n -> {
			numStr.append(n);
		});
		numStr.deleteCharAt(numStr.length() - 1);
		final String myFinalStr = numStr.toString();
		System.out.println(myFinalStr);
	}

	/*
	 * Formats Integers whether odd or even to prepare them for appending to numStr.
	 */

	static String oddOrEven(Integer i) {
		if (i % 2 == 0) {
			return "e" + i + ",";
		} else {
			return "o" + i + ",";
		}
	}
}
