package com.techelevator.dog;

public class Dog {
	
	private boolean isSleeping;
	
	public Dog() {
		isSleeping = false;
	}
	
	public boolean isSleeping() {
		return isSleeping;
	}
	
	//Returns "Zzzzz..." if the dog is asleep. Returns "Woof!" if the dog is awake
	public String makeSound() {
		if (isSleeping) {
			return "Zzzzz...";
		}
		else {
			return "Woof!";
		}
	}
	
	//sets isSleeping to true
	public void sleep() {
		isSleeping = true;
	}
	public void wakeUp() {
		isSleeping = false;
	}
}
