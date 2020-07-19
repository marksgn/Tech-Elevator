package com.techelevator;

public class Airplane {

	private String planeNumber; //gets the size character plane number
	private int bookedFirstClassSeats; //gets the number of already booked first class seats
	private int totalFirstClassSeats; //gets the number of total first class seats
	private int bookedCoachSeats; //gets the number of already booked coach seats
	private int totalCoachSeats; //gets the number of total coach seats
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		if (planeNumber.length() == 6) {
			this.planeNumber = planeNumber;
		}
	
		this.totalFirstClassSeats = totalFirstClassSeats; //
		this.totalCoachSeats = totalCoachSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass == true) {
			if(totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
				bookedFirstClassSeats += totalFirstClassSeats;
				return true;
			} else {
				return false;
				}
		}
		else {
			if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
				bookedCoachSeats += totalCoachSeats;
				return true; 
			} else {
				return false;
				}
		}
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
}
