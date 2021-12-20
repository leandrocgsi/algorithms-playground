package br.com.erudio;

public class ArrayReverter {

	public Object[] reverseArray(Object arr[], int start, int end) {
		
		Object temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	/*if (start >= end)
    return arr;
	temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	reverseArray(arr, start+1, end-1);*/
	
	/*
	 * Utility that prints out an array on a line
	 */
	/*static void printArray(Object arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6 };
		String strArr[] = "Hello World".split("");
		
		printArray(arr, 6);
		reverseArray(arr, 0, 5);
	
		System.out.print("Reversed array is \n");
		printArray(arr, 6);
		
		
		printArray(strArr, 11);
		reverseArray(strArr, 0, 10);
		
		System.out.print("Reversed array is \n");
		printArray(strArr, 11);		
	}*/
}
