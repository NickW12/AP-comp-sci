import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		int [][] nums = new int [4][4];
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = 1 + (int)((Math.random()*101));
				System.out.print(nums[i][j] + "");
			}
			System.out.println("");
		}
		System.out.println("Enter a number: ");
		int Divisor = kb.nextInt();
		int Count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % Divisor == 0)
				{
					Count += 1;
				}
			}
		}
		System.out.println("There " + Count + "  divisible by " + Divisor + " in Array.");
	}
}