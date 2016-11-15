import java.util.Scanner;
public class Rectangle
{
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("The length");
		int l = input.nextInt();
		System.out.println("The Width");
		int w = input.nextInt();
		print(calcPerim(l, w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return (2*l+w);
	}
	
	public static void print(int perimeter)
	{
		System.out.println("The Rectangle is " + perimeter + " feet around. ");
	}
}