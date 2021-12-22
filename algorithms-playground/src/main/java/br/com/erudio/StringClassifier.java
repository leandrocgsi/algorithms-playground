package br.com.erudio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class StringClassifier {

	public int getStringHashValue(String word) {

		int alphabetSize = 26;
		int hashValue = 0;
		char charsArray[] = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			hashValue = (hashValue + (charsArray[i])) % alphabetSize;
		}
		return hashValue;
	}

	public Map<Integer, Vector<String>> classifyStrings(Vector<String> arr) {

		Map<Integer, Vector<String>> mp = new HashMap<>();
		
		for (int i = 0; i < arr.size(); i++) {

			int temp = getStringHashValue(arr.get(i));

			if (mp.containsKey(temp)) {
				mp.get(temp).add(arr.get(i));
			} else {
				mp.put(temp, new Vector<String>());
				mp.get(temp).add(arr.get(i));
			}
		}
		return mp;
	}
	
	public ArrayList<String> classifyStringsAsArrayList(Vector<String> arr) {
		
		ArrayList<String> stringsAsArrayList = new ArrayList<String>();
		Map<Integer, Vector<String>> mp = classifyStrings(arr);
		for (Map.Entry<Integer, Vector<String>> entry : mp.entrySet()) {
			for (String str : entry.getValue()) {
				stringsAsArrayList.add(str);
			}
		}
		return stringsAsArrayList;
	}

	public static Map<Integer, Vector<String>> printClassifiedVector(Map<Integer, Vector<String>> mp) {
		for (Map.Entry<Integer, Vector<String>> entry : mp.entrySet()) {
			for (String str : entry.getValue()) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		return mp;
	}

	/*public static void main(String[] args) {
		String[] array = { "adf", "aahe", "bce", "bgdb" };
		Vector<String> vector = new Vector<String>(Arrays.asList(array));
		
		Map<Integer, Vector<String>> classifiedStrings = classifyStrings(vector);
		printClassifiedVector(classifiedStrings);
	}*/
}