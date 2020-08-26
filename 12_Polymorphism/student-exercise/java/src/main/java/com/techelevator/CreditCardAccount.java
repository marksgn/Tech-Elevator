package com.techelevator;

public class CreditCardAccount implements Accountable {

	private int debt = 0;
	private String accountHolder;
	private String accountNumber;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getDebt() {
		return debt;
	}
	
	public int pay(int amountToPay) {
		return debt = debt - amountToPay;
	}
	
	public int charge(int amountToCharge) {
		return debt = debt + amountToCharge;
	}

	@Override
	public int getBalance() {
		return -debt;
	}
	

}
