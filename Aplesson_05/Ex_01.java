import java.util.Random;
public class Ex_01
{
	static int playnum;
	static int compnum;
	//variable that holds the value of who wins
	static String winner;
	
	public static void main(String[]args)
	{
		playnum = 1 + (int)(Math.random() * 6);
		compnum = 1 + (int)(Math.random() * 6);
		rollDice();
		System.out.println("You rolled a " + playnum + "");
		System.out.println("Computer rolled a " + compnum + "");
		//what variable holds the value of the winner? 
		//put the variable at the end of your sentence
		System.out.println("The winner is " + winner);
	}
	
	//decides who the winner is
	public static void rollDice()
	{
		if (playnum > compnum)
		{
			winner = "You";
		}
		
		if (compnum > playnum)
		{
			winner = "computer";
		}
	}

}