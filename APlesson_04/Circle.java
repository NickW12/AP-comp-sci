import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is radius");
		r = input.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = 3.14*(r*r);
	}
	public static void print()
	{
		System.out.println("The area of the circle is " + area + "in lengh is" +r);
	}
}