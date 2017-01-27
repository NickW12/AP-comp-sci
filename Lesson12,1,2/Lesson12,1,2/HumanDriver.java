import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair");
		String hair = kb.nextLine();
		
		System.out.println("Eyes");
		String eyes = kb.nextLine();
		
		System.out.println("Skin");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info");
		System.out.println("Hair\t" + object.getHair());
		System.out.println("Eyes\t" + object.getEyes());
		System.out.println("Skin\t" + object.getSkin());
		
		Human object2 = new Human("blonde", "blue", "white");
		System.out.println("Friend's info:");
		System.out.println("Hair\t" + object.getHair());
		System.out.println("Eyes\t" + object.getEyes());
		System.out.println("Skin\t" + object.getSkin());
	}
}