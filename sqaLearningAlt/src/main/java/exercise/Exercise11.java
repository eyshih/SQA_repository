package exercise;

public class Exercise11 {
	
	private String acctHolderName;
	private int acctNumber;
	private int initialAmount;
	
	private static int incrementAccount;
	
	public Exercise11(String acctHolderName, int initialAmount){		
		this.acctHolderName = acctHolderName;		
		this.initialAmount = initialAmount;
		//this is a static variable. which will be shared across all the objects
		//Every time constructor will get called, this value
		// will be incremented by 1.
		incrementAccount++;
		this.acctNumber = incrementAccount;
	}	

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}

	public int getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}

	public int getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}	
}
