import java.util.Scanner;
public class ReverseNumber
{
	static int number;
	static int num;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		number = kb.nextInt();
		getReverse();
		System.out.println("The number reversed is..." + rev);

	}
	
	public static void getReverse()
	{
		num = number;
		while (num > 0)
		{
			rev*=10;
			rev += num % 10;
			num = (int)(num / 10);
		}
	}		
}