package basic_learning;

public class StringExample {
	
	public static void main(String args[]){
		//String literal uses the same object from String pool
		String str1 = "Test1"; // this is using java string literals
		
		//Below creates a new object in memory every time it is used.
		String str2 = new String ("Test1"); // this is java standard way of objects
		String str4 = "Test1";
		String str3 = new String ("Test1"); // this is java standard way of objects		
		
		System.out.println("Testing string pool for str1 and str4 : "+ (str1 == str4));
		
		//Below "==" compares the memory address
		System.out.println("Comparing references of str1 and str2 : "+ (str1 == str2));

		//Below .equals compares the values of string
		System.out.println("Comparing values of str1 and str2 : "+str1.equals(str2));
				
		System.out.println("Testing value equality for str1 and str4 : "+str1.equals(str4));
		
		System.out.println("Testing value equality for str2 and str3 : "+str2.equals(str3));
		System.out.println("Testing value equality for str2 and str3 : "+str2 == str3);
		
	}
}
