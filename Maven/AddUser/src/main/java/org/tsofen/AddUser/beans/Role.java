package org.tsofen.AddUser.beans;

public enum Role
{
	Admin("Admin")
	{
		public String getRoleName()
		{
			return this.name;
		}
	},
	User("User")
	{
		public String getRoleName()
		{
			return this.name;
		}
	},
	Configurator("Configurator")
	{
		public String getRoleName()
		{
			return this.name;
		}
	};

	public abstract String getRoleName();

	protected String name;

	private Role(String name)
	{
		this.name = name;
	}

	public static Role getByValue(int value)
	{
		switch (value)
		{
		case 0:
			return Admin;
		case 1:
			return User;
		case 2:
			return Configurator;
		default:
			throw new IllegalArgumentException();
		}
	}

	public String getName()
	{
		return name;
	}

	public static Role getRoleByName(String name)
	{
		if (name.equals("Admin"))
			return Admin;
		else if (name.equals("User"))
			return User;
		else if (name.equals("Configurator"))
			return Configurator;
		else
			throw new IllegalArgumentException();
	}
}
