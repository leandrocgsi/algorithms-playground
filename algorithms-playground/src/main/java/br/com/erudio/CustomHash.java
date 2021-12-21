package br.com.erudio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CustomHash {

	static int getStringHashValue(String word) {

		int alphabetSize = 26;
		int hashValue = 0;
		char charsArray[] = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			hashValue = (hashValue + (charsArray[i])) % alphabetSize;
		}
		return hashValue;
	}

	static void categorisationOfstrings(Vector<String> arr) {

		// Maps strings with their strings
		// respective hash values
		Map<Integer, Vector<String>> mp = new HashMap<>();

		// Scroll through the array of strings
		for (int i = 0; i < arr.size(); i++) {

			// Find the hash value of the
			// of the current string
			int temp = getStringHashValue(arr.get(i));

			// Push the current string in
			// value vector of temp key
			if (mp.containsKey(temp)) {
				mp.get(temp).add(arr.get(i));
			} else {
				mp.put(temp, new Vector<String>());
				mp.get(temp).add(arr.get(i));
			}
		}

		// Scroll through the map mp
		for (Map.Entry<Integer, Vector<String>> entry : mp.entrySet()) {

			// Print the result
			for (String str : entry.getValue()) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {
		String[] Sarr = { "adf", "aahe", "bce", "bgdb" };
		Vector<String> arr = new Vector<String>(Arrays.asList(Sarr));
		int N = arr.size();

		categorisationOfstrings(arr);
	}
}