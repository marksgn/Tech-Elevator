package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Less20Test {
	
	@Test
	public void less20Test() {
		
		
		assertEquals("Input: Less20(18)", true , Less20.isLessThanMultipleOf20(18));
		assertEquals("Input: Less20(19)", true , Less20.isLessThanMultipleOf20(19));
		assertEquals("Input: Less20(20)", false , Less20.isLessThanMultipleOf20(20));
		
		
	}
	

}
