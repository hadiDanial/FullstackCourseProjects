package factory;

public class AnimalFactory
{
	public static Animal createWithDetails(AnimalType animalType, String name, String country)
	{
		Animal animal = create(animalType);
		animal.setName(name);
		animal.setCountry(country);
		return animal;
	}
	public static Animal createWithDetails(int index, String name, String country)
	{
		Animal animal = create(index);
		animal.setName(name);
		animal.setCountry(country);
		return animal;
	}
	public static Animal create(AnimalType animalType)
	{
		Animal animal = null;
		switch (animalType)
		{
		case Lion:
		{
			animal = new Lion();
			break;
		}
		case Cat:
		{
			animal = new Cat();
			break;
		}
		case Dog:
		{
			animal = new Dog();
			break;
		}
		case Monkey:
		{
			animal = new Monkey();
			break;
		}
		default:
			break;
		}
		return animal;
	}

	public static Animal create(int index)
	{
		int enumValue = index - 1;
		return create(AnimalType.values()[enumValue % AnimalType.values().length]);
	}

}
