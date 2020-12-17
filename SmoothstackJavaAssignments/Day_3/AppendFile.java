/**
 * 
 */
package com.ss.sf.williamtraining.javadaythree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * @author William Appends text to an existing file.
 *
 */
public class AppendFile {

	/**
	 * Appends text to file by taking file name and text to append with from the user.
	 */
	public static void main(String[] args) {

		System.out.println("Welcome. Please give the absolute path of the file to append.");
		Scanner sc = new Scanner(System.in);
		String userFile = sc.nextLine();
		System.out.println("What text would you like to append the file with?");
		String myText = sc.nextLine();
		sc.close();
		File file = new File(userFile);

		try (FileWriter writer = new FileWriter(file, true)) {
			writer.write("\n" + myText);
		} catch (IOException io) {
			System.out.println("There was an IOException.");
			io.printStackTrace();
		}
	}
}