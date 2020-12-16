/**
 * 
 */

/**
 * @author William
 *
 */
package com.ss.sf.williamtraining.one;

public class PatternMaker {

	public String makeHeader(int n) {

		String header = n + ")";
		return header;
	}

	public String makeLine(int a, int b, int c) {

		String line = "";

		line += new String(new char[a]).replace("\0", " ");
		line += new String(new char[b]).replace("\0", "*");
		line += new String(new char[c]).replace("\0", " ");

		return line;

	}

	public String makeDivider(int m) {

		String divider = new String(new char[m]).replace("\0", ".");
		return divider;
	}
}
