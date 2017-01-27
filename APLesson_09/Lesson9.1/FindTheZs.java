import java.util.Scanner;
public class FindTheZs
{
	static String Array = "";
	public static void main(String[]args)
	{
		String [] wordss = new String[5];
		fillArray(wordss);
		System.out.println("For these words " + printArray(wordss));
		System.out.println("THis "+ hasZs(wordss) + " ...contains the letter z.");
	}
	public static void fillArray(String[] words)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter five words ");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static String printArray(String[] word)
	{
		for (String n: word)
		{
			Array += n + " ";
		}
		return Array;
	}
	public static String hasZs(String[] wordee)
	{
		String z = "";
		for (String n: wordee)
		{
			if (n.indexOf("z") >= 0)
			{
				z += n + " ";
			}
			else
			{
				z += "";
			}
		}
		return z;
	}
}