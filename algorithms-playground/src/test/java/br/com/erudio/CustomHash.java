package br.com.erudio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CustomHash {

	// Function to find the hash
	// value of the string s
	static int getStringHashValue(String s) {

		// Stores hash value of string
		int hashValue = 0;
		int n = s.length();
		char C[] = s.toCharArray();

		// Iterate over characters of the string
		for (int i = 0; i < n; i++) {

			// Calculate hash value
			hashValue = (hashValue + (C[i])) % 26;
		}

		// Return the hash value
		return hashValue;
	}

	// Function to classify the strings
	// according to the given condition
	static void categorisationOfstrings(Vector<String> s, int N) {

		// Maps strings with their strings
		// respective hash values
		Map<Integer, Vector<String>> mp = new HashMap<>();

		// Traverse the array of strings
		for (int i = 0; i < N; i++) {

			// Find the hash value of the
			// of the current string
			int temp = getStringHashValue(s.get(i));

			// Push the current string in
			// value vector of temp key
			if (mp.containsKey(temp)) {
				mp.get(temp).add(s.get(i));
			} else {
				mp.put(temp, new Vector<String>());
				mp.get(temp).add(s.get(i));
			}
		}

		// Traverse over the map mp
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

		categorisationOfstrings(arr, N);
	}
}