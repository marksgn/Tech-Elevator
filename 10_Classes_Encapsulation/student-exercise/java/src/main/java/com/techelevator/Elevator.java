package com.techelevator;

public class Elevator {

	private int currentLevel = 1; //gets the current floor that the elevator is on
	private int numberOfFloors;
	private boolean doorIsOpen; // 
	
	
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	public void openDoor() {
		doorIsOpen = true;
	}
	
	public void closeDoor() {
		doorIsOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if (doorIsOpen != true) {
			if(desiredFloor <= numberOfFloors) {
				if(desiredFloor > currentLevel) {
					currentLevel = desiredFloor;
				}
			}
		}
	}
	
	public void goDown(int desiredFloor) {
		if(doorIsOpen != true) {
			if(desiredFloor >= 1) {
				if(desiredFloor < currentLevel) {
					currentLevel = desiredFloor;
				}
			}
		}
	}
	
	public int getCurrentFloor() {
		return currentLevel;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return doorIsOpen;
	}
	
}
