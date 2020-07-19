package com.techelevator;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class AnimalGroupNameTest {

	@Test
	public void return_and_get_group_name() {
		
		AnimalGroupName myGroupName = new AnimalGroupName();
		/*the animal name should be case insensitive so "elephant", is "elephant", and "ELEPHANT" should all return "herd"
		 * if the name of the animal is not found, or empty, return "unkown"
		*/
		Assert.assertEquals("Crash", myGroupName.getHerd("rhino"));
		Assert.assertEquals("Herd", myGroupName.getHerd("Lion"));
		Assert.assertEquals("unknown", myGroupName.getHerd("walrus"));
		Assert.assertEquals("Crash", myGroupName.getHerd("rhino".toLowerCase()));
		Assert.assertEquals("unknown", myGroupName.getHerd("elephants"));
		Assert.assertEquals("Crash", myGroupName.getHerd("Rhino"));
		Assert.assertEquals("unknown", myGroupName.getHerd(""));
	}
	
}
