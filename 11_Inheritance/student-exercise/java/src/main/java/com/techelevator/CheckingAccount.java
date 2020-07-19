package com.techelevator;

public class CheckingAccount extends BankAccount {

	//checking account is a subclass of BankAccount
	
	private int overdraftFee = 10;
	
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}

	public int withdraw(int amountToWithdraw) { 
		if ((getBalance() - amountToWithdraw) < -100) {
			return getBalance();
			
		}else if ((getBalance() - amountToWithdraw) < 0) {
			super.withdraw(amountToWithdraw + overdraftFee);
			
		}else if ((getBalance() - amountToWithdraw) > 0) {
			super.withdraw(amountToWithdraw);
			
		}return getBalance();
	}
	
}
