package br.com.erudio;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

// https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
class ArrayReverterTest {

	static ArrayReverter reverter;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		reverter = new ArrayReverter();
	}

	@Test
	void testReverseArrayOfNumbers() {
		
		Integer arr[] = { 1, 2, 3, 4, 5, 6 };
		
		Integer expected[] = { 6, 5, 4, 3, 2, 1 };
		
		var reversed = reverter.reverseArray(arr, 0, 5);
	
		Assertions.assertArrayEquals(
				expected,
				Arrays.asList(reversed).toArray(new Integer[0]));
	}
	
	@Test
	void testReverseArrayOfNumbersByPosition() {
		
		Integer arr[] = { 1, 2, 3, 4, 5, 6 };
		
		Integer expected[] = { 1, 2, 3, 6, 5, 4 };
		
		var reversed = reverter.reverseArray(arr, 3, 5);
		
		Assertions.assertArrayEquals(
				expected,
				Arrays.asList(reversed).toArray(new Integer[0]));
	}
	
	@Test
	void testReverseArrayOfStrings() {
		String strArray[] = "Hello World".split("");
		
		var reversed = reverter.reverseArray(strArray, 0, 10);
		
		Assertions.assertArrayEquals(
				"dlroW olleH".split(""),
				Arrays.asList(reversed).toArray(new String[0]));	
	}

	@Test
	void testReverseArrayOfStringsByPosition() {
		
		String strArray[] = "Hello World".split("");
		
		var reversed = reverter.reverseArray(strArray, 6, 10);
		
		Assertions.assertArrayEquals(
				"Hello dlroW".split(""),
				Arrays.asList(reversed).toArray(new String[0]));	
	}
}
