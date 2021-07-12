package tsofen;

public class Person {
	private String firstName, lastName;
	private int energy = 100;
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void walk()
	{
		if(canPerformAction(20))
		{
			printNameWithMessage(" is walking.");
			energy -= 20;
		}
		else
		{
			printNameWithMessage(" doesn't have enough energy to walk.");
		}
	}
	public void run()
	{
		if(canPerformAction(50))
		{
			printNameWithMessage(" is running.");
			energy -= 50;
		}
		else
		{
			printNameWithMessage(" doesn't have enough energy to run.");
		}
	}
	public void rest()
	{
		energy = 100;
		printNameWithMessage(" is resting.");
	}
	public void talk()
	{
		printNameWithMessage(" is talking.");
	}
	public void shout()
	{
		System.out.println(toString().toUpperCase()+ " IS SHOUTING!!!");
	}
	public void clap()
	{
		printNameWithMessage(" is clapping.");
	}
	
	private boolean canPerformAction(int requiredEnergy)
	{	
		return energy >= requiredEnergy;
	}
	private void printNameWithMessage(String msg)
	{
		System.out.println(toString() + msg + " (Current energy = " + energy + ")");
	}
	public String toString()
	{
		return firstName + " " + lastName;
	}
}
