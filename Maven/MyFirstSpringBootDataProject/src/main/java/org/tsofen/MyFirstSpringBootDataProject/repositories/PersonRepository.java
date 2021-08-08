package org.tsofen.MyFirstSpringBootDataProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.tsofen.MyFirstSpringBootDataProject.beans.Person;

// This interface has all the CRUD methods we need 
public interface PersonRepository extends CrudRepository<Person, Integer>
{
	public Person findByName(String name);
	public List<Person> findAllByName(String name);
	public List<Person> findByHeight(float height);
	public List<Person> findByAgeGreaterThan(int age);
	
	@Query(value = "select top (10) * from persons order by foot_size", nativeQuery = true)
	public List<Person> getTopTenPersonByFootSize();
}
