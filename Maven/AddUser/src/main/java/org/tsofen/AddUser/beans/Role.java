package org.tsofen.AddUser.beans;

public enum Role
{
	Admin(1), User(2), Configurator(3);
	
	private int id;
	private Role(int id)
	{
		this.id = id;
	}
	
	public static Role getByValue(int value)
	{
		switch(value)
		{
		case 1: return Admin;
		case 2: return User;
		case 3: return Configurator;
		default: return User;
		}
	}
}
