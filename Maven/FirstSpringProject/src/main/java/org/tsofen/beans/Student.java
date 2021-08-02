package org.tsofen.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student
{
	private int studentID;
	@Autowired
	private College college;
	

	public Student(int studentID)
	{
		super();
		this.studentID = studentID;
	}

	public Student()
	{
		super();
	}

	public College getCollege()
	{
		return college;
	}

	public void setCollege(College college)
	{
		this.college = college;
	}

	public int getStudentID()
	{
		return studentID;
	}

	public void setStudentID(int studentID)
	{
		this.studentID = studentID;
	}
	
	@Override
	public String toString()
	{
		return "Student [studentID=" + studentID + ", studies at " + college.getCollegeName() + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + studentID;
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
		if (studentID != other.studentID)
			return false;
		return true;
	}
}
