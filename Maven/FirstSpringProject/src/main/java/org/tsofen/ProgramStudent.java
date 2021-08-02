package org.tsofen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tsofen.beans.College;
import org.tsofen.beans.Student;

public class ProgramStudent
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.tsofen");
		Student s1 = context.getBean(Student.class, 1);
		Student s2 = context.getBean(Student.class, 2);
		College college = context.getBean(College.class);
		college.setCollegeName("Braude");
		System.out.println(s1);
		System.out.println(s2);

	}

}
