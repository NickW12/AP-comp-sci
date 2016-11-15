import java.util.Scanner;

public class Receipt{


	public static void main(String[]args){
	
	Receipt form =  new Receipt();
	Scanner kb = new Scanner(System.in);
	
	System.out.println("First Thing");
	String thing1 = kb.next();
	System.out.println("Price");
	double price1 = kb.nextDouble();
	
	System.out.println("Next Thing");
	String thing2 = kb.next();
	System.out.println("Price");
	double price2 = kb.nextDouble();
	
	System.out.println("Next Thing");
	String thing3 = kb.next();
	System.out.println("Price");
	double price3 = kb.nextDouble();
	
	form.format(thing1, price1);
	form.format(thing2, price2);
	form.format(thing3, price3);
	
	double total = price1 + price2 + price3;
	form.format("Subtotal", total);
	
	double price4 = total * .1;
	String item4 = "tax";
	
	form.format(item4, price4);
	
	double price5 = price4 + total;
	String item5 = ("Total");
	form.format(item5, price5);
	
	
	}
	
	public void format(String item, double price)
	{
	
		System.out.printf("\n%20s %20.2f", item, price);
	}
}