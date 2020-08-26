package com.techelevator;

public class SavingsAccount extends BankAccount {
	
		private int serviceCharge = 2;
		
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw > getBalance()) {
			return getBalance();
			
		} else if ((getBalance() - amountToWithdraw) < 150) { 
			super.withdraw(amountToWithdraw + serviceCharge);
			
		} else if (getBalance() > 150) {
			super.withdraw(amountToWithdraw);
		}
		return getBalance();

	}
	
	

	
	
	
	
}
