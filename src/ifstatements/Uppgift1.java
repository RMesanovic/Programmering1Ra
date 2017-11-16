/**
 * 
 * 1. Prompt the user for a number and print good if the number is between 8 & 10 or 
 *   greater than 33. Otherwise, print bad. Use the || operator in your if statement.
 */

package ifstatements;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		Scanner userScanner = new Scanner(System.in);

		for (;;) {

			System.out.println("Skriv ett jävla nummer: ");

			int userNumber = userScanner.nextInt();

			if (userNumber > 8 && userNumber < 10 || userNumber > 33) {
				System.out.println("Good");

			} else {
				System.out.println("Bad");
			}

		}

	}
}
