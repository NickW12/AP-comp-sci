import java.util.Scanner;
public class Adventurelab_5_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String yes = "";
		String straight = "";
		String death = "";

		System.out.println("You walk outisde in the morning ");
		System.out.println(" There is a HOBO asking for chagne, will you say 'yes' or 'no'? ");
		yes = kb.nextLine();

		if (yes.equalsIgnoreCase("Yes")) 
		{
			System.out.println("You are on your way to the coffee shop when a car comes hurtling towards you, will you 'stand' or 'run'. ");
		
			yes = kb.next();
			
			if (yes.equalsIgnoreCase("Run")) 
			{
				System.out.println("You got out of the way, bot not others, will you help them, 'yes' or 'no'?");
     
				yes = kb.next();
				
				if (yes.equalsIgnoreCase("Yes")) 
				{
					System.out.println("  ");
					System.out.println("You are a hero!");
				}
				else if (yes.equalsIgnoreCase("No")) 
				{
					System.out.println("  ");
					System.out.println("You Fricking Suck!");
				}
			}
			else if (death.equalsIgnoreCase("stand")) 
			{
				System.out.println("Your dead!");
        
				death = kb.next();
			}
		}
		else if (yes.equalsIgnoreCase("No")) 
		{
			System.out.println("There is a man walking toward you about 6 foot ish, seems perfectly normal, unitl he pulls out a gun and says give me all your money,'give him your money' highly recommended, or 'dont'");
        
			yes = kb.nextLine();
			
			if (yes.equalsIgnoreCase("give him your money")) 
			{
				System.out.println("  ");
				System.out.println("he killed you anyway...haha!!");
			}	
			else if (yes.equalsIgnoreCase("dont")) 
			{
				System.out.println("  ");
				System.out.println("He kills you and then takes your money...haha!!");
			}
		}
	}
}