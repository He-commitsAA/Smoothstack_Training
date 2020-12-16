/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

import java.util.Scanner;
import java.lang.System;

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

		// this program is intended to add the values in the args String after checking
		// that everything in that String can be added.

		// create array of doubles whose values will be added later.
		double[] toAdd = new double[args.length];

		for (int a = 0; a < args.length; a++) {
			try {
				// see if each element of args can be converted into something that can be
				// added, and if yes, do so.
				toAdd[a] = Double.parseDouble(args[a]);
			} catch (NumberFormatException e) {
				// if an args elements can't be added, exit and tell the user.
				System.out.println("At least one of these values can't be added!");
				System.exit(0);
			}
		}

		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += toAdd[i]; // adding the elements of toAdd together.
		}
		System.out.print(sum);
	}
}
