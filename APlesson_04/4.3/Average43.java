import java.util.Scanner;
public class Average43
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is frist number");
		double num1 = input.nextDouble();
		System.out.println("What is second number");
		double num2 = input.nextDouble();
		System.out.println("What is third number");
		double num3 = input.nextDouble();

		print(num1, num2, num3, calcAverage(num1, num2, num3));
	}

	public static double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("Average of " + num1 + ", " + num2 + ", and " + num3 + " is %5f", avg);
	}


}
	

