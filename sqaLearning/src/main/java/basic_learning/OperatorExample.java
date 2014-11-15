package basic_learning;

public class OperatorExample {
	
	public static void main(String args[]){
		int a = 6;
		int b = 5;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("******Arithmatic operator starts******");
		System.out.println(a +" add "+b+" = "+add);
		System.out.println(a +" sub "+b+" = "+sub);
		System.out.println(a +" mul "+b+" = "+mul);
		System.out.println(a +" div "+b+" = "+div);
		System.out.println(a +" mod "+b+" = "+mod);
		System.out.println("******Arithmatic operator ends******");
		
		System.out.println("******Assignment operator starts******");
		//a = a + 5;
		a += 5;		
		System.out.println("Value of a is now " +a);
		// b = a +5;
		b += a;
		System.out.println("Value of b is now " +b);
	}
}
