/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author William
 *
 *         Tests Lambdas.java
 */
public class LambdasTest {

	/*
	 * Tests oddOrEven()
	 */
	@Test
	public void oddOrEvenTest() {
		assertEquals("EVEN", Lambdas.oddOrEven().apply(2000));
		assertEquals("ODD", Lambdas.oddOrEven().apply(15));
		assertNotEquals("ODD", Lambdas.oddOrEven().apply(0));
	}

	/*
	 * Tests isItPrime()
	 */
	@Test
	public void isItPrimeTest() {
		assertEquals("NEITHER PRIME NOR COMPOSITE", Lambdas.isItPrime().apply(1));
		assertEquals("PRIME", Lambdas.isItPrime().apply(37));
		assertEquals("COMPOSITE", Lambdas.isItPrime().apply(100));
	}

	/*
	 * Tests isPalindrome()
	 */
	@Test
	public void isPalindromeTest() {
		assertEquals("PALINDROME", Lambdas.isPalindrome().apply(373));
		assertNotEquals("PALINDROME", Lambdas.isPalindrome().apply(201));
		assertEquals("NOT PALINDROME", Lambdas.isPalindrome().apply(100));
	}

}