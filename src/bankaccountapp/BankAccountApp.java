package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		String file = "C:\\Users\\ldila\\Downloads\\NewBankAccounts.csv";
		
		/*Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "456789123", 2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		
		System.out.println("**********************************");
		
		chkacc1.showInfo();*/
		
		
		
		// Read a CSV file then create new accounts based on that data
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String social = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, social, initDeposit));
			}
			else if (accountType.equals("Checking")){
				accounts.add(new Checking(name, social, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		

		
		for(Account acc : accounts) {
			System.out.println("\n*********************");
			acc.showInfo();
			
		}
	}

}
