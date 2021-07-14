package polymorphism;

public class GoalKeeper extends SoccerPlayer {

	private int blocked;

	public GoalKeeper(String firstName, String lastName, String team, int goals, int blocked) 
	{
		super(firstName, lastName, "Goal Keeper", team, goals);
		this.blocked = blocked;
	}
	
	public void catchBall()
	{
		System.out.println(getName() + " has caught a ball!");
	}

	@Override
	protected String getAthleteDetails() 
	{
		return super.getAthleteDetails() + "I caught " + blocked + " balls!";
	}

}
