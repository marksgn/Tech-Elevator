package com.techelevator;

import java.math.BigDecimal;
	//Candy class that extends Item class for name and price
	// has a get sound method to present the sound when item is purchased
public class Candy extends Item {

	public Candy(String name, BigDecimal price) {
		super(name, price);
	}
	
	public String getSound() {
		return "Munch Munch, Yum!";
	}
	
	
}
