import java.util.Scanner;
public class Password_6
{
	static String A;
	static String P;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Unsername");
		A = kb.next();
		System.out.println("Password");
		P = kb.next();
		
		passCheck();
	}
	
	public static void passCheck()
	{
		if(A.equals("Maverik") && P.equals("Waves"))
		{
			System.out.println("You are granted access");
		}
		else if (!A.equals("Maverik") && A.equals("Waves"))
		{
			System.out.println("Password: Correct Username:Incorrect Access: Denied");
		}
		else if (!A.equals("Waves") && A.equals("Maverik"))
		{
			System.out.println("Password: Incorrect Username:Correct Access: Denied");
		}
		else
		{
		System.out.println("Password & Username: Incorrect Access Denied");
		}
	}
}