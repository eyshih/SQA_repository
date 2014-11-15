package inheritence;

public class Triangle extends Shape{
	private float base;
	private float height;		
	
	public Triangle(String name, float base, float height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		double area = (0.5) * getBase() * getHeight();
		return area;
	}		

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}		
}
