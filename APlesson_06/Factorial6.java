import java.util.Scanner;
public class Factorial6
{
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.print("Integer");
		int fNumber= kbinput.nextInt();
		System.out.println(calcF(fNumber));
		
		}
		public static int calcF(int fNumber)
		{
		int f = 1;
		for(int i = 1; i <= fNumber; i++)	
		
		{
		f = f * i;
		}
		
		return f;
		
		
	}
}