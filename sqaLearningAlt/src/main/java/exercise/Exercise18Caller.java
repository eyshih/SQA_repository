package exercise;

public class Exercise18Caller {
	
	public static void main(String args[]){
		Exercise18DBOps mySQl = new Exercise18MySQLDBOps();
		Exercise18DBOps oracle = new Exercise18OracleDBOps();
		
		System.out.println(mySQl.update());
		System.out.println(oracle.update());
	}
}
