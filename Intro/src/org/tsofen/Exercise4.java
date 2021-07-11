package org.tsofen;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, i = 0;
		System.out.println("Enter 10 numbers:");
		while(i < 10)
		{
			num  = s.nextInt();
			if(num % 2 == 0)
				System.out.println(num + " is even!");
			i++;
		}
	}
}
