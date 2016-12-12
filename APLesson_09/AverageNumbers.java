import java.util.Scanner ;

import java.util.Random;

public class AverageNumbers
{

	public static void main(String[]args)
	{
		Random kb = new Random();
		
		int [] number = new int [100];
		
		for (int i = 0; i < number.length; i++)
		{
			number[i]=kb.nextInt(1000)+1;
		}
		for (int num : number) 
		{
			System.out.print(num + " ");
		}	
		System.out.println("The average of these numbers is " + average (number));
	}
	
	
	public static double average(int [] num)
	{
		int average = 0;
		
		for (int i = 0; i < num.length; i++)
		{
			average = average + num[i];
		}			
		return average / num.length;
	}
}