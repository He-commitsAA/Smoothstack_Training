/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

/**
 * @author William
 * 
 *         Contains a producer and consumer thread that communicate through an
 *         array.
 *
 */
public class ProducerConsumer {

	/**
	 * Runs the producer and consumer thread.
	 */
	public static void main(String[] args) {

		int capacity = 3;
		int[] dataBuffer = new int[capacity];

		/*
		 * Class that acts as both producer and consumer.
		 */

		class Worker {

			/*
			 * Adds data to the int array.
			 */

			public void produce(int[] myArray) throws InterruptedException {
				while (true) {
					synchronized (this) {
						while (myArray[0] == 1 && myArray[1] == 1 && myArray[2] == 1) {
							wait();
						}
						for (int i = 0; i < capacity; i++) {
							if (myArray[i] == 0) {
								myArray[i] = 1;
								System.out.println("Produced.");
								break;
							}
						}
						notify();
						Thread.sleep(1000);
					}
				}
			}

			/*
			 * Consumes data from the int array.
			 */

			public void consume(int[] myArray) throws InterruptedException {
				while (true) {
					synchronized (this) {
						while (myArray[0] == 0 && myArray[1] == 0 && myArray[2] == 0) {
							wait();
						}
						for (int i = capacity - 1; i >= 0; i--) {
							if (myArray[i] != 0) {
								myArray[i] = 0;
								System.out.println("Consumed.");
								break;
							}
						}
						notify();
						Thread.sleep(1000);
					}
				}
			}
		}

		Worker w = new Worker();

		Thread t1 = new Thread(new Runnable() {

			/*
			 * Runs the produce method.
			 */

			@Override
			public void run() {
				try {
					w.produce(dataBuffer);

				} catch (InterruptedException ie) {
					System.out.println("There was an InterruptedException.");
					ie.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			/*
			 * Runs the consume method.
			 */

			@Override
			public void run() {
				try {
					w.consume(dataBuffer);

				} catch (InterruptedException ie) {
					System.out.println("There was an InterruptedException.");
					ie.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();

	}

}