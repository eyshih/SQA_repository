package exercise;

public class Exercise21StringFlip {

	public static void main (String args[]) {
		System.out.println(flipIt("paralyze"));		
	}

	public static String flipIt(String input) {
		int inLen = input.length();
		char[] output = new char[inLen];		
		if (inLen < 2) {
			return input;
		}
		else {
			for (int i=0; i<inLen; i++) {
				output[i] = input.charAt(inLen-1-i);
			}
		}

		String temp = "";
		for (int j=0; j<inLen; j++) {
			temp+=output[j];
		}
		return temp;
	}
}
