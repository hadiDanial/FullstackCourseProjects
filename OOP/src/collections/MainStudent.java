package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent
{

	public static void main(String[] args)
	{
		Student s1 = new Student("Hadi", "Danial", 97);
		Student s2 = new Student("Hadi", "Danial", 56);
		Student s3 = new Student("Rami", "K", 88);
		Student s4 = new Student("Ali", "H", 90);
		Student[] arr = { s1, s2, s3, s4 };
		List<Student> list = Arrays.asList(arr);
		Collections.sort(list);
		System.out.println("Comparing by name and grades together:\n" + list);
		
		// Name
		Collections.sort(list, new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				return o1.getFullName().compareTo(o2.getFullName());
			}
		});
		System.out.println("Comparing by name:\n" + list);
		
		// Grade
		Collections.sort(list, new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				return Float.compare(o1.getAverageGrade(), o2.getAverageGrade());
			}
		});
		System.out.println("Comparing by grade:\n" + list);
	}

}
