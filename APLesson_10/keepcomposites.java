import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class keepcomposites
{
	public static void main(String[]args)
	{
		Integer[] number = new Integer[] {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(number));
		
		
		System.out.println("List: " + numbers);
		
		for(int i = 0; i< numbers.size(); i++)
		{
			if(geFactor(numbers.get(i)) == 0)
			{
				numbers.remove(i);
				
				i++;
			}
		}
		System.out.println("Other List: " + numbers);
	}
	public static int geFactor(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i ==0)
			{
																		return 1;
			}
		}
																			return 0;
	}

}