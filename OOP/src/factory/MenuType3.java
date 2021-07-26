package factory;

import java.util.ArrayList;
import java.util.List;

public class MenuType3 extends Menu
{

	public MenuType3()
	{
		super(generateOptions());
	}

	protected static List<String> generateOptions()
	{
		List<String> list = new ArrayList<>();
		list.add("HELLO!");
		list.add("Hello World!");
		list.add(exitOption);
		return list;
	}

}
