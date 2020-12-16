/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

/**
 * @author William 
 * 
 * Implements Shape interface for triangles.
 */
public class Triangle implements Shape {

	private double base, height;

	@Override
	public double calculateArea() {
		// Calculates triangle area.
		double area = (base * height) / 2;
		return area;
	}

	@Override
	public void display() {
		// Shows work to get triangle area.
		System.out.printf("The area of this triangle is (1/2) * %f * %f = %f\n", base, height, calculateArea());
	}
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

}
