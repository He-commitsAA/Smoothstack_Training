/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author William
 *
 */
public class LineTest {

	Line tester = new Line(1, 2, 3, 4);
	Line tester2 = new Line(1, 1, 3, 3);
	Line tester3 = new Line(2, 3, 4, 5);

	/*
	 * testing getSlope()
	 */

	@Test
	public void getSlopeTest() {
		assertEquals(1, tester.getSlope(), 0.0001);
		assertNotEquals(2, tester.getSlope(), 0.0001);
	}

	/*
	 * testing getDistance()
	 */
	@Test
	public void getDistanceTest() {
		assertEquals(Math.sqrt(8), tester.getDistance(), 0.0001);
		assertEquals(Math.sqrt(8), tester2.getDistance(), 0.0001);
	}

	/*
	 * testing parallelTo()
	 */
	@Test
	public void parallelToTest() {
		assertNotEquals(false, tester.parallelTo(tester2));
		assertEquals(true, tester.parallelTo(tester3));
	}
}