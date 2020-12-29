package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
    String social;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String social, double initDeposit) {
		this.name = name;
		this.social = social;
		balance = initDeposit;
		
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	// Set account number
	
	private String setAccountNumber() {
		String lastTwoOfSocial = social.substring(social.length()-2, social.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSocial + uniqueID + randomNumber;
	}
	
	// List common methods 
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance + 
				"\nRate: " + rate + "%"
				);
	}
}
