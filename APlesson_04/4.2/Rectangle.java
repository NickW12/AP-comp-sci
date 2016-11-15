import java.util.Scanner;
public class Rectangle
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("The length");
		int l = kb.nextInt();
		System.out.println("The Width");
		int w = kb.nextInt();
		print(calcPerim(l, w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}
	
	public static void print(int perimeter)
	{
		System.out.println("The Rectangle is " + perimeter + " feet around. ");
	}
}