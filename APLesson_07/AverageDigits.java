import java.util.Scanner;
public class AverageDigits
{	

	static int number;
	
	static double average = 0;
	
	static int digits = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);	
		
		System.out.println("Enter a number");
		
		number = kb.nextInt();
		
		avgDigits();
		System.out.println("The average of " + number + " is " + average);

			
	}	

	
	public static void avgDigits()
	{
		int num = number;
		while (num > 0)
		{
			digits++;
			average = average + (num%10);
			num/= 10;
		}
		average = average / digits;
	}		 
}