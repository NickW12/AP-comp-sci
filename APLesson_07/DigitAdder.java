import java.util.Scanner;
public class DigitAdder
{
	
	static int num, sum;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number:: ");
		num = kb.nextInt();
		
		sumDigits();
		System.out.println("Sum is " + num + "" + sum);

	}

	public static void sumDigits()
	{
		while(num>0)
		{
			sum = sum + (num % 10);
			num = num/10;
		}
	}
}