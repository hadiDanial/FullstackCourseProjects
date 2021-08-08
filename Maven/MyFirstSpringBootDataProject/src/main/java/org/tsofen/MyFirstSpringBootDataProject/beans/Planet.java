package org.tsofen.MyFirstSpringBootDataProject.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Planet
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	// Foreign Key
	// Fetch: Eager - load all persons on first load. Lazy - load when needed 
	// Cascade: All - Delete everything when the planet is gone
	//			https://www.baeldung.com/jpa-cascade-types
	// Mapped By: the name of the field in the other relationship that gets mapped to this object.
	//			  sets the planet field in Person to this as a foreign key
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "planet") 
	private List<Person> persons;
	
}
