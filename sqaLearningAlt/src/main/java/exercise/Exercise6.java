package exercise;

public class Exercise6 {

	public static void main(String[] args) { 
		String[] ctryNameArr = new String[]{"US"," England","Ge rmany","France ","Italy"};
		printCountryName(ctryNameArr);
	}
	
	public static void printCountryName(String[] ctryNames){
		for(String ctryName : ctryNames){
			if(ctryName.length() > 3){
				System.out.println(ctryName.trim().substring(0,3).toLowerCase());
				//String trimmedName = ctryName.trim();
				//String subString = trimmedName.substring(0,3);
				//String lowerString = subString.toLowerCase();
			}			
		}
		
//		for(int i=0; i<ctryNames.length; i++){
//			String ctryName = ctryNames[i];
//			System.out.println(ctryName.substring(0,3));
//		}
	}
}
