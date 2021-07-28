package exceptions;

/**
 * @author Hadi
 */
public class CourseMain
{

	public static void main(String[] args)
	{
		int[] grades1 =
		{ 50, 60, 70, 82, 90, 100 };
		int[] grades2 =
		{ 50, 60, 70, 82, 90, 100 };
		int[] grades3 =
		{ 80, 90, 100 };
		int[] grades4 =
		{ -10, 70, 80, 90, 100 };
		int[] grades5 =
			{ 60, 70, 80, 90, 100 };

		testArray(grades1, 1, false);
		testArray(grades2, 2, true);
		testArray(grades3, 3, false);
		testArray(grades4, 4, false);
		testArray(grades5, 5, false);

	}

	public static void testArray(int[] arr, int arrayNum, boolean addExtraElements)
	{
		System.out.println("\n------------------\nTrying array " + arrayNum);
		int extraElements = (addExtraElements) ? 3 : 0; // For testing
		Course course = new Course("Rami", arr.length + extraElements);
		try
		{
			course.setGrades(arr);
			System.out.println("First grade in array " + arrayNum + ": " + course.getGrade(0));
			System.out.println("Fifth grade in array " + arrayNum + ": " + course.getGrade(4));
		} catch (Exception e)
		{
			System.out.println("ERROR! " + e.getMessage() + "\n" + course.toString());
			return;
		}
		System.out.println(course); // toString uses getAverage()
	}
}
