package mycollections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Hadi
 */
public class WordCounter
{

	public static void main(String[] args)
	{
		Map<String, Integer> wordMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		
		for (int i = 0; i < words.length; i++)
		{
			if(wordMap.containsKey(words[i]))
			{
				wordMap.put(words[i], wordMap.get(words[i]) + 1);
			}
			else
			{
				wordMap.put(words[i], 1);
			}
		}
		
		for(String word : wordMap.keySet())
		{
			System.out.println("The word \"" + word + "\" appears " + wordMap.get(word) + " times.");
		}
		
		
		scanner.close();
	}

}
