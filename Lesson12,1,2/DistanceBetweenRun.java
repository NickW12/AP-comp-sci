	import java.util.Scanner;

	public class DistanceRunner
	{
	public static void main(String[]args)
	{
		Distance dist = new Distance();
		
		while(true)
		{
			dist.setParams(prompt("X1"), prompt("Y1"), prompt("X2"), prompt("Y2"));
			System.out.println("Distance" + dst.getDistance() + "");
		}
	}
	
	public static double prompt(String prompt)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What" + prompt + "");
		return kb.nextDouble();
	}
}