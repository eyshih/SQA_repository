package inheritence;
/*
 * Rules for interface:
 * i) interface is the keyword
 * ii) All member variables are public static final by default. i.e. if you define
 * any variable you have to provide a value.
 * iii) All the methods/functions are public abstract by default. You only have
 * to provide 
 * 	a) return type
 * 	b) name of the method
 * 	c) parameter list if applicable
 * for e.g. String myMethod(int number);
 */
public interface IBusiness {	
	
	final String CURRENCY = "USD";
	
	abstract boolean isOpen();	
	int getCapacity();
	String getContactInfo();	
}
