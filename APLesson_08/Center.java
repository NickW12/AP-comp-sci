import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Word1");
		String word1 = kb.next();
		System.out.println("Enter Word2");
		String word2 = kb.next();
		System.out.println("Enter Word3");
		String word3 = kb.next();
		makeCenter(word1);
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else 
			return makeCenter(" "+word+" ");
	}
}