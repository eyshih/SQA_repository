package basic_learning;

public class HelloWorld {
	
	static String classVar = "Entering";
	
	public static void main(String args[]){
		String methodVar = " I am a method variable"; 
		System.out.println(classVar+" main");
		int myVariable = 2*2;
		System.out.println("Value of I is : "+myVariable);
		int callerValue = childFunction(2);
		System.out.println("Exiting main with value = "+callerValue);
	}	
	
	public static int childFunction(int myNum){				
		System.out.println(classVar+"childFunction");
		int myVariable = myNum*2;		
		System.out.println("returning from childFunction");
		return myVariable;
	}
}
