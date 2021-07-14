package polymorphism;

public class SportsMain {

	public static void main(String[] args) 
	{
		SoccerPlayer s = new SoccerPlayer("S", "P", "Attack", "Team1", 5);
		GoalKeeper g = new GoalKeeper("G", "K", "Team2", 0, 10);
		BasketballPlayer b = new BasketballPlayer("B", "P", "Attack", "Team3", 11, 3);
		
		Athlete[] arr = {s, g, b};
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i].present();
		}

	}

}
