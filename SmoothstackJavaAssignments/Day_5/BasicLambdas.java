/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import java.util.Arrays;
import java.lang.Character;

/**
 * @author William
 * 
 *         Uses some basic lambda expressions to manipulate an array of Strings
 *
 */
public class BasicLambdas {

	/**
	 * Sorts arrays, using method in Utils as needed.
	 */
	public static void main(String[] args) {

		String[] words = { "banana", "eat", "at", "doughnut", "christmas" };

		Arrays.sort(words, (word1, word2) -> word1.length() - word2.length());
		System.out.println("Sorted alphabetically by shortest to longest:");
		for (String i : words) {
			System.out.println(i);
		}
		System.out.println();

		Arrays.sort(words, (word1, word2) -> -(word1.length() - word2.length()));
		System.out.println("Sorted alphabetically by longest to shortest:");
		for (String i : words) {
			System.out.println(i);
		}
		System.out.println();

		Arrays.sort(words, (word1, word2) -> Character.compare(word1.charAt(0), word2.charAt(0)));
		System.out.println("Sorted alphabetically by first character only:");
		for (String i : words) {
			System.out.println(i);
		}
		System.out.println();

		Arrays.sort(words, (word1, word2) -> word2.indexOf('e', 0) - word1.indexOf('e', 0));
		System.out.println("Sorted with items containing letter e listed first:");
		for (String i : words) {
			System.out.println(i);
		}
		System.out.println();

		Arrays.sort(words, (word1, word2) -> Utils.eSort(word1, word2));
		System.out.println("Sorted using helper method with items containing letter e listed first:");
		for (String i : words) {
			System.out.println(i);
		}
		System.out.println();
	}

	/*
	 * Class with static eSort method to help with last example above.
	 */
	static class Utils {
		
		/*
		 * Helps main method above sort for words with letter e in them.
		 */
		public static int eSort(String word1, String word2) {
			if (word1.indexOf('e') >= 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}