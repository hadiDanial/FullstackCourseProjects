package Polymorphysm;

public class SportsMain {

	public static void main(String[] args) 
	{
		SoccerPlayer s = new SoccerPlayer("S", "P", "Attack", 5);
		GoalKeeper g = new GoalKeeper("G", "K", 0, 10);
		BasketballPlayer b = new BasketballPlayer("B", "P", "Attack", 11, 3);
		
		Sportsman[] arr = {s, g, b};
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i].present();
		}

	}

}
