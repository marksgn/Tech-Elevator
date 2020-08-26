package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		//enter values 460 8218 1 31313 987654321
		
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a series of decimal integer values
		System.out.println("Please enter a series of decimal integer values (seperated by spaces): ");	
		
		
		String userInput = input.nextLine();
		String [] decimalSeriesArray = userInput.split(" ");
		int binary = 0;
		
		for (int i = 0; i < decimalSeriesArray.length; i++) {
			int decimal = Integer.parseInt(decimalSeriesArray[i]);
			System.out.print(decimal + " in binary is ");
			
			decimalToBinary(decimal);
			System.out.println(" ");
		}
	}
		public static void decimalToBinary(int decimal){
			
			int binary[] = new int[40];
			int index = 0;
			
			while (decimal > 0){
				
				binary[index++] = decimal % 2 ;
				decimal = decimal / 2;						
			}
			for(int i = index-1;i >= 0;i--){
			       System.out.print(binary[i]);
		

	}
}
}
