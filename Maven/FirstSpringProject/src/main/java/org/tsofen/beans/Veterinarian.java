package org.tsofen.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Veterinarian
{
	private String fullName;
	private int licenseNumber;
	@Autowired
	private Diploma diploma;
	public Veterinarian()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinarian(String fullName, int licenseNumber)
	{
		super();
		this.fullName = fullName;
		this.licenseNumber = licenseNumber;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	public int getLicenseNumber()
	{
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber)
	{
		this.licenseNumber = licenseNumber;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + licenseNumber;
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
		Veterinarian other = (Veterinarian) obj;
		if (fullName == null)
		{
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (licenseNumber != other.licenseNumber)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Veterinarian [fullName=" + fullName + ", licenseNumber=" + licenseNumber + "]";
	}
	
}
