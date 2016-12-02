import java.util.Scanner;
public class TreeDeg
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Word");
		String w = kb.nextLine();
		tree(w,0,w.length());
	}
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%10s\n" , word.substring(0, start));
			start++;
			tree(word, start, stop);
			
		}
	}
}