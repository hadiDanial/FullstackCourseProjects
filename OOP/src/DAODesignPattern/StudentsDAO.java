package DAODesignPattern;

import java.util.List;

import collections.Student;

// This interface will be implemented by various classes so that the business logic can be 
// separated from the logic that accesses the data (database, files, in memory, etc...)
public interface StudentsDAO
{
	public void addStudent(Student s);
	public List<Student> getAllStudent();
	
}
