package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "456789123", 2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		
		System.out.println("**********************************");
		
		chkacc1.showInfo();
		
		
		
		// Read a CSV file then create new accounts based on that data

	}

}
