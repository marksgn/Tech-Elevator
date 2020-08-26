package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//prompt user to enter an integer
		System.out.println("Enter an integer:");
		int max = Integer.parseInt(input.nextLine());
		
		int prev2 = 0;
		int prev1 = 1;
		System.out.print("The Fibonacci sequence leading up to " + max + " is " + prev2 + " " + prev1 + " ");
		
		int currentValue = prev2 + prev1;
		
		while (currentValue <= max) {
			System.out.print(currentValue + " ");
			prev2 = prev1;
			prev1 = currentValue;
			currentValue = prev1 + prev2;
		}
		
	
	
	
	//prompt user for a number
		//read that in as a string strMax
		//convert that strMax t oin max
	
		
		
	
		/*int max = 25;
		
		//0,1,1,2,3,5,8...
		int previous2 = 0;
		int previous1 = 1;
		//print out the first 2
		
		int currentValue = previous2 + previous1
		
		//previous2, previous1, currentVAlue,
		
		//do a loop - while
		while (currentValue <= max) {
			//print current value
		*/	
			//reset previous2 and previous 1 to move on to the next one
			//0,1,1
			//1,1,2
			
			//recalculate current value
		}
	
	
	
}
