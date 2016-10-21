import java.util.Scanner;
public class GPACALC_5_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Your grade in math1?");
		String math1 = kb.next();
		System.out.println("Your grade in Science2?");
		String Science2 = kb.next();
		System.out.println("Your grade in Spanish3?");
		String Spanish3 = kb.next();
		System.out.println("Your grade in History4?");
		String History4 = kb.next();
		System.out.println("Your grade in English5?");
		String English5 = kb.next();
		System.out.println("Your grade in Compsci6?");
		String Compsci6 = kb.next();
		System.out.println("Your grade in film7?");
		String film7 = kb.next();
		
		 double gPoints = calcPoints(math1) + calcPoints(Science2) + calcPoints(Spanish3) + calcPoints(History4) + calcPoints(English5) + calcPoints(Compsci6) + calcPoints(film7);
		 System.out.println("Your GPA is " +gPoints+ "");
		
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
		

	}
}