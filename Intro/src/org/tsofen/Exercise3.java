package org.tsofen;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner s = new Scanner(System.in);
		float num = s.nextFloat();
		if(num > 0)
		{
			System.out.println("Positive");
		}
		else if(num < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("ZERO");
		}
		s.close();
	}
}
