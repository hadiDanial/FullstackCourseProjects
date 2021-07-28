package exceptions;

import java.util.Arrays;

/**
 * @author Hadi
 */
public class Course
{
	private String teacherName;
	private int[] grades;
	private float average = 0;
	private boolean recalculateAverage = true;
	public Course(String teacherName, int numStudents)
	{
		super();
		this.teacherName = teacherName;
		grades = new int[numStudents];
	}
	
	public String getTeacherName()
	{
		return teacherName;
	}

	public void setGrades(int[] gradesToSet) throws Exception
	{
		if (gradesToSet.length > grades.length)
			throw new Exception("Array length bigger than student number!");
		
		int currentGrade;
		for (int i = 0; i < grades.length; i++)
		{
			if (i < gradesToSet.length)
			{
				currentGrade = gradesToSet[i];
				if(isWithinRange(currentGrade, 0, 100))
				{
					grades[i] = currentGrade;					
				}
				else
				{
					throw new Exception("Grade "+ i + ": " + currentGrade + " is not valid! Must be between 0-100.");
				}
			} 
			else
			{
				grades[i] = 0;
			}
		}
		recalculateAverage = true;
	}

	public int getGrade(int index) throws Exception
	{
		if(!isWithinRange(index, 0, grades.length))
		{
			throw new Exception("Can't access element " + index + "! Index is not valid.");
		}
		return grades[index];			
	}
	

	public float getAverage()
	{
		if(recalculateAverage) // Only calculate if the grades have been updated.
		{
			int sum = 0;
			for (int i = 0; i < grades.length; i++)
			{
				sum += grades[i];
			}
			average = ((float)sum)/grades.length;
			recalculateAverage = false;
		}
		return average;
	}

	private boolean isWithinRange(int currentGrade, int min, int max)
	{
		return (currentGrade <= max) && (currentGrade >= min);
	}
	
	@Override
	public String toString()
	{
		return "Course taught by " + getTeacherName() + ", has " + grades.length + 
				" students, with an average of: " + getAverage() + ".\n" + Arrays.toString(grades);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(average);
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + (recalculateAverage ? 1231 : 1237);
		result = prime * result + ((teacherName == null) ? 0 : teacherName.hashCode());
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
		Course other = (Course) obj;
		if (Float.floatToIntBits(average) != Float.floatToIntBits(other.average))
			return false;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (recalculateAverage != other.recalculateAverage)
			return false;
		if (teacherName == null)
		{
			if (other.teacherName != null)
				return false;
		} else if (!teacherName.equals(other.teacherName))
			return false;
		return true;
	}

}
