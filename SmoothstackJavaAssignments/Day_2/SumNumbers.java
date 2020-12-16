/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

import java.util.Scanner;
import java.lang.System;

/**
 * @author William
 *                  Takes multiple values from the command line and shows the results of adding all of them.
 */

public class SumNumbers {

	/**
	 * @param userInput What the user types on the command line
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		//delimit the command line input by spaces and make each separated element a String array element.
		String[] sepInputs = userInput.split(" ", 0);
		
		// create array of doubles whose values will be added later.
		double[] toAdd = new double[sepInputs.length];

		for (int a = 0; a < sepInputs.length; a++) {
			try {
				// see if each element of sepInputs can be converted into something that can be added, and if yes, do so.
				toAdd[a] = Double.parseDouble(sepInputs[a]);
			} catch (NumberFormatException e) {
				// if a sepInputs elements can't be added, exit and tell the user.
				System.out.println("At least one of these values can't be added!");
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
