import java.util.Scanner;

public class SubWoofer
{
	public static void main(String[]args)
	{  //method start
		Scanner keyboard = new Scanner(System.in);
		SubWoofer bass = new SubWoofer();
		System.out.println("Enter the height");
		double height = keyboard.nextDouble();
		System.out.println("Enter the length");
		double length = keyboard.nextDouble();
		System.out.println("Enter the width");
		double width = keyboard.nextDouble();
		
		System.out.println("The volume is "+ bass.calcVol(height,  length,  width) +" cubic inches");
		System.out.println("The volume in cubic feet is "+ bass.calcVol(height, length, width) );
	}//method end
	
	public double calcVol(double h, double l, double w){
		 return (h * l * w);
		
	}
	
}