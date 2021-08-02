package org.tsofen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tsofen.beans.Cat;
import org.tsofen.beans.Veterinarian;

public class ProgramCat
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurations.class);
		
		//Prototype - allow multiple instances
		Cat firstCat = context.getBean(Cat.class);
		
		firstCat.setName("Garfield");
		firstCat.setAge(3);
		
		Cat secondCat = context.getBean(Cat.class, "Mitzi", 22);
		Cat thirdCat = context.getBean(Cat.class, "Garfield", 3);
		System.out.println(firstCat);
		System.out.println(secondCat);
		
		if(thirdCat == firstCat)
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Different");
		}
		
		//Singleton - default scope behavior
		Veterinarian vet = context.getBean(Veterinarian.class);
		Veterinarian vet2 = context.getBean(Veterinarian.class);
		vet.setFullName("Rami");
		vet.setLicenseNumber(12321);
		
		
		System.out.println(vet);
		System.out.println(vet2);
		
		System.out.println("My cat's vet is:\n" + firstCat.getVet());
	}

}
