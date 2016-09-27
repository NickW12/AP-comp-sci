import java.util.Scanner; //import Statement

public class BMI_Calc
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "kb"
		Scanner kb = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your height? ");
		
		double h = kb.nextDouble();
		
 
		//prompt for user input
		System.out.println("What is your weight? ");
		
		double w = kb.nextDouble();
		
		
		
		double bmi = 703 * w/(h * h);
		
		System.out.println("Your BMI is..." + bmi);
	}
}