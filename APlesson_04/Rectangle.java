import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("The length");
		l = input.nextDouble();
		System.out.println("The Width");
		w = input.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*l + 2*w);
	}
	
	public static void print()
	{
		System.out.println("The Rectangle is " + perimeter + " feet around. ");
	}
}