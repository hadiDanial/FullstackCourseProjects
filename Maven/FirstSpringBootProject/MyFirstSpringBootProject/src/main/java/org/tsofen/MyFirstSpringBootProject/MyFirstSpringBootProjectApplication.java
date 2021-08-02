package org.tsofen.MyFirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.tsofen.MyFirstSpringBootProject.beans.ChatClient;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
		ChatClient client = context.getBean(ChatClient.class);
		client.sendMessage("Hello world!");
	}

}
