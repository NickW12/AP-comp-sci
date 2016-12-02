import java.util.Scanner;

public class Song
{
	static String kb;
	static String song;
	public static void main(String[]args)
	{
		song("Na", 4);
		song("Na", 4);
		
		song("Hey", 3);
		
		System.out.println("Goodbye");
	}

	public static void song(String word, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
}