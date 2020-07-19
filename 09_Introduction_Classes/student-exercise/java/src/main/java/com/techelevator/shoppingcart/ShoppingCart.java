package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public ShoppingCart() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
		//empty();
	}
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	
	//to do getting for totalAmountOwed
	
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	//methods
	
	//return the result of totalAmountOwed / totalNumberOfItems
	public double getAveragePricePerItem() {
		//make sure that totalNumberOfItems > 0 before your try to divide
		return (totalNumberOfItems == 0) ? 0.0 : (totalAmountOwed / totalNumberOfItems);
	}
	
	//updates TotalNumberOfItems and increase totalAmountOwed by (pricePerItem * numberOfItems)
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems += numberOfItems;
		totalAmountOwed += (pricePerItem * numberOfItems);
		//so if I add (1, 2.50) then totalNumberOfItems increases by 1 and totalAmountOwed increases by 2.50
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
	}
	
}
