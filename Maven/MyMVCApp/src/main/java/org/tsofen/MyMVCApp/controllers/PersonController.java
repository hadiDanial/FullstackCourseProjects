package org.tsofen.MyMVCApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsofen.MyMVCApp.beans.Person;
import org.tsofen.MyMVCApp.bl.PersonBL;

@RestController // singleton component controller
@RequestMapping("Person") // path of url
public class PersonController
{
	@Autowired
	private PersonBL personBL;
	
	@GetMapping("greet")
	public String greet123()
	{
		System.out.println("In greeting");
		return "Greetings!";
	}
	
	//http://localhost:8081/Person/hello?name=Rami
	@GetMapping("hello")
	public String hello(String name)
	{
		return "hey, " + name + "!";
	}
	
	@GetMapping("addPerson")
	public boolean addPerson(String name, int age, int footSize, float weight, float height)
	{
		Person p = new Person(name, age, footSize, weight, height);
		
		return personBL.addPerson(p);
	}
	
	@GetMapping("getPerson")
	public List<Person> getPerson(String name)
	{
		return personBL.getPerson(name);
	}
	@GetMapping("getAll")
	public Iterable<Person> getAll()
	{
		return personBL.getAllPersons();
	}
}
