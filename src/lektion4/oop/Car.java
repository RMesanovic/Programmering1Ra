package lektion4.oop;

public class Car {
	private int numberofDoors = 5; 
	private int numberOfWheels= 0;
	private String color = "purple";
	private int antaletRattar = 1;
	private String carBrand = "Dingo";
	private int speed = 0;
	
	
	
	public void setSpeed (int newSpeed) {
		speed = newSpeed; 
	}
	public int getSpeed() {
		return speed;
		
	}
}
