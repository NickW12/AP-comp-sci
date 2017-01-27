	import java.util.Scanner;

	public class MPHRunner
	{
	public static void main(String[]args)
	{
		MilesPerHour mph = new MilesPerHour();
		
		while(true)
		{
			mph.setParams(prompt("dist"), prompt("hrs"), prompt("mts"));
			System.out.println(mph.distance + " miles" + (mph.hours + mph.minutes / 60) + " hours " + mph.getMPH() + " mph");
		}
	}
	
	public static double prompt(String prompt)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What " + prompt + "");
		return kb.nextDouble();
	}
}