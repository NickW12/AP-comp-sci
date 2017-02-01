import java.util.Scanner;
public class RandomNumbers
{
	public static void main(String[]args)
	{
		int [][] rannumbers = new int [4][4];
		for (int i = 0; i < rannumbers.length; i++)
		{
			for (int j = 0; j < rannumbers[i].length; j++)
			{
				rannumbers[i][j] = (int)((Math.random()*20));
			}
		}
		for (int i = 0; i < rannumbers.length; i++)
		{
			for (int j = 0; j < rannumbers[i].length; j++)
			{
				System.out.print(rannumbers[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}