
/**
 * 
 */

/**
 * @author William
 *
 */

import java.util.*;

public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tries = 5;
		Random randomizer = new Random();
		int x = randomizer.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! Can you guess the number between 1-100?");
		int guess;

		do {
			guess = sc.nextInt();
			tries--;
			if (x - 10 <= guess && guess <= x + 10) {
				break;
			} else if (tries > 0) {
				System.out.printf("That's not it! Keep trying. You have %d guesses left.\n", tries);
			} else {
				System.out.print("Sorry ");
			}
		} while (tries > 0);

		System.out.print(x);
	}
}
