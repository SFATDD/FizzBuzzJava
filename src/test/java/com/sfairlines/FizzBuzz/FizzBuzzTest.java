package com.sfairlines.FizzBuzz;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	public void testNormal() {
		//assertTrue("it should return '1' when given 1", fizzBuzz.shout(1) == "1");
		System.out.println(fizzBuzz.shout(2));
		assertTrue("it should return '2' when given 2", fizzBuzz.shout(2).equals("2"));
	}
}
