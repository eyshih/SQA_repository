package exercise;

public class Exercise20UniqueCountry {
	public static void main(String args[]){
		Exercise19Country[] duplicateCountryArr = new Exercise19Country[10];
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
		duplicateCountryArr[0]=can1;
		duplicateCountryArr[1]=can2;
		duplicateCountryArr[2]=usa1;
		duplicateCountryArr[3]=usa2;
		duplicateCountryArr[4]=ita1;
		duplicateCountryArr[5]=ita2;
		duplicateCountryArr[6]=esp1;
		duplicateCountryArr[7]=esp2;
		duplicateCountryArr[8]=eng1;
		duplicateCountryArr[9]=eng2;
		
		Exercise19Country[] uniqueCountryArr = new Exercise19Country[5];
		int arrayIndex=0;
		Exercise19Country prevCountry = null;
		for(int i=0; i<10; i++){
			if(i == 0){
				uniqueCountryArr[arrayIndex] = duplicateCountryArr[i];
				prevCountry = uniqueCountryArr[i];
				arrayIndex++;
				continue;				
			}else{
				Exercise19Country currentCountry = duplicateCountryArr[i];
				if(!prevCountry.equals(currentCountry)){
					uniqueCountryArr[arrayIndex] = currentCountry;
					arrayIndex++;
					prevCountry = currentCountry;
					continue;
				}
			}
			System.out.println("Going to next step");
		}
		System.out.println("Printing main array with size of : "+duplicateCountryArr.length);
		for(Exercise19Country country : duplicateCountryArr){
			System.out.println("Country code is " +country.getCountryCode());
		}
		System.out.println("--------------------------------------------");
		System.out.println("Printing unique array with size of :"+uniqueCountryArr.length);
		for(Exercise19Country country : uniqueCountryArr){
			System.out.println("Country code is " +country.getCountryCode());
		}
	}
}
