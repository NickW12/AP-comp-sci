import java.util.Scanner;
public class BOX_6
{	
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.print("Take String:: ");
		 String tString = kbinput.nextLine();
		
		for(int i = 0; i < tString.length(); i++)
		{
			System.out.println(tString);
		}
	}
}