package Polymorphysm;

public class SoccerPlayer extends Sportsman 
{
	private int goals;
	
	public SoccerPlayer(String firstName, String lastName, String role, int goals)
	{
		super(firstName, lastName, role, "Soccer");
		this.goals = goals;
	}
	
	public void kickBall()
	{
		System.out.println(getName() + " is kicking the ball!");
	}

	@Override
	protected String getSportsmanDetails() 
	{
		return "I scored " + goals + " goals! ";
	}

}
