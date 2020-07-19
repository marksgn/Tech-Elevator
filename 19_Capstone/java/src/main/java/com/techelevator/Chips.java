package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Item {
	//Chips class that extends Item class for name and price
		// has a get sound method to present the sound when item is purchased
	public Chips(String name, BigDecimal price) {
		super(name, price);
	}
	
	public String getSound() {
		return "Crunch Crunch, Yum!";
	}
}
