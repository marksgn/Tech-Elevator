package com.techelevator;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxEnd3Test {

	
	@Test
	public void MaxEnd3Test() {
		
		/*MakeArray([1, 2, 3]) → [3, 3, 3]
		 * MakeArray([11, 5, 9]) → [11, 11, 11]
		 * MakeArray([2, 11, 3]) → [3, 3, 3]
		 */
		
		assertArrayEquals("Input: makeArray(new int[]{1, 2, 3})", new int[]{3, 3, 3}, MaxEnd3.makeArray(new int[]{1, 2, 3}));
		assertArrayEquals("Input: makeArray(new int[]{11, 5, 9})", new int[]{11, 11, 11}, MaxEnd3.makeArray(new int[]{11, 5, 9}));
		assertArrayEquals("Input: makeArray(new int[]{2, 11, 3})", new int[]{3, 3, 3}, MaxEnd3.makeArray(new int[]{2, 11, 3}));
	}
}
