/**
 * 
 */
package com.ss.sf.williamtraining.javadayfive;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author William
 *	Tests OddEven.java
 */
public class OddEvenTest {
	
	/*
	 * Tests oddOrEven() method.
	 */
	@Test
	public void oddOrEvenTest() {
		assertEquals("e2,",OddEven.oddOrEven(2));
		assertEquals("o1,",OddEven.oddOrEven(1));
		assertNotEquals("e3,",OddEven.oddOrEven(3));
	}

}
