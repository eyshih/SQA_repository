package inheritence;

public class Fruit {  

	public String pub = "FruitPublic";  
	String def = "FruitDefault";  
	protected String pro = "FruitProtected";  
	private String pri = "FruitPrivate";  

	public String name() {  
		return "Fruit";  
	}  

	public void contains() {  
		System.out.println("I contains a number of fruits in me !");  
	}  

	private void myPrivateMethod() {  
		System.out.println("This is for me only, no one can change my definition !");  
	}  

	protected void myProtectedMethod() {  
		System.out.println("This is for me and my subclasses only !");  
	}  

	void defaultScope() {  
		System.out.println("I am in defult scope of 'Fruit' class !");  
	}  

	public static void iAmStatic() {  
		System.out.println("I am static to Fruit");  
	}  

	public final void iAmFinal() {  
		System.out.println("I am final to Fruit");  
	}  

	public static final void iAmStaticFinal() {  
		System.out.println("My final part protects me from being ovverriden or hiding !");  
	}  
}  


