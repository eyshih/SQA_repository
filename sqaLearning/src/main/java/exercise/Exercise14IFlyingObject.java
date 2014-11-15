package exercise;

public interface Exercise14IFlyingObject {
	int maxSpeed = 400;
	int maxAltitude = 20000;
	
	void takeOff();
	void land();
	int capacity();
	int flyHigh();
	int currentAltitude();
}
