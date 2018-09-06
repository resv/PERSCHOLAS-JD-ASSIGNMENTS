package sort_ALGORITHMS;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int[] arr = {3, 7, 2, 9, 1, 6, 10, 4, 50, 49, 33, 8, 8, 25, 26, 28, 30, 31};
	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
