package factory;

public abstract class Animal {
	
	private String name;
	private String country;
	
	public Animal()
	{
		
	}
	public Animal(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public abstract void makeSound();
	public abstract void sleep();

}
