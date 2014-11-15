package static_example;

public class Bicycle {
	
	private String color;
	private int gear;
	public static int totalNumOfBikes;		
	
	public Bicycle(String color, int gear){
		this.color=color;
		this.gear = gear;
		totalNumOfBikes++;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public static int getTotalNumOfBikes() {
		return totalNumOfBikes;
	}
	
	public static void setTotalNumOfBikes(int numOfBike) {
		//this.totalNumOfBikes = numOfBike;
		Bicycle.totalNumOfBikes = numOfBike;
	}	
}
