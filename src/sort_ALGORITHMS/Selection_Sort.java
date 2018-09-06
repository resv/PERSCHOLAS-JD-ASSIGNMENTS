package sort_ALGORITHMS;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		
	//INSTRUCTOR CODE
		int[] arr = { 3, 7, 2, 9, 1, 6};
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int track = i;
			for (int j = i + 1 ; j <arr.length; j++) {
				if (temp > arr[j]) {
					temp = arr[j];
					track = j;
				}
			}
			arr[track] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	//MY CODE
		int[] arr2 = { 3, 7, 2, 9, 1, 6};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				} else if (arr2[i] < arr2[j]){
					continue;
				}
			}
		}

		
		
	}

}
