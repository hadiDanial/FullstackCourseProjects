package org.tsofen.MyFirstSpringBootDataProject.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="persons") // Rename table
public class Person
{
	@Id //PK
	@GeneratedValue // Generate/auto increment pk
	private int id;
	@Column(name="Full_Name") // Rename column
	private String name;
	private int age;
	private int footSize;
	private float height;
	private float weight;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "planet_id") // Foreign Key Name
	private Planet planet;

	public Person()
	{
		super();
	}

	public Person(String name, int age, int footSize, float height, float weight)
	{
		super();
		this.name = name;
		this.age = age;
		this.footSize = footSize;
		this.height = height;
		this.weight = weight;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
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

	public int getFootSize()
	{
		return footSize;
	}

	public void setFootSize(int footSize)
	{
		this.footSize = footSize;
	}

	public float getHeight()
	{
		return height;
	}

	public void setHeight(float height)
	{
		this.height = height;
	}

	public float getWeight()
	{
		return weight;
	}

	public void setWeight(float weight)
	{
		this.weight = weight;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + footSize;
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(weight);
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (footSize != other.footSize)
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", footSize=" + footSize + ", height=" + height
				+ ", weight=" + weight + "]";
	}

}
