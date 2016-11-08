import java.util.Scanner; 
public class LeftTriangle
{
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
		
			System.out.println("Enter Word");
			String Eword = kb.next();
			for(int i = 0; i <= Eword.length(); i++ )
			{
				System.out.println(Eword.substring(i));
			}	
		}	
}