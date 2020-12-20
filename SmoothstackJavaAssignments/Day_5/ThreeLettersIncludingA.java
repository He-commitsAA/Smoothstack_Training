/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author William
 * 
 *         Creates a list of Strings and returns a list of the Strings that have
 *         exactly 3 letters and start with the letter a.
 *
 */
public class ThreeLettersIncludingA {

	public static void main(String[] args) {

		List<String> allStrings = new ArrayList<>(
				Arrays.asList("ate", "eight", "are", "r", "ale", "ail", "hail", "Are"));

		List<String> selectStrings = allStrings.stream().filter(c -> c.length() < 4 && c.charAt(0) == 'a')
				.collect(Collectors.toList());

		for (String s : selectStrings) {
			System.out.println(s);
		}
	}
}