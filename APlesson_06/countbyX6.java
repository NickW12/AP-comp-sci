import java.util.Scanner;

public class countbyX6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What number do you want to count up to?");
		
		int countUpto = kb.nextInt();
		
		System.out.println("What number do you want to count up by?");
		
		int countBy = kb.nextInt();
		
		for (int i = countBy; i <= countUpto; i += countBy)
		{
			System.out.println(i + " ");
		}
	}
}