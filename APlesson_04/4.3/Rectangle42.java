import java.util.Scanner;
public class Rectangle42
{
	static double l;
	static double w;
	static double h;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("The length");
		l = input.nextDouble();
		System.out.println("The Width");
		w = input.nextDouble();
		System.out.println("The height");
		h = input.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*l + 2*w + 2*h);
		return 2*(l+w);
	}
	
	public static void print()
	{
		System.out.println("The Rectangle is " + perimeter + " feet around. ");
	}
}