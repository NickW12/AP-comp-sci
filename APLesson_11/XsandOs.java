import java.util.Scanner;
public class XsandOs
{
	public static void main(String[]args)
	{
		String [][] XsandOs = new String [4][4];
		for (int i = 0; i < XsandOs.length; i++)
		{
			for (int j = 0; j < XsandOs[i].length; j++)
			{
			int Pick = 1 + (int)((Math.random()*2));
			if (Pick == 1)
			{
				XsandOs[i][j] = "X";
			}
			if (Pick == 2)
			{
				XsandOs[i][j] = "O";
			}
				System.out.print(XsandOs[i][j] + "");
			}
			System.out.println("");
		}
	}
}