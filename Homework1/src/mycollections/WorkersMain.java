package mycollections;

/**
 * @author Hadi
 */
public class WorkersMain
{

	public static void main(String[] args)
	{
		Department department = new Department();
		Worker w1 = new Worker("A", "a", 1, 1000);
		Worker w2 = new Worker("B", "b", 2, 5000);
		Worker w3 = new Worker("C", "c", 3, 4500);
		Worker w4 = new Worker("D", "d", 4, 300);
		Worker w5 = new Worker("E", "e", 5, 2300);
		Worker w6 = new Worker("F", "f", 6, 100);
		
		try
		{
			department.addWorker(w1);
			department.addWorker(w2);
			department.addWorker(w3);
			department.addWorker(w4);
			department.addWorker(w5);
			department.addWorker(w6);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		Worker[] reverse = department.getWorkersInDescendingOrder();
		System.out.println("Reverse Order:");
		for (int i = 0; i < reverse.length; i++)
		{
			System.out.println(reverse[i]);
		}
		System.out.println("Highest paid worker is:\n" + department.getWorkerWithHighestSalary());
	}

}
