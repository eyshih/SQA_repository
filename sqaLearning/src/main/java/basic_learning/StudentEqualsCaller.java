package basic_learning;

public class StudentEqualsCaller {
	
	public static void main(String args[]){
		StudentEqualsExample s1 = new StudentEqualsExample(1,"Roy",3);
		StudentEqualsExample s2 = new StudentEqualsExample(1,"Roy",3);
			
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		System.out.println("s1 == s2 = "+(s1 == s2));
	}			
}
