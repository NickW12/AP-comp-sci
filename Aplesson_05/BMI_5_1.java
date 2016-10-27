import java.util.Scanner;
public class BMI_5_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		//prompt for user input
		System.out.println("What is your height?");
		double h = kb.nextDouble();
		System.out.println("What is your weight?");
		double w = kb.nextDouble();
		double BMI = 703 * w/(h * h);
		calcCondish(BMI);
	}
	
	public static void calcCondish(double BMI)
	{
		
		if (BMI < 18.5){
			 System.out.println("You are underweight");
		}
		else if (BMI >= 18.5 && BMI <= 24.9){
			System.out.println("You are normal!!!!111!");
		}
		else if (BMI >= 25 && BMI <= 29.9){
			System.out.println("Overweight");
		}
		else if (BMI >= 29.9 && BMI <= 34.9){
			System.out.println("Obese");
		}
		else if (BMI >= 35 && BMI <= 39.9){
			System.out.println(" Very Obese");
		}
		else{
			  System.out.println("Morbidly Obese");
		}
}
}
	
