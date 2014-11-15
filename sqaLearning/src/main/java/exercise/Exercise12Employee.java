package exercise;

public class Exercise12Employee extends Exercise12Person{
	private int idNum;
	private int expYear;
	
	public Exercise12Employee(){	}
	
	public Exercise12Employee(int idNum, int expYear, String gender,
			String name, int age){
		super(gender, name, age);
		this.idNum = idNum;
		this.expYear = expYear;		
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	
	
}
