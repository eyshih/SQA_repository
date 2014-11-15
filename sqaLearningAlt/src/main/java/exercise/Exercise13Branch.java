package exercise;

public class Exercise13Branch extends Exercise13Bank {

	private String branchName;
	private String branchAddress;
	
	public Exercise13Branch(String bankAddress, int totalEmployees, double balance, String branchName,
			String branchAddress) {
		super(bankAddress, totalEmployees, balance);
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}

	public Exercise13Branch() {}

	@Override
	public double withdrawMoney(double y) {
		System.out.println("Made withdrawl from Branch. New balance: "+(this.getBalance()-y));
		return this.getBalance() - y;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}	
}