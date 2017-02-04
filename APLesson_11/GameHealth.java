import java.util.Scanner;
public class GameHealth
{
	static String [] health = new String[6];
	static int Healthloads = 6;
	static int healthCounts = 6;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		
		while (!turn.equals("Q") && healthCounts > 0)
		{
			System.out.println("Your turn, Hit enter when ready");
			turn = kb.nextLine();
			damage = (int)((Math.random()*6)+ 1);
			amount = (int)((Math.random()*6)+ 1);
			takeDamage(damage, amount);
			printClip();
		}
		System.out.println("You died!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCounts -= amt;
			System.out.println("Take " + amt + " damage");
		}
		else
		{
			if (healthCounts + amt < Healthloads)
			{
		amt += Healthloads;
			}
			else
			{
		healthCounts = Healthloads;	
			}
		}
		return ("Power Up" + amt + "");
	}
	
	public static void printClip()
	{
		String output = "Health";
		for (int i = 0; i < Healthloads; i++)
		{
			if (i < healthCounts)
			{
			health[i] = "@";
			}
			else
			{
			health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}