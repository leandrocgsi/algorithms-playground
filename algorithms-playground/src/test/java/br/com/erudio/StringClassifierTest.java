package br.com.erudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

// https://www.geeksforgeeks.org/classify-strings-from-an-array-using-custom-hash-function/
public class StringClassifierTest {

	private static StringClassifier stringClassifier;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		stringClassifier = new StringClassifier();
	}

	@Test
	void testGetStringHashValue() {
		Assertions.assertEquals(15, stringClassifier.getStringHashValue("for"));
		Assertions.assertEquals(7, stringClassifier.getStringHashValue("geeks"));
	}
	
	@Test
	void testGetStringHashValueWithAleatoryWords() {
		Assertions.assertEquals(13, stringClassifier.getStringHashValue("adf"));
		Assertions.assertEquals(9, stringClassifier.getStringHashValue("aahe"));
		Assertions.assertEquals(12, stringClassifier.getStringHashValue("bce"));
		Assertions.assertEquals(9, stringClassifier.getStringHashValue("bgdb"));
	}

	@Test
	void testCategorisationOfstrings() {
		String[] array = { "geeks", "for", "geeks" };
		Vector<String> vector = new Vector<String>(Arrays.asList(array));

		Map<Integer, Vector<String>> classifiedStrings = stringClassifier.classifyStrings(vector);
		Assertions.assertEquals("{7=[geeks, geeks], 15=[for]}", classifiedStrings.toString());
	}
	
	@Test
	void testCategorisationOfstringsWithAleatoryWords() {
		String[] array = {"adf", "aahe", "bce", "bgdb"};
		Vector<String> vector = new Vector<String>(Arrays.asList(array));
		
		Map<Integer, Vector<String>> classifiedStrings = stringClassifier.classifyStrings(vector);
		Assertions.assertEquals("{9=[aahe, bgdb], 12=[bce], 13=[adf]}", classifiedStrings.toString());
	}
	
	@Test
	void testCategorisationOfstringsInArrayList() {
		String[] array = {"adf", "aahe", "bce", "bgdb"};
		Vector<String> vector = new Vector<String>(Arrays.asList(array));
		
		ArrayList<String> classifiedStrings = stringClassifier.classifyStringsAsArrayList(vector);
		Assertions.assertEquals("[aahe, bgdb, bce, adf]", classifiedStrings.toString());
	}

}
