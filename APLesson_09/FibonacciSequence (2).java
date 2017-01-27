import java.util.Scanner;
public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number ");
		int Num = kb.nextInt();
		System.out.println("Enter your size");
		int Size = kb.nextInt();
		int [] sequence = new int[Size];
		for (int i = 0; i < sequence.length; i++)
		{
			if (i == 0 || i == 1)
			{
				sequence[i] = Num;
			}
			else
			{
				sequence[i] = sequence[i-1] + sequence [i-2];
			}
			System.out.print(sequence[i] + " ");
		}
	}
}