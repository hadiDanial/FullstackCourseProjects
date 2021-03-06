package org.tsofen.MyMVCApp.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsofen.MyMVCApp.beans.Person;
import org.tsofen.MyMVCApp.repositories.PersonRepository;

@Service
public class PersonBL
{
	@Autowired
	PersonRepository repo;
	public boolean addPerson(Person p)
	{
		// Check if person with this name already exists
		List<Person> person = repo.findAllByName(p.getName());
		// If yes, don't add
		// Else, add to DB
		if(person.size() == 0)
		{
			repo.save(p);
			return true;
		}
		return false;
	}
	public List<Person> getPerson(String name)
	{
		return repo.findAllByName(name);
	}
	public Iterable<Person> getAllPersons()
	{
		return repo.findAll();
	}
}
