package com.techelevator;

import java.math.BigDecimal;

public class Beverage extends Item {
	//Beverage class that extends Item class for name and price
	// has a get sound method to present the sound when item is purchased
	public Beverage(String name, BigDecimal price) {
		super(name, price);
	}
	
	public String getSound() {
		return "Glug Glug, Yum!";
	}
}
