/**
 * 
 */
package com.ss.sf.williamtraining.javadaythree;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;

/**
 * @author William
 * 
 *         Counts the number of times a character specified in the command line
 *         appears in a file.
 *
 */
public class CharacterCount {

	/**
	 * Counts the number of times the first character in the command line appear in
	 * a file.
	 */
	public static void main(String[] args) {

		char[] fromArgs = args[0].toCharArray();
		char myChar = fromArgs[0];

		System.out.println("Please give the absolute path of the file you would like to search.");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		sc.close();
		File file = new File(userInput);
		String thisLine = "";
		int count = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while ((thisLine = reader.readLine()) != null) {
				for (int i = 0; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == myChar) {
						count++;
					}
				}
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("There was a FileNotFoundException.");
			fnf.printStackTrace();
		} catch (IOException io) {
			System.out.println("There was an IOException.");
			io.printStackTrace();
		}
		System.out.printf("Done! There were %d instances of the character %c in your file.", count, myChar);
	}
}