package bankaccountapp;

public class Savings extends Account {
	// List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the savings properties
	public Savings(String name, String social, double initDeposit) {
		super(name, social, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");
		
	}
	
	// List any methods specific to savings account

}