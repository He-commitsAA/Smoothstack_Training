/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

/**
 * @author William
 *
 */
public class LineTest {
	
	Line tester = new Line(1,2,3,4);
	Line tester2 = new Line(1,1,3,3);
	Line tester3 = new Line (2,3,4,5);

	@Test
	public double getSlopeTest() {
		assertEquals(1, tester.getSlope(), 0.0001);
		assertNotEquals(2, tester.getSlope(), 0.0001);
	}
	
	@Test
	public double getDistanceTest() {
		assertEquals(Math.sqrt(2), tester.getDistance(), 0.0001);
		assertEquals(Math.sqrt(8), tester2.getDistance(), 0.0001);
	}
	
	@Test
	public boolean parallelToTest(Line l) {
		assertNotEquals(true, tester.parallelTo(tester2));
		assertEquals(true, tester.parallelTo(tester3));
	}
	
}
