package basic_learning;

public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Java class are funny";
		String str2 = "are they really?";

		System.out.println(str1.lastIndexOf('s'));
		int length = str1.length();
		System.out.println("length of str1 is : "+length);

		String subStr1 = str1.substring(1,length);
		System.out.println("Substring of str1 is : "+subStr1);

		int indexStr2 = str2.indexOf("b");
		System.out.println("Index of ' are' in str2 is : "+indexStr2);
	}

}
