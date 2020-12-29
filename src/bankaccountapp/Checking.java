package bankaccountapp;

public class Checking extends Account {
	// List the properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String social, double initDeposit) {
		super(name, social, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	// List any methods specific to the checking account
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card Pin: " + debitCardPin 
				);
	}
}
