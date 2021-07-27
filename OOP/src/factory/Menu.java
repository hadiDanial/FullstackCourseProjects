package factory;

import java.util.List;
import java.util.Scanner;

public abstract class Menu
{
	private List<String> options;	
	protected static String exitOption = "Exit";
	
	protected static Option exit = new Option("Exit", new Action()
	{
		@Override
		public void performAction()
		{
			System.exit(0);			
		}
	});
	
	public Menu(List<String> options)
	{
		super();
		this.options = options;
	}

	public void start()
	{
		printOptions();
		select();
	}

	private void printOptions()
	{
		for(int i = 0; i < options.size(); i++)
		{
			System.out.println((i + 1) + ". " + options.get(i));
		}	
	}
	
	private void select()
	{
		Scanner s = new Scanner(System.in);
		int result = s.nextInt();
		while(result < options.size() && result > 0)
		{
			System.out.println(options.get(result - 1));
			result = s.nextInt();
		}
		s.close();
	}
	

}
