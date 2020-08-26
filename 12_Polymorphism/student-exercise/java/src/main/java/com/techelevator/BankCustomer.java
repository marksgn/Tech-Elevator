package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	public BankCustomer() {
		super();
	}
	
	private String name;
	private String address;
	private String phoneNumber;

	private List<Accountable> accounts = new ArrayList<Accountable>();

	/*public BankCustomer (String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;				DON'T DO THIS^!!!!!
		this.phoneNumber = phoneNumber;
	}*/
	
	public Accountable[] getAccounts() {
		return accounts.toArray(new Accountable[accounts.size()]);
	}
	
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}
	
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean isVip() {
		int allAccounts = 0;
		for (Accountable customerAccount: accounts) {
			allAccounts += customerAccount.getBalance();
		}
		return allAccounts >= 25000;
		
	}
}
