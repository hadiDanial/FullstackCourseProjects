package org.tsofen;

import java.util.Arrays;

public class merge {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5 };
		int[] arr2 = {6, 7, 8, 9, 10};
		
		int[] mergedArr = mergeArrays(arr1, arr2);
		int[] mergedArr2 = mergeArrays(arr2, arr1);
		System.out.println("Merged Array 1: " + Arrays.toString(mergedArr));
		System.out.println("Merged Array 2: " + Arrays.toString(mergedArr2));
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int len1 = arr1.length, len2 = arr2.length;
		int num = len1 + len2;
		int[] mergedArr = new int[num];
		for (int i = 0; i < len1; i++) 
		{
			mergedArr[i] = arr1[i];
		}
		for (int i = 0; i < len2; i++) {
			mergedArr[i + len1] = arr2[i];
		}
		return mergedArr;
	}
}
