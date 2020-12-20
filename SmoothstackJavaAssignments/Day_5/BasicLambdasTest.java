/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.sf.williamtraining.javadayfive.BasicLambdas.Utils;

/**
 * @author William
 * 
 *         Tests BasicLambdas.java
 *
 */
public class BasicLambdasTest {

	/*
	 * tests eSort() method.
	 */
	@Test
	public void eSortTest() {
		assertEquals(-1, Utils.eSort("eat", "tire"));
		assertEquals(-1, Utils.eSort("eat", "food"));
		assertNotEquals(-1, Utils.eSort("food", "eat"));
	}

}
