/**
 * 
 */
package com.ss.sf.williamtraining.javadaythree;

import java.util.Scanner;
import java.io.File;

/**
 * @author William 
 * 
 * Constructs and prints list of file and directory names under directory user specifies via console.
 *       
 */
public class findFileNames {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome. Please specify the absolute path of the directory.");
			String userInput = sc.nextLine();
			File file = new File(userInput);
			File[] listOfNames = file.listFiles();
			System.out.println("Thank you. The file and directory names are:");
			for (int i = 0; i < listOfNames.length; i++) {
				System.out.println(listOfNames[i]);
			}
		} catch (NullPointerException npe) {
			System.out.println("There was a NullPointerException");
			npe.printStackTrace();
		}
	}
}