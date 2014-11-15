package inheritence;

public class Car extends Vehicle{
	private int engineCap;
	private boolean isFourWheel;
	protected String source = "car";
	String name = "myCar";
	
	public Car(){		
		System.out.println("This is from Car");
		this.engineCap = 3;
	}
	
	public Car(int engineCap, boolean isFourWheel, int maxSpeed, 
			String color, String model){
		super(maxSpeed, color, model);		
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("This is from Car overloaded");
	}
	
	@Override
	public void run(){
		System.out.println("My car is running");
		super.source = "vechileFromCar";
		super.getColor();
	}

	public static void main(String args[]){
		//Car myCar1 = new Car();
		Car myCar1 = new Car(5,true,20,"blue","Nisan");
		String color = myCar1.getColor();
		String model = myCar1.getModel();			
		int myCap = myCar1.getEngineCap();
		System.out.println("color is : "+color+", model is : "+model
				+ " and engineCap is : "+myCap);
		myCar1.run();
		
		Vehicle vh = new Vehicle();
		vh.run();
		
		//Overriden methods are always called from objects not from reference
		Vehicle car = new Car();
		car.run();
		//Overriden properties are always called from reference not objects
		String overridenProper = car.source;
		System.out.println(overridenProper);
	}	
	
	public int getEngineCap() {
		return engineCap;		
	}
	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}
	public boolean isFourWheel() {
		return isFourWheel;
	}
	public void setFourWheel(boolean isFourWheel) {
		this.isFourWheel = isFourWheel;
	}
}
