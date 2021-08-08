package org.tsofen.MyFirstSpringBootDataProject.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsofen.MyFirstSpringBootDataProject.beans.Person;
import org.tsofen.MyFirstSpringBootDataProject.repositories.PersonRepository;

@Service
public class PersonBL
{
	@Autowired
	PersonRepository repo;
	public void addPerson(Person p)
	{
		// Check if person with this name already exists
		List<Person> person = repo.findAllByName(p.getName());
		// If yes, don't add
		// Else, add to DB
		if(person.size() == 0)
		{
			repo.save(p);
		}
	}
}
