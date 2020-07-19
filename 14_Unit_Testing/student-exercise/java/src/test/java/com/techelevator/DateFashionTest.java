package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateFashionTest {

	
	@Test
	public void dateFashionTest() {
		
		assertEquals("Input: DateFashion (5, 10)", 2, DateFashion.getATable(5, 10));
		assertEquals("Input: DateFashion (5, 2)", 0, DateFashion.getATable(5, 2));
		assertEquals("Input: DateFashion (5, 5)", 1, DateFashion.getATable(5, 1));
		
	}
	
}
