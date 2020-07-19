package com.techelevator.calculator;

public class Calculator {

	//current calculated data
	private int result;
	
	//Adds added to result and returns the current value of result.
	public int add(int added) {
		return result += added;
	}
	
	//Multiplies current result by multiplier and returns the current value of result.
	public int multiply(int multiplier) {
		return result *= multiplier;
	}
	
	//Raises result to power of exponent. Negative exponents should use the absolute value. 
	//Returns the current value of result
	public int power(int exponent) {
		return (result = (int) Math.pow(result, exponent));
	}
	
	//reset result to 0
	public void reset() {
		result = 0;
	}
	
	//	Subtracts subtrahend from the current value of result and returns 
	//the current value of result.
	public int subtract(int subtrahend) {
		return result -= subtrahend;
	}
	
	//getter
	public int getResult() {
		return result;
	}
	
	
	
}
