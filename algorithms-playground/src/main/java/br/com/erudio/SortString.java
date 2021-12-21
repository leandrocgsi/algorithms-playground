package br.com.erudio;

// https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
public class SortString {

	public String sortString(String string) {
		
		char temp;
		char arr[] = string.toCharArray(); 
        int i = 0;
        while (i <= arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        //Arrays.sort(arr);
		return new StringBuilder().append(arr).toString();
	}
}