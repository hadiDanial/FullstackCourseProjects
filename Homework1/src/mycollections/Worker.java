package mycollections;

/**
 * @author Hadi
 */
public class Worker implements Comparable<Worker>
{
	private String first, last;
	private int id;
	private float salary;

	public Worker(String first, String last, int id, float salary)
	{
		super();
		this.first = first;
		this.last = last;
		this.id = id;
		this.salary = salary;
	}

	public String getFullName()
	{
		return first + " " + last;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	public String getFirst()
	{
		return first;
	}

	public String getLast()
	{
		return last;
	}

	public int getId()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return "Worker [id=" + id + ". " + getFullName() + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + id;
		result = prime * result + ((last == null) ? 0 : last.hashCode());
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
		Worker other = (Worker) obj;
		if (first == null)
		{
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (id != other.id)
			return false;
		if (last == null)
		{
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}

	@Override
	public int compareTo(Worker o)
	{
		return Float.compare(salary, o.getSalary());
	}

}
