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
		System.out.println("NAME: " + name + " SOCIAL: " + social + " balance: " + balance);
		
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
	}
	
	// Set account number
	
	private String setAccountNumber() {
		String lastTwoOfSocial = social.substring(social.length()-2, social.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSocial + uniqueID + randomNumber;
	}
	
	// List common methods 
	private void deposit() {
		
	}
	
	private void withdraw() {
		
	}
	
	private void transfer() {
		
	}
	
	private String showInfo() {
		return "Ok";
	}
}
