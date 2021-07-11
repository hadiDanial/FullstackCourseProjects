package org.tsofen;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random rnd = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(49) + 1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
