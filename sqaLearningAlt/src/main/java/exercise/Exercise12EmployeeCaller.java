package exercise;

public class Exercise12EmployeeCaller {
	public static void main(String args[]){
		
		Exercise12Employee emp1 = new Exercise12Employee();
		Exercise12Employee emp2 = new Exercise12Employee(1000,
				4,"male","Robert",34);
		
		System.out.println("Properties of emp1 are : ");
		System.out.println("IdNum : "+emp1.getIdNum()+"\n expYear : "+emp1.getExpYear()
				+"\n gender : "+emp1.getGender()+"\n name : "+emp1.getName()+"\n age : "+emp1.getAge());
		
		System.out.println("Properties of emp2 are : ");
		System.out.println("IdNum : "+emp2.getIdNum()+"\n expYear : "+emp2.getExpYear()
				+"\n gender : "+emp2.getGender()+"\n name : "+emp2.getName()+"\n age : "+emp2.getAge());
	}
}
