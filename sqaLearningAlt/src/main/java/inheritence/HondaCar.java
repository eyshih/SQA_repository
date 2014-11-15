package inheritence;


public class HondaCar extends Car{
	
	public HondaCar(int maxSpeed, String color, String model){
		//super(maxSpeed, color, model);		
	}
	
	public String getCarInfo(){
		//maxSpeed, color and model
		System.out.println("Car max Speed is: ");
		int maxSpeed = super.getMaxSpeed();				
		return "abc";
	}
}
