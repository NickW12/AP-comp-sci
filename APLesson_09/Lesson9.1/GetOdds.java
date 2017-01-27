import java.util.Scanner;
public class GetOdds
{
	static int [] nums;
	public static void main(String[]args)
	{
		nums = new int[1000];
		fillArray();
		System.out.println("For the numbers");
		printArray();
		System.out.print("There are " + getOdds() + " odd numbers.");
	}
	public static void fillArray()
	{
		for (int i = 0; i< nums.length; i++)
			nums[i] = (int)(Math.random()*10)+1;
	}
	public static void printArray()
	{		
		for(int num : nums)
			System.out.print(num + " ");
	}
	public static int getOdds()
	{
		int odds = 0;
		for (int num : nums)
		{
			if((num  %  2) ==  1)
				odds ++;
		}
		return odds;
	}
}