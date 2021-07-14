package Polymorphysm;

public class GoalKeeper extends SoccerPlayer {

	private int blocked;

	public GoalKeeper(String firstName, String lastName, int goals, int blocked) 
	{
		super(firstName, lastName, "Goal Keeper", goals);
		this.blocked = blocked;
	}
	
	public void catchBall()
	{
		System.out.println(getName() + " has caught a ball!");
	}

	@Override
	protected String getSportsmanDetails() 
	{
		return super.getSportsmanDetails() + "I caught " + blocked + " balls!";
	}

}
