package exercise;

public class Exercise9 {
	
	private String name;
	private String taste;
	private String color;		
	
	public Exercise9(){
		//this is redundant step
		this(null,null,null);
		System.out.println("just calling the main constructor from no args const.");
	}
	
	public Exercise9(String name){		
		this(name, null, null);
		System.out.println("just calling the main constructor from 1 args const.");
	}
	
	public Exercise9(String name, String taste){		
		this(name, taste, null);		
		System.out.println("just calling the main constructor from 2 args const.");
	}
	
	public Exercise9(String name1, String taste, String color){
		System.out.println("This is where initialization happens");
		this.name = name1;
		this.taste = taste;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {		
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;		
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
}
