package org.tsofen.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class College
{
	private String collegeName;

	public College()
	{
		super();
	}

	public College(String collegeName)
	{
		super();
		this.collegeName = collegeName;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
}
