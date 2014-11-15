package inheritence;

public class Vehicle {
	private int maxSpeed;
	private String color;
	private String model;
	protected String source = "vehicle";
		
	public Vehicle(){
		System.out.println("This is from Vehicle()");
	}
	
	public Vehicle(int maxSpeed, String color, String model){	
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.model = model;
		System.out.println("This is from overloaded Vehicle");
	}	
	
	public void run(){
		System.out.println("My Vehcile is Running");
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}	
}
