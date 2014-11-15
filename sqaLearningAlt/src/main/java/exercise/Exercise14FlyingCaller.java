package exercise;

public class Exercise14FlyingCaller {
	
	public static void main(String args[]){
		Exercise14IFlyingObject ob1 = new Exercise14Plane();
		Exercise14IFlyingObject ob2 = new Exercise14Chopper();
		System.out.println("Flying plane now.....");
		operate(ob1);
		System.out.println("-----------------------------");
		System.out.println("Flying chopper now.....");
		operate(ob2);
	}
	
	public void add(int a, int b){
		System.out.println(a + b);
	}
	
	public static void operate(Exercise14IFlyingObject ob){
		while(true){
			if(ob.currentAltitude() < Exercise14IFlyingObject.maxAltitude){
				ob.flyHigh();
			}else{
				ob.land();
				break;
			}
		}
	}
}
