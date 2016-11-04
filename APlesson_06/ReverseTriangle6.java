import java.util.Scanner;
public class ReverseTriangle6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter word");
		String word = kb.next();
		for(int i = 5; i >= 1; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}