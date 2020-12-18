/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

import java.lang.StringBuffer;

/**
 * @author William
 * 
 *         2 students (represented by StringBuffers) are studying in a library
 *         to "append()" to their knowledge before an exam. They get into a
 *         deadlock when they try to study from the same 2 books.
 *
 */
public class StudyingStudentsDeadlock {

	/**
	 * Runs threads to create a deadlock.
	 */
	public static void main(String[] args) {

		StringBuffer student1 = new StringBuffer("");
		StringBuffer student2 = new StringBuffer(""); // both StringBuffers start blank - the "students" know nothing

		final String french = "Good morning = Bonjour";
		final String spanish = "Hello = Hola"; // these represent the contents of the books the students are reading

		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (french) {
						student1.append(french);
						Thread.sleep(1000);
						synchronized (spanish) {
							student1.append(spanish);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (spanish) {
						student2.append(spanish);
						Thread.sleep(1000);
						synchronized (french) {
							student2.append(french);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(t1).start();
		new Thread(t2).start();

		System.err.println("Deadlock!");
		System.out.println("Student 1 could only learn " + student1);
		System.out.println("Student 2 could only learn " + student2);
	}
}