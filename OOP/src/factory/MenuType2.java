package factory;

import java.util.ArrayList;
import java.util.List;

public class MenuType2 extends Menu
{
	public static int counter = 0;
	
	public MenuType2()
	{
		super(generateOptions());
	}

	protected static List<String> generateOptions()
	{
		Option op = new Option("Message", new Action()
		{		
			@Override
			public void performAction()
			{
				System.out.println(10 + 20);
				
			}
		});
		Option op2 = new Option("Message", new Action()
		{		
			@Override
			public void performAction()
			{
				counter++;
				
			}
		});
		
		Option op3 = new Option("Opening menu 2:", new Action()
		{		
			@Override
			public void performAction()
			{
				Menu m2 = MenuFactory.createMenu(2);
				m2.start();				
			}
		});
		List<String> list = new ArrayList<>();
		list.add("Hello World!");
		list.add(exitOption);
		return list;
	}

}

