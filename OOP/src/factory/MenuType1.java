package factory;

import java.util.ArrayList;
import java.util.List;

public class MenuType1 extends Menu
{

	public MenuType1()
	{
		super(generateOptions());
	}

	protected static List<String> generateOptions()
	{
		List<String> list = new ArrayList<>();
		list.add("HELLO");
		list.add("HI");
		list.add(exitOption);
		return list;
	}

}
