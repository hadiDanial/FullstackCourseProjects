package connection;

public class Student
{

	private int id;
	private String name;
	private float age;
	private float average;

	public Student()
	{
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

	public float getAge()
	{
		return age;
	}

	public void setAge(float age)
	{
		this.age = age;
	}

	public float getAverage()
	{
		return average;
	}

	public void setAverage(float average)
	{
		this.average = average;
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", average=" + average + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(age);
		result = prime * result + Float.floatToIntBits(average);
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (Float.floatToIntBits(age) != Float.floatToIntBits(other.age))
			return false;
		if (Float.floatToIntBits(average) != Float.floatToIntBits(other.average))
			return false;
		if (id != other.id)
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