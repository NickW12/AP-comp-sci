import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("In order>");
		for(String word : words)
		{
			System.out.println(word);
		}
		System.out.println("Reversed>");
		reverse(words);
	}
	public static void reverse(String[]words)
	{
		for(int i = words.length; i > 0; i--)
		{
			System.out.println(words[i-1]);
		}
	}
}