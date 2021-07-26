import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDBManager {
	
	private DBConnection dbConn ;

	private static StudentsDBManager instance; // static private instance
	//private static StudentsDBManager instance = new StudentsDBManager()//Eagely loading
	private StudentsDBManager() {  //1. Private Constructor
		try {
			this.dbConn = DBConnection.getInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static StudentsDBManager getInstance() 
	{
		if(instance ==null)
		{
			instance = new StudentsDBManager(); //Lazy initialize
		}
		return instance;
	}
	
	
	public List<Student> getAllStudents()
	{
		List<Student> students = new ArrayList<>();
		
		String sql = "select name, age from students";
		try {
			ResultSet res = this.dbConn.read(sql);
			while(res.next())
			{
				Student student = new Student();
				//student.setId(res.getInt("student_id"));
				student.setName(res.getString("name"));
				student.setAge(res.getFloat("age"));
				//student.setAverage(res.getFloat("average"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return students;
	}
	
	public void addStudent(Student student)
	{
		String sql = "insert into students (name, age, average) values ('"+student.getName()+"', "+student.getAge()+", "+student.getAverage()+")";
		try {
			student.setId(dbConn.runInsertSQL(sql));
		} catch (SQLException e) {
			
		}
	}
	

}
