import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the side");
		side = input.nextDouble();
		calcSurf(); 
		print();
		
	}
	public static void calcSurf()
	{
		sa = side*side*6;
	}
	public static void print()
	{
		System.out.println("The surface area of the cube whose sides are " + side + "in lengh is" +sa);
	}
}