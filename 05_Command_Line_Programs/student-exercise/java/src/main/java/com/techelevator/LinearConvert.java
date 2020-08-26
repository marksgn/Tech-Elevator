package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a length
		System.out.println("Enter a length: ");
		int num = Integer.parseInt(input.next());
		
		//prompt user for type of measurement
		System.out.println("Enter M for meters or F for feet: (This will be calculated into the opposite measurement)");
		String length = input.next();
		
		//converting
		if (length.equals("M") || length.equals("m")) {
			
			//meters to feet
			int measureF = (int) (num * 3.2808399);
			System.out.println(num + "m is equal to" + measureF + "ft");	
		}
		else if(length.equals("F") || length.equals("f")) {
			
			//feet to meters
			int measureM = (int) (num * 0.3048); 
			System.out.println(num + "ft is equal to " + measureM + "m");
		}

	}

}
