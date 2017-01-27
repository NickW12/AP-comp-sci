import java.util.Scanner;
public class BiggestNumber
{
	int Array;
	int number;
	int num;
	static int [] numbers;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		numbers = new int[10];
	}
	public static void fillArray()
	{
		for(int i = 5; i >= 1; i--)
		{
			System.out.print(i + " ");
			int num = (int)((Math.random()* 101));
			System.out.println(num);
		}
	}
	public static void printArray()
	{
		for (int num : numbers)
		{
			System.out.print(num);
		}
	}
}
