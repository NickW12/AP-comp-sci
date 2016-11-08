import java.util.Scanner; 
public class RightTriangle
{
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
		
			System.out.println("Enter Word");
			String Eword = kb.next();
			for(int i = Eword.length()-1; i >= 0; i-- )
			{
				System.out.println(Eword.substring(i));
			}	
		}	
}