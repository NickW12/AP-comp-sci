import java.util.Scanner;
public class AverageNumbers
{
	public static void main(String[]args)
	{
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)Math.floor(Math.random()*100)+1;
		}
		System.out.println("Numbers ");
		for(int num : nums)
		{
			System.out.print(num + " ");
		}
		System.out.println("The Average of the numbers is... " + Average(nums));
	}
	public static double Average(int[]nums)
	{
		int sum = 0;
		for(int num : nums)
		{
			sum += num;
		}
		return (double)sum/nums.length;
	}
}