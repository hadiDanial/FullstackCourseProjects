import java.util.List;

public class Program {
	public static void main(String[] args) {
		StudentsDBManager studentManager =StudentsDBManager.getInstance();
		StudentsDBManager studentManager1 = StudentsDBManager.getInstance();
		
		
		if(studentManager == studentManager1)
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equal");
		}
		List<Student> students = studentManager.getAllStudents();
		
		float sum = 0;
		for(Student student : students)
		{
			sum += student.getAverage();
			System.out.println(student);	
		}
		
		System.out.println("Average of all student is "+(sum/students.size()));
		
	}

}
