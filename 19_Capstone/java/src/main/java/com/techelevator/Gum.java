package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {
	//Gum class that extends Item class for name and price
		// has a get sound method to present the sound when item is purchased
	public Gum(String name, BigDecimal price) {
		super(name, price);
	}
	
	public String getSound() {
		return "Chew Chew, Yum!";
	}

}
