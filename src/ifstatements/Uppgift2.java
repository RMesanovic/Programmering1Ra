/** 2. Write Java program to allow the user to input his/her age. Then the program will show 
 *    if the person is eligible to vote. A person who is eligible to vote must be older than 
 * or equal to 18 years old.
 */


package ifstatements;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner userScanner = new Scanner(System.in);

		for (;;) {

			System.out.println("Hur gammal är du?");

			int userNumber = userScanner.nextInt();

			if (userNumber == 18 || userNumber > 18) {
				System.out.println("You can vote my friend");

			} else {
				System.out.println("Fuck off");
			}

		}

	}
}
