package lektion5.konstruktorer;

public class Car {
	private int numberofDoors = 5; 
	private int numberOfWheels= 0;
	private String color = "purple";
	private int antaletRattar = 1;
	private String carBrand = "Dingo";
	private int speed = 0;
	
	/**
	 * Konstruktor för Bil classen. 
	 * Sätter färgen på bilen vid skapande. 
	 */
	public Car(String selectedColor) {
		color = selectedColor; 
	}
	
	public void setSpeed (int newSpeed) {
		speed = newSpeed; 
	}
	public int getSpeed() {
		return speed;
		
	}
	
	public void setColor(String newColor) {
		color = newColor;
		
	}
	public String getColor ( ) {
		return color;
	}

	
	
}
