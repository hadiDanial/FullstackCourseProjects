package factory;

public class Lion extends Animal {

	public Lion(String name, String country) {
		super(name, country);
	}

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println(this.getName()+": Waaaa");
	}

	@Override
	public void sleep() {
		System.out.println(this.getName()+" is sleeping");

	}

}
