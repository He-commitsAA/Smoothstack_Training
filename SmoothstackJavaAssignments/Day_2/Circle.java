/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

import java.lang.Math;

/**
 * @author William
 *	Implements Shape interface for circles.
 */
public class Circle implements Shape {

	private double radius;

	@Override
	public double calculateArea() {
		// Calculates area of circle.
		double area = Math.PI * radius * radius;
		return area;
	}

	@Override
	public void display() {
		// Shows work to get to area of circle.
		System.out.printf("The area of this circle is pi * %f * %f = %f\n", radius, radius, calculateArea());
	}

	public Circle(double r) {
		this.radius = r;
	}

}
