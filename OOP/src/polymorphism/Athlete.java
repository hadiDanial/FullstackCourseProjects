package polymorphism;

public abstract class Athlete 
{
	private String firstName, lastName;
	private String role;
	private String group;
	
	public Athlete(String firstName, String lastName, String role, String group) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.group  = group;
	}
	
	public void run()
	{
		System.out.println(getName() + " is running!");
	}
	
	public void jump()
	{
		System.out.println(getName() + " is jumping!");
	}
	
	protected String getName()
	{
		return firstName + " " + lastName;
	}
	
	public void present()
	{
		System.out.println(toString());
	}
	protected abstract String getAthleteDetails();
	protected abstract String getSportName();
	@Override
	public String toString() 
	{
		return "Hey, I'm " + getName() + ", I play " + getSportName() + " with "
				+ group + " in the " + role + " position. " + getAthleteDetails();
	}
}
