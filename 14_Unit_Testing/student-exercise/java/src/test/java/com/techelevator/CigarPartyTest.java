package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CigarPartyTest {

	@Test
	public void cigarParty() {
		
		assertEquals("Input: haveParty(30, false)", false, CigarParty.haveParty(30, false));
		assertEquals("Input: haveParty(50, false)", true, CigarParty.haveParty(50, false));
		assertEquals("Input: haveParty(70, true)", true, CigarParty.haveParty(70, true));
	}
	
	
}
