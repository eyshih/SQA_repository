package static_example;

public class BicycleSeller {

	public static void main(String[] args) {
		//printMessage();
		printStaticMessage();
		Bicycle bike1 = new Bicycle("black",9);
		Bicycle bike2 = new Bicycle("blue",3);
		Bicycle bike3 = new Bicycle("orange",0);
		Bicycle bike4 = new Bicycle("green",2);
		Bicycle bike5 = new Bicycle("white",6);
		
		//Calling the static variable
		System.out.println(Bicycle.totalNumOfBikes);
		System.out.println(Bicycle.getTotalNumOfBikes());

		//Calling the static method.
		System.out.println(bike1.getTotalNumOfBikes());			
	}
	
	public void printMessage(){
		System.out.println("fdsajkfsadjflkads;fj");
		printStaticMessage();
	}
	
	public static void printStaticMessage(){
		System.out.println("This is a static method");
		String str = new String("this is a utility example");
		Math.abs(-42.43);
	}

}
