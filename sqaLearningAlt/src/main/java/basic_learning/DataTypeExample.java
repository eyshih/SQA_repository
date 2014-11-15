package basic_learning;

public class DataTypeExample {
	
	public static void main(String args[]){
		char varChar = 'a';
		boolean varBoolean = false;
		byte varByte = 127;
		short varShort = 12;
		int varInt = 4;
		long varLong = 244312;
		float varFloat = 5.0f;		
		double varDouble = 543.34;
		String stringPart1 = "Value of ";
		String stringPart2 = " is : ";		
		
		System.out.println(stringPart1+" char"+stringPart2+varChar);		
		System.out.println("Value of boolean is : "+varBoolean);
		System.out.println("Value of byte is : "+varByte);
		System.out.println("Value of short is : "+varShort);
		System.out.println("Value of int is : "+varInt);
		System.out.println("Value of long is : "+varLong);
		System.out.println("Value of float is : "+varFloat);
		System.out.println("Value of double is : "+varDouble);
	}

}
