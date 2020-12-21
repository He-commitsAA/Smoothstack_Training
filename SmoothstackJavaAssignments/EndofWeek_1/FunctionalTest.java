/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author William
 * 
 * Tests Functional.java
 *
 */
public class FunctionalTest {
	
	/*
	 * Tests rightDigitTest()
	 */
	@Test
	public void rightDigitTest() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3)),Functional.rightDigit(new ArrayList<Integer>(Arrays.asList(1, 12, 113))));
		assertEquals(new ArrayList<Integer>(Arrays.asList(0, 0, 0)),Functional.rightDigit(new ArrayList<Integer>(Arrays.asList(0, 10000, 11000000))));
		assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1, 1)),Functional.rightDigit(new ArrayList<Integer>(Arrays.asList(221801, 618741, 3424321))));
	}
	
	/*
	 * Tests doubling()
	 */
	@Test
	public void doublingTest() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(20, 200, 2000)),Functional.doubling(new ArrayList<Integer>(Arrays.asList(10, 100, 1000))));
		assertEquals(new ArrayList<Integer>(Arrays.asList(0, 0, 0)),Functional.doubling(new ArrayList<Integer>(Arrays.asList(0, 0, 0))));
		assertEquals(new ArrayList<Integer>(Arrays.asList(70, -50, 200)),Functional.doubling(new ArrayList<Integer>(Arrays.asList(35, -25, 100))));
	}
	
	/*
	 * Tests noX()
	 */
	
	@Test
	public void noXTest() {
		assertEquals(new ArrayList<String>(Arrays.asList("a","bb","c")),Functional.noX(new ArrayList<String>(Arrays.asList("ax", "bb", "cx"))));
		assertEquals(new ArrayList<>(Arrays.asList("y","b","")),Functional.noX(new ArrayList<String>(Arrays.asList("xy", "bx", "x"))));
		assertNotEquals(new ArrayList<>(Arrays.asList(" ","","")),Functional.noX(new ArrayList<String>(Arrays.asList("x", "x", "x"))));
	}
	

}
