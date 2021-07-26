package factory;

public class Cat extends Animal{

	public Cat()
	{
		
	}
	public Cat(String name, String country) {
		super(name, country);
	}

	@Override
	public void makeSound() {
		System.out.println(this.getName()+": Miao");
	}

	@Override
	public void sleep() {
		System.out.println(this.getName()+": I'm sleeping at "+this.getCountry());
		
	}

}
