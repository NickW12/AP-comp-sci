import java.util.Scanner; //import Statement

public class Simple
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "kb"
		Scanner kb = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your radius? ");
		
		int r = kb.nextInt();
		
		double p = 3.14159;
		
		int num = 4;
		
	    double h = num * p * r * r; 
		
		System.out.println("The surface area of your sphere is... " + h );
	}	
}
		