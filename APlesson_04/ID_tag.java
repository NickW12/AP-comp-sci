import java.util.Scanner;

public class ID_tag
{
	public static void main(String[]args)
	{
	
		ID_tag id = new ID_tag();
		Scanner input = new Scanner(System.in);
		
		System.out.println("First name:");
		String fname = input.nextLine();
		
		System.out.println("Last name:");
		String lname = input.nextLine();
		
		System.out.println("Title:");
		String title = input.nextLine();
		
		System.out.println("School:");
		String school = input.nextLine();
		
		System.out.println("year:");
		String year = input.nextLine();
		
		System.out.println("subject:");
		String subject = input.nextLine();
		//top line of id card
		System.out.println("***********************************");
		//line items (method calls)
		id.format(school, year);
		id.format(fname, lname);
		id.format(title, subject);
		System.out.println("***********************************");
	}
		
	//format method
	public void format(String item, String thing)
	{
		//formats all your line items
		System.out.printf("*%20s %20s*\n", item, thing);
	}
}
		
