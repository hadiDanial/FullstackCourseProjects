package org.tsofen;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random rnd = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = generateRandomNumber(-5, 5);
		}
		System.out.println(Arrays.toString(nums));
		
		
		
	}
	
	public static int generateRandomNumber(int min, int max)
	{
		int val;
		val = (int)(Math.random() * (max - min + 1)) + min;	
		return val;
	}
}
