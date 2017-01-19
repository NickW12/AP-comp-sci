import java.util.Scanner;
public class GameGun
{
	static int bulletCount = 96;
	static int Clipsize = 16;
	static int shotCount = 16;
	static String [] clip = new String [16];
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Out of bullets");
		restClip();
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.nextLine();
			
			if (action.equals("R"))
			{
				reload();
			}
			if (action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
	}
	
	public static void restClip()
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("Boom!!!");
		}
		else
		{
			System.out.println("Reload");
		}
		return "";
	}
	
	public static void reload()
	{
		if (bulletCount >= Clipsize)
		{
			bulletCount -= Clipsize;
			shotCount = Clipsize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		restClip();
		for (int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
		
	}
	
	public static void printClip()
	{
		String output = "";
		output = "Bullets: \t" + bulletCount + "\nClip:\t";
		for (int i = 0; i < Clipsize; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}