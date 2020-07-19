package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {

	@Test
	public void stringBitsTest() {
		
		/* so "Hello" yields "Hlo". 
		 * GetBits("Hello") → "Hlo" 
		 * GetBits("Hi") → "H" 
		 * GetBits("Heeololeo") → "Hello"
		 */
		
		assertEquals("Input: getBits(\"Hello\")", "Hlo", StringBits.getBits("Hello"));
		assertEquals("Input: getBits(\"Hi\")", "H", StringBits.getBits("Hi"));
		assertEquals("Input: getBits(\"Heeololeo\")", "Hello", StringBits.getBits("Heeololeo"));
	}
	
}
