package factory;

public class MenuFactory
{
	
	public static Menu createMenu(int index)
	{
		int typeIndex = (index - 1) % MenuType.values().length;
		return createMenu(MenuType.values()[typeIndex]);
	}
	public static Menu createMenu(MenuType type)
	{
		Menu m = null;
		switch (type)
		{
		case One:
		{
			m = new MenuType1();
			break;
		}
		case Two:
		{
			m = new MenuType2();
			break;
		}
		case Three:
		{
			m = new MenuType3();
			break;
		}

		default:
		{
			m = new MenuType1();
			break;
		}
		}
		return m;
	}
}
