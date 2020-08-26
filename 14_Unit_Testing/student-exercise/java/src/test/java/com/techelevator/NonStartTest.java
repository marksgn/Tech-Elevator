package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonStartTest {

	@Test
	public void nonStartTest() {
		
		assertEquals("Input: getPartialString(\"Hello\", \"There\")", "ellohere", NonStart.getPartialString("Hello", "There"));
		assertEquals("Input: getPartialString(\"java\", \"code\")", "avaode", NonStart.getPartialString("java", "code"));
		assertEquals("Input: getPartialString(\"shotl\", \"java\")", "hotlava", NonStart.getPartialString("shotl", "java"));
		
	}
	
}
