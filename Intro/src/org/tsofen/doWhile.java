package org.tsofen;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0, num;
		System.out.println("Enter numbers to sum, end with 0:");
		do {
			num = s.nextInt();
			sum += num;
		}
		while(num != 0);
		System.out.println("The sum is: " + sum);
	}
}
