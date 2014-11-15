package exercise;

public class Exercise10Caller {
	
	public static void main(String args[]){
		
		//Directly calling the method within sysout
		System.out.println("Output of add is " + Exercise10.add(2, 2));
				
		int sub = Exercise10.sub(4, 2);
		System.out.println("Output of sub is "+sub);
		
		int mul = Exercise10.mul(3, 2);
		System.out.println("Output of sub is "+mul);
		
		int div = Exercise10.div(4, 2);
		System.out.println("Output of sub is "+div);
	}
}
