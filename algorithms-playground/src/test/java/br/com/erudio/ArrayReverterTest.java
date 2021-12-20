package br.com.erudio;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArrayReverterTest {

	static ArrayReverter reverter;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		reverter = new ArrayReverter();
	}

	@Test
	void testReverseArrayOfNumbers() {
		
		Integer arr[] = { 1, 2, 3, 4, 5, 6 };
		String strArr[] = "Hello World".split("");
		
		printArray(arr, 6);
		reverseArray(arr, 0, 5);
	
		System.out.print("Reversed array is \n");
		printArray(arr, 6);
		
		
		printArray(strArr, 11);
		reverseArray(strArr, 0, 10);
		
		System.out.print("Reversed array is \n");
		printArray(strArr, 10);		
	}
	
	@Test
	void testReverseArrayOfStrings() {
		fail("Not yet implemented");
		
		Integer arr[] = { 1, 2, 3, 4, 5, 6 };
		String strArr[] = "Hello World".split("");
		
		printArray(arr, 6);
		reverseArray(arr, 0, 5);
		
		System.out.print("Reversed array is \n");
		printArray(arr, 6);
		
		
		printArray(strArr, 11);
		reverseArray(strArr, 0, 10);
		
		System.out.print("Reversed array is \n");
		printArray(strArr, 10);		
	}

	@Test
	void testPrintArray() {
		fail("Not yet implemented");
	}

}
