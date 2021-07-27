package factory;

import java.util.Scanner;

public class MenuMain
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1, 2, or 3:");
		int index = s.nextInt();
		Menu m = MenuFactory.createMenu(index);
		m.start();
		System.out.println("Goodbye!");	

	}

}
