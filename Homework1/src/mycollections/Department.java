package mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hadi
 */
public class Department
{
	// I would use a a TreeSet to keep it sorted, 
	// but you want a Vector, and sets don't inherit from Vector.
	private List<Worker> workers = new ArrayList<>(); 
	
	public void addWorker(Worker worker) throws Exception
	{
		if(!workers.contains(worker))
		{
			workers.add(worker);	
			Collections.sort(workers);
		}		
		else
		{
			throw new Exception("Worker already in the list!");
		}
	}
	
	public Worker[] getWorkersInDescendingOrder()
	{
		Worker[] reversedArray = new Worker[workers.size()];
		int size = workers.size();
		for(int i = 0; i < reversedArray.length; i++)
		{
			reversedArray[i] = workers.get(size - i - 1);
		}
		return reversedArray;
	}
	
	public Worker getWorkerWithHighestSalary()
	{
		// List is always sorted...
		return workers.get(workers.size() - 1);
	}
}
