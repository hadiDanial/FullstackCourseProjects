package exceptions;

import java.util.Iterator;
import java.util.Scanner;

public class PrintNumsBetween
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a, b;
		boolean done = false;
		while (!done)
		{
			try
			{
				System.out.println("Enter A and B:");
				a = s.nextInt();
				b = s.nextInt();
				if (a == b)
					throw new AEqualToBException();
				if (a > b)
					throw new AGreaterThanBException();
				printNumsBetween(a, b);

			} catch (Exception e)
			{
				System.err.println("Error! " + e.getMessage());
				done = true;
			}
		}
	}

	private static void printNumsBetween(int a, int b)
	{
		for (int i = a; i <= b; i++)
		{
			System.out.println(i);
		}

	}

}
