package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOutOfBounds
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count = 2;
		String[] names = new String[count];
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Enter name " + (i + 1));
			names[i] = s.next();
		}
		
		System.out.println("Enter index: ");
		
		try
		{
			int index = s.nextInt();
			System.out.println("The name in index " + index + " is: " + names[index]);
		} 
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Index out of bounds!!!");
		}
		catch (InputMismatchException e)
		{
			System.out.println("You didn't enter an integer!");
		}
		s.close();
	}

}
