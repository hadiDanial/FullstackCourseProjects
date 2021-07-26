package factory;

import java.util.ArrayList;
import java.util.List;

public class MenuType2 extends Menu
{

	public MenuType2()
	{
		super(generateOptions());
	}

	protected static List<String> generateOptions()
	{
		List<String> list = new ArrayList<>();
		list.add("Hello World!");
		list.add(exitOption);
		return list;
	}

}

