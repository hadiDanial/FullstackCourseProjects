package polymorphism;

public class SoccerPlayer extends Athlete 
{
	private int goals;
	
	public SoccerPlayer(String firstName, String lastName, String role, String team, int goals)
	{
		super(firstName, lastName, role, team);
		this.goals = goals;
	}
	
	public void kickBall()
	{
		System.out.println(getName() + " is kicking the ball!");
	}

	@Override
	protected String getAthleteDetails() 
	{
		return "I scored " + goals + " goals! ";
	}
	

	@Override
	protected String getSportName() 
	{
		return "Soccer";
	}

}
