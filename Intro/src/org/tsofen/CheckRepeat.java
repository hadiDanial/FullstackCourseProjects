package org.tsofen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckRepeat {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4 ,5 };
		System.out.println(Arrays.toString(arr) + " - Check 1: " + hasNoRepeatingNumbers1(arr));
		System.out.println(Arrays.toString(arr) + " - Check 2: " + hasNoRepeatingNumbers2(arr));
		System.out.println(Arrays.toString(arr) + " - Check 3: " + hasNoRepeatingNumbers3(arr));
	}
	
	private static boolean hasNoRepeatingNumbers1(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j])
					return false;
			}
		}
		return true;
	}

	private static boolean hasNoRepeatingNumbers2(int[] array)
	{
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] == array[i+1])
				return false;
		}
		return true;
	}
	
	private static boolean hasNoRepeatingNumbers3(int[] array)
	{
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if(set.contains(array[i]))
				return false;
			set.add(array[i]);
		}
		return true;
	}
}
