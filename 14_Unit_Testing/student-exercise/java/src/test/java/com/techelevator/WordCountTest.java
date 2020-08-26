package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

import junit.framework.Assert;

public class WordCountTest {

	
	WordCount wordCountTest = new WordCount();
	String [] input;
	
	@SuppressWarnings("deprecation")
	@Test
	public void string_array_is_successful() {
		Map<String, Integer> output = new HashMap<String, Integer>();
		output.put("ba",2);
		output.put("black", 1);
		output.put("sheep", 1);
		Assert.assertEquals(output,  WordCount.getCount(input = new String [] {"ba", "ba", "black", "sheep"}));
		Assert.assertNotNull(null, WordCount.getCount(null));
	}
}
