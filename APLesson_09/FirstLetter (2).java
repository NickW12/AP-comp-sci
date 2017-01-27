import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words  = new String[5];
		System.out.println("Enter any five words");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("First Letters");
		First(words);
	}
	public static String First(String[] word123)
	{
		for (String word: word123)
			{
				System.out.println(word.charAt(0));
			}
			return " ";
	}
	
}