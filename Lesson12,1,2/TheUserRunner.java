import java.util.Scanner;

public class TheUserRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want a public avatar? ||yes or no||");
		String user = kb.next();
		
		if (user.equals("Yes") || user.equals("yes"))
		{
			User pH = new User("professor", "handsome");
			System.out.println(pH);
		}
		else
		{
			User pH2 = new User("professor", "handsome", "profhansizzle");
			System.out.println(pH2);
		}
	}
}