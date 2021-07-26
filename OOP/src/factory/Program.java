package factory;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter an option: ");
		System.out.println("1. Lion");
		System.out.println("2. Dog");
		System.out.println("3. Cat");
		System.out.println("4. Monkey");
		int choice = input.nextInt();
		Animal animal = AnimalFactory.createWithDetails(choice, "Rex", "Africa");
		
		if(animal !=null)
		{
			animal.makeSound();
		}
	}
}
