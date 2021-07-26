package factory;

public class Monkey extends Animal {

	public Monkey(String name, String country) {
		super(name, country);
	}

	public Monkey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Monkey is making sound");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey is sleeping");
	
	}
	
	public void climbTree()
	{
		System.out.println(this.getName()+" is climbing on a tree");
	}

}
