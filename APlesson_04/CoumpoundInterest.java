import java.util.Scanner;

public class CoumpoundInterest
{
	public static void main(String[]args)
	{
		//new Scanner object
		Scanner keyboard = new Scanner(System.in);
		//new CoumpoundInterest object
		CoumpoundInterest Interest = new CoumpoundInterest();
		
		System.out.println("Enter your rate");
		double rate = keyboard.nextDouble();
		System.out.println("Enter your principal");
		double principal = keyboard.nextDouble();
		System.out.println("Enter your time");
		double time = keyboard.nextDouble();
		System.out.println("Enter your number");
		double number = keyboard.nextDouble();
		
		                                                //use dot notation to call payment()
		System.out.println("Your monthly payment will be" + Interest.payment(rate, principal, number, time));
		
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+r/n, n*t)))/(t*12);
	}
		
		
	
}