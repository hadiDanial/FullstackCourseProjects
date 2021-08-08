package org.tsofen.MyMVCApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // singleton component controller
@RequestMapping("Person") // path of url
public class PersonController
{
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
}
