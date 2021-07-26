package factory;

public class Dog extends Animal {
	private String ownerName;
	
	
	public Dog(String name, String country, String ownerName) {
		super(name, country);
		this.ownerName = ownerName;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void makeSound() {
		System.out.println(this.getName()+", Howhow");
		
	}

	@Override
	public void sleep() {
		System.out.println(this.getName()+" is sleeping at "+this.ownerName+"'s house");
	}

}
