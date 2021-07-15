package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReverseArray
{
	public static void main(String[] args)
	{

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--)
		{
			list.add(arr[i]);
		}
		System.out.println(list);
		Set<Integer> m = new TreeSet<>(new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2)
			{
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
}
