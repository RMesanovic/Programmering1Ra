package lektion5.konstruktorer;

public class CarGame {

	public static void main(String[] args) {
		Car dingo = new Car ("pink");
		
		System.out.println(dingo.getSpeed());
		
		dingo.setSpeed(7000);
		
		System.out.println(dingo.getSpeed());
		
		
		

	}

}
