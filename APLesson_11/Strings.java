import java.util.Scanner;
import java.util.Arrays;
public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [][]words = new String [4][4];
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print("Please Enter a word:: ");
				words [i][j] = kb.nextLine();
				
				
				
			
				
			}
		}
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}	
	
	}
}