/**
 * 
 */
package com.ss.sf.williamtraining.javadaythree;

import java.io.File;
import java.util.Scanner;

/**
 * @author William
 * 
 *         Gets and prints a list of file and directory names under
 *         user-specified directory.
 *
 */
public class FindNames {

	/**
	 * This method performs all the work the class does.
	 */
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome. Please specify the absolute path of the directory.");
			String userInput = sc.nextLine();
			File file = new File(userInput);
			File[] listOfNames = file.listFiles();
			for (int i = 0; i < listOfNames.length; i++) {
				System.out.println(listOfNames[i]);
			}
		} catch (NullPointerException npe) {
			System.out.println("There was a NullPointerException");
			npe.printStackTrace();
		}
	}
}