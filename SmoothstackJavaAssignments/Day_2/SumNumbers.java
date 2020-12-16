/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

/**
 * @author William
 *
 */

import java.util.Scanner;
import java.lang.System;

public class SumNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment: take multiple values from the command line and show the result of
		// adding all of them.

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		String[] sepInputs = userInput.split(" ", 0); // delimit the command line input by spaces, making each separated
														// element a String array element.
		double[] toAdd = new double[sepInputs.length]; // create array of doubles whose values will be added later.

		for (int a = 0; a < sepInputs.length; a++) {
			try {
				toAdd[a] = Double.parseDouble(sepInputs[a]); // see if each element of sepInputs can be converted into
																// something that can be added, and if yes, do so.
			} catch (NumberFormatException e) {
				System.out.println("At least one of these values can't be added!"); // if a sepInputs elements can't be
																					// added, exit and tell the user.
				System.exit(0);
			}
		}

		double sum = 0;
		for (int i = 0; i < sepInputs.length; i++) {
			sum += toAdd[i]; // adding the elements of toAdd together.
		}
		System.out.print(sum);
	}
}
