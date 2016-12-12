import java.util.Scanner ;
public class FibonacciSequence
{

	public static void main(String[]args)
	{
		int  startnum;
		int seqsize;

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a starting number");
		
		startnum=kb.nextInt();
		
		System.out.println("Please enter a sequence size");
		
		seqsize=kb.nextInt();
		
		int [] sequence = new int[seqsize];
		
		for (int i = 0; i < sequence.length; i++)
		{
			if (i==0 || i==1)
			{
				sequence[i]=(startnum);
			}
			else
			{
				sequence [i] =sequence[ i - 1 ]  +sequence [ i - 2 ] ;
			}
			System.out.print(sequence [i] + " ");
		}
		
	
	}
}