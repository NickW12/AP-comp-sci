import java.util.Scanner;
public class Circle43
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is radius");
		 double r = input.nextDouble();
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{
		return 3.14*(r*r);
	}
	public static void print(double r, double area)
	{
		System.out.println("The area of the circle is " + area + "in lengh is" +r);
	}
}