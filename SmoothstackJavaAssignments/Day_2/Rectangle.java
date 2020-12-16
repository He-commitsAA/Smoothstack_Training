/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

/**
 * @author William
 *	Implements Shape class for rectangles.
 */
public class Rectangle implements Shape {

	private double length, width;

	@Override
	public double calculateArea() {
		// Calculates area of the rectangle.
		double area = length * width;
		return area;
	}

	@Override
	public void display() {
		// Shows work to get to area of rectangle.
		System.out.printf("The area of this rectangle is %f * %f = %f\n", length, width, calculateArea());

	}

	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}

}
