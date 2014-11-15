package exercise;

public class Exercise19CountryCaller {

	public static void main (String args[]) {
	
		Exercise19Country can1 = new Exercise19Country ("CAN", "Canada", 35540419, "CN Dollar");
		Exercise19Country can2 = new Exercise19Country ("CAN", "Canada", 35500000, "Looney");
		Exercise19Country usa1 = new Exercise19Country ("USA", "United States", 319072000, "US Dollar");
		Exercise19Country usa2 = new Exercise19Country ("USA", "United States", 319072000, "Buck");
		Exercise19Country ita1 = new Exercise19Country ("ITA", "Italy", 60783711, "Euro");
		Exercise19Country ita2 = new Exercise19Country ("ITA", "Italia", 60780000, "Lira");
		Exercise19Country esp1 = new Exercise19Country ("ESP", "Spain", 46507760, "Euro");
		Exercise19Country esp2 = new Exercise19Country ("ESP", "Espana", 46500000, "Peseta");
		Exercise19Country eng1 = new Exercise19Country ("ENG", "England", 64105654, "Pound");
		Exercise19Country eng2 = new Exercise19Country ("ENG", "United Kingdom", 64105654, "Lb");
				
		printOut(can1, can2);
		printOut(usa1, usa2);
		printOut(ita1, ita2);
		printOut(esp1, esp2);
		printOut(eng1, eng2);				
	}
	
	public static void printOut(Exercise19Country cnt1, Exercise19Country cnt2) {
		System.out.println(cnt1.getCountryCode()+" == "+cnt2.getCountryCode()+" is: "+(cnt1 == cnt2));
		System.out.println(cnt1.getCountryCode()+" .equals() "+cnt2.getCountryCode()+" is: "+(cnt1.equals(cnt2)));
		System.out.println("**************************************");
	}
}
