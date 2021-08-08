package org.tsofen.MyMVCApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tsofen.MyMVCApp.beans.Person;
import org.tsofen.MyMVCApp.bl.PersonBL;
import org.tsofen.MyMVCApp.repositories.PersonRepository;

@SpringBootApplication
public class MyMvcAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyMvcAppApplication.class, args);
	}

}
