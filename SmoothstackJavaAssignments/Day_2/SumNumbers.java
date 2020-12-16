/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author William Takes multiple values from the command line and shows the
 *         results of adding all of them.
 */

public class SumNumbers {

	/**
	 * @param args What the user types on the command line
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add the values in the args String after checking
		// that everything in that String can be added.

		// create array of doubles whose values will be added later.

		ArrayList<Double> clToAdd = new ArrayList<>();

		try {
			clToAdd = validityCheck(args);
			System.out.printf("Sum of command line arguments: %f\n", addValues(clToAdd));
		} catch (NumberFormatException e) {
			// if an args element can't be added, exit and tell the user.
			System.out.println("At least one of the command line arguments can't be added!");
		}

		// now try adding console inputs

		System.out.println("Now try inputting some values of in the console, separated by spaces.");
		Scanner sc = new Scanner(System.in);
		String consoleInput = sc.nextLine();
		sc.close();
		String[] sepInputs = consoleInput.split(" ", 0);

		ArrayList<Double> consoleToAdd = new ArrayList<>();

		try {
			consoleToAdd = validityCheck(sepInputs);
		} catch (NumberFormatException e) {
			// if a console input element can't be added, exit and tell the user.
			System.out.println("At least one of the console inputs can't be added!");
			System.exit(0);
		}

		System.out.printf("Sum of console arguments: %f\n", addValues(consoleToAdd));

	}

	static ArrayList<Double> validityCheck(String[] toCheck) throws NumberFormatException {
		// see if each element of args can be converted into something that can be
		// added, and if yes, do so.
		ArrayList<Double> toAdd = new ArrayList<>();
		for (int a = 0; a < toCheck.length; a++) {
			toAdd.add(a, Double.parseDouble(toCheck[a]));
		}
		return toAdd;
	}

	static double addValues(ArrayList<Double> toAdd) {
		// adding the elements of toAdd together.
		double sum = 0;
		for (int i = 0; i < toAdd.size(); i++) {
			sum += toAdd.get(i);
		}
		return sum;
	}
}
