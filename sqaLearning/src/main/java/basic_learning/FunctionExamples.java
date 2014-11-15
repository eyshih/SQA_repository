package basic_learning;

public class FunctionExamples {
	public static void main(String[] args) {
		int sum = calcSum(2,2);
		System.out.println("Value one is : "+sum);
		
		int value2 = calcSum(3,65);
		System.out.println("Value two is : "+value2);
		
		printName("Java");
		printName("Apple");
	}
	
	
	public static int calcSum(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public static void printName(String str){
		System.out.println("name is : "+str);
	}

}
