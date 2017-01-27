import java.util.Scanner;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("paint");
		String pnt = kb.nextLine();
		System.out.println("interior");
		String intror = kb.nextLine();
		System.out.println("engine");
		String engne = kb.nextLine();
		System.out.println("tires");
		String trs = kb.nextLine();
		
		CarClass object = new CarClass(pnt, intror, engne, trs);
		System.out.println("Your vehicle is ready");
		System.o ut.println("Paint:\t" + object.getPaint());
		System.out.println("Interior:\t" + object.getInterior());
		System.out.println("Engine:\t" + object.getEngine());
		System.out.println("Tires:\t" + object.getTires());
	}
}