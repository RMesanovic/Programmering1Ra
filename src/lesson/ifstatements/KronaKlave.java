package lesson.ifstatements;


import java.util.Random;
import java.util.Scanner;


public class KronaKlave {

	public static void main(String[] args) {
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("V�lj sten sax eller p�se: ");
		String usersPick = usersGuess.nextLine().toLowerCase();
		
		
		
		
		Random randomGenerator = new Random();
		int coinFlipValue = randomGenerator.nextInt(3); 
		System.out.println(coinFlipValue);
		if (coinFlipValue == 0) {
			System.out.println("Sten");
		} else if (coinFlipValue == 1) {
			System.out.println("P�se");
		} else { 
			System.out.println("Sax"); 	
		}
		
		
		
		if (coinFlipValue == 0 && usersPick.equals("sax") || coinFlipValue == 1 && usersPick.equals("sten") || coinFlipValue == 2 && usersPick.equals("p�se")) {
			System.out.println("Sten ");
		} else if (coinFlipValue == 1 && usersPick.equals("p�se")){
			System.out.println("P�se ");
		}
		else { 
			System.out.println("Sax ");
			}
	}


}
