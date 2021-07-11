package org.tsofen;

import java.util.Scanner;

public class biggestNumLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max, cur, num = 10;
		System.out.println("Enter " + num + " numbers:");

		num--;
		max = s.nextInt();
		while(num > 0)
		{
			cur = s.nextInt();
			if(cur > max)
			{
				max = cur;
			}
			num--;
		}
		System.out.println("Max number is: " + max);
	}
}
