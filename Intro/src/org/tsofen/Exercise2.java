package org.tsofen;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Please enter the first number:");		
		System.out.println("Please enter your name:");
		String first, last;
		first = scanner.next();
		last = scanner.next();
		System.out.println("Please enter your monthly salary:");
		float salary = scanner.nextFloat();
		System.out.println("Hello, " + first + " " + last + "!");
		System.out.println("Your current salary: " + salary);
		for (int i = 1; i < 3; i++) {
			salary = salary * 1.1f;
			System.out.println("Year " + i + " salary: " + salary);
		}
		scanner.close();
	}
}
