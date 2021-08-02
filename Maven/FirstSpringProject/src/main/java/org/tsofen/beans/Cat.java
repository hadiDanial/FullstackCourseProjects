package org.tsofen.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Tells Spring that this is a bean that should be managed
@Scope("prototype") // A Prototype means that there can be many instances of this class - not a a Singleton
//@Scope("singleton") - This is the default behavior of a component
public class Cat
{
	private String name;
	private int age;
	
	@Autowired
	private Veterinarian vet;
	
	public Cat()
	{
		super();
	}
	
	public Cat(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Veterinarian getVet()
	{
		return vet;
	}

	public void setVet(Veterinarian vet)
	{
		this.vet = vet;
	}

	@Override
	public String toString()
	{
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
