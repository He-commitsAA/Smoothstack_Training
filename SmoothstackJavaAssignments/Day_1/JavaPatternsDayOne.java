/**
 * 
 */

/**
 * @author William
 *
 */
package com.ss.sf.williamtraining.one;

public class JavaPatternsDayOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		PatternMaker p = new PatternMaker();  //allows main method to use methods from PatternMaker class (see PatternMaker.java) in order to draw the pattern.
		int numPeriods = 9;

		System.out.println(p.makeHeader(1));
		for (int i = 1; i < 5; i++) {
			System.out.println(p.makeLine(0, i, 0));
		}

		System.out.println(p.makeDivider(numPeriods));
		numPeriods++;
		System.out.println();
		System.out.println(p.makeHeader(2));
		System.out.println(p.makeDivider(numPeriods));
		numPeriods++;
		for (int i = 1; i < 5; i++) {
			System.out.println(p.makeLine(0, 5 - i, 0));
		}

		System.out.println();
		System.out.println(p.makeHeader(3));
		for (int i = 0; i < 4; i++) {
			System.out.println(p.makeLine(5 - i, 2 * i + 1, 5 - i));
		}

		System.out.println(p.makeDivider(numPeriods));
		numPeriods++;
		System.out.println();
		System.out.println(p.makeHeader(4));
		System.out.println(p.makeDivider(numPeriods));
		numPeriods++;
		for (int i = 4; i > 0; i--) {
			System.out.println(p.makeLine(6 - i, 2 * i - 1, 6 - i));
		}
	}
}
