import java.util.Scanner;

public class InvRun
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item name: ");
		String IN = kb.next();
		System.out.println("Enter item manufacturer: ");
		String ITM = kb.next();
		System.out.println("Enter a category or a price? ||yes or no||");
		String choice = kb.next();
		InventoryItems item1;
		
		if(choice.equals("no"))
		{
			item1 = new InventoryItems(ITM, IN);
		}
		
		else
		{
			System.out.println("Enter a category");
			String CTS = kb.next();
			
			System.out.println("Enter a price");
			double P = kb.nextDouble();
			
			item1 = new InventoryItems(ITM, IN, CTS, P);
			
			System.out.println(item1);
		}
	}
}