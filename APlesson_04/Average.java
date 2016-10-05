import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;

	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is frist number");
		num1 = input.nextDouble();
		System.out.println("What is second number");
		num2 = input.nextDouble();
		System.out.println("What is third number");
		num3 = input.nextDouble();

		print(calcAverage(num1, num2, num3));
	}

	public static double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(double avg)
	{
		System.out.printf("Average of " + num1 + ", " + num2 + ", and " + num3 + " is %5f", avg);
	}


}
	


