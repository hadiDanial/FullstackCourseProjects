package org.tsofen;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println("Please enter the first number:");
		int n1, n2;
		n1 = scanner.nextInt();
		System.out.println("Please enter the second number:");
		n2 = scanner.nextInt();
		System.out.println("The sum of the two numbers is: " + (n1 + n2));
		scanner.close();
	}
}
