import java.util.Scanner;
public class FindTheZs
{
	public static String[] letter;
	public static void main(String[]args)
	{
		letter = new String[5];
		
		fillArray();
		
		System.out.println("The Words");
		
		printArray();
		
		System.out.println("Contains z's ");
		
		System.out.println(hasZs());
	}
	
	public static void fillArray()
	{ 
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < letter.length; i++)
		{
			System.out.println("Please enter word number 1");
			System.out.println("Please enter word number 2");
			System.out.println("Please enter word number 3");
			System.out.println("Please enter word number 4");
			System.out.println("Please enter word number 5");
			letter[i] = kb.next();
		}
	
	}
	public static void printArray()
	{
		System.out.println("Words");
		for(String word : letter)
		{
			System.out.println(word + "  ");
		}
	}
	public static String hasZs()
	{
		String z's = "";
		for(String word : letter)
		{
			if (letter.indexOf("z") >= 0 || wor.indexOf("z") >= 0 )
				z's += wor + ", ";
		}
		return z's;
	}
}