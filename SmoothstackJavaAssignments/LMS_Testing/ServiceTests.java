/**
 * 
 */
package com.ss.sf.lms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 *
 */
public class ServiceTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Librarian libby = new Librarian();
		List<String> stringsA = new ArrayList<>(Arrays.asList("A", "B", "C"));
		List<String> stringsOne = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
		libby.makeMenu(stringsA);
		libby.makeMenu(stringsOne);

	}

}
