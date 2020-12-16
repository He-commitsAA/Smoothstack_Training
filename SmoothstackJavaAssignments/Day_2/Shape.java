/**
 * 
 */
package com.ss.sf.williamtraining.javadaytwo;

/**
 * @author William
 * 
 * Interface to be implemented by Rectangle, Circle, Triangle classes.
 *
 */
public interface Shape {

	public double calculateArea(); // calculates shape area. Returns double because area of circle must be double.

	public void display(); // displays work to get to shape area.

}
