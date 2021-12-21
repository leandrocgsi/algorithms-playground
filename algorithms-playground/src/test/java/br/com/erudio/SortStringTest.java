package br.com.erudio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SortStringTest {

	private static SortString sortString;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sortString = new SortString();
	}

	@Test
	void test() {
		String arrayStr = sortString.sortString("geeksforgeeks");

		Assertions.assertEquals("eeeefggkkorss", arrayStr);
	}

}
