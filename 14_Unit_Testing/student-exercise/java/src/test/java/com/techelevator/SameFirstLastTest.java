package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SameFirstLastTest {
	
	@Test
	public void sameFirstLastTest() {
		
		 /*IsItTheSame([1, 2, 3]) → false
		  * IsItTheSame([1, 2, 3, 1]) → true
		  * IsItTheSame([1, 2, 1]) → true
		  */
		
		assertEquals("Input: isItTheSame(new int[]{1, 2, 3})", false, SameFirstLast.isItTheSame(new int[]{1, 2, 3}));
		assertEquals("Input: isItTheSame(new int[]{1, 2, 3, 1})", true, SameFirstLast.isItTheSame(new int[]{1, 2, 3, 1}));
		assertEquals("Input: isItTheSame(new int[]{1, 2, 1})", true, SameFirstLast.isItTheSame(new int[]{1, 2, 1}));
	}

	
		
	}


