//GitHub is dope
import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "ketboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println("Wow!" + name + " cool name");
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! " + teacher + " is very good");
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		
		String sport = keyboard.next();
		
		System.out.println("cool! " + sport + " is very good");
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.next();
		
		System.out.println("cool! " + music + " is a good artist");
		
		//prompt for user input
		System.out.println("How may siblings do you have? ");
		
		String siblings = keyboard.next();
		
		System.out.println("cool! " + siblings + " One sister");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up? ");
		
		String videoediting = keyboard.next();
		
		System.out.println("Wow!" + videoediting + " sounds fun");
	
		//print the results...
		System.out.println("Wow " + num + " is perfect. You're pretty cool. " );
		
		
	}
}