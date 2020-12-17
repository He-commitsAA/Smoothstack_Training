/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

/**
 * @author William Creates a 2D array and then finds the maximum value in that
 *         array, along with its position.
 */
public class ArrayMax {

	/**
	 * Constructs array and finds array's maximum value and the value's position.
	 */
	public static void main(String[] args) {
		findMax(arrayFill());
	}

	/*
	 * Constructs 2D array and fills it with int values.
	 */
	public static int[][] arrayFill() {
		int[][] newArray = new int[2][5];
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[0].length; j++) {
				newArray[i][j] = i + j;
			}
		}
		return newArray;
	}

	/*
	 * Finds the maximum value in a given 2D array and prints the value and its position.
	 */
	public static void findMax(int[][] myArray) {
		int max = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[0].length; j++) {
				if (myArray[i][j] > max) {
					max = myArray[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.printf("The maximum value in the array is %d, at [%d][%d].", max, row, col);
	}
}
