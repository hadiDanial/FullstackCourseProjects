package Polymorphysm;

public class BasketballPlayer extends Sportsman 
{
	private int numBaskets, numRebounds;
	
	public BasketballPlayer(String firstName, String lastName, String role, int numBaskets, int numRebounds) 
	{
		super(firstName, lastName, role, "Basketball");
		this.numBaskets = numBaskets;
		this.numRebounds = numRebounds;
	}

	public void throwBall()
	{
		System.out.println(getName() + " is throwing the ball!");
	}
	
	@Override
	protected String getSportsmanDetails() 
	{
		return "I scored " + numBaskets + " baskets and have " + numRebounds + " rebounds.";
	}

}
