package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void frontTimesTest() {
		
		/* "frontTimes("Chocolate", 2) → "ChoCho" 
		 * frontTimes("Chocolate", 3) → "ChoChoCho" 
		 * frontTimes("Abc", 3) → "AbcAbcAbc"
		 */
		
		assertEquals("Input: FrontTimes(\"Chocolate\", 2)", "ChoCho", FrontTimes.generateString("Chocolate", 2));
		assertEquals("Input: FrontTimes(\"Chocolate\", 3)", "ChoChoCho", FrontTimes.generateString("Chocolate", 3));
		assertEquals("Input: FrontTimes(\"Abc\", 3)", "AbcAbcAbc", FrontTimes.generateString("Abc", 3));
		
	}
	
}
