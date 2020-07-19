package com.techelevator;

public class BankAccount {

	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	
	/*A new bank account requires an account holder name and account number. 
	 * The balance defaults to a 0 dollar balance if not specified.
	 */
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	/*A new bank account requires an account holder name and account number. 
	 * The balance is initialized to the dollar balance given.
	 * */
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	/*adds amountToDeposit to the current balance
	and returns the new balance of the bank account
	*/
	public int deposit(int amountToDeposit) { 
		if (amountToDeposit > 0) {
			balance = balance + amountToDeposit;
		}
		return balance;
	}
	
	/*subtracts amountToWithdrwa from the current balance
	 and return the new balance of the bank account. 
	 */
	public int withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;
		return balance;

}
	
												
	
	
	
}
