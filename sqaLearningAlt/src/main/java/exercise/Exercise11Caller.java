package exercise;

public class Exercise11Caller {
	
	public static void main(String args[]){
		Exercise11 ba1 = new Exercise11("Robert",300);
		Exercise11 ba2 = new Exercise11("James",560);
		Exercise11 ba3 = new Exercise11("Jack",765);
		Exercise11 ba4 = new Exercise11("Ben",245);
		Exercise11 ba5 = new Exercise11("Steve",650);
		//ba1.accountNumber;
		//ba1.getAccountNumbr();
		System.out.println("Account Number for ba1 " +ba1.getAcctNumber());
		System.out.println("Account Number for ba2 " +ba2.getAcctNumber());
		System.out.println("Account Number for ba3 " +ba3.getAcctNumber());
		System.out.println("Account Number for ba4 " +ba4.getAcctNumber());
		System.out.println("Account Number for ba5 " +ba5.getAcctNumber());
	}
}
