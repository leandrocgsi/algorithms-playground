package br.com.erudio;

import java.lang.reflect.Array;
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
	
	@Test
	void testReverseArrayOfStringsByPosition2() {
		
		String strArray[] = "Hello olleH".split("");
		
		var reversed = reverter.reverseArray(strArray, 6, 10);
		
		Assertions.assertArrayEquals(
				"Hello Hello".split(""),
				Arrays.asList(reversed).toArray(new String[0]));	
	}
	
	@Test
	void testReverseArrayOfStringsByPosition3() {
		
		
		Integer arrayA[] = { 1, 2, 3, 4, 5, 6 };
		
		Integer arrayB[] = { 7, 8, 9, 10 };
		Integer expected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aLength = arrayA.length;
		int bLength = arrayB.length;

	    Integer[] fusion = (Integer[]) Array.newInstance(Integer.class, aLength + bLength);
	    System.arraycopy(arrayA, 0, fusion, 0, aLength);
	    System.arraycopy(arrayB, 0, fusion, aLength, bLength);
		
		Assertions.assertArrayEquals(
				expected,
				Arrays.asList(fusion).toArray(new Integer[0]));	
	}
}
