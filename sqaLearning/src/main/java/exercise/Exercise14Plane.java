package exercise;

public class Exercise14Plane implements Exercise14IFlyingObject {
	
	private int currentAlt = 0;
	
	
	public void takeOff() {
		System.out.println("Plane taking off now");
	}

	
	public void land() {
		System.out.println("Plane landing now");

	}

	
	public int capacity() {
		return 50;
	}

	public int currentAltitude(){
		return currentAlt;
	}
		
	public int flyHigh() {
		currentAlt += 10000;
		//currentAlt = currentAlt + 10000;
		System.out.println("Plane flying at : "+currentAlt+" now");
		return currentAlt;
	}

}
