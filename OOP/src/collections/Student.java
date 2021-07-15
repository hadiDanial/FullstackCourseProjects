package collections;

public class Student implements Comparable<Student>
{
	private String firstName, lastName;
	private float averageGrade;
	protected String getFirstName()
	{
		return firstName;
	}
	protected void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	protected String getLastName()
	{
		return lastName;
	}
	protected void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	protected float getAverageGrade()
	{
		return averageGrade;
	}
	protected void setAverageGrade(float averageGrade)
	{
		this.averageGrade = averageGrade;
	}
	public Student(String firstName, String lastName, float averageGrade)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.averageGrade = averageGrade;
	}
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	@Override
	public int compareTo(Student o)
	{
		if(getFullName().equals(o.getFullName()))
		{
			return Float.compare(averageGrade, o.getAverageGrade());
		}
		return getFullName().compareTo(o.getFullName());
	}
	@Override
	public String toString()
	{
		return firstName + " " + lastName + ": averageGrade = " + averageGrade;
	}
	
	
}
