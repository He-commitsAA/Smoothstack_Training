/**
 * 
 */
package com.ss.sf.williamtraining.javaendweekone;

/**
 * @author William
 * 
 *         Run group sum clump test on integers.
 *
 */
public class Recursion {

	/**
	 * Runs group sum clump test, using helper methods as needed.
	 */
	public static void main(String[] args) {

		System.out.print(groupSumClump(0, new int[] { 2, 8, 4 }, 10));

	}

	/*
	 * Runs group sum clump algorithm.
	 */
	public static boolean groupSumClump(int start, int[] numbers, int target) {

		if (start == numbers.length) {
			return false;
		}
		
		int next = start;

		int total = 0;
		for(int i = 0; i <=start; i++) {
			total += numbers[i];
//			System.out.print(total+ " ");
		}
		/*
		 * System.out.print("Total: "+total); System.out.print("Target: "+target);
		 */
		if (total == target) {
			return true;
		}

		if (target == 0) {
			return true;
		}

		/*
		 * do { target -= numbers[start+1]; }while (start < numbers.length-1 &&
		 * numbers[start] == numbers[start+1]);
		 */


		 while(start < numbers.length-1 && numbers[start] == numbers[start+1]) { 
			 System.out.print("while");
			 total += numbers[start+1]; 
			 start++; }

		if (start < numbers.length - 1) {
			next++;
		} else {
			return false;
		}

		if(groupSumClump(next, numbers, target)) {
			return true;
		}

		return false;
	}

}
