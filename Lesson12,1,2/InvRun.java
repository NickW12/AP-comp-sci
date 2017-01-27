import java.util.Scanner;

public class InvRun
{
	public static void main (String[]args)
	{
		String ITM = "";
		String IN = "";
		String CTS = "";
		double P = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a category or a price? ||yes or no||");
		String use = kb.nextLine();
		
		if (use.equals("yes") || use.equals("Yes"))
		{
			System.out.println("Enter a manufacturer ");
			ITM = kb.nextLine();
			
			System.out.println("Enter an item ");
			IN = kb.nextLine();
			
			System.out.println("Enter a category");
			CTS = kb.nextLine();
			
			System.out.println("Enter a price");
			P = kb.nextDouble();
			
			Inv rando = new Inv(ITM, IN, CTS, P);
			
			System.out.println(rando);
		}
		
		else
		{
			System.out.println("Please enter a manufacturer ");
			ITM = kb.nextLine();
			
			System.out.println("Please enter an item ");
			IN = kb.nextLine();
			
			Inv rando = new Inv(ITM, IN);
			
			System.out.println(rando);
		}
	}
}