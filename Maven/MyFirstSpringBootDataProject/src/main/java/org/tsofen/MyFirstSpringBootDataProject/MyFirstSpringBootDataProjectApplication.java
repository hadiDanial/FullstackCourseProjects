package org.tsofen.MyFirstSpringBootDataProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tsofen.MyFirstSpringBootDataProject.beans.Person;
import org.tsofen.MyFirstSpringBootDataProject.bl.PersonBL;
import org.tsofen.MyFirstSpringBootDataProject.repositories.PersonRepository;

@SpringBootApplication
public class MyFirstSpringBootDataProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyFirstSpringBootDataProjectApplication.class, args);
		// Spring auto-generates a class that implements this interface
		// This has CRUD methods for the specific repositories
		PersonRepository repo = context.getBean(PersonRepository.class); 
		
		Person p = new Person("Hadi", 242, 4412, 1275f, 730);
//		Person p2 = new Person("Rami", 42, 124, 180f, 80);
//		repo.save(p2);

		System.out.println(repo.findAllByName("Hadi"));
		//javax.persistence.NonUniqueResultException:

		PersonBL personBL = context.getBean(PersonBL.class);
		personBL.addPerson(p);
	}

}
