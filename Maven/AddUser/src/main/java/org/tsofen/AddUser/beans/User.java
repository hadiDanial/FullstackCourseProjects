package org.tsofen.AddUser.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User
{
	@Id
	@GeneratedValue	
	private int id;
	private String name;
	private String email;
	private int phone;
	private String password;
	private boolean active;
	private Role role;
	private String productGroups;
	public User()
	{
		super();
	}
	public User(String name, String email, int phone, String password, boolean active, String productGroups, Role role)
	{
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.active = active;
		this.productGroups = productGroups;
		this.role = role;
	}
	
	public void updateUser(User other)
	{
		setName(other.getName());
		setEmail(other.getEmail());
		setPhone(other.getPhone());
		setPassword(other.getPassword());
		setActive(other.isActive());
		setProductGroups(other.getProductGroup());
		setRole(other.getRole());
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public int getPhone()
	{
		return phone;
	}
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public boolean isActive()
	{
		return active;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
	public Role getRole()
	{
		return role;
	}
	public void setRole(Role role)
	{
		this.role = role;
	}
	public String getProductGroup()
	{
		return productGroups;
	}
	public void setProductGroups(String productGroups)
	{
		this.productGroups = productGroups;
	}
	public int getId()
	{
		return id;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(active, email, id, name, password, phone, productGroups, role);
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
		User other = (User) obj;
		return active == other.active && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password) && phone == other.phone
				&& Objects.equals(productGroups, other.productGroups) && role == other.role;
	}
	@Override
	public String toString()
	{
		return "Name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", active=" + active + ", role=" + role + ", productGroups=" + productGroups + "]";
	}
	
}
