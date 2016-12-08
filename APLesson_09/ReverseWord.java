import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter 5 names");
		
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		for(String word : words)
		{
			System.out.println("\"" + word.length() + "\", ");
		}
	}
		public static void first(String [] words)
		{
			for (String word : words)
				System.out.println(word[0]);
		}
}