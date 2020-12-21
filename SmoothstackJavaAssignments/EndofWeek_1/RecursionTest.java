package com.ss.sf.williamtraining.javaendweekone;
/**
 * 
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
/**
 * @author William
 *	Tests Recursion.java
 */
public class RecursionTest {
	
	/*
	 * tests groupSumClump().
	 */
	
	@Test
	public void groupSumClumpTest() {
		assertEquals(true, Recursion.groupSumClump(0, new int[] {2,10,4},12));
		assertEquals(true, Recursion.groupSumClump(0, new int[] {0,0,0},0));
		assertNotEquals(true, Recursion.groupSumClump(0, new int[] {2,12,4}, 19));
	}

}
