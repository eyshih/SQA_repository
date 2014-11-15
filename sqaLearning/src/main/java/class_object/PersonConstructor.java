package class_object;

public class PersonConstructor {
	//Below are the properties/class variable/ instance variable/member variable		
		private String name;		
		private int age;
		private String ssn;
		
		public PersonConstructor(){		
			System.out.println("This is from default constructor");
		}
		
		public PersonConstructor(String name, int age, String ssn){
			this.name = name;
			this.age = age;
			this.ssn = ssn;
		}
		
		public PersonConstructor(String name, int age){
			this(name,age,null);
		}
		
		public PersonConstructor(String name){
			this(name,0,null);		
		}
		
		//This is an example of a function / instance method / behavior of a class
		public void printName(){
			System.out.println("My name is : "+name);
		}	
		
		public static void main(String args[]){			
			
			PersonConstructor objDefConstr = new PersonConstructor();
			System.out.println("Creating objects with overloaded constructors *****");
			PersonConstructor personObject = new PersonConstructor("myName",23);			
			personObject.printName();
			System.out.println("Age is : "+personObject.age);			
			
			PersonConstructor personObject2 = new PersonConstructor("yourName",534);			
			personObject2.printName();
			System.out.println("Age is : "+personObject2.age);			
		}
}
