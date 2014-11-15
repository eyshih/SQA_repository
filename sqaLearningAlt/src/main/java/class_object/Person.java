package class_object;

public class Person {
	
	//Below are the properties/class variable/ instance variable/member variable
	private String name;
	private int age;
	private String ssn;
	
	//This is an example of a function / instance method / behavior of a class
	public void printName(){
		System.out.println("My name is : "+name);
	}	
	
	public static void main(String args[]){		
//		String str = new String();
//		str = "abc";
		String str = new String("abc");
		
		Person personObject = new Person();
		personObject.name = "myName";
		personObject.age = 12;
		personObject.ssn = "243-432-432";
		personObject.printName();
		System.out.println("Age is : "+personObject.age);
		System.out.println("ssn is : "+personObject.ssn);
		
		Person personObject2 = new Person();
		personObject2.name = "yourName";
		personObject2.age = 54;
		personObject2.ssn = "432-432-4323";
		personObject2.printName();
		System.out.println("Age is : "+personObject2.age);
		System.out.println("ssn is : "+personObject2.ssn);
	}
}
