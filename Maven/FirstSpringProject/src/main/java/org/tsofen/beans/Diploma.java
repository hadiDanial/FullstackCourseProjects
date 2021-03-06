package org.tsofen.beans;

import org.springframework.stereotype.Component;

@Component
public class Diploma
{
	private String title;
	private int year;
	public Diploma()
	{
		super();
	}
	
	public Diploma(String title, int year)
	{
		super();
		this.title = title;
		this.year = year;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return "Diploma [title=" + title + ", year=" + year + "]";
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
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
		Diploma other = (Diploma) obj;
		if (title == null)
		{
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
