package inheritence;

public abstract class Shape {
	private String name;
	public int count = 10;
	
    public Shape (String name){
    		this.name = name;
    	}
            
    public String getName(){    		
    		return name;
    	}
         
    //GetArea method is not used here. 
    //We have to declare it just for compilers' sake.
    public abstract double getArea();
}
