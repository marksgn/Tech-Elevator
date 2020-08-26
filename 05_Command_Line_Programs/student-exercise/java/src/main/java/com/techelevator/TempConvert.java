package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a temperature
		System.out.println("Enter a temperature: ");
		int num = Integer.parseInt(input.next());
		
		//prompt user for type of temperature
		System.out.println("Enter C for Celsius or F for Fahrenheit: ");
		String temp = input.next();
		
		//converting 
		if (temp.equals("C") || temp.equals("c")) {
			
			//Celsius to Fahrenheit 
			int degreeF = (int) (num * 1.8 + 32);
			System.out.println(num + "C is equal to " + degreeF + "F");
			}
		
			//Fahrenheit to Celsius
		else if(temp.equals("F") || temp.equals("f")) {
			int degreeC = (int) ((num - 32) / 1.8);
			System.out.println(num + "F is equal to " + degreeC + "C");
			
			}
		
		else {
			System.out.println("An error has occured");
			}
		}
		
		
	//System.out.format("Total Bill: $%.2f \n", totalBill);

	}

