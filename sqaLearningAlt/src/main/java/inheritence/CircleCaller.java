package inheritence;

public class CircleCaller {
	public static void main(String args[]){
		//It is recommended and good practice to use Type of super class 
		Shape myCircle = new Circle("blueCircle",5);
		Shape myTriangle = new Triangle("redTriangle",4,5);
		
		
//		System.out.println("Area of "+myCircle.getName()+" is "+myCircle.getArea());
//		System.out.println("Area of "+myTriangle.getName()+" is "+myTriangle.getArea());
		Shape[] shpArr = new Shape[]{myCircle, myTriangle};
		
		for(Shape sh : shpArr){
			System.out.println("Area of : " +sh.getName() + " is  : "
					+sh.getArea());
		}
	}
}
