package polymorphism;

public class BasketballPlayer extends Athlete 
{
	private int numBaskets, numRebounds;
	
	public BasketballPlayer(String firstName, String lastName, String role, String team, int numBaskets, int numRebounds) 
	{
		super(firstName, lastName, role, team);
		this.numBaskets = numBaskets;
		this.numRebounds = numRebounds;
	}

	public void throwBall()
	{
		System.out.println(getName() + " is throwing the ball!");
	}
	
	@Override
	protected String getAthleteDetails() 
	{
		return "I scored " + numBaskets + " baskets and have " + numRebounds + " rebounds.";
	}

	@Override
	protected String getSportName() 
	{
		return "Basketball";
	}

}
