package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lucky13Test {
	
	@Test
	public void lucky13Test() {

		assertEquals("Input: getLucky(new int[]{0, 2, 4})", true , Lucky13.getLucky(new int[]{0, 2, 4}));
		assertEquals("Input: getLukcy(new int[]{1, 2, 3})", false , Lucky13.getLucky(new int[]{1, 2, 3}));
		assertEquals("Input: getLucky(new int[]{1, 2, 4})",false , Lucky13.getLucky(new int[]{1, 2, 4}));
	
	}
	
}
